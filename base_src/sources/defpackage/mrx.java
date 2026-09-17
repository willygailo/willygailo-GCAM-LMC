package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class mrx implements msa {
    public final MediaCodec a;
    public final Surface c;
    public final mrw j;
    private final boolean o;
    public final Set k = new HashSet();
    public final Set l = new HashSet();
    public volatile mth m = mth.a;
    public volatile msn n = msn.c;
    public final Deque d = new ConcurrentLinkedDeque();
    public final AtomicInteger b = new AtomicInteger(3);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final pih e = pih.f();
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);

    public mrx(MediaCodec mediaCodec, MediaFormat mediaFormat, oiu oiuVar, boolean z, Handler handler) {
        this.a = mediaCodec;
        this.o = z;
        mrw mrwVar = new mrw(this);
        this.j = mrwVar;
        if (handler == null) {
            mediaCodec.setCallback(mrwVar);
        } else {
            mediaCodec.setCallback(mrwVar, handler);
        }
        k(mediaCodec, mediaFormat);
        this.c = oiuVar == null ? null : (Surface) oiuVar.a(mediaCodec);
    }

    private final int h() {
        synchronized (this) {
            if (this.d.isEmpty()) {
                return -1;
            }
            return ((Integer) this.d.removeFirst()).intValue();
        }
    }

    private final void i() {
        this.d.clear();
        this.k.clear();
        this.l.clear();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e A[Catch: all -> 0x004c, TryCatch #2 {, blocks: (B:3:0x0001, B:12:0x0023, B:13:0x0026, B:15:0x002e, B:17:0x0039, B:19:0x003d, B:20:0x0040, B:21:0x004a, B:8:0x0011, B:11:0x001c, B:5:0x000a), top: B:26:0x0001, inners: #3 }] */
    private final void j(boolean z) {
        Surface surface;
        synchronized (this) {
            if (this.i.getAndSet(false)) {
                try {
                    this.a.stop();
                } catch (MediaCodec.CodecException e) {
                    if (z) {
                        this.j.onError(this.a, e);
                    }
                } catch (Throwable th) {
                    Log.e("AsynchMediaCodec", "Exception while trying to stop codec", th);
                }
                i();
                if (!this.e.isDone()) {
                    MediaCodec mediaCodec = this.a;
                    boolean z2 = mot.a;
                    mediaCodec.release();
                    surface = this.c;
                    if (surface != null && this.o) {
                        surface.release();
                    }
                    this.e.o(true);
                }
            } else if (!this.e.isDone()) {
                MediaCodec mediaCodec2 = this.a;
                boolean z3 = mot.a;
                mediaCodec2.release();
                surface = this.c;
                if (surface != null) {
                    surface.release();
                }
                this.e.o(true);
            }
            throw th;
        }
    }

    private static void k(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        try {
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, mediaCodec.getCodecInfo().isEncoder() ? 1 : 0);
        } catch (MediaCodec.CodecException e) {
            String strValueOf = String.valueOf(e.getDiagnosticInfo());
            Log.w("AsynchMediaCodec", strValueOf.length() != 0 ? "Error while configuring codec: ".concat(strValueOf) : new String("Error while configuring codec: "), e);
            throw e;
        }
    }

    public final void a(MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 4) != 0) {
            i();
            this.b.set(3);
            if (this.g.get()) {
                this.n.e(2);
            } else {
                this.n.e(1);
            }
            if (this.g.getAndSet(false)) {
                b();
            }
        }
    }

    public final void b() {
        j(true);
    }

    public final void c() {
        j(false);
    }

    public final synchronized void d() {
        if (this.c != null) {
            e(0);
            return;
        }
        int iH = h();
        if (iH >= 0) {
            e(iH);
        } else {
            if (this.b.get() == 1) {
                this.f.set(true);
            }
        }
    }

    public final void e(int i) {
        this.b.set(2);
        if (this.c == null) {
            try {
                this.a.queueInputBuffer(i, 0, 0, 0L, 4);
            } catch (MediaCodec.CodecException e) {
                this.j.onError(this.a, e);
            } catch (Throwable th) {
                Log.e("AsynchMediaCodec", "Exception occurred while trying to signal an EOS", th);
            }
            this.k.clear();
            return;
        }
        try {
            this.a.signalEndOfInputStream();
        } catch (MediaCodec.CodecException e2) {
            this.j.onError(this.a, e2);
        } catch (Throwable th2) {
            Log.e("AsynchMediaCodec", "Exception occurred while trying to signal an EOS", th2);
        }
    }

    @Override // defpackage.msa
    public final void f() {
        try {
            this.a.start();
            this.i.set(true);
            this.b.set(1);
            this.n.d();
        } catch (MediaCodec.CodecException e) {
            this.j.onError(this.a, e);
        } catch (Throwable th) {
            Log.e("AsynchMediaCodec", "Exception occurred while trying to start codec", th);
        }
    }

    @Override // defpackage.msa
    public final mru g() {
        obr.aR(true, "nextByteBuffer() called on codec in block mode");
        if (this.c != null) {
            throw new AssertionError("MediaCodec configured to use input surface. Should not be requesting for a byte buffer");
        }
        int iH = h();
        if (iH < 0) {
            return null;
        }
        try {
            ByteBuffer inputBuffer = this.a.getInputBuffer(iH);
            if (inputBuffer == null) {
                return null;
            }
            mru mruVar = new mru(this, inputBuffer, iH);
            synchronized (this) {
                this.k.add(mruVar);
            }
            return mruVar;
        } catch (MediaCodec.CodecException e) {
            this.j.onError(this.a, e);
            return null;
        } catch (Throwable th) {
            Log.e("AsynchMediaCodec", "Error occurred while trying to fetch input buffer", th);
            return null;
        }
    }
}

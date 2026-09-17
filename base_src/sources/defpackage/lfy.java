package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class lfy implements lfm {
    public lie C;
    public lie D;
    public MediaFormat F;
    public final HandlerThread M;
    public int O;
    private final ljf P;
    private final lfz Q;
    private final Handler T;
    private final MediaCodec.Callback U;
    public final phv a;
    public final phv b;
    public final phv c;
    public final phv d;
    public final lxl h;
    public final MediaCodec i;
    public final lfe j;
    public final lda k;
    public final double l;
    public final lge m;
    public final boolean n;
    public final boolean p;
    public long t;
    public final lda u;
    public final Object e = new Object();
    public final Object f = new Object();
    public final Object g = new Object();
    public final Queue o = new ArrayDeque(1000);
    public final Deque q = new ArrayDeque();
    public long r = -1;
    public volatile long s = Long.MAX_VALUE;
    private long R = 0;
    public final AtomicLong v = new AtomicLong(0);
    public final AtomicLong w = new AtomicLong(0);
    public volatile boolean x = false;
    public volatile boolean y = false;
    public volatile boolean z = false;
    public volatile boolean A = false;
    public volatile boolean B = false;
    private final AtomicBoolean S = new AtomicBoolean(false);
    public boolean E = false;
    public final List G = new ArrayList();
    public final List H = new ArrayList();
    public Future I = null;
    public long J = -1;
    public int K = -1;
    public byte[] L = null;
    public final pih N = pih.f();

    public lfy(lee leeVar, lxl lxlVar, lfe lfeVar, lge lgeVar, ljf ljfVar, lda ldaVar, lda ldaVar2, boolean z, lfz lfzVar, boolean z2) throws lej {
        boolean z3 = false;
        lfv lfvVar = new lfv(this);
        this.U = lfvVar;
        this.h = lxlVar;
        this.m = lgeVar;
        this.k = ldaVar;
        this.u = ldaVar2;
        this.n = z;
        this.Q = lfzVar;
        int i = leeVar.d;
        double d = i;
        double d2 = leeVar.c;
        Double.isNaN(d);
        Double.isNaN(d2);
        this.l = d / d2;
        if (z2 && i == 48000) {
            z3 = true;
        }
        this.p = z3;
        lei leiVarA = lei.a(leeVar.a.g);
        String str = leiVarA.f;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        if (leiVarA.f.equals("audio/mp4a-latm")) {
            mediaFormat.setInteger("aac-profile", 2);
        }
        mediaFormat.setInteger("sample-rate", leeVar.c);
        mediaFormat.setInteger("channel-count", leeVar.e);
        mediaFormat.setInteger("bitrate", leeVar.b);
        MediaCodec mediaCodecBG = mip.bG(leiVarA);
        this.i = mediaCodecBG;
        mediaCodecBG.getClass();
        this.a = plk.J(mip.bM("AEncFormat"));
        this.b = plk.J(mip.bM("AEncInput"));
        this.c = plk.J(mip.bM("AEncOutput"));
        this.d = plk.J(mip.bM("AEncReadAudio"));
        HandlerThread handlerThread = new HandlerThread("AudioEncoder");
        this.M = handlerThread;
        handlerThread.start();
        Handler handlerBV = mip.bV(handlerThread.getLooper());
        this.T = handlerBV;
        mediaCodecBG.setCallback(lfvVar, handlerBV);
        mediaCodecBG.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        this.j = lfeVar;
        this.P = ljfVar;
        this.O = 1;
        if (z) {
            mediaCodecBG.start();
        }
    }

    public static long c() {
        return TimeUnit.MICROSECONDS.convert(SystemClock.uptimeMillis(), TimeUnit.MILLISECONDS);
    }

    private final void j() {
        this.T.post(new lfo(this, 1));
        try {
            this.M.join();
        } catch (InterruptedException e) {
        }
    }

    @Override // defpackage.lfm
    public final void a() {
        synchronized (this.e) {
            if (this.O != 4) {
                if (this.M.isAlive()) {
                    j();
                }
                this.a.shutdown();
                this.c.shutdown();
                this.b.shutdown();
                this.d.shutdown();
                this.i.release();
                this.h.close();
                lie lieVar = this.C;
                if (lieVar != null) {
                    lieVar.close();
                }
                lie lieVar2 = this.D;
                if (lieVar2 != null) {
                    lieVar2.close();
                }
                this.O = 4;
                SystemClock.uptimeMillis();
            }
        }
    }

    @Override // defpackage.lfm
    public final void b(long j) {
        synchronized (this.e) {
            int i = this.O;
            if (i == 2 || i == 5) {
                long jD = d(j);
                if (this.O == 5) {
                    i(jD);
                }
                this.s = jD - this.t;
                this.P.e("AudioEncoder#stop");
                this.Q.a(1, this.s, this.v, this.N);
                this.h.d();
                this.T.post(new lfo(this, 0));
                j();
                this.P.f();
                this.O = 3;
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            b(c());
            a();
        }
    }

    public final long d(long j) {
        double d = j;
        double d2 = this.l;
        Double.isNaN(d);
        return (long) (d * d2);
    }

    public final void e(MediaCodec mediaCodec, int i) {
        int i2;
        if (this.h.a() == 3 && i >= 0) {
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i);
            lgp lgpVarE = this.h.e(inputBuffer, inputBuffer.limit());
            if (lgpVarE != null) {
                long jD = d(TimeUnit.MICROSECONDS.convert(lgpVarE.b(), TimeUnit.NANOSECONDS));
                mediaCodec.queueInputBuffer(i, 0, lgpVarE.a(), jD, 0);
                this.r = jD;
            } else {
                if (this.h.a() == 3) {
                    Log.w("AudioEncoder", "Read buffer from AudioRecord, but buffer size is 0.");
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                mediaCodec.queueInputBuffer(i, 0, 0, this.r, i2);
            }
        }
    }

    public final void f(final MediaFormat mediaFormat) {
        if (this.S.getAndSet(true)) {
            throw new IllegalStateException("format changed twice");
        }
        if (this.N.isDone()) {
            return;
        }
        g(new Runnable() { // from class: lfq
            @Override // java.lang.Runnable
            public final void run() {
                lfy lfyVar = this.a;
                MediaFormat mediaFormat2 = mediaFormat;
                String.valueOf(String.valueOf(mediaFormat2)).length();
                lfyVar.j.b(mediaFormat2);
                lfyVar.j.k();
                lfyVar.m.b(lfh.AUDIO, lfyVar.w);
            }
        }, this.a);
    }

    public final void g(Runnable runnable, phv phvVar) {
        plk.af(phvVar.submit(runnable), new lfw(this), pgr.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    public final void h() {
        while (!this.o.isEmpty() && ((lfx) this.o.peek()).a.presentationTimeUs <= ((Long) ((lce) this.u).d).longValue()) {
            lfx lfxVar = (lfx) this.o.poll();
            if (lfxVar.a.presentationTimeUs >= ((Long) ((lce) this.k).d).longValue()) {
                MediaCodec.BufferInfo bufferInfo = lfxVar.a;
                ByteBuffer byteBuffer = lfxVar.b;
                if (!this.j.o()) {
                    try {
                        this.j.j(2000L);
                        if (this.R < bufferInfo.presentationTimeUs) {
                            this.R = bufferInfo.presentationTimeUs;
                            this.j.l(byteBuffer, bufferInfo);
                            this.z = true;
                        }
                    } catch (RuntimeException e) {
                        Log.e("AudioEncoder", "Could not start all required tracks.", e);
                        this.A = true;
                        this.m.a(lga.VIDEO_TRACK_FAIL_TO_START);
                    }
                } else if (this.R < bufferInfo.presentationTimeUs) {
                    this.R = bufferInfo.presentationTimeUs;
                    this.j.l(byteBuffer, bufferInfo);
                    this.z = true;
                }
                this.y = true;
            }
        }
    }

    public final void i(long j) {
        orj orjVar = (orj) this.q.removeLast();
        this.q.add(orj.f((Long) orjVar.j(), Long.valueOf(j)));
        this.t += j - ((Long) orjVar.j()).longValue();
    }
}

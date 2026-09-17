package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class mjr implements mah {
    public static final ouj a = ouj.h("com/google/android/libraries/microvideo/gcamuxer/AsyncMediaMuxerWrapper");
    public final mah b;
    private final Executor g;
    private final Runnable h;
    private final boolean i;
    public final Object c = new Object();
    public Throwable d = null;
    public final Object e = new Object();
    public final HashMap f = new HashMap();
    private int j = 0;

    public mjr(mah mahVar, final ExecutorService executorService) {
        this.b = mahVar;
        this.g = new mjq(this, plk.M(executorService));
        executorService.getClass();
        this.h = new Runnable() { // from class: mji
            @Override // java.lang.Runnable
            public final void run() {
                executorService.shutdown();
            }
        };
        this.i = true;
    }

    private final void j() {
        synchronized (this.c) {
            Throwable th = this.d;
            this.d = null;
            if (th != null) {
                throw new mkn(th);
            }
        }
    }

    private final void k() {
        pih pihVarF = pih.f();
        this.g.execute(new eqo(pihVarF, 3));
        try {
            pihVarF.get(60L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((oug) ((oug) ((oug) a.c()).h(e)).G((char) 3583)).o("Waiting for muxer interrupted / timed out");
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.mah
    public final int a(final MediaFormat mediaFormat) {
        final int i;
        synchronized (this.e) {
            i = this.j;
            this.j = i + 1;
            this.g.execute(new Runnable() { // from class: mjn
                @Override // java.lang.Runnable
                public final void run() {
                    mjr mjrVar = this.a;
                    MediaFormat mediaFormat2 = mediaFormat;
                    int i2 = i;
                    int iA = mjrVar.b.a(mediaFormat2);
                    synchronized (mjrVar.e) {
                        mjrVar.f.put(Integer.valueOf(i2), Integer.valueOf(iA));
                    }
                }
            });
        }
        return i;
    }

    @Override // defpackage.mah
    public final void b(final String str, final Object obj) {
        this.g.execute(new Runnable() { // from class: mjo
            @Override // java.lang.Runnable
            public final void run() {
                mjr mjrVar = this.a;
                mjrVar.b.b(str, obj);
            }
        });
        j();
    }

    @Override // defpackage.mah
    public final void c() {
        this.g.execute(new mjj(this.b, 1));
        k();
        if (this.i) {
            this.h.run();
        }
        j();
    }

    @Override // defpackage.mah
    public final void d(final float f, final float f2) {
        this.g.execute(new Runnable() { // from class: mjk
            @Override // java.lang.Runnable
            public final void run() {
                mjr mjrVar = this.a;
                mjrVar.b.d(f, f2);
            }
        });
        j();
    }

    @Override // defpackage.mah
    public final void e(final int i) {
        this.g.execute(new Runnable() { // from class: mjl
            @Override // java.lang.Runnable
            public final void run() {
                mjr mjrVar = this.a;
                mjrVar.b.e(i);
            }
        });
        j();
    }

    @Override // defpackage.mah
    public final void f() {
        this.g.execute(new isd(20));
        j();
    }

    @Override // defpackage.mah
    public final void g() {
        this.g.execute(new mjj(this.b, 0));
        k();
        j();
    }

    @Override // defpackage.mah
    public final void h(final int i, ByteBuffer byteBuffer, final MediaCodec.BufferInfo bufferInfo) {
        j();
        final ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
        this.g.execute(new Runnable() { // from class: mjm
            @Override // java.lang.Runnable
            public final void run() {
                Integer num;
                mjr mjrVar = this.a;
                int i2 = i;
                ByteBuffer byteBuffer2 = byteBufferAllocateDirect;
                MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
                synchronized (mjrVar.e) {
                    num = (Integer) mjrVar.f.get(Integer.valueOf(i2));
                    if (num == null) {
                        StringBuilder sb = new StringBuilder(29);
                        sb.append("Unknown track id: ");
                        sb.append(i2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                mjrVar.b.h(num.intValue(), byteBuffer2, bufferInfo2);
            }
        });
    }

    @Override // defpackage.mah
    public final boolean i() {
        return true;
    }
}

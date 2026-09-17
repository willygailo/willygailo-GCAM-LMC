package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class cml extends mip {
    private static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/frameserver/listener/FrameDropListener");
    private long b;
    private long c;
    private long d;
    private long g;
    private long i;
    private int j;
    private int k;
    private final ddf l;
    private final AtomicBoolean n;
    private final ctb o;
    private final long p;
    private long h = -1;
    private final AtomicBoolean m = new AtomicBoolean(true);

    public cml(ckd ckdVar, ddf ddfVar, ctb ctbVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        this.n = atomicBoolean;
        this.l = ddfVar;
        ldz ldzVar = ckdVar.d;
        this.p = ldzVar != ldz.FPS_AUTO ? 1000000 / ((long) ldzVar.i) : -1L;
        this.o = ctbVar;
        ddi ddiVar = dcu.a;
        this.b = 1000000 / ldzVar.i;
        ldzVar.f();
        if (ldzVar.f()) {
            atomicBoolean.set(false);
        }
    }

    @Override // defpackage.mip
    public final void b(lzv lzvVar) {
        synchronized (this) {
            this.i++;
        }
        if (!this.n.get()) {
            long jB = lzvVar.b();
            synchronized (this) {
                if (this.h == jB) {
                    this.n.set(true);
                } else {
                    this.h = jB;
                }
            }
            return;
        }
        Long l = (Long) lzvVar.d(CaptureResult.SENSOR_TIMESTAMP);
        l.getClass();
        long jLongValue = l.longValue() / 1000;
        long jLongValue2 = this.p;
        if (jLongValue2 == -1) {
            Long l2 = (Long) lzvVar.d(CaptureResult.SENSOR_FRAME_DURATION);
            l2.getClass();
            jLongValue2 = l2.longValue() / 1000;
        }
        j(jLongValue, jLongValue2);
    }

    public final synchronized int g() {
        return this.j;
    }

    public final synchronized int h() {
        return this.k;
    }

    public final synchronized long i() {
        return this.i;
    }

    final synchronized void j(long j, long j2) {
        if (!this.m.compareAndSet(true, false) && j > this.g) {
            long j3 = j - this.d;
            long j4 = this.c;
            long j5 = this.b;
            int i = (int) ((j3 - j4) / j5);
            if (i < 0 || i > 1000) {
                ((oug) ((oug) a.b()).G(514)).B("Likely error in frame drop calculation: %d = (%d - %d) / %d", Integer.valueOf(i), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5));
            }
            if (j2 <= this.b || i != 1) {
                this.k += i;
                if (i > this.j) {
                    this.j = i;
                    if (i >= ((Integer) this.l.a(dcu.k).c()).intValue()) {
                        this.o.b();
                    }
                }
                ((oug) ((oug) a.c()).G(516)).B("Frame presentation time: %d us. Expected FPS: %d. Delay: %d us. Possible frame loss counts: %d", Long.valueOf(j), Long.valueOf(1000000 / j2), Long.valueOf(j3), Integer.valueOf(i));
            }
        }
        long j6 = (long) (j2 * 0.4f);
        this.c = j6;
        this.b = j2;
        this.d = j;
        this.g = j + j2 + j6;
    }
}

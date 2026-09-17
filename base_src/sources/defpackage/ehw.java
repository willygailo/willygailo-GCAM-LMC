package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.imax.cyclops.capture.TrackerStats;
import com.google.android.libraries.vision.opengl.Texture;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ehw implements ejy {
    public final eke a;
    public final AtomicBoolean e;
    public final mcu j;
    public float q;
    public ehu r;
    private final ekf s;
    private final Map y;
    public final egp b = new egp();
    public double c = 0.0d;
    private double t = 0.0d;
    private final TrackerStats u = new TrackerStats();
    public float d = 0.0f;
    private double v = 0.0d;
    public double f = 0.0d;
    public double g = 0.0d;
    public final float[] h = new float[9];
    public boolean i = false;
    public double k = 0.0d;
    public final jtj l = new jtj(10);
    public long m = 0;
    public int n = 0;
    public double o = 0.0d;
    private double w = 0.0d;
    private double x = 0.0d;
    public final Object p = new Object();

    public ehw(ekf ekfVar, eke ekeVar, mcu mcuVar) {
        EnumMap enumMap = new EnumMap(ehv.class);
        this.y = enumMap;
        this.s = ekfVar;
        this.a = ekeVar;
        this.j = mcuVar;
        this.e = new AtomicBoolean(false);
        enumMap.put(ehv.WHITE, Float.valueOf(25.0f));
        enumMap.put(ehv.RED, Float.valueOf(35.0f));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // defpackage.ejy
    public final void a(float[] fArr, long j) {
        float f;
        if (this.e.get()) {
            this.a.d.getTrackerStats(this.u);
            i(this.i);
            float captureProgress = this.a.d.getCaptureProgress();
            float f2 = this.d;
            if (captureProgress < 0.0f) {
                if (captureProgress < f2) {
                    this.d = captureProgress;
                    f = captureProgress;
                } else {
                    f = f2;
                }
            } else if (captureProgress > f2) {
                this.d = captureProgress;
                f = captureProgress;
            } else {
                f = f2;
            }
            if ((f2 >= 0.0f && f < 0.0f) || (f2 < 0.0f && f >= 0.0f)) {
                this.t = this.c;
            }
            ehu ehuVar = this.r;
            if (ehuVar == null) {
                return;
            }
            int i = 1;
            if (f >= 1.0f || f <= -1.0f) {
                eig eigVar = (eig) ehuVar;
                eigVar.g.execute(new eib(eigVar, i));
                return;
            }
            obr.ao(ehuVar);
            double d = this.w - this.v;
            this.f = d;
            if (Math.abs(d) > 25.0d || Math.abs(this.w) > 60.0d) {
                ehuVar.a(3);
                this.e.set(false);
                return;
            }
            double dA = this.b.a(this.x);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jElapsedRealtime - this.m;
            if (j2 != 0) {
                double d2 = this.k;
                this.m = jElapsedRealtime;
                this.k = dA;
                jtj jtjVar = this.l;
                double d3 = j2;
                Double.isNaN(d3);
                jtjVar.a((float) (((dA - d2) / d3) * 1000.0d));
            }
            double dAbs = Math.abs(dA - this.c);
            double dAbs2 = Math.abs(this.t - this.c);
            if (dAbs > dAbs2) {
                this.t = dA;
            } else {
                dAbs = dAbs2;
            }
            double dAbs3 = Math.abs(dA - this.t);
            this.g = dAbs3;
            if (dAbs > 30.0d && dAbs3 > 30.0d) {
                ehuVar.a(5);
                this.e.set(false);
                return;
            }
            if (Math.abs(this.l.a) >= 140.0f) {
                ehuVar.a(6);
                this.e.set(false);
                return;
            }
            if (Math.abs(this.o) > 18.0d) {
                ehuVar.a(4);
                this.e.set(false);
                return;
            }
            h(this.y);
            Float f3 = (Float) this.y.get(ehv.RED);
            if (Math.abs(f()) >= (f3 != null ? f3.floatValue() : 35.0f)) {
                i = 6;
            } else if (Math.abs(this.o) >= 10.0d) {
                i = 4;
            } else if (Math.abs(this.f) >= 10.0d || Math.abs(this.w) > 50.0d) {
                i = 3;
            } else if (dAbs > 30.0d && this.g > 10.0d) {
                i = 5;
            }
            switch (i - 1) {
                case 2:
                    eig eigVar2 = (eig) ehuVar;
                    eigVar2.e(eigVar2.f.k() ? eigVar2.y : eigVar2.x);
                    break;
                case 3:
                    eig eigVar3 = (eig) ehuVar;
                    eigVar3.e(eigVar3.w);
                    break;
                case 4:
                    eig eigVar4 = (eig) ehuVar;
                    eigVar4.e(eigVar4.v);
                    break;
                case 5:
                    eig eigVar5 = (eig) ehuVar;
                    eigVar5.e(eigVar5.u);
                    break;
            }
            ((eig) ehuVar).p = captureProgress;
        }
    }

    @Override // defpackage.ejy
    public final void b(int i, int i2) {
    }

    @Override // defpackage.ejy
    public final void c(Texture texture, ejx ejxVar) {
    }

    @Override // defpackage.ejy
    public final void d() {
    }

    @Override // defpackage.ejy
    public final void e(egy egyVar) {
    }

    public final float f() {
        return this.l.a;
    }

    public final float g() {
        if (this.e.get()) {
            return this.d;
        }
        return 0.0f;
    }

    public final void h(Map map) {
        float f;
        synchronized (this.p) {
            f = this.q;
        }
        float fMax = Math.max(8.0f, 25.0f - f);
        float fMax2 = Math.max(20.0f, 35.0f - f);
        map.put(ehv.WHITE, Float.valueOf(fMax));
        map.put(ehv.RED, Float.valueOf(fMax2));
    }

    public final void i(boolean z) {
        synchronized (this.h) {
            this.s.d(this.h);
            this.w = this.s.b();
            this.x = this.s.a();
            this.o = Math.toDegrees(Math.asin(this.h[4]));
            if (k() && this.n == 270) {
                this.o = -this.o;
            }
            if (z) {
                this.i = false;
                double dA = this.b.a(this.x);
                this.c = dA;
                this.k = dA;
                this.t = dA;
                this.v = this.w;
            }
        }
    }

    public final boolean j() {
        return this.e.get();
    }

    public final boolean k() {
        return this.n != 0;
    }
}

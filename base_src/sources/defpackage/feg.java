package defpackage;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.HandlerThread;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class feg {
    public final bud a;
    public HandlerThread o;
    public SensorManager b = null;
    public final jub c = new jub();
    public boolean d = false;
    public final float[] e = new float[3];
    public long f = 0;
    public final float[] g = new float[3];
    public final float[] h = {0.0f, 0.0f, 0.0f};
    public int i = 0;
    public final dyu j = dyu.b();
    private final float[] q = new float[16];
    public float k = 90.0f;
    public fet l = null;
    public float m = 0.0f;
    public boolean n = false;
    private double[] r = new double[16];
    public final SensorEventListener p = new fef(this);

    public feg(bud budVar) {
        this.a = budVar;
    }

    public final double a() {
        return this.j.a();
    }

    public final void b() {
        Arrays.fill(this.h, 0.0f);
    }

    public final void c(double d) {
        if (d < 0.0d) {
            d += 360.0d;
        }
        if (d > 360.0d) {
            d -= 360.0d;
        }
        this.j.f(d);
    }

    public final void d() {
        this.n = false;
        HandlerThread handlerThread = this.o;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.o = null;
        SensorManager sensorManager = this.b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.p);
        }
    }

    public final float[] e() {
        float[] fArr;
        synchronized (this) {
            fArr = (float[]) this.g.clone();
            float[] fArr2 = this.g;
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            this.i = 0;
        }
        return fArr;
    }

    public final float[] f() {
        if (this.j.g()) {
            this.r = this.j.h();
        }
        float[] fArr = new float[16];
        for (int i = 0; i < 16; i++) {
            fArr[i] = (float) this.r[i];
        }
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.rotateM(fArr2, 0, this.k, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(this.q, 0, fArr2, 0, fArr, 0);
        return this.q;
    }
}

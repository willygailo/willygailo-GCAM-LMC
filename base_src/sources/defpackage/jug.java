package defpackage;

import android.hardware.SensorEvent;
import android.opengl.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class jug {
    private final float[] c = new float[16];
    private final float[] d = new float[16];
    public final float[] a = new float[16];
    private final dyu b = dyu.b();

    private final synchronized void d() {
        double[] dArrH = this.b.h();
        for (int i = 0; i < 16; i++) {
            if (Double.isNaN(dArrH[i])) {
                this.b.e();
                return;
            }
            this.c[i] = (float) dArrH[i];
        }
        Matrix.rotateM(this.c, 0, -90.0f, 1.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(this.d, 0, this.a, 0, this.c, 0);
        Matrix.rotateM(this.d, 0, 0.0f, 1.0f, 0.0f, 0.0f);
    }

    public final void a() {
        this.b.e();
    }

    public final boolean b(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            this.b.c((float[]) sensorEvent.values.clone(), sensorEvent.timestamp);
        } else if (sensorEvent.sensor.getType() == 4) {
            this.b.d((float[]) sensorEvent.values.clone(), sensorEvent.timestamp);
        }
        if (!this.b.g()) {
            return false;
        }
        d();
        return true;
    }

    public final synchronized float[] c() {
        return this.d;
    }
}

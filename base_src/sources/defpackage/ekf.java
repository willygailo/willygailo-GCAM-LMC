package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class ekf implements SensorEventListener {
    public final SensorManager a;
    public final Sensor b;
    public final Sensor c;
    private final dyu d;
    private long e;
    private int f;
    private final float[] g;
    private final float[] h;
    private final float[] i;
    private double j;
    private double k;

    public ekf(SensorManager sensorManager) {
        dyu dyuVarB = dyu.b();
        this.e = 0L;
        this.f = 0;
        float[] fArr = new float[16];
        this.g = fArr;
        this.h = new float[16];
        this.i = new float[16];
        this.j = 0.0d;
        this.k = 0.0d;
        this.d = dyuVarB;
        this.a = sensorManager;
        this.b = sensorManager.getDefaultSensor(1);
        this.c = sensorManager.getDefaultSensor(4);
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        Matrix.setRotateM(fArr2, 0, 180.0f, 1.0f, 0.0f, 0.0f);
        Matrix.setRotateM(fArr3, 0, 90.0f, 0.0f, 0.0f, 1.0f);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr3, 0);
    }

    public final synchronized double a() {
        return this.k;
    }

    public final synchronized double b() {
        return this.j;
    }

    public final synchronized void c(int i) {
        this.f = i;
        this.d.e();
    }

    public final synchronized void d(float[] fArr) {
        float[] fArr2 = this.i;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[4];
        fArr[4] = fArr2[5];
        fArr[5] = fArr2[6];
        fArr[6] = fArr2[8];
        fArr[7] = fArr2[9];
        fArr[8] = fArr2[10];
    }

    final synchronized void e(float[] fArr, int i, long j) {
        if (this.e == 0) {
            this.d.e();
        }
        this.e = j;
        if (i == 1) {
            this.d.c(fArr, j);
        } else if (i == 4) {
            this.d.d(fArr, j);
        }
        double[] dArrH = this.d.h();
        for (int i2 = 0; i2 < 16; i2++) {
            this.h[i2] = (float) dArrH[i2];
        }
        Matrix.rotateM(this.h, 0, -90.0f, 1.0f, 0.0f, 0.0f);
        Matrix.multiplyMM(this.i, 0, this.g, 0, this.h, 0);
        Matrix.rotateM(this.i, 0, -this.f, 1.0f, 0.0f, 0.0f);
        float[] fArr2 = this.i;
        double d = fArr2[2];
        double d2 = fArr2[10];
        double d3 = 0.0d;
        if (Math.hypot(d, d2) >= 0.1d) {
            double degrees = (-90.0d) - Math.toDegrees(Math.atan2(d2, d));
            if (degrees < 0.0d) {
                degrees += 360.0d;
            }
            d3 = degrees;
            if (d3 >= 360.0d) {
                d3 -= 360.0d;
            }
        }
        this.k = d3;
        this.j = Math.toDegrees(Math.asin(this.i[6]));
        Math.toDegrees(Math.asin(Math.abs(this.i[5])));
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        e(sensorEvent.values, sensorEvent.sensor.getType(), sensorEvent.timestamp);
    }
}

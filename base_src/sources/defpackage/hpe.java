package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hpe implements SensorEventListener {
    private static final ouj f = ouj.h("com/google/android/apps/camera/sensor/HeadingSensor");
    public final SensorManager b;
    public final Sensor c;
    public final Sensor d;
    public final Executor e;
    public int a = -1;
    private final float[] g = new float[3];
    private final float[] h = new float[3];
    private final float[] i = new float[16];

    public hpe(SensorManager sensorManager, Executor executor) {
        this.b = sensorManager;
        this.e = executor;
        this.c = sensorManager.getDefaultSensor(1);
        this.d = sensorManager.getDefaultSensor(2);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            fArr = this.g;
        } else {
            if (type != 2) {
                ((oug) ((oug) f.c()).G((char) 2584)).r("Unexpected sensor type %s", sensorEvent.sensor.getName());
                return;
            }
            fArr = this.h;
        }
        System.arraycopy(sensorEvent.values, 0, fArr, 0, 3);
        float[] fArr2 = new float[3];
        SensorManager.getRotationMatrix(this.i, new float[3], this.g, this.h);
        SensorManager.getOrientation(this.i, fArr2);
        double d = fArr2[0] * 180.0f;
        Double.isNaN(d);
        int i = ((int) (d / 3.141592653589793d)) % 360;
        this.a = i;
        if (i < 0) {
            this.a = i + 360;
        }
    }
}

package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hpl {
    public final SensorManager a;
    public final Sensor b;
    private final Executor c;

    public hpl(SensorManager sensorManager, Executor executor) {
        this.a = sensorManager;
        this.c = executor;
        for (Sensor sensor : sensorManager.getSensorList(-1)) {
            if ("com.google.sensor.double_twist".equals(sensor.getStringType()) && "Google".equals(sensor.getVendor())) {
                this.b = sensor;
            }
        }
        sensor = null;
        this.b = sensor;
    }

    public final void a(SensorEventListener sensorEventListener) {
        if (this.b != null) {
            this.c.execute(new hpk(this, sensorEventListener, 0));
        }
    }

    public final void b(SensorEventListener sensorEventListener) {
        if (this.b != null) {
            this.c.execute(new hpk(this, sensorEventListener, 1));
        }
    }
}

package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes.dex */
final class dsu implements SensorEventListener {
    final /* synthetic */ drt a;

    public dsu(drt drtVar) {
        this.a = drtVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        if (this.a.e()) {
            this.a.onAccuracyChanged(sensor, i);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.a.e()) {
            this.a.onSensorChanged(sensorEvent);
        }
    }
}

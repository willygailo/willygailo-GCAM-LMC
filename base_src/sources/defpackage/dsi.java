package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes.dex */
public final class dsi implements SensorEventListener {
    final /* synthetic */ dsz a;

    public dsi(dsz dszVar) {
        this.a = dszVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.a.h(sensorEvent.timestamp, sensorEvent.values);
    }
}

package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dri implements drb {
    final /* synthetic */ Sensor a;
    final /* synthetic */ SensorEventListener b;

    public dri(Sensor sensor, SensorEventListener sensorEventListener) {
        this.a = sensor;
        this.b = sensorEventListener;
    }

    @Override // defpackage.drb
    public final Set f() {
        return Collections.singleton(this.a);
    }

    @Override // defpackage.drb
    public final void g(Sensor sensor) {
    }

    @Override // defpackage.drb
    public final void h(Sensor sensor) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.b.onSensorChanged(sensorEvent);
    }
}

package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes2.dex */
final class lxf implements SensorEventListener {
    final /* synthetic */ lxg a;
    private long b = 1;

    public lxf(lxg lxgVar) {
        this.a = lxgVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor == null || sensorEvent.sensor.getType() != 4) {
            return;
        }
        float[] fArr = sensorEvent.values;
        synchronized (this.a) {
            lxg lxgVar = this.a;
            lxc lxcVar = (lxc) lxgVar.a.get(lxgVar.c);
            long j = this.b;
            this.b = 1 + j;
            lxcVar.d = j;
            lxcVar.e = sensorEvent.timestamp;
            lxcVar.f = fArr[0];
            lxcVar.g = fArr[1];
            lxcVar.h = fArr[2];
            lxg lxgVar2 = this.a;
            lxgVar2.c = (lxgVar2.c + 1) % 6000;
        }
    }
}

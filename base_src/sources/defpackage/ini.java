package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes2.dex */
final class ini implements SensorEventListener {
    final /* synthetic */ cvo a;
    final /* synthetic */ ink b;

    public ini(ink inkVar, cvo cvoVar) {
        this.b = inkVar;
        this.a = cvoVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 4) {
            iqq iqqVar = this.b.F;
            iqqVar.getClass();
            lwd lwdVarD = this.a.d();
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            long j = sensorEvent.timestamp;
            lwd lwdVar = lwd.FRONT;
            switch (lwdVarD) {
                case FRONT:
                    float f4 = -f2;
                    f3 = -f3;
                    f2 = f;
                    f = f4;
                    break;
                case BACK:
                    f2 = f;
                    f = f2;
                    break;
            }
            iqqVar.b(f, f2, f3, sensorEvent.timestamp);
        }
    }
}

package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class ioy implements SensorEventListener {
    final /* synthetic */ iqj a;
    final /* synthetic */ ipf b;

    public ioy(ipf ipfVar, iqj iqjVar) {
        this.b = ipfVar;
        this.a = iqjVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 4) {
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            ipf ipfVar = this.b;
            double d = 0.0d;
            if (ipfVar.O == 0.0d) {
                ipfVar.O = Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
            }
            ipf ipfVar2 = this.b;
            ipfVar2.P = ipfVar2.O;
            ipfVar2.O = Math.sqrt((f * f) + (f2 * f2) + (f3 * f3));
            ipf ipfVar3 = this.b;
            double dAbs = Math.abs(ipfVar3.O - ipfVar3.P);
            synchronized (this.b.b) {
                ipf ipfVar4 = this.b;
                long j = ipfVar4.d;
                ipfVar4.d = 1 + j;
                double[] dArr = ipfVar4.c;
                dArr[((int) j) % 3] = dAbs;
                for (int i = 0; i < 3; i++) {
                    d += dArr[i];
                }
            }
            this.b.Q = TimeUnit.NANOSECONDS.toMillis(sensorEvent.timestamp - this.b.R);
            ipf ipfVar5 = this.b;
            if (ipfVar5.Q > 50) {
                ipfVar5.R = sensorEvent.timestamp;
            }
            ipf ipfVar6 = this.b;
            if (ipfVar6.Q <= 50 || d / 3.0d <= 0.014999999664723873d) {
                return;
            }
            if (((inr) ipfVar6.j.d).equals(inr.STATE_RECORDING)) {
                this.a.e();
            }
            this.b.h(true);
            this.b.f();
        }
    }
}

package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes.dex */
final class fef implements SensorEventListener {
    final /* synthetic */ feg a;

    public fef(feg fegVar) {
        this.a = fegVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            feg fegVar = this.a;
            if (fegVar.d) {
                jub jubVar = fegVar.c;
                float f = sensorEvent.values[0];
                jub jubVar2 = fegVar.c;
                jubVar.a = (f * 0.15f) + (jubVar2.a * 0.85f);
                float f2 = sensorEvent.values[1];
                jub jubVar3 = fegVar.c;
                jubVar2.b = (f2 * 0.15f) + (jubVar3.b * 0.85f);
                jubVar3.c = (sensorEvent.values[2] * 0.15f) + (fegVar.c.c * 0.85f);
            } else {
                fegVar.c.a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                fegVar.d = true;
            }
            this.a.j.c(sensorEvent.values, sensorEvent.timestamp);
            return;
        }
        if (sensorEvent.sensor.getType() == 2) {
            this.a.e[0] = sensorEvent.values[0];
            this.a.e[1] = sensorEvent.values[1];
            this.a.e[2] = sensorEvent.values[2];
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float[] fArr = sensorEvent.values;
            fArr[0] = fArr[0] - this.a.h[0];
            float[] fArr2 = sensorEvent.values;
            fArr2[1] = fArr2[1] - this.a.h[1];
            float[] fArr3 = sensorEvent.values;
            fArr3[2] = fArr3[2] - this.a.h[2];
            float f3 = sensorEvent.values[0];
            float f4 = sensorEvent.values[0];
            float f5 = sensorEvent.values[1];
            float f6 = sensorEvent.values[1];
            float f7 = sensorEvent.values[2];
            float f8 = sensorEvent.values[2];
            feg fegVar2 = this.a;
            float f9 = (f3 * f4) + (f5 * f6) + (f7 * f8);
            fegVar2.m = f9;
            fet fetVar = fegVar2.l;
            if (fetVar != null) {
                fetVar.a(Float.valueOf(f9));
            }
            feg fegVar3 = this.a;
            if (fegVar3.f != 0) {
                float f10 = (sensorEvent.timestamp - fegVar3.f) * 1.0E-9f;
                synchronized (fegVar3) {
                    float[] fArr4 = fegVar3.g;
                    fArr4[0] = fArr4[0] + (sensorEvent.values[0] * f10);
                    float[] fArr5 = fegVar3.g;
                    fArr5[1] = fArr5[1] + (sensorEvent.values[1] * f10);
                    float[] fArr6 = fegVar3.g;
                    fArr6[2] = fArr6[2] + (sensorEvent.values[2] * f10);
                    fegVar3.i++;
                }
            }
            fegVar3.f = sensorEvent.timestamp;
            this.a.j.d(sensorEvent.values, sensorEvent.timestamp);
        }
    }
}

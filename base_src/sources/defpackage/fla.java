package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: loaded from: classes.dex */
final class fla implements SensorEventListener {
    final /* synthetic */ flb a;

    public fla(flb flbVar) {
        this.a = flbVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 9) {
            if (sensorEvent.sensor.getType() == 4) {
                flj fljVar = this.a.a;
                float[] fArr = (float[]) sensorEvent.values.clone();
                long j = sensorEvent.timestamp;
                float fA = flj.a(fArr, fArr);
                if (fljVar.d >= 0 && fA <= 1.0E-4f) {
                    fljVar.f = Math.min(fljVar.f + 1, 5);
                    return;
                } else {
                    fljVar.d = j;
                    fljVar.f = 0;
                    return;
                }
            }
            return;
        }
        flj fljVar2 = this.a.a;
        float[] fArr2 = (float[]) sensorEvent.values.clone();
        long j2 = sensorEvent.timestamp;
        float fSqrt = (float) Math.sqrt(flj.a(fArr2, fArr2));
        if (fSqrt == 0.0f) {
            return;
        }
        float f = 1.0f / fSqrt;
        float fAcos = (float) Math.acos(flj.a(new float[]{fArr2[0] * f, fArr2[1] * f, fArr2[2] * f}, fljVar2.a));
        if (fljVar2.c >= 0 && fAcos <= fljVar2.b) {
            fljVar2.e = Math.min(fljVar2.e + 1, 5);
        } else {
            fljVar2.c = j2;
            fljVar2.e = 0;
        }
    }
}

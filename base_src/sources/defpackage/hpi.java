package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes2.dex */
final class hpi implements SensorEventListener {
    final /* synthetic */ hpj a;

    public hpi(hpj hpjVar) {
        this.a = hpjVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        oom oomVarJ;
        if (sensorEvent.sensor.getType() == this.a.c.getType()) {
            SensorManager.getRotationMatrixFromVector(this.a.f, sensorEvent.values);
            hpj hpjVar = this.a;
            SensorManager.remapCoordinateSystem(hpjVar.f, 1, 3, hpjVar.g);
            hpj hpjVar2 = this.a;
            SensorManager.getOrientation(hpjVar2.g, hpjVar2.h);
            hpj hpjVar3 = this.a;
            float[] fArr = hpjVar3.h;
            float f = (fArr[0] * 57.29578f) % 360.0f;
            if (f < 0.0f) {
                f += 360.0f;
            }
            float f2 = fArr[1] * 57.29578f;
            float f3 = (fArr[2] * 57.29578f) % 360.0f;
            if (f3 < 0.0f) {
                f3 += 360.0f;
            }
            hph hphVar = new hph(f, f2, f3);
            synchronized (hpjVar3.e) {
                oomVarJ = oom.j(hpjVar3.i);
            }
            int size = oomVarJ.size();
            for (int i = 0; i < size; i++) {
                ((hpg) oomVarJ.get(i)).b(hphVar);
            }
        }
    }
}

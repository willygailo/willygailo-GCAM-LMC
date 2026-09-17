package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hpk implements Runnable {
    public final /* synthetic */ hpl a;
    public final /* synthetic */ SensorEventListener b;
    private final /* synthetic */ int c;

    public /* synthetic */ hpk(hpl hplVar, SensorEventListener sensorEventListener, int i) {
        this.c = i;
        this.a = hplVar;
        this.b = sensorEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                hpl hplVar = this.a;
                SensorEventListener sensorEventListener = this.b;
                SensorManager sensorManager = hplVar.a;
                Sensor sensor = hplVar.b;
                sensor.getClass();
                sensorManager.unregisterListener(sensorEventListener, sensor);
                break;
            default:
                hpl hplVar2 = this.a;
                SensorEventListener sensorEventListener2 = this.b;
                SensorManager sensorManager2 = hplVar2.a;
                Sensor sensor2 = hplVar2.b;
                sensor2.getClass();
                sensorManager2.registerListener(sensorEventListener2, sensor2, 3);
                break;
        }
    }
}

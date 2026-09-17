package defpackage;

import android.hardware.Sensor;
import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hpd implements Runnable {
    public final /* synthetic */ hpe a;
    private final /* synthetic */ int b;

    public /* synthetic */ hpd(hpe hpeVar, int i) {
        this.b = i;
        this.a = hpeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                hpe hpeVar = this.a;
                Sensor sensor = hpeVar.c;
                if (sensor != null) {
                    hpeVar.b.unregisterListener(hpeVar, sensor);
                }
                Sensor sensor2 = hpeVar.d;
                if (sensor2 != null) {
                    hpeVar.b.unregisterListener(hpeVar, sensor2);
                }
                break;
            default:
                hpe hpeVar2 = this.a;
                Trace.beginSection("HeadingSensor.RegisterAccelerometer");
                Sensor sensor3 = hpeVar2.c;
                if (sensor3 != null) {
                    hpeVar2.b.registerListener(hpeVar2, sensor3, 3);
                }
                Trace.endSection();
                Trace.beginSection("HeadingSensor.RegisterMagneticSensor");
                Sensor sensor4 = hpeVar2.d;
                if (sensor4 != null) {
                    hpeVar2.b.registerListener(hpeVar2, sensor4, 3);
                }
                Trace.endSection();
                break;
        }
    }
}

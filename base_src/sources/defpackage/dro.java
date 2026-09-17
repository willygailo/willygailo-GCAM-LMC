package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class dro implements drb {
    final /* synthetic */ drp a;

    public dro(drp drpVar) {
        this.a = drpVar;
    }

    @Override // defpackage.drb
    public final Set f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((drb) it.next()).f());
        }
        return hashSet;
    }

    @Override // defpackage.drb
    public final void g(Sensor sensor) {
        for (drb drbVar : this.a.d) {
            if (drbVar.f().contains(sensor)) {
                drbVar.g(sensor);
            }
        }
    }

    @Override // defpackage.drb
    public final void h(Sensor sensor) {
        for (drb drbVar : this.a.d) {
            if (drbVar.f().contains(sensor)) {
                drbVar.h(sensor);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        for (drb drbVar : this.a.d) {
            if (drbVar.f().contains(sensor)) {
                drbVar.onAccuracyChanged(sensor, i);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        for (drb drbVar : this.a.d) {
            if (drbVar.f().contains(sensorEvent.sensor)) {
                drbVar.onSensorChanged(sensorEvent);
            }
        }
    }
}

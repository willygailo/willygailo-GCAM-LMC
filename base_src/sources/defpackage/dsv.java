package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dsv {
    public final SensorManager a;
    private final List b;
    private final List c = new ArrayList();

    public dsv(SensorManager sensorManager, Set set) {
        this.a = sensorManager;
        this.b = dru.a(set);
    }

    final synchronized void a() {
        dru.c("sensor", this.b);
        for (final drt drtVar : this.b) {
            if (drtVar.e()) {
                for (final Sensor sensor : drtVar.f()) {
                    drtVar.h(sensor);
                    final dsu dsuVar = new dsu(drtVar);
                    this.a.registerListener(dsuVar, sensor, 3);
                    this.c.add(new Runnable() { // from class: dst
                        @Override // java.lang.Runnable
                        public final void run() {
                            dsv dsvVar = this.a;
                            drt drtVar2 = drtVar;
                            Sensor sensor2 = sensor;
                            SensorEventListener sensorEventListener = dsuVar;
                            drtVar2.g(sensor2);
                            dsvVar.a.unregisterListener(sensorEventListener);
                        }
                    });
                }
            }
        }
    }

    public final synchronized void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.c.clear();
    }
}

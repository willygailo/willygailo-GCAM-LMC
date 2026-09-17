package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class drt implements dqv, dqt, dqs, drb {
    public final dsz a;
    private final dqv b;
    private final dqs c;
    private final dqt d;
    private final drb e;

    public drt(dsz dszVar, dqv dqvVar, dqs dqsVar, dqt dqtVar, drb drbVar) {
        this.a = dszVar;
        this.b = dqvVar;
        this.c = dqsVar;
        this.d = dqtVar;
        this.e = drbVar;
    }

    @Override // defpackage.dqt
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.dqs
    public final void b(lmr lmrVar, lnx lnxVar) {
        this.c.b(lmrVar, lnxVar);
    }

    @Override // defpackage.dqt
    public final /* synthetic */ void c(lvp lvpVar) {
    }

    @Override // defpackage.dqt
    public final void d(lvp lvpVar, brg brgVar) {
        this.d.d(lvpVar, brgVar);
    }

    @Override // defpackage.dqv
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.drb
    public final Set f() {
        return this.e.f();
    }

    @Override // defpackage.drb
    public final void g(Sensor sensor) {
        this.e.g(sensor);
    }

    @Override // defpackage.drb
    public final void h(Sensor sensor) {
        this.e.h(sensor);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        this.e.onAccuracyChanged(sensor, i);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.e.onSensorChanged(sensorEvent);
    }
}

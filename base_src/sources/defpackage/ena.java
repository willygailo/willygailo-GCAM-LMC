package defpackage;

import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public final class ena implements pys {
    private final qkg a;

    public ena(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SensorManager get() {
        SensorManager sensorManager = (SensorManager) ((emr) this.a.get()).a(emr.k);
        qmd.ae(sensorManager);
        return sensorManager;
    }
}

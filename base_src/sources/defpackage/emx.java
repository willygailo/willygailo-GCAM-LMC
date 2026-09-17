package defpackage;

import android.location.LocationManager;

/* JADX INFO: loaded from: classes.dex */
public final class emx implements pys {
    private final qkg a;

    public emx(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LocationManager get() {
        LocationManager locationManager = (LocationManager) ((emr) this.a.get()).a(emr.h);
        qmd.ae(locationManager);
        return locationManager;
    }
}

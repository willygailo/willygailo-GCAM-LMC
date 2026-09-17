package defpackage;

import android.location.Location;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes.dex */
final class fiv implements fiw {
    public final qkg a;
    public LocationManager b;
    final fiu[] c = {new fiu("gps"), new fiu("network")};
    private boolean d;

    public fiv(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.fiw
    public final pht a() {
        pih pihVarF = pih.f();
        int i = 0;
        while (true) {
            fiu[] fiuVarArr = this.c;
            if (i >= 2) {
                pihVarF.o(null);
                return pihVarF;
            }
            fiu fiuVar = fiuVarArr[i];
            Location location = fiuVar.b ? fiuVar.a : null;
            if (location != null) {
                pihVarF.o(location);
                return pihVarF;
            }
            i++;
        }
    }

    @Override // defpackage.fiw
    public final void c(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        if (z) {
            mip.bS().execute(new Runnable() { // from class: fit
                @Override // java.lang.Runnable
                public final void run() {
                    fiv fivVar = this.a;
                    lar.a();
                    if (fivVar.b == null) {
                        fivVar.b = ((emx) fivVar.a).get();
                    }
                    LocationManager locationManager = fivVar.b;
                    if (locationManager != null) {
                        try {
                            locationManager.requestLocationUpdates("network", 1000L, 0.0f, fivVar.c[1]);
                        } catch (IllegalArgumentException e) {
                            e.getMessage();
                        } catch (SecurityException e2) {
                        }
                        try {
                            fivVar.b.requestLocationUpdates("gps", 1000L, 0.0f, fivVar.c[0]);
                        } catch (IllegalArgumentException e3) {
                            e3.getMessage();
                        } catch (SecurityException e4) {
                        }
                    }
                }
            });
            return;
        }
        if (this.b == null) {
            return;
        }
        int i = 0;
        while (true) {
            fiu[] fiuVarArr = this.c;
            if (i >= 2) {
                return;
            }
            try {
                this.b.removeUpdates(fiuVarArr[i]);
            } catch (Exception e) {
            }
            i++;
        }
    }
}

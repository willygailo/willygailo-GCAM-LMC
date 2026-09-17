package defpackage;

import android.content.Context;
import android.location.Location;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class fja implements fix, fik, fhm, fhn {
    private static final ouj g = ouj.h("com/google/android/apps/camera/location/LocationProviderImpl");
    public final Context a;
    public final huf b;
    public final qkg c;
    public final ljf d;
    public final Executor e;
    public pht f;
    private final lar h;

    public fja(Context context, huf hufVar, qkg qkgVar, lar larVar, ljf ljfVar, Executor executor) {
        this.a = context;
        this.b = hufVar;
        this.c = qkgVar;
        this.h = larVar;
        this.d = ljfVar;
        this.e = executor;
    }

    private final pht e(pht phtVar) {
        return pgb.i(phtVar, ewp.c, this.e);
    }

    @Override // defpackage.fhm
    public final void a() {
        this.f = plk.aa(new pgj() { // from class: fiz
            @Override // defpackage.pgj
            public final pht a() {
                fja fjaVar = this.a;
                fjaVar.d.e("Location#isLocationEnabled");
                fiw fisVar = null;
                if ((fjaVar.a.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || fjaVar.a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) && ((Boolean) fjaVar.b.c(htu.a)).booleanValue()) {
                    fjaVar.d.e("connectLocationProvider");
                    fisVar = (khm.a.f(fjaVar.a, 0) == 0 && fis.d(fjaVar.a)) ? new fis(fjaVar.a, fjaVar.e) : new fiv(fjaVar.c);
                    fisVar.c(true);
                    fjaVar.d.f();
                }
                fjaVar.f = plk.V(fisVar);
                fjaVar.d.f();
                return fjaVar.f;
            }
        }, this.e);
    }

    @Override // defpackage.fhn
    public final void b() {
        pht phtVar = this.f;
        if (phtVar != null) {
            mip.ca(phtVar, new lht() { // from class: fiy
                @Override // defpackage.lht
                public final void a(Object obj) {
                    fiw fiwVar = (fiw) obj;
                    if (fiwVar != null) {
                        fiwVar.c(false);
                    }
                }
            }, this.h);
        }
    }

    @Override // defpackage.fix
    public final bww c() {
        pht phtVar = this.f;
        return phtVar == null ? bww.a() : new bww(e(phtVar), 1000L);
    }

    @Override // defpackage.fix
    public final ojc d() {
        try {
            if (this.f == null) {
                return oih.a;
            }
            try {
                this.d.e("Location#getCurrent");
                return ojc.h((Location) e(this.f).get(1000L, TimeUnit.MILLISECONDS));
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                ((oug) ((oug) ((oug) g.c()).h(e)).G(1716)).o("Failed to get current location.");
                this.d.f();
                return oih.a;
            }
        } finally {
            this.d.f();
        }
    }
}

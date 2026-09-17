package defpackage;

import android.os.Trace;
import com.google.android.apps.camera.debug.shottracker.db.ShotDatabase;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dhx implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public dhx(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static dhx a(qkg qkgVar) {
        return new dhx(qkgVar, 15);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                aig aigVarI = fw.i(((emp) this.a).a(), ShotDatabase.class, "shot_db");
                aigVarI.d();
                ShotDatabase shotDatabase = (ShotDatabase) aigVarI.a();
                qmd.ae(shotDatabase);
                return shotDatabase;
            case 1:
                final dib dibVar = (dib) this.a.get();
                return new iho() { // from class: dhu
                    @Override // java.lang.Runnable
                    public final void run() {
                        dib dibVar2 = dibVar;
                        Trace.beginSection("ShotTracker#checkForLostShots");
                        dibVar2.b();
                        Trace.endSection();
                    }
                };
            case 2:
                return new dji((ddf) this.a.get());
            case 3:
                return new dkm((ddf) this.a.get());
            case 4:
                return new dkq();
            case 5:
                ddf ddfVar = (ddf) this.a.get();
                int i = true == ddfVar.k(dda.c) ? 3 : 1;
                if (ddfVar.k(dda.d)) {
                    i |= 4;
                }
                return Integer.valueOf(i);
            case 6:
                ddf ddfVar2 = (ddf) this.a.get();
                ddi ddiVar = dda.a;
                ddfVar2.e();
                return false;
            case 7:
                return Boolean.valueOf(((ddf) this.a.get()).k(dda.g));
            case 8:
                return Boolean.valueOf(((ddf) this.a.get()).k(dda.h));
            case 9:
                ddf ddfVar3 = (ddf) this.a.get();
                ddi ddiVar2 = dda.a;
                ddfVar3.e();
                return false;
            case 10:
                return Boolean.valueOf(((ddf) this.a.get()).k(dda.i));
            case 11:
                return new dow(((eej) this.a).b());
            case 12:
                lco lcoVarA = ((dqa) this.a.get()).a();
                qmd.ae(lcoVarA);
                return lcoVarA;
            case 13:
                ddf ddfVar4 = (ddf) this.a.get();
                ddi ddiVar3 = ddl.a;
                ddfVar4.e();
                return false;
            case 14:
                return new dqe(new dqh(), (lco) this.a.get());
            case 15:
                lap lapVar = (lap) this.a.get();
                final ExecutorService executorServiceBM = mip.bM("FeatureCentral");
                lax laxVar = new lax(executorServiceBM);
                executorServiceBM.getClass();
                lapVar.c(new lie() { // from class: dqr
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        executorServiceBM.shutdown();
                    }
                });
                return laxVar;
            case 16:
                dte dteVarH = enl.H((dqw) this.a.get());
                dteVarH.a = 1;
                dteVarH.c(5L, TimeUnit.MINUTES);
                dteVarH.b();
                return dteVarH.a();
            case 17:
                dte dteVarH2 = enl.H((dqw) this.a.get());
                dteVarH2.a = 1;
                dteVarH2.c(5L, TimeUnit.MINUTES);
                dteVarH2.b();
                return dteVarH2.a();
            case 18:
                dte dteVarH3 = enl.H((dqw) this.a.get());
                dteVarH3.a = 1;
                dteVarH3.c(5L, TimeUnit.MINUTES);
                dteVarH3.b();
                return dteVarH3.a();
            case 19:
                dte dteVarH4 = enl.H((dqw) this.a.get());
                dteVarH4.a = 1;
                dteVarH4.c(5L, TimeUnit.MINUTES);
                dteVarH4.b();
                return dteVarH4.a();
            default:
                dte dteVarH5 = enl.H((dqw) this.a.get());
                dteVarH5.a = 1;
                dteVarH5.c(5L, TimeUnit.MINUTES);
                dteVarH5.b();
                return dteVarH5.a();
        }
    }
}

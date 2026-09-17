package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gwh implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public gwh(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static gwh a(qkg qkgVar) {
        return new gwh(qkgVar, 0);
    }

    public static gwh b(qkg qkgVar) {
        return new gwh(qkgVar, 1);
    }

    public static gwh c(qkg qkgVar) {
        return new gwh(qkgVar, 2);
    }

    public static gwh d(qkg qkgVar) {
        return new gwh(qkgVar, 5);
    }

    public static gwh e(qkg qkgVar) {
        return new gwh(qkgVar, 7);
    }

    public static gwh f(qkg qkgVar) {
        return new gwh(qkgVar, 8);
    }

    public static gwh g(qkg qkgVar) {
        return new gwh(qkgVar, 9);
    }

    public static gwh h(qkg qkgVar) {
        return new gwh(qkgVar, 11);
    }

    public static gwh i(qkg qkgVar) {
        return new gwh(qkgVar, 12);
    }

    public static gwh j(qkg qkgVar) {
        return new gwh(qkgVar, 13);
    }

    public static gwh k(qkg qkgVar) {
        return new gwh(qkgVar, 14);
    }

    public static gwh l(qkg qkgVar) {
        return new gwh(qkgVar, 15);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Object objH;
        switch (this.b) {
            case 0:
                ddf ddfVar = (ddf) this.a.get();
                ddi ddiVar = ddl.a;
                ddfVar.b();
                orx orxVar = orx.a;
                qmd.ae(orxVar);
                return orxVar;
            case 1:
                Object objH2 = ((bpk) this.a).a().booleanValue() ? ope.H(fcy.h(mip.be(kdc.i, true))) : orx.a;
                qmd.ae(objH2);
                return objH2;
            case 2:
                return new gxt((gvm) this.a.get());
            case 3:
                Iterator it = ((gjp) this.a).get().A().iterator();
                while (it.hasNext()) {
                    if (((CaptureRequest.Key) it.next()).getName().equals(ghy.b.getName())) {
                        objH = ope.H(fcy.i(ghy.b, 1));
                        qmd.ae(objH);
                        return objH;
                    }
                }
                objH = orx.a;
                qmd.ae(objH);
                return objH;
            case 4:
                ddf ddfVar2 = (ddf) this.a.get();
                ddi ddiVar2 = ddl.a;
                ddfVar2.d();
                return 35;
            case 5:
                lap lapVar = (lap) this.a.get();
                final gjw gjwVar = new gjw(1);
                lapVar.c(gjwVar);
                final ExecutorService executorServiceBM = mip.bM("ActiveCamera");
                return new Executor() { // from class: hbx
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        gjwVar.a(new hby(executorServiceBM, runnable));
                    }
                };
            case 6:
                return ojc.i(new hca((lda) this.a.get()));
            case 7:
                HashMap map = new HashMap((Map) this.a.get());
                map.remove(hdr.PD);
                return new hcg(map);
            case 8:
                return new hcg((Map) this.a.get());
            case 9:
                ojc ojcVar = (ojc) this.a.get();
                return ojcVar.g() ? (ojc) ojcVar.c() : oih.a;
            case 10:
                ojc ojcVar2 = (ojc) this.a.get();
                obr.aF(ojcVar2.g());
                return ojc.i((lnx) ojcVar2.c());
            case 11:
                Set set = ((pyw) this.a).get();
                opc opcVarD = ope.D();
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    opcVarD.i(fvq.o((gjm) it2.next()));
                }
                ope opeVarF = opcVarD.f();
                qmd.ae(opeVarF);
                return opeVarF;
            case 12:
                return new HashSet(((Map) this.a.get()).values());
            case 13:
                hsl hslVar = (hsl) this.a.get();
                lce lceVar = new lce(false);
                hslVar.b(new hdq(lceVar));
                return lceVar;
            case 14:
                hsl hslVar2 = (hsl) this.a.get();
                lap lapVar2 = new lap();
                hslVar2.b(new hdp(lapVar2));
                return lapVar2;
            case 15:
                final hsl hslVar3 = (hsl) this.a.get();
                hslVar3.getClass();
                return new gnl() { // from class: hdo
                    @Override // defpackage.gnl, java.lang.Runnable
                    public final void run() {
                        boolean zD;
                        hsl hslVar4 = hslVar3;
                        hslVar4.a.e("ShotPipeline#shutdown");
                        synchronized (hslVar4) {
                            hslVar4.c = true;
                            zD = hslVar4.d();
                        }
                        if (zD) {
                            hslVar4.c();
                        }
                        hslVar4.a.f();
                    }
                };
            case 16:
                return new hez((lnc) this.a.get());
            case 17:
                hgi hgiVar = (hgi) enl.a(this.a);
                qmd.ae(hgiVar);
                return hgiVar;
            case 18:
                hgl hglVar = (hgl) enl.a(this.a);
                qmd.ae(hglVar);
                return hglVar;
            case 19:
                hgm hgmVar = (hgm) enl.a(this.a);
                qmd.ae(hgmVar);
                return hgmVar;
            default:
                return new grz(((Integer) ((ddf) this.a.get()).a(ddx.a).c()).intValue());
        }
    }
}

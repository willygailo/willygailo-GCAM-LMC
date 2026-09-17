package defpackage;

import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class edn implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public edn(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static edn a(qkg qkgVar) {
        return new edn(qkgVar, 0);
    }

    public static edn b(qkg qkgVar) {
        return new edn(qkgVar, 1);
    }

    public static edn c(qkg qkgVar) {
        return new edn(qkgVar, 2);
    }

    public static edn d(qkg qkgVar) {
        return new edn(qkgVar, 3);
    }

    public static edn e(qkg qkgVar) {
        return new edn(qkgVar, 4);
    }

    public static edn f(qkg qkgVar) {
        return new edn(qkgVar, 5);
    }

    public static edn g(qkg qkgVar) {
        return new edn(qkgVar, 8);
    }

    public static edn h(qkg qkgVar) {
        return new edn(qkgVar, 9);
    }

    public static edn i(qkg qkgVar) {
        return new edn(qkgVar, 10);
    }

    public static edn j(qkg qkgVar) {
        return new edn(qkgVar, 11);
    }

    public static edn k(qkg qkgVar) {
        return new edn(qkgVar, 12);
    }

    public static edn l(qkg qkgVar) {
        return new edn(qkgVar, 13);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                return new edm(((eab) this.a).get());
            case 1:
                return new ecd((gig) this.a.get());
            case 2:
                lco lcoVarC = lci.c((lce) this.a.get());
                qmd.ae(lcoVarC);
                return lcoVarC;
            case 3:
                Set set = ((gjm) ((eej) this.a).b().fA()).a;
                qmd.ae(set);
                return set;
            case 4:
                lco lcoVarC2 = lci.c((lce) this.a.get());
                qmd.ae(lcoVarC2);
                return lcoVarC2;
            case 5:
                final hcg hcgVar = (hcg) this.a.get();
                return new heu() { // from class: eef
                    @Override // defpackage.heu
                    public final boolean a(lmr lmrVar) {
                        return hcgVar.a(lmrVar).b() != null;
                    }
                };
            case 6:
                try {
                    ojc ojcVarA = ((ddf) this.a.get()).a(ddm.a);
                    if (ojcVarA.g() && ew.f()[((Integer) ojcVarA.c()).intValue()] != 1 && enl.y()) {
                        return new efc();
                    }
                } catch (RuntimeException e) {
                    ((oug) ((oug) eff.a.c()).G((char) 1122)).r("In getFlagValue caught %s", e);
                }
                return new efg();
            case 7:
                return (efh) ((ojj) ((evv) this.a).a()).a;
            case 8:
                pih pihVar = (pih) this.a.get();
                lce lceVar = new lce(lcv.g(false));
                plk.af(pihVar, new lcu(lceVar), pgr.INSTANCE);
                lco lcoVarC3 = lcg.c(lceVar);
                qmd.ae(lcoVarC3);
                return lcoVarC3;
            case 9:
                return ((ojc) this.a.get()).b(bxe.s);
            case 10:
                Object objH = (!((ddf) this.a.get()).k(ddm.X) || kcy.a == null) ? orx.a : ope.H(mip.be(kcy.a, 1));
                qmd.ae(objH);
                return objH;
            case 11:
                Object objH2 = kdd.j != null ? ope.H(mip.be(kdd.j, true)) : orx.a;
                qmd.ae(objH2);
                return objH2;
            case 12:
                lco lcoVarM = kdd.i != null ? fcy.m(kdd.i, lcv.j((lco) this.a.get(), bxe.t)) : lcv.g(fcy.l());
                qmd.ae(lcoVarM);
                return lcoVarM;
            case 13:
                dzy dzyVar = (dzy) this.a.get();
                opc opcVarD = ope.D();
                if (dzyVar.e()) {
                    enl.w(kda.s, true, opcVarD);
                    enl.w(kdb.a, true, opcVarD);
                    enl.w(kdb.e, true, opcVarD);
                    enl.w(kdb.f, true, opcVarD);
                    enl.w(kdb.g, true, opcVarD);
                }
                ope opeVarF = opcVarD.f();
                qmd.ae(opeVarF);
                return opeVarF;
            case 14:
                return ojc.i(((egf) this.a).get());
            case 15:
                return new egy((GLSurfaceView) this.a.get());
            case 16:
                ekf ekfVar = (ekf) this.a.get();
                eke ekeVar = new eke();
                ekeVar.e = ekfVar;
                ekeVar.f();
                return ekeVar;
            case 17:
                SensorManager sensorManager = (SensorManager) ((emd) this.a).get().getSystemService("sensor");
                obr.ao(sensorManager);
                return new ekf(sensorManager);
            case 18:
                ehl ehlVar = (ehl) this.a.get();
                qmd.ae(ehlVar);
                return ehlVar;
            case 19:
                return new ehl(((emd) this.a).get());
            default:
                return ((egw) this.a).get();
        }
    }
}

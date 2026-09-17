package defpackage;

import android.hardware.camera2.CaptureRequest;
import com.Helper;
import com.google.android.apps.camera.stats.ViewfinderJankSession;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gqr implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public gqr(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public gqr(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gqr(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gqr(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gqr(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gqr(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gqr(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gqr(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static gqr a(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 1);
    }

    public static gqr b(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 2);
    }

    public static gqr c(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 3);
    }

    public static gqr d(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 4);
    }

    public static gqr e(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 6);
    }

    public static gqr f(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 7);
    }

    public static gqr g(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 8);
    }

    public static gqr h(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 9, (byte[]) null);
    }

    public static gqr i(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 15, (boolean[]) null);
    }

    public static gqr j(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 16);
    }

    public static gqr k(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 18);
    }

    public static gqr l(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 19);
    }

    public static gqr m(qkg qkgVar, qkg qkgVar2) {
        return new gqr(qkgVar, qkgVar2, 20, (byte[][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                htp htpVar = ((huh) this.a).get();
                ddf ddfVar = (ddf) this.b.get();
                gqx gqxVar = gqx.AUTO;
                return ddfVar.k(ddm.X) ? new gqy(lcz.a(gqxVar.d), gqxVar) : new gqy(htpVar.c("pref_camera_hdr_plus_key", gqxVar.d), gqxVar);
            case 1:
                Object objA = ((gjo) this.b).get().k() == lwd.FRONT ? (gxl) this.a.get() : gvo.a();
                qmd.ae(objA);
                return objA;
            case 2:
                return new grr((fjs) this.a.get(), (lar) this.b.get());
            case 3:
                ijn ijnVar = (ijn) this.a.get();
                lap lapVar = (lap) this.b.get();
                ViewfinderJankSession viewfinderJankSession = (ViewfinderJankSession) ijnVar.a();
                lapVar.c(viewfinderJankSession);
                return viewfinderJankSession;
            case 4:
                return new gru(((dgb) this.a).get(), (dha) this.b.get());
            case 5:
                qkg qkgVar = this.a;
                if (!((ddf) this.b.get()).k(ddv.e)) {
                    return oih.a;
                }
                qkgVar.getClass();
                return ojc.i(new gts(new mxk(qkgVar, 1)));
            case 6:
                Set<lnq> set = (Set) this.a.get();
                lvp lvpVar = ((gjp) this.b).get();
                HashSet hashSet = new HashSet();
                Iterator it = lvpVar.A().iterator();
                while (it.hasNext()) {
                    hashSet.add(((CaptureRequest.Key) it.next()).getName());
                }
                opc opcVar = new opc();
                if (!set.isEmpty()) {
                    for (lnq lnqVar : set) {
                        if (hashSet.contains(lnqVar.a.getName())) {
                            opcVar.d(lnqVar);
                        }
                    }
                }
                ope opeVarF = opcVar.f();
                qmd.ae(opeVarF);
                return opeVarF;
            case 7:
                lnc lncVarA = ((lnr) this.a.get()).a((lnf) this.b.get());
                qmd.ae(lncVarA);
                return lncVarA;
            case 8:
                ddf ddfVar2 = (ddf) this.a.get();
                lzi lziVar = (lzi) this.b.get();
                opc opcVarD = ope.D();
                if (ddfVar2.j(ddl.ag)) {
                    opcVarD.d(lns.ALWAYS_ALLOW_FLASH_MODE_TORCH);
                }
                if (lziVar.h()) {
                    opcVarD.d(lns.ABORT_FRAME_ON_FAILURE_BEFORE_START);
                }
                ope opeVarF2 = opcVarD.f();
                qmd.ae(opeVarF2);
                return opeVarF2;
            case 9:
                Object objH = ((bpk) this.b).a().booleanValue() ? ope.H((box) this.a.get()) : orx.a;
                qmd.ae(objH);
                return objH;
            case 10:
                final lce lceVar = (lce) this.a.get();
                final lco lcoVarA = ((gqz) this.b).a();
                return aas.d(new Runnable() { // from class: gwl
                    @Override // java.lang.Runnable
                    public final void run() {
                        lcoVarA.a(new eqd(lceVar, 2), pgr.INSTANCE);
                    }
                }, "longexaf");
            case 11:
                final lvp lvpVar2 = ((gjp) this.a).get();
                lco lcoVarM = fcy.m(CaptureRequest.LENS_FOCUS_DISTANCE, lcv.j(((gqz) this.b).a(), new oiu() { // from class: gwk
                    @Override // defpackage.oiu
                    public final Object a(Object obj) {
                        hte hteVar = (hte) obj;
                        float f = 0.0f;
                        if (lvpVar2.k() == lwd.FRONT) {
                            hte hteVar2 = hte.ON;
                            switch (hteVar.ordinal()) {
                                case 1:
                                case 2:
                                    f = 2.0f;
                                    break;
                                case 3:
                                    f = 1.0f;
                                    break;
                            }
                        } else {
                            Helper.loadDistances();
                            hte hteVar3 = hte.ON;
                            int iOrdinal = hteVar.ordinal();
                            if (iOrdinal == 2) {
                                f = Helper.DistanceNear;
                            } else if (iOrdinal != 3) {
                                f = 5.6E-45f;
                                if (iOrdinal == 4) {
                                    f = Helper.DistanceInfinity;
                                }
                            } else {
                                f = Helper.DistanceFar;
                            }
                        }
                        return Float.valueOf(f);
                    }
                }));
                qmd.ae(lcoVarM);
                return lcoVarM;
            case 12:
                lnc lncVar = (lnc) this.b.get();
                ojc ojcVar = (ojc) this.a.get();
                return ojcVar.g() ? ojc.i(lncVar.u((lnx) ojcVar.c(), orx.a)) : oih.a;
            case 13:
                ddf ddfVar3 = (ddf) this.b.get();
                Map map = (Map) this.a.get();
                return Boolean.valueOf(ddfVar3.k(ddx.w) && map.containsKey(hdr.RAW_WIDE) && map.containsKey(hdr.RAW_TELE));
            case 14:
                Object objH2 = ((Boolean) this.b.get()).booleanValue() ? ope.H((eav) this.a.get()) : orx.a;
                qmd.ae(objH2);
                return objH2;
            case 15:
                return ((ojc) this.a.get()).b(new hcw((lnc) this.b.get(), 0));
            case 16:
                ojc ojcVar2 = (ojc) this.a.get();
                ((ddf) this.b.get()).k(ddm.aa);
                if (0 == 0) {
                    return oih.a;
                }
                obr.aF(ojcVar2.g());
                return ojc.i((lnx) ojcVar2.c());
            case 17:
                lnc lncVar2 = (lnc) this.b.get();
                ojc ojcVar3 = (ojc) this.a.get();
                obr.aF(ojcVar3.g());
                return ojc.i(lncVar2.t(ope.H((lnx) ojcVar3.c())));
            case 18:
                hdb hdbVar = ((hdj) this.a).get();
                ((lap) this.b.get()).c(hdbVar);
                return hdbVar;
            case 19:
                final qkg qkgVar2 = this.a;
                final gvm gvmVar = (gvm) this.b.get();
                return aas.d(new Runnable() { // from class: hdl
                    @Override // java.lang.Runnable
                    public final void run() {
                        qkg qkgVar3 = qkgVar2;
                        gvm gvmVar2 = gvmVar;
                        Set set2 = ((pyw) qkgVar3).get();
                        set2.size();
                        gvmVar2.n(lnb.b(set2));
                    }
                }, "pckrespman");
            default:
                lvp lvpVar3 = (lvp) this.b.get();
                int i = ((gfw) this.a.get()).b;
                lwp lwpVarK = fvq.k(lvpVar3, 1144402265);
                lwpVarK.getClass();
                return fvq.m(lvpVar3.i(), lwpVarK, i);
        }
    }
}

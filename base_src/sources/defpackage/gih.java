package defpackage;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes.dex */
public final class gih implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public gih(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static gih a(qkg qkgVar) {
        return new gih(qkgVar, 0);
    }

    public static gih b(qkg qkgVar) {
        return new gih(qkgVar, 1);
    }

    public static gih c(qkg qkgVar) {
        return new gih(qkgVar, 2);
    }

    public static gih d(qkg qkgVar) {
        return new gih(qkgVar, 3);
    }

    public static gih e(qkg qkgVar) {
        return new gih(qkgVar, 4);
    }

    public static gih f(qkg qkgVar) {
        return new gih(qkgVar, 5);
    }

    public static gih g(qkg qkgVar) {
        return new gih(qkgVar, 6);
    }

    public static gih h(qkg qkgVar) {
        return new gih(qkgVar, 7);
    }

    public static gih i(qkg qkgVar) {
        return new gih(qkgVar, 8);
    }

    public static gih j(qkg qkgVar) {
        return new gih(qkgVar, 10);
    }

    public static gih k(qkg qkgVar) {
        return new gih(qkgVar, 11);
    }

    public static gih l(qkg qkgVar) {
        return new gih(qkgVar, 12);
    }

    public static gih m(qkg qkgVar) {
        return new gih(qkgVar, 13);
    }

    public static gih n(qkg qkgVar) {
        return new gih(qkgVar, 14);
    }

    public static gih o(qkg qkgVar) {
        return new gih(qkgVar, 15);
    }

    public static gih p(qkg qkgVar) {
        return new gih(qkgVar, 16);
    }

    public static gih q(qkg qkgVar) {
        return new gih(qkgVar, 17);
    }

    public static gih r(qkg qkgVar) {
        return new gih(qkgVar, 18);
    }

    public static gih s(qkg qkgVar) {
        return new gih(qkgVar, 19);
    }

    public static gih t(qkg qkgVar) {
        return new gih(qkgVar, 20);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        int i;
        switch (this.b) {
            case 0:
                return fcy.j(((gin) this.a).get().h);
            case 1:
                lco lcoVarM = fcy.m(CaptureRequest.CONTROL_MODE, ((gim) this.a).get());
                qmd.ae(lcoVarM);
                return lcoVarM;
            case 2:
                return fcy.j(((gis) this.a).get().h);
            case 3:
                lco lcoVarM2 = fcy.m(CaptureRequest.CONTROL_AE_MODE, (lco) this.a.get());
                qmd.ae(lcoVarM2);
                return lcoVarM2;
            case 4:
                return fcy.j(fvq.t(((gjp) this.a).get()));
            case 5:
                lco lcoVarM3 = fcy.m(CaptureRequest.JPEG_ORIENTATION, ((brh) this.a).get().a());
                qmd.ae(lcoVarM3);
                return lcoVarM3;
            case 6:
                ((git) this.a).get();
                return fcy.l();
            case 7:
                ddf ddfVar = (ddf) this.a.get();
                ddi ddiVar = ddl.a;
                ddfVar.e();
                return fcy.l();
            case 8:
                lco lcoVarM4 = fcy.m(CaptureRequest.STATISTICS_FACE_DETECT_MODE, ((gjh) this.a).get());
                qmd.ae(lcoVarM4);
                return lcoVarM4;
            case 9:
                ddf ddfVar2 = (ddf) this.a.get();
                if (ddfVar2.k(ddu.k)) {
                    i = 4098;
                } else {
                    i = ddfVar2.k(ddu.l) ? 4099 : 257;
                }
                return Integer.valueOf(i);
            case 10:
                return new gkc((gkw) this.a.get());
            case 11:
                ((gmd) this.a).get();
                return new gmg();
            case 12:
                return new gmh(((gmd) this.a).get(), 1, null);
            case 13:
                return new gmh(((gmd) this.a).get(), 0);
            case 14:
                return new gmh(((gmd) this.a).get(), 3);
            case 15:
                return new gmh(((gmd) this.a).get(), 2);
            case 16:
                return ((glv) this.a).get();
            case 17:
                return new gmp(((gms) this.a).get());
            case 18:
                gnm gnmVar = (gnm) this.a.get();
                lap lapVar = new lap();
                lap lapVarB = gnmVar.b();
                lapVarB.c(new bwj(new bwh("DelLifetime", 2000), lapVar));
                lapVar.c(lapVarB);
                return lapVar;
            case 19:
                final lap lapVar2 = (lap) this.a.get();
                lapVar2.getClass();
                return new gnl() { // from class: gnb
                    @Override // defpackage.gnl, java.lang.Runnable
                    public final void run() {
                        lapVar2.close();
                    }
                };
            default:
                return new gnp((lij) this.a.get());
        }
    }
}

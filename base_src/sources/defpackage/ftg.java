package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ftg implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public ftg(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public static ftg a(qkg qkgVar) {
        return new ftg(qkgVar, 1);
    }

    public static ftg b(qkg qkgVar) {
        return new ftg(qkgVar, 2);
    }

    public static ftg c(qkg qkgVar) {
        return new ftg(qkgVar, 5);
    }

    public static ftg d(qkg qkgVar) {
        return new ftg(qkgVar, 12);
    }

    public static ftg e(qkg qkgVar) {
        return new ftg(qkgVar, 13);
    }

    public static ftg f(qkg qkgVar) {
        return new ftg(qkgVar, 15);
    }

    public static ftg g(qkg qkgVar) {
        return new ftg(qkgVar, 16);
    }

    public static ftg h(qkg qkgVar) {
        return new ftg(qkgVar, 17);
    }

    public static ftg i(qkg qkgVar) {
        return new ftg(qkgVar, 18);
    }

    public static ftg j(qkg qkgVar) {
        return new ftg(qkgVar, 19);
    }

    public static ftg k(qkg qkgVar) {
        return new ftg(qkgVar, 20);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        boolean z = false;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((djc) this.a).get().c());
            case 1:
                gxm gxmVar = ((djc) this.a).get();
                if (gxmVar.b.k(ddr.j) || gxmVar.b.k(ddr.q)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ((djc) this.a).get().g();
                return false;
            case 3:
                dte dteVarH = enl.H((dqw) this.a.get());
                dteVarH.a = 3;
                dteVarH.c(5L, TimeUnit.MINUTES);
                dteVarH.b = 30;
                dteVarH.b();
                dteVarH.c = 4;
                return dteVarH.a();
            case 4:
                dte dteVarH2 = enl.H((dqw) this.a.get());
                dteVarH2.c(5L, TimeUnit.MINUTES);
                dteVarH2.b();
                dteVarH2.a = 3;
                dteVarH2.c = 4;
                return dteVarH2.a();
            case 5:
                return new fun(((liq) this.a).get());
            case 6:
                return ((byg) this.a).get();
            case 7:
                return (iju) ((ijn) this.a.get()).a();
            case 8:
                return (ijy) ((ijn) this.a.get()).a();
            case 9:
                return (ijw) ((ijn) this.a.get()).a();
            case 10:
                return (buf) ((ojj) ((cjc) this.a).a()).a;
            case 11:
                buf bufVar = (buf) this.a.get();
                qmd.ae(bufVar);
                return bufVar;
            case 12:
                return new gda((gdj) this.a.get());
            case 13:
                return new hmm((gcf) this.a.get(), 1);
            case 14:
                return new lwf(((lhr) this.a).get());
            case 15:
                return new nle(((gjp) this.a).get().f());
            case 16:
                return new ggg((gge) this.a.get());
            case 17:
                return new ggo(((bpk) this.a).a().booleanValue());
            case 18:
                lco lcoVarM = fcy.m(CaptureRequest.CONTROL_AE_REGIONS, ((ggb) this.a).get());
                qmd.ae(lcoVarM);
                return lcoVarM;
            case 19:
                lco lcoVarM2 = fcy.m(CaptureRequest.CONTROL_AE_LOCK, ((gfy) this.a.get()).a);
                qmd.ae(lcoVarM2);
                return lcoVarM2;
            default:
                mip mipVar = ((ggt) this.a.get()).b;
                qmd.ae(mipVar);
                return mipVar;
        }
    }
}

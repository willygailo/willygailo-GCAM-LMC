package defpackage;

import android.content.Context;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class hcu implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;
    private final qkg i;
    private final qkg j;
    private final /* synthetic */ int k;

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i) {
        this.k = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.i = qkgVar9;
        this.j = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, byte[] bArr) {
        this.k = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.h = qkgVar3;
        this.e = qkgVar4;
        this.f = qkgVar5;
        this.g = qkgVar6;
        this.a = qkgVar7;
        this.j = qkgVar8;
        this.i = qkgVar9;
        this.d = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, char[] cArr) {
        this.k = i;
        this.j = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.e = qkgVar4;
        this.h = qkgVar5;
        this.i = qkgVar6;
        this.b = qkgVar7;
        this.a = qkgVar8;
        this.g = qkgVar9;
        this.d = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, float[] fArr) {
        this.k = i;
        this.c = qkgVar;
        this.h = qkgVar2;
        this.i = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
        this.f = qkgVar6;
        this.e = qkgVar7;
        this.j = qkgVar8;
        this.g = qkgVar9;
        this.d = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, int[] iArr) {
        this.k = i;
        this.a = qkgVar;
        this.h = qkgVar2;
        this.d = qkgVar3;
        this.j = qkgVar4;
        this.e = qkgVar5;
        this.i = qkgVar6;
        this.f = qkgVar7;
        this.g = qkgVar8;
        this.b = qkgVar9;
        this.c = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, short[] sArr) {
        this.k = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.h = qkgVar3;
        this.i = qkgVar4;
        this.j = qkgVar5;
        this.g = qkgVar6;
        this.f = qkgVar7;
        this.e = qkgVar8;
        this.b = qkgVar9;
        this.a = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, boolean[] zArr) {
        this.k = i;
        this.c = qkgVar;
        this.e = qkgVar2;
        this.j = qkgVar3;
        this.b = qkgVar4;
        this.g = qkgVar5;
        this.d = qkgVar6;
        this.a = qkgVar7;
        this.f = qkgVar8;
        this.h = qkgVar9;
        this.i = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, byte[][] bArr) {
        this.k = i;
        this.i = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.f = qkgVar4;
        this.j = qkgVar5;
        this.a = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.e = qkgVar9;
        this.d = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, char[][] cArr) {
        this.k = i;
        this.b = qkgVar;
        this.f = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
        this.h = qkgVar5;
        this.e = qkgVar6;
        this.j = qkgVar7;
        this.g = qkgVar8;
        this.a = qkgVar9;
        this.i = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, float[][] fArr) {
        this.k = i;
        this.f = qkgVar;
        this.j = qkgVar2;
        this.c = qkgVar3;
        this.e = qkgVar4;
        this.d = qkgVar5;
        this.i = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
        this.a = qkgVar9;
        this.b = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, int[][] iArr) {
        this.k = i;
        this.j = qkgVar;
        this.h = qkgVar2;
        this.f = qkgVar3;
        this.b = qkgVar4;
        this.e = qkgVar5;
        this.a = qkgVar6;
        this.c = qkgVar7;
        this.g = qkgVar8;
        this.d = qkgVar9;
        this.i = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, short[][] sArr) {
        this.k = i;
        this.j = qkgVar;
        this.b = qkgVar2;
        this.e = qkgVar3;
        this.g = qkgVar4;
        this.d = qkgVar5;
        this.f = qkgVar6;
        this.h = qkgVar7;
        this.i = qkgVar8;
        this.a = qkgVar9;
        this.c = qkgVar10;
    }

    public hcu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10, int i, boolean[][] zArr) {
        this.k = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.e = qkgVar3;
        this.d = qkgVar4;
        this.i = qkgVar5;
        this.f = qkgVar6;
        this.h = qkgVar7;
        this.c = qkgVar8;
        this.g = qkgVar9;
        this.j = qkgVar10;
    }

    public static hcu a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10) {
        return new hcu(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, 0);
    }

    public static hcu b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10) {
        return new hcu(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, 1, (byte[]) null);
    }

    public static hcu c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8, qkg qkgVar9, qkg qkgVar10) {
        return new hcu(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, qkgVar8, qkgVar9, qkgVar10, 3, (short[]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        ojc ojcVar;
        switch (this.k) {
            case 0:
                hvj hvjVar = (hvj) this.a.get();
                ghx ghxVar = ((gjo) this.b).get();
                lnc lncVar = (lnc) this.c.get();
                ojc ojcVar2 = (ojc) this.d.get();
                ojc ojcVar3 = (ojc) this.e.get();
                ojc ojcVar4 = (ojc) this.f.get();
                ojc ojcVar5 = (ojc) this.g.get();
                qkg qkgVar = this.h;
                ddf ddfVar = (ddf) this.i.get();
                jrl jrlVar = ((giv) this.j).get();
                if (ddfVar.k(ddm.am) || ((ghxVar.k() != lwd.FRONT || hvjVar.a()) && (ghxVar.k() != lwd.BACK || hvjVar.b()))) {
                    ojcVar = ojcVar5;
                } else {
                    fvq.r(jrlVar, ddfVar);
                    ojcVar = oih.a;
                }
                return !ojcVar2.g() ? oih.a : fvq.q(lncVar, ope.H((lnx) ojcVar2.c()), ojcVar, ojcVar3, ojcVar4, qkgVar);
            case 1:
                lmv lmvVar = (lmv) this.b.get();
                lap lapVar = (lap) this.c.get();
                gri griVar = new gri(lmvVar, ((grn) this.h).get(), (grb) this.e.get(), (giq) this.f.get(), (edm) this.g.get(), (hcg) this.a.get(), (Executor) this.j.get(), ((pyw) this.i).get(), (ljf) this.d.get());
                synchronized (griVar.b) {
                    if (!griVar.j) {
                        griVar.l = true;
                        griVar.b();
                    }
                }
                lapVar.c(griVar);
                return griVar;
            case 2:
                return new hdu((dkq) this.j.get(), (DynamicDepthUtils) this.f.get(), (hcg) this.c.get(), ((dzw) this.e).get(), ((brh) this.h).get(), ((gsi) this.i).get(), (hvj) this.b.get(), (Executor) this.a.get(), (ljf) this.g.get(), (nvb) this.d.get(), null, null);
            case 3:
                pyn pynVarA = pyr.a(this.c);
                lig ligVarA = ((gjc) this.d).get();
                dzv dzvVar = ((dzw) this.h).get();
                hcg hcgVar = (hcg) this.i.get();
                ghx ghxVar2 = ((gjo) this.j).get();
                ((ego) this.g).get();
                Executor executor = (Executor) this.f.get();
                nvb nvbVar = (nvb) this.e.get();
                return new hdz(pynVarA, ligVarA, dzvVar, hcgVar, ghxVar2, executor, nvbVar, (ddf) this.a.get(), null, null);
            case 4:
                return new hmy(((emd) this.a).get(), ((jbz) this.h).get(), (hme) this.d.get(), (BottomBarController) this.j.get(), (jfn) this.e.get(), (hmz) this.i.get(), ((jnw) this.f).get(), ((emh) this.g).get(), (ifn) this.b.get(), (jty) this.c.get());
            case 5:
                return new hpt(this.c, this.e, this.b, this.g, this.d, this.a, this.f, this.h, this.i);
            case 6:
                return new hza((hxj) this.c.get(), (hzz) this.h.get(), (hzo) this.i.get(), (lar) this.b.get(), efb.b(), (hrx) this.a.get(), this.f, (lda) this.e.get(), (lda) this.j.get(), ((eej) this.g).b(), (ljf) this.d.get());
            case 7:
                return new ife(((Boolean) this.i.get()).booleanValue(), ((jui) this.c).get().booleanValue(), ((emd) this.b).get(), ((bwq) this.f).a(), (BottomBarController) this.j.get(), (ddf) this.a.get(), ((joc) this.g).get(), (huf) this.h.get(), (hug) this.e.get(), ((ifk) this.d).get());
            case 8:
                return new iye((bzg) this.b.get(), (BottomBarController) this.f.get(), (jlb) this.d.get(), (jak) this.c.get(), (jfn) this.h.get(), (gtg) this.e.get(), (imy) this.j.get(), ((iwi) this.g).get(), (iud) this.a.get(), (ddf) this.i.get(), null);
            case 9:
                return new izg((lda) this.j.get(), (BottomBarController) this.b.get(), (jlb) this.e.get(), ((iwi) this.g).get(), ((emg) this.d).get(), (jak) this.f.get(), (jdy) this.h.get(), (gtg) this.i.get(), (jfn) this.a.get(), (iyb) this.c.get(), null, null);
            case 10:
                return new jna(((emd) this.j).get(), ((dgb) this.h).get(), ((jnw) this.f).get(), (CameraActivityTiming) this.b.get(), (ijn) this.e.get(), (jnl) this.a.get(), (ddf) this.c.get(), (ljf) this.g.get(), (ojc) this.d.get(), ((jnc) this.i).get());
            case 11:
                Context context = ((emd) this.a).get();
                jrl jrlVarA = ((jrj) this.b).get();
                jdk jdkVar = (jdk) this.e.get();
                hug hugVar = (hug) this.d.get();
                ddf ddfVar2 = (ddf) this.i.get();
                qkg qkgVar2 = this.f;
                lar larVar = (lar) this.h.get();
                Executor executorA = ((bwq) this.c).a();
                dug.a();
                return new jpx(context, jrlVarA, jdkVar, hugVar, ddfVar2, qkgVar2, larVar, executorA, (ljf) this.g.get(), ((etf) this.j).get());
            default:
                return new jsu((jsw) this.f.get(), ((emd) this.j).get(), (elw) this.c.get(), (huf) this.e.get(), (hug) this.d.get(), ((jtn) this.i).get(), (fjs) this.g.get(), (hrx) this.h.get(), dug.a(), (lar) this.a.get(), (ddf) this.b.get());
        }
    }
}

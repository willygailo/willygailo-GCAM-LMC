package defpackage;

import com.Helper;
import com.google.android.apps.camera.rectiface.jni.RectifaceImpl;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class gyc implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final /* synthetic */ int e;

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[] bArr) {
        this.e = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[] cArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[] fArr) {
        this.e = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[] iArr) {
        this.e = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[] sArr) {
        this.e = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[] zArr) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[][] bArr) {
        this.e = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[][] cArr) {
        this.e = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[][] fArr) {
        this.e = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[][] iArr) {
        this.e = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[][] sArr) {
        this.e = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.d = qkgVar3;
        this.b = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[][][] cArr) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[][][] fArr) {
        this.e = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.b = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[][][] iArr) {
        this.e = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[][][] sArr) {
        this.e = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
    }

    public gyc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public static gyc a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 0);
    }

    public static gyc b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 1, (byte[]) null);
    }

    public static gyc c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 2, (char[]) null);
    }

    public static gyc d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 3, (short[]) null);
    }

    public static gyc e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 5, (boolean[]) null);
    }

    public static gyc f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 6, (float[]) null);
    }

    public static gyc g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 7);
    }

    public static gyc h(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 8, (byte[][]) null);
    }

    public static gyc i(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 9, (char[][]) null);
    }

    public static gyc j(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 10, (short[][]) null);
    }

    public static gyc k(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 11, (int[][]) null);
    }

    public static gyc l(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gyc(qkgVar, qkgVar2, qkgVar3, qkgVar4, 12, (boolean[][]) null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        lwp lwpVarK = null;
        int i = 0;
        switch (this.e) {
            case 0:
                return new gyb(((gja) this.a).get(), (lar) this.b.get(), (gxt) this.c.get(), (ddf) this.d.get());
            case 1:
                gxm gxmVar = ((gxn) this.c).get();
                lvp lvpVar = ((gjp) this.b).get();
                jrl jrlVar = ((giv) this.d).get();
                Object objH = (gxm.b() && ((ddf) this.a.get()).k(ddu.j) && lvpVar.k().equals(lwd.BACK) && (jrlVar.equals(jrl.PHOTO) || jrlVar.equals(jrl.PORTRAIT))) ? ope.H(fcy.k(mip.be(kdc.c, true), mip.be(kdc.b, Integer.valueOf(gxmVar.a(lvpVar))))) : orx.a;
                qmd.ae(objH);
                return objH;
            case 2:
                return new gyg((lnc) this.b.get(), (ddf) this.a.get(), (ljf) this.c.get(), (Executor) this.d.get());
            case 3:
                return new hae(pyr.a(this.a), pyr.a(this.c), pyr.a(this.b), (ojc) this.d.get());
            case 4:
                return new hbq((ddf) this.a.get(), (gfy) this.d.get(), (phv) this.b.get(), ((dgb) this.c).get());
            case 5:
                return new hbr(((lhr) this.b).get(), ((gjp) this.d).get(), (jth) this.c.get(), (hbq) this.a.get());
            case 6:
                ddf ddfVar = (ddf) this.d.get();
                final pih pihVar = (pih) this.b.get();
                final gvm gvmVar = (gvm) this.a.get();
                final lap lapVar = (lap) this.c.get();
                final int iIntValue = ((Integer) ddfVar.a(ddl.c).c()).intValue();
                return aas.d(new Runnable() { // from class: hde
                    @Override // java.lang.Runnable
                    public final void run() {
                        lap lapVar2 = lapVar;
                        pih pihVar2 = pihVar;
                        gvm gvmVar2 = gvmVar;
                        int i2 = iIntValue;
                        aat.d(lapVar2, pihVar2);
                        gvmVar2.n(new hdg(new AtomicInteger(0), i2, pihVar2, gvmVar2));
                    }
                }, "pckvfl");
            case 7:
                lap lapVar2 = (lap) this.a.get();
                lnc lncVar = (lnc) this.b.get();
                final ojc ojcVar = (ojc) this.c.get();
                final ojc ojcVarA = ((gjb) this.d).a();
                if (!ojcVar.g() || !ojcVarA.g()) {
                    return bwb.a;
                }
                final lmv lmvVarR = lncVar.r(lncVar.s((lnx) ojcVar.c()), 1);
                lapVar2.c(lmvVarR);
                return aas.d(new Runnable() { // from class: hdf
                    @Override // java.lang.Runnable
                    public final void run() {
                        ojc ojcVar2 = ojcVarA;
                        ((jwx) ojcVar2.c()).a(lmvVarR, (lnx) ojcVar.c());
                    }
                }, "pckvfe");
            case 8:
                qkg qkgVar = this.c;
                qkg qkgVar2 = this.d;
                ojc ojcVarA2 = ((gjb) this.b).a();
                ddf ddfVar2 = (ddf) this.a.get();
                ddi ddiVar = ddl.a;
                ddfVar2.d();
                if (!ojcVarA2.g()) {
                    return mip.bb(((lvp) qkgVar2.get()).i(), ((gjc) qkgVar).get());
                }
                lny lnyVarA = lnz.a();
                lnyVarA.h(loa.IMAGE_READER);
                lnyVarA.b(((lvp) qkgVar2.get()).i());
                lnyVarA.g(((gjc) qkgVar).get());
                lnyVarA.f(34);
                lnyVarA.c(9);
                lnyVarA.i(256L);
                lnyVarA.e(true);
                return lnyVarA.a();
            case 9:
                final pyn pynVarA = pyr.a(this.c);
                final pyn pynVarA2 = pyr.a(this.d);
                final lnc lncVar2 = (lnc) this.b.get();
                final lap lapVar3 = (lap) this.a.get();
                return aas.d(new Runnable() { // from class: hdk
                    @Override // java.lang.Runnable
                    public final void run() {
                        lnc lncVar3 = lncVar2;
                        pyn pynVar = pynVarA;
                        pyn pynVar2 = pynVarA2;
                        lap lapVar4 = lapVar3;
                        fvq.p(lncVar3, (Set) pynVar.get());
                        Iterator it = ((Set) pynVar2.get()).iterator();
                        while (it.hasNext()) {
                            lapVar4.c(((lco) it.next()).a(new cme(lncVar3, 8), pgr.INSTANCE));
                        }
                    }
                }, "pckreqdyn");
            case 10:
                ghx ghxVar = ((gjo) this.d).get();
                gfw gfwVar = (gfw) this.b.get();
                qkg qkgVar3 = this.c;
                int iIntValue2 = ((Integer) this.a.get()).intValue();
                if (ghxVar.L()) {
                    List list = (List) qkgVar3.get();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        lwpVarK = fvq.k((lvp) list.get(i2), iIntValue2);
                        if (lwpVarK != null) {
                            i = i2;
                            ghxVar = (ghx) list.get(i);
                        }
                    }
                    ghxVar = (ghx) list.get(i);
                } else {
                    lwpVarK = fvq.k(ghxVar, iIntValue2);
                }
                lwpVarK.getClass();
                return fvq.m(ghxVar.i(), lwpVarK, gfwVar.b);
            case 11:
                lvp lvpVar2 = (lvp) this.d.get();
                gfw gfwVar2 = (gfw) this.a.get();
                ojc ojcVarB = ((fsr) this.c).b();
                lzi lziVar = (lzi) this.b.get();
                int i3 = gfwVar2.b;
                lwp lwpVarK2 = fvq.k(lvpVar2, Helper.GetRawFormatFix());
                lwpVarK2.getClass();
                lvpVar2.i();
                lvpVar2.r();
                Long lValueOf = (Long) ojcVarB.e(0L);
                if (lziVar.a) {
                    lValueOf = Long.valueOf(lValueOf.longValue() | 48);
                }
                return fvq.j(lvpVar2.i(), lwpVarK2, i3, true, false, lValueOf.longValue() == 0 ? null : lValueOf);
            case 12:
                ghx ghxVar2 = ((gjo) this.d).get();
                gfw gfwVar3 = (gfw) this.b.get();
                jth jthVar = (jth) this.a.get();
                ojc ojcVarB2 = ((fsr) this.c).b();
                obr.aF(ghxVar2.L());
                int i4 = gfwVar3.b;
                lvp lvpVarD = jthVar.d();
                lvpVarD.i();
                lvpVarD.r();
                lwp lwpVarK3 = fvq.k(lvpVarD, Helper.GetRawFormatFix());
                lwpVarK3.getClass();
                return fvq.j(lvpVarD.i(), lwpVarK3, i4, true, false, (Long) ojcVarB2.f());
            case 13:
                hvj hvjVar = (hvj) this.a.get();
                ghx ghxVar3 = ((gjo) this.d).get();
                qkg qkgVar4 = this.b;
                qkg qkgVar5 = this.c;
                lwd lwdVarK = ghxVar3.k();
                Object objH2 = (lwdVarK == lwd.BACK && hvjVar.b()) ? ope.H((eav) qkgVar4.get()) : (lwdVarK == lwd.FRONT && hvjVar.a()) ? ope.H((eav) qkgVar5.get()) : orx.a;
                qmd.ae(objH2);
                return objH2;
            case 14:
                return new hgf((elw) this.a.get(), (lar) this.c.get(), ((emd) this.d).get(), efb.a(), (ddf) this.b.get());
            case 15:
                return new RectifaceImpl((hgm) this.a.get(), (hgl) this.b.get(), (lda) this.c.get(), (ddf) this.d.get());
            case 16:
                return hoc.a(((eme) this.b).get().getIntent()) ? mip.eR(new hob(this.c, (lar) this.a.get(), ((etj) this.d).get())) : bqi.g;
            case 17:
                return new hvb(((emp) this.d).a(), (lwf) this.a.get(), (hur) this.c.get(), (ddf) this.b.get());
            case 18:
                return new ick((fjs) this.c.get(), (lda) this.d.get(), (huf) this.b.get(), (hug) this.a.get());
            case 19:
                return new ijc((qiz) this.b.get(), (Instrumentation) this.a.get(), (mcu) this.d.get(), (ljf) this.c.get(), null);
            default:
                return new iln(((emd) this.d).get(), (huf) this.c.get(), ojc.i((hnx) this.a.get()), (ddf) this.b.get());
        }
    }
}

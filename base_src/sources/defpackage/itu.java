package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.util.DisplayMetrics;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class itu implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final /* synthetic */ int e;

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
        this.d = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[] cArr) {
        this.e = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[] fArr) {
        this.e = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.b = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[] iArr) {
        this.e = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[] sArr) {
        this.e = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[] zArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[][] bArr) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[][] cArr) {
        this.e = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[][] fArr) {
        this.e = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[][] iArr) {
        this.e = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[][] sArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, char[][][] cArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, float[][][] fArr) {
        this.e = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, int[][][] iArr) {
        this.e = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, short[][][] sArr) {
        this.e = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
    }

    public itu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, int i, boolean[][][] zArr) {
        this.e = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
    }

    public static itu a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new itu(qkgVar, qkgVar2, qkgVar3, qkgVar4, 0);
    }

    public static itu b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new itu(qkgVar, qkgVar2, qkgVar3, qkgVar4, 2, (char[]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        ojc ojcVarI;
        Object jygVar;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        switch (this.e) {
            case 0:
                ojc ojcVarA = ((hlj) this.a).a();
                itx itxVar = (itx) this.b.get();
                ojc ojcVarB = ((fsr) this.d).b();
                if (!ojcVarA.g()) {
                    return oih.a;
                }
                itf itfVar = (itf) ojcVarA.c();
                if (ojcVarB.g()) {
                    itr itrVarA = itr.a(((Integer) ojcVarB.c()).intValue());
                    if (itrVarA != itr.UNKNOWN) {
                        ojcVarI = ojc.i(itrVarA);
                    } else {
                        ((oug) ((oug) itt.a.b()).G((char) 3161)).o("Unsupported tracker type");
                        ojcVarI = oih.a;
                    }
                } else {
                    ojcVarI = oih.a;
                }
                itfVar.b.e("RoiTracker");
                try {
                    itg itgVar = new itg(ojc.i(itxVar), ojcVarI, itfVar.a);
                    return ojc.i(itgVar);
                } finally {
                    itfVar.b.f();
                }
            case 1:
                return new isv((ius) this.a.get(), (DisplayMetrics) this.c.get(), ((emd) this.b).get(), (ddf) this.d.get());
            case 2:
                Boolean bool = (Boolean) this.a.get();
                qkg qkgVar = this.d;
                qkg qkgVar2 = this.c;
                ghx ghxVar = ((gjo) this.b).get();
                if (bool.booleanValue() && ghxVar.k() == lwd.BACK && ((hlj) qkgVar).a().g() && ((ojc) qkgVar2.get()).g()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return new iwt((lar) this.d.get(), (gfy) this.a.get(), (imy) this.b.get(), (dmh) this.c.get(), null);
            case 4:
                return new jay(((eme) this.a).get(), (ddf) this.b.get(), (lar) this.c.get(), (lda) this.d.get());
            case 5:
                return new jbb(((eme) this.a).get(), (jas) this.b.get(), (huf) this.d.get(), (ddf) this.c.get());
            case 6:
                return new jng((gvb) this.b.get(), ((jnw) this.a).get(), (ljf) this.d.get(), this.c);
            case 7:
                Object objH = !((ddf) this.b.get()).k(ddo.c) ? orx.a : ope.H(new jnp((lar) this.d.get(), ((etj) this.c).get(), pyr.a(this.a), z ? 1 : 0));
                qmd.ae(objH);
                return objH;
            case 8:
                return new jpi((daf) this.b.get(), (elw) this.d.get(), this.a, (ddf) this.c.get());
            case 9:
                return new jpo((jas) this.b.get(), (jas) this.d.get(), this.a, (ddf) this.c.get());
            case 10:
                return new jps(this.b, ((etg) this.a).get(), (huf) this.d.get(), (lar) this.c.get());
            case 11:
                ddf ddfVar = (ddf) this.a.get();
                final hyc hycVar = (hyc) this.d.get();
                final qkg qkgVar3 = this.b;
                final qkg qkgVar4 = this.c;
                Object objH2 = !ddfVar.k(ddl.bq) ? orx.a : ope.H(new iho() { // from class: jsq
                    @Override // java.lang.Runnable
                    public final void run() {
                        qkg qkgVar5 = qkgVar3;
                        hyc hycVar2 = hycVar;
                        qkg qkgVar6 = qkgVar4;
                        jsu jsuVar = (jsu) qkgVar5.get();
                        iau iauVarA = iav.a();
                        iauVarA.a = "InAppUpdate";
                        iauVarA.c(ope.J(jrl.PHOTO, jrl.PORTRAIT, jrl.LONG_EXPOSURE));
                        iauVarA.b(ope.I(lwd.BACK, lwd.FRONT));
                        iauVarA.e(false);
                        iauVarA.f(false);
                        iauVarA.d = 1;
                        hycVar2.a(jsuVar, iauVarA.a());
                        jsx jsxVar = ((jsy) qkgVar6).get();
                        long jLongValue = ((Long) jsxVar.c.c(htu.O)).longValue();
                        long longVersionCode = jsxVar.e.getLongVersionCode();
                        if (jLongValue != 0) {
                            jsxVar.d.d(htu.O);
                            jsxVar.d.d(htu.R);
                            jsxVar.d.d(htu.S);
                            jsxVar.g.ai(5, longVersionCode, jLongValue, 0, 0);
                        }
                        if (longVersionCode != ((Long) jsxVar.c.c(htu.P)).longValue()) {
                            jsxVar.d.e(htu.Q, 0);
                            jsxVar.d.e(htu.P, Long.valueOf(longVersionCode));
                        }
                        ((jsw) jsxVar.a.get()).e((jsv) jsxVar.b.get());
                        enl.f(jsxVar.f, jsxVar.h, jsxVar);
                    }
                });
                qmd.ae(objH2);
                return objH2;
            case 12:
                Context context = ((emd) this.a).get();
                pyn pynVarA = pyr.a(this.d);
                fhv fhvVarB = ((etj) this.b).get();
                lar larVar = (lar) this.c.get();
                try {
                    if (context.getPackageManager().getPackageInfo("com.google.android.wearable.app", 0) != null) {
                        jyq jyqVar = (jyq) pynVarA.get();
                        enl.f(larVar, fhvVarB, jyqVar);
                        jygVar = jyqVar;
                    } else {
                        jygVar = new jyg();
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
                qmd.ae(jygVar);
                return jygVar;
            case 13:
                return new ncp(this.a, this.b, this.c, this.d, null, null);
            case 14:
                lap lapVar = (lap) this.c.get();
                final lpr lprVar = (lpr) this.a.get();
                lis lisVar = ((liq) this.d).get();
                final lap lapVar2 = new lap();
                final Handler handlerBW = mip.bW(lapVar2, "ShutdownHndlr");
                final lis lisVarA = lisVar.a("FrameServer");
                lapVar.c(new lie() { // from class: lph
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        Handler handler = handlerBW;
                        final lis lisVar2 = lisVarA;
                        final lpr lprVar2 = lprVar;
                        final lap lapVar3 = lapVar2;
                        handler.postDelayed(new Runnable() { // from class: lpi
                            @Override // java.lang.Runnable
                            public final void run() {
                                lis lisVar3 = lisVar2;
                                lpr lprVar3 = lprVar2;
                                lap lapVar4 = lapVar3;
                                String strValueOf = String.valueOf(lprVar3);
                                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
                                sb.append("Shutdown ");
                                sb.append(strValueOf);
                                sb.append(" started.");
                                lisVar3.b(sb.toString());
                                lapVar4.close();
                                String strValueOf2 = String.valueOf(lprVar3);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf2).length() + 9);
                                sb2.append("Shutdown ");
                                sb2.append(strValueOf2);
                                lisVar3.f(sb2.toString());
                            }
                        }, 2000L);
                    }
                });
                return lapVar2;
            case 15:
                return new lpq((lol) this.b.get(), ((lpl) this.a).get(), (lqz) this.d.get(), ((liq) this.c).get());
            case 16:
                return new lqz((ltc) this.b.get(), (lap) this.a.get(), ((lqy) this.d).get(), this.c, null);
            case 17:
                return new ncp(this.b, this.a, this.d, this.c, null);
            case 18:
                return new lsc((luk) this.b.get(), (ltv) this.c.get(), ((liq) this.a).get(), (ljf) this.d.get());
            case 19:
                return new myv(pyr.a(this.c), this.b, (ojc) ((pyt) this.d).a, (Executor) this.a.get());
            default:
                return new naz((mwe) this.a.get(), this.d, this.b, this.c);
        }
    }
}

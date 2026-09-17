package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fsy implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[] cArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[] fArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[] iArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[] zArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][] cArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[][] fArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][] iArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][] sArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][][] cArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][][] iArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][][] sArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public fsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[][][] zArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public static fsy a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 0);
    }

    public static bvv b(final lap lapVar, final pht phtVar, final bxj bxjVar) {
        return aas.d(new Runnable() { // from class: gnf
            @Override // java.lang.Runnable
            public final void run() {
                lap lapVar2 = lapVar;
                bxj bxjVar2 = bxjVar;
                pht phtVar2 = phtVar;
                lie lieVarB = bxjVar2.b();
                lapVar2.c(lieVarB);
                phtVar2.d(new gng(lieVarB, 0), pgr.INSTANCE);
            }
        }, "latch");
    }

    public static fsy c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 1, (byte[]) null);
    }

    public static fsy d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 2, (char[]) null);
    }

    public static fsy e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 3, (short[]) null);
    }

    public static fsy f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 9, (short[][]) null);
    }

    public static fsy g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 10, (int[][]) null);
    }

    public static fsy h(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 11, (boolean[][]) null);
    }

    public static fsy i(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 14, (char[][][]) null);
    }

    public static fsy j(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 15, (short[][][]) null);
    }

    public static fsy k(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 16);
    }

    public static fsy l(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 17);
    }

    public static fsy m(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 18);
    }

    public static fsy n(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 19, (int[][][]) null);
    }

    public static fsy o(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new fsy(qkgVar, qkgVar2, qkgVar3, 20, (boolean[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        int i;
        lco lcoVarG;
        boolean z = false;
        switch (this.d) {
            case 0:
                return new dyx((lxb) this.a.get(), (dzb) this.c.get(), (dyz) this.b.get(), 12, 1, 1);
            case 1:
                Object obj = (((djc) this.a).get().c() && ((gjf) this.b).get().a) ? (ojc) this.c.get() : oih.a;
                qmd.ae(obj);
                return obj;
            case 2:
                final lap lapVar = (lap) this.c.get();
                final lnc lncVar = (lnc) this.a.get();
                return ((ojc) this.b.get()).b(new oiu() { // from class: ftx
                    @Override // defpackage.oiu
                    public final Object a(Object obj2) {
                        lap lapVar2 = lapVar;
                        lmv lmvVarR = lncVar.r((lqd) obj2, 45);
                        lapVar2.c(lmvVarR);
                        return lmvVarR;
                    }
                });
            case 3:
                return new fus(((liq) this.b).get(), (fuo) this.a.get(), (ddf) this.c.get());
            case 4:
                fxk fxkVar = (fxk) this.c.get();
                qkg qkgVar = this.a;
                lje ljeVar = new lje((ljf) this.b.get(), "MoreModesModule#provideMoreModesAgent");
                try {
                    ojc ojcVarI = ojc.i(new fxj(fxkVar, qkgVar));
                    ljeVar.close();
                    return ojcVarI;
                } catch (Throwable th) {
                    try {
                        ljeVar.close();
                        break;
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            case 5:
                qkg qkgVar2 = this.a;
                ((cjc) this.c).a();
                lje ljeVar2 = new lje((ljf) this.b.get(), "PanoramaModule#providePanoramaAgent");
                try {
                    ojc ojcVarI2 = ojc.i(new fxj(new fxk(jrl.IMAX), qkgVar2));
                    ljeVar2.close();
                    return ojcVarI2;
                } catch (Throwable th3) {
                    try {
                        ljeVar2.close();
                        break;
                    } catch (Throwable th4) {
                    }
                    throw th3;
                }
            case 6:
                ddf ddfVar = (ddf) this.b.get();
                lzi lziVar = (lzi) this.a.get();
                Context contextA = ((emp) this.c).a();
                if (ddfVar.k(dcu.J) && lziVar.f()) {
                    int i2 = contextA.getApplicationInfo().targetSdkVersion;
                    try {
                        i = Integer.parseInt(Build.VERSION.INCREMENTAL);
                    } catch (NumberFormatException e) {
                        ((oug) ((oug) fzc.a.c()).G(2000)).r("Build number (%s) is not a number. Ignoring version check for b/163282828.", Build.VERSION.INCREMENTAL);
                        i = -1;
                    }
                    if (Build.ID.startsWith("RP1A")) {
                        ((oug) ((oug) fzc.a.c()).G(1999)).r("Apply workaround: %b", Boolean.valueOf(i < 6774646 && i2 == 30));
                        if (i < 6774646 && i2 == 30) {
                            z = true;
                        }
                    }
                    break;
                }
                return Boolean.valueOf(z);
            case 7:
                fxk fxkVar2 = (fxk) this.c.get();
                qkg qkgVar3 = this.a;
                lje ljeVar3 = new lje((ljf) this.b.get(), "VideoModeModule#provideVideoAgent");
                try {
                    ojc ojcVarI3 = ojc.i(new fxj(fxkVar2, qkgVar3));
                    ljeVar3.close();
                    return ojcVarI3;
                } catch (Throwable th5) {
                    try {
                        ljeVar3.close();
                        break;
                    } catch (Throwable th6) {
                    }
                    throw th5;
                }
            case 8:
                fxk fxkVar3 = (fxk) this.c.get();
                qkg qkgVar4 = this.a;
                lje ljeVar4 = new lje((ljf) this.b.get(), "VideoIntentModeModule#provideVideoIntentAgent");
                try {
                    ojc ojcVarI4 = ojc.i(new fxj(fxkVar3, qkgVar4));
                    ljeVar4.close();
                    return ojcVarI4;
                } catch (Throwable th7) {
                    try {
                        ljeVar4.close();
                        break;
                    } catch (Throwable th8) {
                    }
                    throw th7;
                }
            case 9:
                return new gal(((gam) this.c).get().a, new gem((gej) this.b.get(), (Handler) this.a.get()));
            case 10:
                Object objI = !((Boolean) this.c.get()).booleanValue() ? orx.a : ope.I(new gbx(this.b, 0), new gbx(this.a, 2));
                qmd.ae(objI);
                return objI;
            case 11:
                ojc ojcVar = (ojc) this.b.get();
                final ojc ojcVar2 = (ojc) this.a.get();
                Executor executor = (Executor) this.c.get();
                if (ojcVar.g() && ((Boolean) ojcVar.c()).booleanValue()) {
                    return !ojcVar2.g() ? plk.V(oih.a) : plk.Z(new Callable() { // from class: gfa
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return ojc.i((lmt) ((qkg) ojcVar2.c()).get());
                        }
                    }, executor);
                }
                return plk.V(oih.a);
            case 12:
                ((etj) this.c).get();
                ((fsr) this.a).b();
                orx orxVar = orx.a;
                qmd.ae(orxVar);
                return orxVar;
            case 13:
                return new ghw(((fwj) this.c).get(), (fxc) this.b.get(), (pht) this.a.get());
            case 14:
                lco lcoVar = (lco) this.b.get();
                lvp lvpVar = ((gjp) this.c).get();
                if (!((ddf) this.a.get()).k(ddl.bu) || kdd.t == null) {
                    lcoVarG = lcv.g(fcy.l());
                } else {
                    CaptureRequest.Key key = kdd.t;
                    Iterator it = lvpVar.z().iterator();
                    while (it.hasNext()) {
                        if (((CaptureRequest.Key) it.next()).getName().equals(key.getName())) {
                            lcoVarG = fcy.m(kdd.t, lcv.j(lcoVar, eto.h));
                        }
                    }
                    lcoVarG = lcv.g(fcy.l());
                }
                qmd.ae(lcoVarG);
                return lcoVarG;
            case 15:
                return new gio(((gjo) this.c).get(), (gqs) this.a.get(), ((giy) this.b).get());
            case 16:
                return b((lap) this.a.get(), (pht) this.b.get(), (bxj) this.c.get());
            case 17:
                return new gpk(((dgb) this.a).get(), ((gjo) this.b).get(), (gqs) this.c.get());
            case 18:
                lco lcoVarA = ((gra) this.a).a();
                lco lcoVarA2 = ((gra) this.b).a();
                gfy gfyVar = (gfy) this.c.get();
                return new gqs(lcoVarA, lcoVarA2, gfyVar.b, gfyVar.c, gfyVar.d);
            case 19:
                ddf ddfVar2 = (ddf) this.a.get();
                lco lcoVarJ = (lco) this.c.get();
                final eam eamVar = (eam) this.b.get();
                if (ddfVar2.k(ddm.aa)) {
                    lcoVarJ = lcv.j(lcoVarJ, new oiu() { // from class: gpl
                        @Override // defpackage.oiu
                        public final Object a(Object obj2) {
                            return ((Boolean) eamVar.a().fA()).booleanValue() ? gjk.LONG_EXPOSURE : (gjk) obj2;
                        }
                    });
                }
                qmd.ae(lcoVarJ);
                return lcoVarJ;
            default:
                return ((lnc) this.c.get()).u((lnx) this.b.get(), ((pyw) this.a).get());
        }
    }
}

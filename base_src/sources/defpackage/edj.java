package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.apps.camera.hdrplus.deblurfusion.DeblurFusionControllerImpl;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class edj implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final /* synthetic */ int g;

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i) {
        this.g = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[] bArr) {
        this.g = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.e = qkgVar3;
        this.d = qkgVar4;
        this.f = qkgVar5;
        this.c = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[] cArr) {
        this.g = i;
        this.d = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.e = qkgVar4;
        this.a = qkgVar5;
        this.f = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, float[] fArr) {
        this.g = i;
        this.d = qkgVar;
        this.f = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.e = qkgVar5;
        this.c = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, int[] iArr) {
        this.g = i;
        this.f = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.b = qkgVar4;
        this.c = qkgVar5;
        this.e = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, short[] sArr) {
        this.g = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.e = qkgVar3;
        this.c = qkgVar4;
        this.f = qkgVar5;
        this.b = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, boolean[] zArr) {
        this.g = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.f = qkgVar5;
        this.e = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[][] bArr) {
        this.g = i;
        this.f = qkgVar;
        this.e = qkgVar2;
        this.a = qkgVar3;
        this.c = qkgVar4;
        this.d = qkgVar5;
        this.b = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[][] cArr) {
        this.g = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.f = qkgVar5;
        this.b = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, float[][] fArr) {
        this.g = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.f = qkgVar3;
        this.c = qkgVar4;
        this.a = qkgVar5;
        this.e = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, int[][] iArr) {
        this.g = i;
        this.d = qkgVar;
        this.e = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
        this.b = qkgVar5;
        this.f = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, short[][] sArr) {
        this.g = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.f = qkgVar3;
        this.e = qkgVar4;
        this.b = qkgVar5;
        this.a = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, boolean[][] zArr) {
        this.g = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.f = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.a = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, byte[][][] bArr) {
        this.g = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.d = qkgVar3;
        this.f = qkgVar4;
        this.c = qkgVar5;
        this.e = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, char[][][] cArr) {
        this.g = i;
        this.d = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.b = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, int[][][] iArr) {
        this.g = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.e = qkgVar3;
        this.a = qkgVar4;
        this.f = qkgVar5;
        this.b = qkgVar6;
    }

    public edj(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, int i, short[][][] sArr) {
        this.g = i;
        this.f = qkgVar;
        this.e = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
        this.b = qkgVar5;
        this.c = qkgVar6;
    }

    public static edj a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new edj(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 0);
    }

    public static edj b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new edj(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 3, (short[]) null);
    }

    public static edj c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new edj(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 5, (boolean[]) null);
    }

    public static edj d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new edj(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 10, (int[][]) null);
    }

    public static edj e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new edj(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 11, (boolean[][]) null);
    }

    public static edj f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new edj(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 14, (char[][][]) null);
    }

    public static edj g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new edj(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 15, (short[][][]) null);
    }

    public static edj h(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new edj(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, 16, (int[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Object objI;
        Object objI2;
        goy goyVar;
        switch (this.g) {
            case 0:
                ecb ecbVar = (ecb) this.a.get();
                eam eamVar = (eam) this.b.get();
                return new edi((imt) this.d.get(), ((ing) this.e).a(), eamVar.a(), ecbVar, (ddf) this.c.get(), (lap) this.f.get());
            case 1:
                return new ebb(this.a, (ddf) this.b.get(), (ljf) this.e.get(), ((hlj) this.d).a(), ((evv) this.f).a(), (pht) this.c.get());
            case 2:
                return new DeblurFusionControllerImpl((hgm) this.d.get(), (Executor) this.b.get(), (lce) this.c.get(), (ljf) this.e.get(), this.a, (ddf) this.f.get());
            case 3:
                return new eea((lnc) this.a.get(), (Map) this.d.get(), (lco) this.e.get(), (lco) this.c.get(), (lap) this.f.get(), (Executor) this.b.get());
            case 4:
                ddf ddfVar = (ddf) this.f.get();
                ojc ojcVar = (ojc) this.d.get();
                ((etg) this.b).get();
                ((etf) this.c).get();
                if (ojcVar.g()) {
                    fcy.a(ddfVar);
                }
                return obr.av(null);
            case 5:
                return new hoa(((eti) this.a).get(), ((eme) this.c).get(), this.d, ((Boolean) this.f.get()).booleanValue(), CameraActivity.class, (KeyguardManager) ((emd) this.b).get().getSystemService("keyguard"), (huf) this.e.get(), null, null);
            case 6:
                return new fkh(((emn) this.d).get(), (fvv) this.f.get(), (ScheduledExecutorService) this.b.get(), (eam) this.a.get(), (huj) this.e.get(), ((cbi) this.c).get());
            case 7:
                return new fkp(((emd) this.f).get(), (lar) this.e.get(), (ius) this.a.get(), ((cjc) this.c).a(), (ddf) this.d.get(), (lda) this.b.get());
            case 8:
                return new fno(((emd) this.c).get(), (elw) this.a.get(), (fnu) this.d.get(), (AtomicBoolean) this.e.get(), (fnq) this.f.get(), (ddf) this.b.get());
            case 9:
                return new fnu((lda) this.d.get(), (lda) this.c.get(), (fnq) this.f.get(), (imf) this.e.get(), (dqa) this.b.get(), (ddf) this.a.get());
            case 10:
                return new fqc((frn) this.d.get(), (fsf) this.e.get(), (ojc) this.c.get(), (lap) this.a.get(), (ddf) this.b.get(), ((liq) this.f).get());
            case 11:
                Context contextA = ((emp) this.b).a();
                lvp lvpVar = ((gjp) this.c).get();
                ddf ddfVar2 = (ddf) this.f.get();
                Executor executor = (Executor) this.d.get();
                ljf ljfVar = (ljf) this.e.get();
                lda ldaVar = (lda) this.a.get();
                ljl ljlVar = new ljl(executor, ljfVar, "SmartCaptureFQS");
                boolean zBooleanValue = ((Boolean) ldaVar.fA()).booleanValue();
                ddg ddgVar = ddd.a;
                ddfVar2.d();
                return hld.b(contextA, ddfVar2, lvpVar, ljlVar, ljfVar, zBooleanValue, oih.a);
            case 12:
                fxk fxkVar = (fxk) this.b.get();
                qkg qkgVar = this.d;
                qkg qkgVar2 = this.f;
                ddf ddfVar3 = (ddf) this.c.get();
                lwf lwfVar = (lwf) this.a.get();
                lje ljeVar = new lje((ljf) this.e.get(), "SlowMotionModeModule#provideVideoHfrAgent");
                try {
                    if (lwfVar.k()) {
                        objI = ddfVar3.k(dcu.J) ? ojc.i(new fxj(fxkVar, qkgVar2)) : ojc.i(new fxj(fxkVar, qkgVar));
                    } else {
                        objI = oih.a;
                    }
                    ljeVar.close();
                    return objI;
                } catch (Throwable th) {
                    try {
                        ljeVar.close();
                        break;
                    } catch (Throwable th2) {
                    }
                    throw th;
                }
            case 13:
                boolean zBooleanValue2 = ((bpk) this.b).a().booleanValue();
                fxk fxkVar2 = (fxk) this.a.get();
                qkg qkgVar3 = this.d;
                qkg qkgVar4 = this.f;
                ddf ddfVar4 = (ddf) this.c.get();
                lje ljeVar2 = new lje((ljf) this.e.get(), "TimelapseModeModule#provideTimelapseAgent");
                try {
                    if (zBooleanValue2) {
                        objI2 = ddfVar4.k(dcu.J) ? ojc.i(new fxj(fxkVar2, qkgVar4)) : ojc.i(new fxj(fxkVar2, qkgVar3));
                    } else {
                        objI2 = oih.a;
                    }
                    ljeVar2.close();
                    return objI2;
                } catch (Throwable th3) {
                    try {
                        ljeVar2.close();
                        break;
                    } catch (Throwable th4) {
                    }
                    throw th3;
                }
            case 14:
                return new gej(((liq) this.d).get(), (ddf) this.a.get(), (gcl) this.e.get(), (gay) this.b.get(), ((gcb) this.c).get(), (hcg) this.f.get());
            case 15:
                boolean zBooleanValue3 = ((gqf) this.f).b().booleanValue();
                ojc ojcVar2 = (ojc) this.e.get();
                qkg qkgVar5 = this.d;
                qkg qkgVar6 = this.a;
                qkg qkgVar7 = this.b;
                jrl jrlVar = ((giv) this.c).get();
                if (zBooleanValue3 && jrlVar != jrl.IMAGE_INTENT) {
                    goyVar = (goy) qkgVar7.get();
                } else {
                    if (!ojcVar2.g()) {
                        throw new UnsupportedOperationException("Stream configuration not supported");
                    }
                    goyVar = jrlVar == jrl.IMAGE_INTENT ? (goy) qkgVar6.get() : (goy) qkgVar5.get();
                }
                qmd.ae(goyVar);
                return goyVar;
            default:
                ddf ddfVar5 = (ddf) this.c.get();
                qkg qkgVar8 = this.d;
                qkg qkgVar9 = this.e;
                goo gooVar = (goo) this.a.get();
                hae haeVar = (hae) this.f.get();
                goy goyVarA = ddfVar5.k(ddl.aS) ? ((han) qkgVar9).get().a() : ((haq) qkgVar8).get();
                return gooVar.c(haeVar.a(fvq.D(goyVarA)), goyVarA);
        }
    }
}

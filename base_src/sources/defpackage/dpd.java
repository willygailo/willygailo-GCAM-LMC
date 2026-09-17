package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class dpd implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[] cArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[] fArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[] iArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[] zArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][] bArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][] cArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[][] fArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][] iArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][] sArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][][] cArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][][] iArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][][] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public dpd(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[][][] zArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public static dpd a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new dpd(qkgVar, qkgVar2, qkgVar3, 2, (byte[]) null);
    }

    public static dpd b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new dpd(qkgVar, qkgVar2, qkgVar3, 3, (char[]) null);
    }

    public static dpd c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new dpd(qkgVar, qkgVar2, qkgVar3, 4, (short[]) null);
    }

    public static dpd d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new dpd(qkgVar, qkgVar2, qkgVar3, 11, (int[][]) null);
    }

    public static dpd e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new dpd(qkgVar, qkgVar2, qkgVar3, 12, (boolean[][]) null);
    }

    public static dpd f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new dpd(qkgVar, qkgVar2, qkgVar3, 13, (float[][]) null);
    }

    public static dpd g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new dpd(qkgVar, qkgVar2, qkgVar3, 14, (byte[][][]) null);
    }

    public static dpd h(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new dpd(qkgVar, qkgVar2, qkgVar3, 15, (char[][][]) null);
    }

    public static dpd i(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new dpd(qkgVar, qkgVar2, qkgVar3, 16, (short[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        final int i = 1;
        switch (this.d) {
            case 0:
                Object objH = !((Boolean) this.a.get()).booleanValue() ? orx.a : ope.H(jwv.a((jwu) this.c.get(), (lco) this.b.get(), jwt.FACE_OBFUSCATION));
                qmd.ae(objH);
                return objH;
            case 1:
                lco lcoVarB = ((eej) this.a).b();
                final boolean zBooleanValue = ((Boolean) this.b.get()).booleanValue();
                dom domVar = new dom((Executor) this.c.get());
                domVar.g(lcv.j(lcoVarB, new oiu() { // from class: don
                    @Override // defpackage.oiu
                    public final Object a(Object obj) {
                        htf htfVar = (htf) obj;
                        boolean z = false;
                        if (zBooleanValue && htfVar != htf.OFF) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                }));
                return domVar;
            case 2:
                boolean zBooleanValue2 = ((Boolean) this.b.get()).booleanValue();
                lap lapVar = (lap) this.a.get();
                qkg qkgVar = this.c;
                if (!zBooleanValue2) {
                    return new dpv();
                }
                dpt dptVar = ((dpu) qkgVar).get();
                lapVar.c(dptVar);
                return dptVar;
            case 3:
                return new dqi((jth) this.c.get(), ((gjc) this.a).get());
            case 4:
                lnc lncVar = (lnc) this.b.get();
                ojc ojcVar = (ojc) this.a.get();
                lap lapVar2 = (lap) this.c.get();
                if (!ojcVar.g()) {
                    return oih.a;
                }
                lmv lmvVarR = lncVar.r((lqd) ojcVar.c(), 2);
                lapVar2.c(lmvVarR);
                return ojc.i(lmvVarR);
            case 5:
                dqw dqwVar = (dqw) this.c.get();
                dqw dqwVar2 = (dqw) this.b.get();
                dqw dqwVar3 = (dqw) this.a.get();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (!Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", "feature.acmi.camera.diet-interestingness")) {
                    throw new IllegalArgumentException("Feature with bad type name 'feature.acmi.camera.diet-interestingness'!");
                }
                arrayList.add(dqwVar);
                arrayList.add(dqwVar2);
                arrayList.add(dqwVar3);
                return enl.J("feature.acmi.camera.diet-interestingness", arrayList, arrayList2);
            case 6:
                return enl.I(new hnq((dqx) this.a.get()), (dsz) this.b.get(), ((dsa) this.c).a());
            case 7:
                SensorManager sensorManager = ((ena) this.a).get();
                dqv dqvVarA = ((dsa) this.c).a();
                dsz dszVar = (dsz) this.b.get();
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                if (defaultSensor == null) {
                    ((oug) ((oug) dsj.a.c()).G((char) 910)).o("Accelerometer sensor not found! Signal will be missing.");
                    return dru.b(dszVar).a();
                }
                dsi dsiVar = new dsi(dszVar);
                drp drpVarB = dru.b(dszVar);
                drpVarB.c = dqvVarA;
                drpVarB.d.add(new dri(defaultSensor, dsiVar));
                return drpVarB.a();
            case 8:
                lxb lxbVar = (lxb) this.a.get();
                dqv dqvVarA2 = ((dsa) this.c).a();
                dsz dszVar2 = (dsz) this.b.get();
                final dsf dsfVar = new dsf(lxbVar, dszVar2);
                drp drpVarB2 = dru.b(dszVar2);
                drpVarB2.c = dqvVarA2;
                drpVarB2.b(dsfVar);
                drpVarB2.a.add(new drj(new Runnable() { // from class: dsh
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                dsf dsfVar2 = dsfVar;
                                synchronized (dsfVar2.b) {
                                    lxa lxaVar = dsfVar2.c;
                                    if (lxaVar != null) {
                                        lxaVar.close();
                                        dsfVar2.c = null;
                                    }
                                    break;
                                }
                                return;
                            default:
                                dsf dsfVar3 = dsfVar;
                                synchronized (dsfVar3.b) {
                                    if (dsfVar3.c == null) {
                                        dsfVar3.c = dsfVar3.a.a("FeatureCentral");
                                    }
                                    break;
                                }
                                return;
                        }
                    }
                }));
                final int i2 = 0;
                drpVarB2.a.add(new drk(new Runnable() { // from class: dsh
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                dsf dsfVar2 = dsfVar;
                                synchronized (dsfVar2.b) {
                                    lxa lxaVar = dsfVar2.c;
                                    if (lxaVar != null) {
                                        lxaVar.close();
                                        dsfVar2.c = null;
                                    }
                                    break;
                                }
                                return;
                            default:
                                dsf dsfVar3 = dsfVar;
                                synchronized (dsfVar3.b) {
                                    if (dsfVar3.c == null) {
                                        dsfVar3.c = dsfVar3.a.a("FeatureCentral");
                                    }
                                    break;
                                }
                                return;
                        }
                    }
                }));
                return drpVarB2.a();
            case 9:
                jry jryVar = ((hkx) this.a).get();
                dqv dqvVarA3 = ((dsa) this.c).a();
                dsz dszVar3 = (dsz) this.b.get();
                drp drpVarB3 = dru.b(dszVar3);
                drpVarB3.c = dqvVarA3;
                drr drrVar = new drr(new dsg(jryVar, dszVar3, null));
                drpVarB3.b(drrVar);
                drpVarB3.c(new drl(drrVar));
                return drpVarB3.a();
            case 10:
                return new dtt((dtp) this.a.get(), (FilmstripTransitionLayout) this.c.get(), (bue) this.b.get());
            case 11:
                gsf gsfVar = ((gsi) this.b).get();
                ddf ddfVar = (ddf) this.c.get();
                lig ligVar = ((gjc) this.a).get();
                lig ligVar2 = gsfVar.b;
                if (ddfVar.k(ddm.X)) {
                    return ligVar;
                }
                if (lhs.b.k(lhs.h(ligVar2))) {
                    return dvv.b;
                }
                obr.aF(lhs.a.k(lhs.h(ligVar2)));
                return dvv.a;
            case 12:
                gxm gxmVar = ((djc) this.c).get();
                ddf ddfVar2 = (ddf) this.b.get();
                nez nezVar = ((gjf) this.a).get();
                enl.G(gxmVar, ddfVar2, nezVar);
                if (enl.F(gxmVar, nezVar)) {
                    ddi ddiVar = ddr.a;
                    ddfVar2.c();
                    if (kcz.p != null) {
                        return fcy.i(kcz.p, kcz.q);
                    }
                }
                return fcy.l();
            case 13:
                return new dyz((enm) this.a.get(), (ghx) this.c.get(), (lvp) this.b.get());
            case 14:
                return new eax((ead) this.b.get(), ((cjc) this.a).a(), ((giv) this.c).get());
            case 15:
                return new ebd((lco) this.b.get(), (Executor) this.c.get(), (lap) this.a.get());
            case 16:
                return aas.d(((ljf) this.a.get()).c("HdrPlusImageCaptureAvailability", new gpf((pih) this.c.get(), this.b, 1)), "hdrplusa");
            case 17:
                return new egr(((emn) this.a).get(), (fvv) this.b.get(), (ScheduledExecutorService) this.c.get());
            case 18:
                return new eip((eij) this.b.get(), (ehj) this.c.get(), (huf) this.a.get());
            case 19:
                return new ejf(((emn) this.a).get(), (fvv) this.b.get(), ((cbi) this.c).get());
            default:
                Object objH2 = (((ddf) this.b.get()).k(dcv.b) && ((bpk) this.c).a().booleanValue()) ? ope.H((cbm) pyr.a(this.a).get()) : orx.a;
                qmd.ae(objH2);
                return objH2;
        }
    }
}

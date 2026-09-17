package defpackage;

import MC.hslh;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import com.Fix.Pref;
import com.SDE.LensValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gcc implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public gcc(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public gcc(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gcc(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gcc(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gcc(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gcc(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gcc(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gcc(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gcc(qkg qkgVar, qkg qkgVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gcc(qkg qkgVar, qkg qkgVar2, int i, int[][] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public gcc(qkg qkgVar, qkg qkgVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static gcc a(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 0);
    }

    public static gcc b(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 1, (byte[]) null);
    }

    public static gcc c(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 2);
    }

    public static gcc d(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 3);
    }

    public static gcc e(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 4, (char[]) null);
    }

    public static gcc f(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 5);
    }

    public static gcc g(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 6, (short[]) null);
    }

    public static gcc h(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 7);
    }

    public static gcc i(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 8);
    }

    public static gcc j(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 9, (int[]) null);
    }

    public static gcc k(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 10);
    }

    public static gcc l(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 11, (boolean[]) null);
    }

    public static gcc m(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 12);
    }

    public static gcc n(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 13, (float[]) null);
    }

    public static gcc o(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 15, (char[][]) null);
    }

    public static gcc p(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 16);
    }

    public static gcc q(qkg qkgVar, qkg qkgVar2) {
        return new gcc(qkgVar, qkgVar2, 18, (int[][]) null);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, lco] */
    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Range rangeGetTargetFps;
        char c = 1;
        final int i = 0;
        switch (this.c) {
            case 0:
                return Boolean.valueOf(((djc) this.a).get().d() && ((gjf) this.b).get().a);
            case 1:
                Object gecVar = ((djc) this.a).get().d() ? (ges) this.b.get() : new gec();
                qmd.ae(gecVar);
                return gecVar;
            case 2:
                ojc ojcVar = (ojc) this.a.get();
                ojc ojcVar2 = (ojc) this.b.get();
                return (ojcVar2.g() && ((Boolean) ojcVar2.c()).booleanValue() && ojcVar.g()) ? ojc.i((gfj) ((qkg) ojcVar.c()).get()) : oih.a;
            case 3:
                lco lcoVarJ = lcv.j(lcv.d(lcv.j(((ggo) this.b.get()).a, new brr(2)), ((imy) this.a.get()).a), new brr(3));
                qmd.ae(lcoVarJ);
                return lcoVarJ;
            case 4:
                lap lapVar = (lap) this.b.get();
                lap lapVar2 = (lap) this.a.get();
                final ScheduledExecutorService scheduledExecutorServiceBP = mip.bP("SchCameraEx", 1);
                final char c2 = c == true ? 1 : 0;
                lapVar.c(new lie() { // from class: gid
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        switch (c2) {
                            case 0:
                                scheduledExecutorServiceBP.shutdownNow();
                                break;
                            default:
                                scheduledExecutorServiceBP.shutdown();
                                break;
                        }
                    }
                });
                lapVar2.c(new lie() { // from class: gid
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        switch (i) {
                            case 0:
                                scheduledExecutorServiceBP.shutdownNow();
                                break;
                            default:
                                scheduledExecutorServiceBP.shutdown();
                                break;
                        }
                    }
                });
                return scheduledExecutorServiceBP;
            case 5:
                ghx ghxVar = ((gjo) this.a).get();
                ddf ddfVar = (ddf) this.b.get();
                ddi ddiVar = ddm.a;
                ddfVar.b();
                ddi ddiVar2 = ddl.a;
                ddfVar.d();
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
                List<Range> listU = ghxVar.u();
                if (Pref.MenuValue(LensValue.SetLensValue("pref_vffps_key")) == 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Range range : listU) {
                        if (((Integer) range.getUpper()).intValue() <= 30) {
                            arrayList.add(range);
                        }
                    }
                    Collections.sort(arrayList, new cdg(13));
                    if (arrayList.isEmpty()) {
                        throw new UnsupportedOperationException("No fps range with upper value at or below 30fps.");
                    }
                    rangeGetTargetFps = (Range) arrayList.get(0);
                } else {
                    rangeGetTargetFps = hslh.GetTargetFps();
                }
                return fcy.i(key, rangeGetTargetFps);
            case 6:
                ghf ghfVar = (ghf) this.b.get();
                ojc ojcVar3 = (ojc) this.a.get();
                if (ojcVar3.g()) {
                    ghfVar = (ghf) ojcVar3.c();
                }
                lco lcoVarM = fcy.m(CaptureRequest.CONTROL_AWB_MODE, ghfVar.a);
                qmd.ae(lcoVarM);
                return lcoVarM;
            case 7:
                return new bxl((Executor) this.a.get(), (pht) this.b.get());
            case 8:
                return new bxl((Executor) this.a.get(), (pht) this.b.get());
            case 9:
                return new gnm(this.b, (lbu) this.a.get());
            case 10:
                return new got((goy) this.a.get(), (hsl) this.b.get());
            case 11:
                return new gou((goy) this.b.get(), (lij) this.a.get());
            case 12:
                gvm gvmVar = (gvm) this.a.get();
                gpk gpkVar = (gpk) this.b.get();
                gvmVar.n(lnb.a(gpkVar));
                qmd.ae(gpkVar);
                return gpkVar;
            case 13:
                return ((ddf) this.a.get()).k(ddm.aa) ? ojc.i((hdz) this.b.get()) : oih.a;
            case 14:
                gzf gzfVar = ((eqi) this.b).get();
                goy goyVar = (goy) this.a.get();
                hen henVar = (hen) gzfVar.b.get();
                henVar.getClass();
                lco lcoVar = (lco) gzfVar.f.get();
                lcoVar.getClass();
                lap lapVar3 = (lap) gzfVar.h.get();
                lapVar3.getClass();
                ojc ojcVarA = ((evv) gzfVar.e).a();
                Object obj = gzfVar.a.get();
                ?? r8 = gzfVar.d.get();
                lda ldaVar = (lda) gzfVar.c.get();
                ldaVar.getClass();
                qkg qkgVar = gzfVar.g;
                goyVar.getClass();
                return new eqh(henVar, lcoVar, lapVar3, ojcVarA, (eqa) obj, r8, ldaVar, qkgVar, goyVar);
            case 15:
                Object gxqVar = ((gjo) this.a).get().k() == lwd.FRONT ? (gxl) this.b.get() : new gxq();
                qmd.ae(gxqVar);
                return gxqVar;
            case 16:
                lnc lncVar = (lnc) this.a.get();
                Map map = (Map) this.b.get();
                EnumMap enumMap = new EnumMap(hdr.class);
                for (hdr hdrVar : map.keySet()) {
                    enumMap.put(hdrVar, lncVar.b().a((lnz) map.get(hdrVar)));
                }
                return enumMap;
            case 17:
                mhm mhmVar = ((gor) this.b).get();
                goy goyVar2 = (goy) this.a.get();
                grz grzVar = (grz) mhmVar.b.get();
                grzVar.getClass();
                Object obj2 = mhmVar.a.get();
                goyVar2.getClass();
                return new goq(grzVar, (gzf) obj2, goyVar2, null);
            default:
                Object objA = ((gjo) this.a).get().k() == lwd.FRONT ? (gxl) this.b.get() : gvo.a();
                qmd.ae(objA);
                return objA;
        }
    }
}

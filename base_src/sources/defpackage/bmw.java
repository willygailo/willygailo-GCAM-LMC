package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.autotimer.analysis.jni.Curator;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bmw implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public bmw(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, float[][] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, int[][] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, boolean[][] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, byte[][][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public bmw(qkg qkgVar, qkg qkgVar2, int i, char[][][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static bmw a(qkg qkgVar, qkg qkgVar2) {
        return new bmw(qkgVar, qkgVar2, 1);
    }

    public static bmw b(qkg qkgVar, qkg qkgVar2) {
        return new bmw(qkgVar, qkgVar2, 6, (int[]) null);
    }

    public static bmw c(qkg qkgVar, qkg qkgVar2) {
        return new bmw(qkgVar, qkgVar2, 11, (byte[][]) null);
    }

    public static bmw d(qkg qkgVar, qkg qkgVar2) {
        return new bmw(qkgVar, qkgVar2, 12, (char[][]) null);
    }

    public static bmw e(qkg qkgVar, qkg qkgVar2) {
        return new bmw(qkgVar, qkgVar2, 19);
    }

    public static bmw f(qkg qkgVar, qkg qkgVar2) {
        return new bmw(qkgVar, qkgVar2, 20, (char[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        Object objH;
        lxa lxaVarA;
        switch (this.c) {
            case 0:
                return new bmv((huq) this.a.get(), (bui) this.b.get(), null);
            case 1:
                Object objH2 = !((gjo) this.a).get().E() ? orx.a : ope.H(fcy.m(CaptureRequest.CONTROL_AF_REGIONS, ((ggk) this.b).get()));
                qmd.ae(objH2);
                return objH2;
            case 2:
                Object obj = ((jrj) this.a).get() == jrl.PHOTO ? bqi.b : (iho) this.b.get();
                qmd.ae(obj);
                return obj;
            case 3:
                Object obj2 = ((jrj) this.a).get() != jrl.PHOTO ? bqi.a : (iho) this.b.get();
                qmd.ae(obj2);
                return obj2;
            case 4:
                return new bqt(((emp) this.b).a(), (hug) this.a.get());
            case 5:
                return new brb((bqs) this.a.get(), (CameraActivityTiming) this.b.get());
            case 6:
                return new brc(((emk) this.b).get(), (lar) this.a.get());
            case 7:
                ddf ddfVar = (ddf) this.a.get();
                qkg qkgVar = this.b;
                if (ddfVar.k(dcs.c)) {
                    bsq bsqVar = (bsq) qkgVar.get();
                    bst bstVar = bsqVar.a;
                    bsqVar.h();
                    objH = ope.H(bsqVar);
                } else {
                    objH = orx.a;
                }
                qmd.ae(objH);
                return objH;
            case 8:
                ddf ddfVar2 = (ddf) this.b.get();
                qkg qkgVar2 = this.a;
                ddi ddiVar = dcs.a;
                ddfVar2.c();
                bta btaVar = (bta) qkgVar2.get();
                Object objH3 = btaVar.a.c() ? ope.H(btaVar) : orx.a;
                qmd.ae(objH3);
                return objH3;
            case 9:
                ((bte) this.a).get();
                btf btfVar = new btf();
                ddf ddfVar3 = (ddf) this.b.get();
                if (ddfVar3.k(ddl.aK)) {
                    ddfVar3.b();
                }
                return btfVar;
            case 10:
                return new bxl((Executor) this.b.get(), (pht) this.a.get());
            case 11:
                return new bxl(((bwq) this.b).a(), (pht) this.a.get());
            case 12:
                Object obj3 = this.b.get();
                bxj bxjVar = (bxj) this.a.get();
                pht phtVar = ((bxf) obj3).d;
                phtVar.d(new gng(bxjVar.b(), 1), pgr.INSTANCE);
                return phtVar;
            case 13:
                return new bxl((Executor) this.b.get(), (pht) this.a.get());
            case 14:
                return new ljl(((bxs) this.b).a(), (ljf) this.a.get(), "IOTask");
            case 15:
                return new bxj((ljf) this.a.get(), (ScheduledExecutorService) this.b.get());
            case 16:
                return ((bxj) this.a.get()).a((Executor) this.b.get());
            case 17:
                return new bxn((Executor) this.b.get(), (ScheduledExecutorService) this.a.get());
            case 18:
                return ((ddf) this.a.get()).k(ddm.aa) ? ((evv) this.b).a() : oih.a;
            case 19:
                ojc ojcVar = (ojc) this.a.get();
                lap lapVar = (lap) this.b.get();
                if (!ojcVar.g() || (lxaVarA = ((lxb) ojcVar.c()).a("AutoTimerSession")) == null) {
                    return oih.a;
                }
                lapVar.c(lxaVarA);
                return ojc.i(lxaVarA);
            default:
                ddf ddfVar4 = (ddf) this.b.get();
                Context contextA = ((emp) this.a).a();
                int i = dct.a;
                ddfVar4.d();
                poy poyVarM = pum.r.m();
                String absolutePath = contextA.getCacheDir().getAbsolutePath();
                if (poyVarM.c) {
                    poyVarM.m();
                    poyVarM.c = false;
                }
                pum pumVar = (pum) poyVarM.b;
                absolutePath.getClass();
                int i2 = pumVar.a | 16777216;
                pumVar.a = i2;
                pumVar.n = absolutePath;
                int i3 = i2 | 2;
                pumVar.a = i3;
                pumVar.d = false;
                pumVar.c = 1;
                pumVar.a = i3 | 1;
                Curator curator = new Curator((pum) poyVarM.j());
                curator.nativeSetCaptureEnabled(true);
                return curator;
        }
    }
}

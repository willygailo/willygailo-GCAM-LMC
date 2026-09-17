package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class elc implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[] cArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[] fArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[] iArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[] sArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[] zArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][] bArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][] cArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[][] fArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][] iArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public elc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.a = qkgVar3;
    }

    public static elc a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new elc(qkgVar, qkgVar2, qkgVar3, 2, (char[]) null);
    }

    public static elc b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new elc(qkgVar, qkgVar2, qkgVar3, 18, (int[][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.d) {
            case 0:
                Activity activity = ((eme) this.a).get();
                ((emd) this.b).get();
                efb.a();
                return new mip(activity);
            case 1:
                Object objH = (!((ddf) this.b.get()).k(dcv.b) || ((bpk) this.a).a().booleanValue()) ? orx.a : ope.H((dbr) pyr.a(this.c).get());
                qmd.ae(objH);
                return objH;
            case 2:
                Object obj = (((ddf) this.c.get()).k(ddm.ak) && ((Boolean) ((lda) this.b.get()).fA()).booleanValue()) ? (ojc) this.a.get() : oih.a;
                qmd.ae(obj);
                return obj;
            case 3:
                ddf ddfVar = (ddf) this.a.get();
                ((djt) this.c).get();
                return new jtx(ddfVar, (byte[]) null);
            case 4:
                return ((ghr) this.a.get()).a(((fbg) this.b).get(), ((ewk) this.c).b(), new nez(true), jrl.PHOTO);
            case 5:
                fxk fxkVar = (fxk) this.a.get();
                qkg qkgVar = this.b;
                lje ljeVar = new lje((ljf) this.c.get(), "CaptureModeModule#providePhotoAgent");
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
            case 6:
                fxk fxkVar2 = (fxk) this.a.get();
                qkg qkgVar2 = this.b;
                lje ljeVar2 = new lje((ljf) this.c.get(), "CaptureModeModule#providePhotoIntentAgent");
                try {
                    ojc ojcVarI2 = ojc.i(new fxj(fxkVar2, qkgVar2));
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
            case 7:
                fxk fxkVar3 = (fxk) this.a.get();
                qkg qkgVar3 = this.b;
                lje ljeVar3 = new lje((ljf) this.c.get(), "LongExposureModeModule#provideLongExposureAgent");
                try {
                    ojc ojcVarI3 = ojc.i(new fxj(fxkVar3, qkgVar3));
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
                fxk fxkVar4 = (fxk) this.a.get();
                qkg qkgVar4 = this.b;
                lje ljeVar4 = new lje((ljf) this.c.get(), "MotionBlurModeModule#provideMotionBlurAgent");
                try {
                    ojc ojcVarI4 = ojc.i(new fxj(fxkVar4, qkgVar4));
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
                return ((ghr) this.a.get()).a(((fbg) this.b).get(), ((ewk) this.c).b(), new nez(false), jrl.IMAGE_INTENT);
            case 10:
                return new iln(((fbr) this.a).get(), (huf) this.c.get(), oih.a, (ddf) this.b.get());
            case 11:
                return new iln(((fcf) this.a).get(), (huf) this.c.get(), oih.a, (ddf) this.b.get());
            case 12:
                return ((gqf) this.a).b().booleanValue() ? ((jja) this.b).get() : ((jjc) this.c).get();
            case 13:
                fja fjaVar = ((fjb) this.b).get();
                enl.e((lar) this.c.get(), ((fhq) this.a).get(), fjaVar);
                return fjaVar;
            case 14:
                return new fjh(((emp) this.a).a(), (ScheduledExecutorService) this.b.get(), (ljf) this.c.get());
            case 15:
                return new fjr((fjs) this.c.get(), ((dgb) this.b).get(), (ScheduledExecutorService) this.a.get());
            case 16:
                return new fkj(((emn) this.c).get(), (fvv) this.b.get(), (ScheduledExecutorService) this.a.get());
            case 17:
                final jdy jdyVar = (jdy) this.b.get();
                final qkg qkgVar5 = this.c;
                final bqg bqgVar = ((etg) this.a).get();
                final byte[] bArr = null;
                final byte[] bArr2 = null;
                final byte[] bArr3 = null;
                return new iho(jdyVar, qkgVar5, bArr, bArr2, bArr3) { // from class: fmo
                    public final /* synthetic */ qkg a;
                    public final /* synthetic */ jdy c;

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.b.i().c(this.c.f(((fmr) this.a).get()));
                    }
                };
            case 18:
                return new fnm((gfu) this.c.get(), ((giz) this.b).get(), ((gjo) this.a).get());
            case 19:
                return new fnq((ilx) this.c.get(), (ddf) this.b.get(), (Executor) this.a.get());
            default:
                return new fox((fnv) this.c.get(), (lda) this.b.get(), (ddf) this.a.get());
        }
    }
}

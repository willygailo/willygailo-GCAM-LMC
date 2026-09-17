package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.media.MediaFormat;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class esp implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public esp(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public esp(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public esp(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public esp(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public esp(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public esp(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public esp(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public esp(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public esp(qkg qkgVar, qkg qkgVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public esp(qkg qkgVar, qkg qkgVar2, int i, int[][] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public esp(qkg qkgVar, qkg qkgVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public esp(qkg qkgVar, qkg qkgVar2, int i, boolean[][] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static esp a(qkg qkgVar, qkg qkgVar2) {
        return new esp(qkgVar, qkgVar2, 11);
    }

    public static esp b(qkg qkgVar, qkg qkgVar2) {
        return new esp(qkgVar, qkgVar2, 12);
    }

    public static esp c(qkg qkgVar, qkg qkgVar2) {
        return new esp(qkgVar, qkgVar2, 13);
    }

    public static esp d(qkg qkgVar, qkg qkgVar2) {
        return new esp(qkgVar, qkgVar2, 14);
    }

    public static esp e(qkg qkgVar, qkg qkgVar2) {
        return new esp(qkgVar, qkgVar2, 15, (short[][]) null);
    }

    public static esp f(qkg qkgVar, qkg qkgVar2) {
        return new esp(qkgVar, qkgVar2, 16);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        final int i = 1;
        switch (this.c) {
            case 0:
                return ((ddf) this.b.get()).k(ddt.f) ? ((evv) this.a).a() : oih.a;
            case 1:
                return ((ddf) this.b.get()).k(ddt.e) ? ((evv) this.a).a() : oih.a;
            case 2:
                Map map = ((pyu) this.b).get();
                ljf ljfVar = (ljf) this.a.get();
                ljfVar.e("ModuleManager#provide");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    if (((ojc) entry.getValue()).g()) {
                        arrayList.add((fxj) ((ojc) entry.getValue()).c());
                    }
                }
                fxi fxiVar = new fxi(arrayList, jrl.PHOTO);
                ljfVar.f();
                return fxiVar;
            case 3:
                final ghu ghuVar = (ghu) this.b.get();
                final ghw ghwVar = (ghw) this.a.get();
                return new iho() { // from class: ewg
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                ghwVar.a(ghuVar);
                                break;
                            default:
                                ghwVar.a(ghuVar);
                                break;
                        }
                    }
                };
            case 4:
                final ghu ghuVar2 = (ghu) this.b.get();
                final ghw ghwVar2 = (ghw) this.a.get();
                final int i2 = 0;
                return new iho() { // from class: ewg
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                ghwVar2.a(ghuVar2);
                                break;
                            default:
                                ghwVar2.a(ghuVar2);
                                break;
                        }
                    }
                };
            case 5:
                ddf ddfVar = (ddf) this.b.get();
                ljf ljfVar2 = (ljf) this.a.get();
                ljfVar2.e("OneFeatureConfig#provide");
                gfw gfwVar = new gfw(((Integer) ddfVar.a(ddu.d).c()).intValue(), ((Integer) ddfVar.a(ddu.b).c()).intValue());
                ljfVar2.f();
                return gfwVar;
            case 6:
                return new ljl(plk.M((Executor) this.b.get()), (ljf) this.a.get(), "OneCameraCreator");
            case 7:
                Object objH = ((bpk) this.b).a().booleanValue() ? ope.H((cbm) pyr.a(this.a).get()) : orx.a;
                qmd.ae(objH);
                return objH;
            case 8:
                return !((bpk) this.a).a().booleanValue() ? oih.a : ((evv) this.b).a();
            case 9:
                Application application = ((emo) this.b).get();
                ddf ddfVar2 = (ddf) this.a.get();
                ActivityManager activityManager = (ActivityManager) application.getSystemService(ActivityManager.class);
                if (activityManager == null) {
                    return new lxx(134217728L);
                }
                int iIntValue = ((Integer) ddfVar2.a(ddl.m).c()).intValue();
                if (iIntValue > 0) {
                    return new lxx(((long) iIntValue) * 1048576);
                }
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                return new lxx(Math.max(134217728L, (memoryInfo.totalMem - (memoryInfo.threshold + 805306368)) / 3));
            case 10:
                ddf ddfVar3 = (ddf) this.a.get();
                return new mos(ddfVar3);
            case 11:
                return new fqy((fpo) this.a.get(), (ojc) this.b.get());
            case 12:
                return !((ojc) this.b.get()).g() ? oih.a : ojc.i((fpz) this.a.get());
            case 13:
                ojc ojcVarB = ((fsr) this.a).b();
                ojc ojcVarB2 = ((fsr) this.b).b();
                return (ojcVarB.g() && ojcVarB2.g()) ? new fmx((lnx) ojcVarB.c(), (lmv) ojcVarB2.c()) : new foy();
            case 14:
                ddf ddfVar4 = (ddf) this.a.get();
                MediaFormat mediaFormat = ((fsz) this.b).get();
                ddi ddiVar = ddr.a;
                ddfVar4.d();
                return new fri(mediaFormat);
            case 15:
                return ((ojc) this.a.get()).b(new hcw((lnc) this.b.get(), 1));
            case 16:
                return new ftz((dyx) this.a.get(), (lig) this.b.get());
            case 17:
                return ((ddf) this.b.get()).j(ddr.f) ? ojc.i((fui) this.a.get()) : oih.a;
            case 18:
                return new mip();
            case 19:
                return new dnj(((emd) this.a).get(), (View) ((jnw) this.b).get().k.c(R.id.preview_overlay));
            default:
                ddf ddfVar5 = (ddf) this.b.get();
                ldz ldzVar = ((Boolean) this.a.get()).booleanValue() ? ldz.FPS_240_HFR_8X : ldz.FPS_120_HFR_4X;
                ojc ojcVarA = ddfVar5.a(dcu.b);
                if (ojcVarA.g() && ((Integer) ojcVarA.c()).intValue() == 240) {
                    ldzVar = ldz.FPS_240_HFR_8X;
                }
                return new lce(ldzVar);
        }
    }
}

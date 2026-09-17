package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.camera.stats.Instrumentation;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class ije implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public ije(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, float[][] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, int[][] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, short[][] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public ije(qkg qkgVar, qkg qkgVar2, int i, boolean[][] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public static ije a(qkg qkgVar, qkg qkgVar2) {
        return new ije(qkgVar, qkgVar2, 8);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return new ija((Instrumentation) this.a.get(), (mcu) this.b.get(), 4);
            case 1:
                return new ija((Instrumentation) this.a.get(), (mcu) this.b.get(), 3);
            case 2:
                return new ija((Instrumentation) this.a.get(), (mcu) this.b.get(), 5);
            case 3:
                return new nez((lzh) this.b.get(), (ddf) this.a.get());
            case 4:
                final Context contextA = ((emp) this.b).a();
                final lar larVar = (lar) this.a.get();
                final dei deiVarA = dug.a();
                return new iho() { // from class: ikr
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        dei deiVar = deiVarA;
                        Context context = contextA;
                        lar larVar2 = larVar;
                        if (deiVar == dei.ENG || deiVar == dei.FISHFOOD) {
                            return;
                        }
                        int i = context.getApplicationInfo().targetSdkVersion;
                        try {
                            final int i2 = Integer.parseInt(Build.VERSION.INCREMENTAL);
                            oon oonVar = new oon();
                            oonVar.e("MASTER", 6317413);
                            oonVar.e("RVC", 6317039);
                            oonVar.e("RD1A", 6318983);
                            oonVar.e("QT", 6317527);
                            oonVar.e("RP1A", 6318984);
                            oonVar.e("RPP", 6386018);
                            oonVar.e("QD4A", 6436923);
                            final oor oorVarC = oonVar.c();
                            oti otiVarListIterator = oorVarC.keySet().listIterator();
                            while (true) {
                                z = true;
                                if (!otiVarListIterator.hasNext()) {
                                    break;
                                }
                                String str = (String) otiVarListIterator.next();
                                if (Build.ID.startsWith(str)) {
                                    if (i2 >= ((Integer) oorVarC.get(str)).intValue()) {
                                        break;
                                    }
                                    z = false;
                                    break;
                                }
                            }
                            if (i > 29 && !z) {
                                larVar2.execute(new Runnable() { // from class: iks
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i3 = i2;
                                        throw new RuntimeException(String.format(Locale.ROOT, "This apk targets R but it is running on android build: %s %s which does not have a fix for b/149569689.  See go/gca-rvc-migration-plan for details. You must use this apk after the following build numbers for each of the following branches: %s", Build.ID, Integer.valueOf(i3), oorVarC));
                                    }
                                });
                            } else {
                                if (i > 29 || !z) {
                                    return;
                                }
                                ((oug) ((oug) ikt.a.c()).G(2984)).w("This apk does NOT targets R but it may be running on android build: %s %d which  has a fix for b/149569689.  See go/gca-rvc-migration-plan for details. You must use a more recent GCA apk after cl/307677912", Build.ID, i2);
                            }
                        } catch (NumberFormatException e) {
                            ((oug) ((oug) ikt.a.c()).G(2986)).r("Build number (%s) is not a number. Ignoring version check for b/149569689.", Build.VERSION.INCREMENTAL);
                        }
                    }
                };
            case 5:
                final hyc hycVar = (hyc) this.b.get();
                final qkg qkgVar = this.a;
                return ope.H(new iho() { // from class: ill
                    @Override // java.lang.Runnable
                    public final void run() {
                        qkg qkgVar2 = qkgVar;
                        hyc hycVar2 = hycVar;
                        ilq ilqVar = (ilq) qkgVar2.get();
                        iau iauVarA = iav.a();
                        iauVarA.a = "StorageWarning";
                        iauVarA.c(ope.K(jrl.PHOTO, jrl.PORTRAIT, jrl.LONG_EXPOSURE, jrl.VIDEO));
                        iauVarA.b(ope.I(lwd.BACK, lwd.FRONT));
                        iauVarA.e(false);
                        iauVarA.f(false);
                        hycVar2.a(ilqVar, iauVarA.a());
                    }
                });
            case 6:
                return new ilu((ilx) this.a.get(), (ScheduledExecutorService) this.b.get());
            case 7:
                return new imo(((emz) this.a).get(), ((bxs) this.b).a());
            case 8:
                return ((ddf) this.b.get()).k(ddm.am) ? ojc.i((hel) this.a.get()) : oih.a;
            case 9:
                ddf ddfVar = (ddf) this.b.get();
                Object objH = (ddfVar.k(dcv.b) && ddfVar.k(dcv.f) && ddfVar.k(deg.a)) ? ope.H((dbr) pyr.a(this.a).get()) : orx.a;
                qmd.ae(objH);
                return objH;
            case 10:
                return new iod((ddf) this.a.get(), (lda) this.b.get());
            case 11:
                return new ipj(((emn) this.a).get(), (fvv) this.b.get());
            case 12:
                return new itf(((emp) this.b).a(), (ljf) this.a.get());
            case 13:
                Context contextA2 = ((emp) this.b).a();
                Executor executor = (Executor) this.a.get();
                pih pihVarF = pih.f();
                executor.execute(new ivs(contextA2, pihVarF));
                return pihVarF;
            case 14:
                final ikh ikhVar = (ikh) this.a.get();
                final lis lisVarA = ((dgb) this.b).get().a("CptrIndDskCsh");
                return mip.eR(new Runnable() { // from class: ivr
                    @Override // java.lang.Runnable
                    public final void run() {
                        lis lisVar = lisVarA;
                        ikh ikhVar2 = ikhVar;
                        lisVar.g("pre-initializing indicator cache");
                        ikhVar2.a();
                    }
                });
            case 15:
                return new ljl(plk.M((Executor) this.b.get()), (ljf) this.a.get(), "IndicatorUpdate");
            case 16:
                return bqe.u(((eth) this.a).get()) ? new ivw() : ((ivq) this.b).get();
            case 17:
                final pyn pynVarA = pyr.a(this.b);
                final ivz ivzVar = (ivz) this.a.get();
                return new jqn() { // from class: ivu
                    @Override // defpackage.jqn
                    public final void a() {
                        pyn pynVar = pynVarA;
                        ((bue) pynVar.get()).c(ivzVar);
                    }
                };
            case 18:
                return new izd((izr) this.a.get(), (iwt) this.b.get());
            case 19:
                return new jbh(((eme) this.b).get(), (lar) this.a.get());
            default:
                return new jiy(((emp) this.b).a(), (hlv) this.a.get());
        }
    }
}

package defpackage;

import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.OneCameraTiming;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class hvz implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final /* synthetic */ int d;

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i) {
        this.d = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[] bArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[] cArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[] fArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[] iArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[] sArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[] zArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][] bArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][] cArr) {
        this.d = i;
        this.c = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, float[][] fArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, int[][] iArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, short[][] sArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, boolean[][] zArr) {
        this.d = i;
        this.b = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, byte[][][] bArr) {
        this.d = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.b = qkgVar3;
    }

    public hvz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, int i, char[][][] cArr) {
        this.d = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.c = qkgVar3;
    }

    public static hvz a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new hvz(qkgVar, qkgVar2, qkgVar3, 3, (short[]) null);
    }

    public static hvz b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new hvz(qkgVar, qkgVar2, qkgVar3, 16, (float[][]) null);
    }

    public static hvz c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new hvz(qkgVar, qkgVar2, qkgVar3, 17, (byte[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        final byte[] bArr = null;
        switch (this.d) {
            case 0:
                return new hvy(((emu) this.a).get(), (Executor) this.b.get(), (ScheduledExecutorService) this.c.get());
            case 1:
                return new hvj((ddf) this.b.get(), (lda) this.a.get(), (imt) this.c.get());
            case 2:
                return new hwn((fjs) this.c.get(), lzg.a(), (jtx) this.a.get(), (huf) this.b.get(), null, null);
            case 3:
                Object obj = this.c.get();
                final gxm gxmVar = ((djc) this.a).get();
                final ghx ghxVar = ((gjo) this.b).get();
                final hxj hxjVar = (hxj) obj;
                return aas.d(new Runnable(hxjVar, ghxVar, bArr) { // from class: hxl
                    public final /* synthetic */ hxj a;
                    public final /* synthetic */ ghx b;

                    @Override // java.lang.Runnable
                    public final void run() {
                        gxm gxmVar2 = this.c;
                        hxj hxjVar2 = this.a;
                        ghx ghxVar2 = this.b;
                        gxmVar2.f();
                        hxjVar2.d(ghxVar2);
                    }
                }, "smarts");
            case 4:
                return new ida(((emi) this.a).get(), (iet) this.c.get(), (ibm) this.b.get());
            case 5:
                return new iec(((jto) this.a).get(), (hub) this.b.get(), (huf) this.c.get());
            case 6:
                return new igq(((emp) this.a).a(), (ddf) this.b.get(), (ljf) this.c.get());
            case 7:
                final Instrumentation instrumentation = (Instrumentation) this.b.get();
                final mcu mcuVar = (mcu) this.a.get();
                final ljf ljfVar = (ljf) this.c.get();
                final int i = 1;
                return new ijn() { // from class: ijb
                    @Override // defpackage.ijn
                    public final Object a() {
                        switch (i) {
                            case 0:
                                Instrumentation instrumentation2 = instrumentation;
                                OneCameraTiming oneCameraTiming = new OneCameraTiming(mcuVar, ljfVar);
                                instrumentation2.f(oneCameraTiming);
                                return oneCameraTiming;
                            case 1:
                                Instrumentation instrumentation3 = instrumentation;
                                ijk ijkVar = new ijk(mcuVar, ljfVar);
                                instrumentation3.f(ijkVar);
                                return ijkVar;
                            default:
                                Instrumentation instrumentation4 = instrumentation;
                                ijp ijpVar = new ijp(mcuVar, ljfVar);
                                instrumentation4.f(ijpVar);
                                return ijpVar;
                        }
                    }
                };
            case 8:
                final Instrumentation instrumentation2 = (Instrumentation) this.b.get();
                final mcu mcuVar2 = (mcu) this.a.get();
                final ljf ljfVar2 = (ljf) this.c.get();
                final int i2 = 0;
                return new ijn() { // from class: ijb
                    @Override // defpackage.ijn
                    public final Object a() {
                        switch (i2) {
                            case 0:
                                Instrumentation instrumentation3 = instrumentation2;
                                OneCameraTiming oneCameraTiming = new OneCameraTiming(mcuVar2, ljfVar2);
                                instrumentation3.f(oneCameraTiming);
                                return oneCameraTiming;
                            case 1:
                                Instrumentation instrumentation4 = instrumentation2;
                                ijk ijkVar = new ijk(mcuVar2, ljfVar2);
                                instrumentation4.f(ijkVar);
                                return ijkVar;
                            default:
                                Instrumentation instrumentation5 = instrumentation2;
                                ijp ijpVar = new ijp(mcuVar2, ljfVar2);
                                instrumentation5.f(ijpVar);
                                return ijpVar;
                        }
                    }
                };
            case 9:
                final Instrumentation instrumentation3 = (Instrumentation) this.b.get();
                final mcu mcuVar3 = (mcu) this.a.get();
                final ljf ljfVar3 = (ljf) this.c.get();
                final int i3 = 2;
                return new ijn() { // from class: ijb
                    @Override // defpackage.ijn
                    public final Object a() {
                        switch (i3) {
                            case 0:
                                Instrumentation instrumentation4 = instrumentation3;
                                OneCameraTiming oneCameraTiming = new OneCameraTiming(mcuVar3, ljfVar3);
                                instrumentation4.f(oneCameraTiming);
                                return oneCameraTiming;
                            case 1:
                                Instrumentation instrumentation5 = instrumentation3;
                                ijk ijkVar = new ijk(mcuVar3, ljfVar3);
                                instrumentation5.f(ijkVar);
                                return ijkVar;
                            default:
                                Instrumentation instrumentation6 = instrumentation3;
                                ijp ijpVar = new ijp(mcuVar3, ljfVar3);
                                instrumentation6.f(ijpVar);
                                return ijpVar;
                        }
                    }
                };
            case 10:
                nez nezVar = (nez) this.c.get();
                ((emp) this.a).a();
                return new ikj(nezVar, null);
            case 11:
                imj imjVar = ((imk) this.b).get();
                enl.f((lar) this.c.get(), ((etj) this.a).get(), imjVar);
                return imjVar;
            case 12:
                return new imx((Executor) this.a.get(), (lda) this.b.get(), ((ing) this.c).a());
            case 13:
                ddf ddfVar = (ddf) this.a.get();
                final hyc hycVar = (hyc) this.c.get();
                final pyn pynVarA = pyr.a(this.b);
                Object objH = (ddfVar.k(dcv.b) && ddfVar.k(dcv.f) && ddfVar.k(deg.a)) ? ope.H(new iho() { // from class: iny
                    @Override // java.lang.Runnable
                    public final void run() {
                        hyc hycVar2 = hycVar;
                        pyn pynVar = pynVarA;
                        iau iauVarA = iav.a();
                        iauVarA.a = "Cheetah";
                        iauVarA.c(ope.H(jrl.PHOTO));
                        iauVarA.b(ope.H(lwd.BACK));
                        hycVar2.a((iat) pynVar.get(), iauVarA.a());
                    }
                }) : orx.a;
                qmd.ae(objH);
                return objH;
            case 14:
                return new iro(((emd) this.a).get(), (irj) this.b.get(), (lar) this.c.get(), jwg.a());
            case 15:
                return new ite((itp) this.b.get(), ((hlj) this.c).a(), (ljf) this.a.get());
            case 16:
                return new dyx((lxb) this.b.get(), (dzb) this.a.get(), (dyz) this.c.get(), 1, 1, 1);
            case 17:
                return new itx((dyx) this.a.get(), (dvx) this.c.get(), (dvp) this.b.get());
            case 18:
                pht phtVar = (pht) this.a.get();
                Executor executor = (Executor) this.b.get();
                ((dgb) this.c).get().a("BitmapEncoder");
                return new ikh(phtVar, executor);
            case 19:
                return new iyf((ixj) this.b.get(), (iwt) this.a.get(), (crs) this.c.get());
            default:
                return new izl((lda) this.a.get(), (crs) this.b.get(), (crw) this.c.get());
        }
    }
}

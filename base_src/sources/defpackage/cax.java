package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cax implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final /* synthetic */ int h;

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i) {
        this.h = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, byte[] bArr) {
        this.h = i;
        this.f = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.e = qkgVar4;
        this.g = qkgVar5;
        this.b = qkgVar6;
        this.d = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, byte[] bArr, byte[] bArr2) {
        this.h = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.f = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
        this.e = qkgVar6;
        this.g = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, char[] cArr) {
        this.h = i;
        this.b = qkgVar;
        this.f = qkgVar2;
        this.c = qkgVar3;
        this.g = qkgVar4;
        this.d = qkgVar5;
        this.a = qkgVar6;
        this.e = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, char[] cArr, byte[] bArr) {
        this.h = i;
        this.c = qkgVar;
        this.e = qkgVar2;
        this.b = qkgVar3;
        this.f = qkgVar4;
        this.a = qkgVar5;
        this.g = qkgVar6;
        this.d = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, float[] fArr) {
        this.h = i;
        this.e = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, int[] iArr) {
        this.h = i;
        this.g = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
        this.c = qkgVar6;
        this.f = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, short[] sArr) {
        this.h = i;
        this.e = qkgVar;
        this.f = qkgVar2;
        this.d = qkgVar3;
        this.g = qkgVar4;
        this.b = qkgVar5;
        this.c = qkgVar6;
        this.a = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, boolean[] zArr) {
        this.h = i;
        this.g = qkgVar;
        this.e = qkgVar2;
        this.d = qkgVar3;
        this.b = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
        this.a = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, byte[][] bArr) {
        this.h = i;
        this.g = qkgVar;
        this.e = qkgVar2;
        this.d = qkgVar3;
        this.b = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
        this.a = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, char[][] cArr) {
        this.h = i;
        this.e = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
        this.g = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
        this.d = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, float[][] fArr) {
        this.h = i;
        this.e = qkgVar;
        this.d = qkgVar2;
        this.f = qkgVar3;
        this.g = qkgVar4;
        this.a = qkgVar5;
        this.b = qkgVar6;
        this.c = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, int[][] iArr) {
        this.h = i;
        this.g = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
        this.b = qkgVar5;
        this.f = qkgVar6;
        this.e = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, short[][] sArr) {
        this.h = i;
        this.e = qkgVar;
        this.a = qkgVar2;
        this.g = qkgVar3;
        this.f = qkgVar4;
        this.c = qkgVar5;
        this.d = qkgVar6;
        this.b = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, boolean[][] zArr) {
        this.h = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.f = qkgVar3;
        this.e = qkgVar4;
        this.b = qkgVar5;
        this.g = qkgVar6;
        this.a = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, byte[][][] bArr) {
        this.h = i;
        this.e = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.c = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, char[][][] cArr) {
        this.h = i;
        this.g = qkgVar;
        this.f = qkgVar2;
        this.d = qkgVar3;
        this.e = qkgVar4;
        this.a = qkgVar5;
        this.c = qkgVar6;
        this.b = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, float[][][] fArr) {
        this.h = i;
        this.c = qkgVar;
        this.f = qkgVar2;
        this.b = qkgVar3;
        this.e = qkgVar4;
        this.d = qkgVar5;
        this.a = qkgVar6;
        this.g = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, int[][][] iArr) {
        this.h = i;
        this.d = qkgVar;
        this.e = qkgVar2;
        this.b = qkgVar3;
        this.f = qkgVar4;
        this.c = qkgVar5;
        this.a = qkgVar6;
        this.g = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, short[][][] sArr) {
        this.h = i;
        this.f = qkgVar;
        this.g = qkgVar2;
        this.e = qkgVar3;
        this.d = qkgVar4;
        this.a = qkgVar5;
        this.c = qkgVar6;
        this.b = qkgVar7;
    }

    public cax(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, boolean[][][] zArr) {
        this.h = i;
        this.f = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.a = qkgVar4;
        this.e = qkgVar5;
        this.g = qkgVar6;
        this.c = qkgVar7;
    }

    public static cax a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new cax(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 5, (boolean[]) null);
    }

    public static cax b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new cax(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 6, (float[]) null);
    }

    public static cax c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new cax(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 7, (byte[][]) null);
    }

    public static cax d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new cax(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 14, (char[][][]) null);
    }

    public static cax e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new cax(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 15, (short[][][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        ope opeVarF;
        switch (this.h) {
            case 0:
                return new caw(((jrs) this.a).get(), (jcf) this.b.get(), (lwf) this.c.get(), (cvo) this.d.get(), ((etg) this.e).get(), (ddf) this.f.get(), (dkm) this.g.get());
            case 1:
                return new bzg((SharedPreferences) this.f.get(), (lce) this.c.get(), (bzo) this.a.get(), (cae) this.e.get(), (bzn) this.g.get(), ((bzk) this.b).get(), (ifn) this.d.get());
            case 2:
                return new cqi(((iwi) this.b).get(), (nvb) this.f.get(), (lda) this.c.get(), (ddf) this.g.get(), (ivf) this.d.get(), ((cjc) this.a).a(), (cvo) this.e.get(), null, null, null);
            case 3:
                return new crk((BottomBarController) this.e.get(), (jlb) this.f.get(), (jak) this.d.get(), (jfn) this.g.get(), ((csc) this.b).get(), ((cjc) this.c).a(), (gtg) this.a.get());
            case 4:
                return new csw(((cop) this.g).get(), ((brh) this.a).get(), ((con) this.e).get(), (hki) this.d.get(), (hkr) this.b.get(), (jth) this.c.get(), (lap) this.f.get());
            case 5:
                return new cvr(((emd) this.g).get(), (brc) this.e.get(), ((eme) this.d).get(), (fjs) this.b.get(), ((liq) this.c).get(), ((cwd) this.f).get(), (ddf) this.a.get(), null, null, null);
            case 6:
                return new cvt((cwk) this.e.get(), (lar) this.c.get(), (cxz) this.a.get(), ((cwd) this.d).get(), (fjs) this.b.get(), ((liq) this.f).get(), (cwf) this.g.get(), null, null, null);
            case 7:
                return new cvz(((emd) this.g).get(), (brc) this.e.get(), ((eme) this.d).get(), (fjs) this.b.get(), ((liq) this.c).get(), ((cwd) this.f).get(), (ddf) this.a.get(), null, null, null);
            case 8:
                CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase = (CameraFatalErrorTrackerDatabase) this.e.get();
                Executor executorA = ((bxs) this.a).a();
                fjs fjsVar = (fjs) this.b.get();
                return new cxc(cameraFatalErrorTrackerDatabase, executorA, fjsVar, (lar) this.c.get(), (ddf) this.f.get(), ((cwu) this.d).get());
            case 9:
                return new dac((czq) this.e.get(), new dad(), ((czw) this.a).get(), (Executor) this.g.get(), (ljl) this.f.get(), ((dat) this.c).get(), ((emp) this.d).a(), (ljf) this.b.get());
            case 10:
                final ddf ddfVar = (ddf) this.g.get();
                final lda ldaVar = (lda) this.d.get();
                final hyc hycVar = (hyc) this.c.get();
                final pyn pynVarA = pyr.a(this.a);
                final pyn pynVarA2 = pyr.a(this.b);
                final pyn pynVarA3 = pyr.a(this.f);
                final pyn pynVarA4 = pyr.a(this.e);
                opc opcVarD = ope.D();
                if (ddfVar.k(dcv.b)) {
                    final HashSet hashSet = new HashSet();
                    hashSet.add(jrl.PHOTO);
                    if (ddfVar.k(dcv.n)) {
                        hashSet.add(jrl.LONG_EXPOSURE);
                    }
                    if (ddfVar.k(dcv.c)) {
                        final int i = 1;
                        opcVarD.d(new iho() { // from class: dan
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        hyc hycVar2 = hycVar;
                                        pyn pynVar = pynVarA;
                                        Set set = hashSet;
                                        ddf ddfVar2 = ddfVar;
                                        lda ldaVar2 = ldaVar;
                                        iat iatVar = (iat) pynVar.get();
                                        iau iauVarA = iav.a();
                                        iauVarA.a = "UpDownIndicatorHUD";
                                        iauVarA.c(ope.F(set));
                                        iauVarA.b(ope.H(lwd.BACK));
                                        iauVarA.e(!ddfVar2.k(dcv.m));
                                        iauVarA.d(ldaVar2);
                                        iauVarA.b = ojc.i((ian) pynVar.get());
                                        hycVar2.a(iatVar, iauVarA.a());
                                        break;
                                    default:
                                        hyc hycVar3 = hycVar;
                                        pyn pynVar2 = pynVarA;
                                        Set set2 = hashSet;
                                        ddf ddfVar3 = ddfVar;
                                        lda ldaVar3 = ldaVar;
                                        iat iatVar2 = (iat) pynVar2.get();
                                        iau iauVarA2 = iav.a();
                                        iauVarA2.a = "PitchRollIndicatorHUD";
                                        iauVarA2.c(ope.F(set2));
                                        iauVarA2.b(ope.H(lwd.BACK));
                                        iauVarA2.e(!ddfVar3.k(dcv.m));
                                        iauVarA2.d(ldaVar3);
                                        iauVarA2.b = ojc.i((ian) pynVar2.get());
                                        hycVar3.a(iatVar2, iauVarA2.a());
                                        break;
                                }
                            }
                        });
                    }
                    if (ddfVar.k(dcv.j)) {
                        final int i2 = 0;
                        opcVarD.d(new iho() { // from class: dan
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        hyc hycVar2 = hycVar;
                                        pyn pynVar = pynVarA2;
                                        Set set = hashSet;
                                        ddf ddfVar2 = ddfVar;
                                        lda ldaVar2 = ldaVar;
                                        iat iatVar = (iat) pynVar.get();
                                        iau iauVarA = iav.a();
                                        iauVarA.a = "UpDownIndicatorHUD";
                                        iauVarA.c(ope.F(set));
                                        iauVarA.b(ope.H(lwd.BACK));
                                        iauVarA.e(!ddfVar2.k(dcv.m));
                                        iauVarA.d(ldaVar2);
                                        iauVarA.b = ojc.i((ian) pynVar.get());
                                        hycVar2.a(iatVar, iauVarA.a());
                                        break;
                                    default:
                                        hyc hycVar3 = hycVar;
                                        pyn pynVar2 = pynVarA2;
                                        Set set2 = hashSet;
                                        ddf ddfVar3 = ddfVar;
                                        lda ldaVar3 = ldaVar;
                                        iat iatVar2 = (iat) pynVar2.get();
                                        iau iauVarA2 = iav.a();
                                        iauVarA2.a = "PitchRollIndicatorHUD";
                                        iauVarA2.c(ope.F(set2));
                                        iauVarA2.b(ope.H(lwd.BACK));
                                        iauVarA2.e(!ddfVar3.k(dcv.m));
                                        iauVarA2.d(ldaVar3);
                                        iauVarA2.b = ojc.i((ian) pynVar2.get());
                                        hycVar3.a(iatVar2, iauVarA2.a());
                                        break;
                                }
                            }
                        });
                    }
                    if (ddfVar.k(dcv.h)) {
                        final int i3 = 1;
                        opcVarD.d(new iho() { // from class: dam
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        hyc hycVar2 = hycVar;
                                        pyn pynVar = pynVarA3;
                                        lda ldaVar2 = ldaVar;
                                        iat iatVar = (iat) pynVar.get();
                                        iau iauVarA = iav.a();
                                        iauVarA.a = "CameraLockIndicator";
                                        iauVarA.c(ope.J(jrl.PHOTO, jrl.LONG_EXPOSURE, jrl.MOTION_BLUR));
                                        iauVarA.b(ope.H(lwd.BACK));
                                        iauVarA.e(false);
                                        iauVarA.d(ldaVar2);
                                        iauVarA.b = ojc.i((ian) pynVar.get());
                                        hycVar2.a(iatVar, iauVarA.a());
                                        break;
                                    default:
                                        hyc hycVar3 = hycVar;
                                        pyn pynVar2 = pynVarA3;
                                        lda ldaVar3 = ldaVar;
                                        iat iatVar2 = (iat) pynVar2.get();
                                        iau iauVarA2 = iav.a();
                                        iauVarA2.a = "SelfieAngleAdvice";
                                        iauVarA2.c(ope.H(jrl.PHOTO));
                                        iauVarA2.b(ope.H(lwd.FRONT));
                                        iauVarA2.e(true);
                                        iauVarA2.d(ldaVar3);
                                        hycVar3.a(iatVar2, iauVarA2.a());
                                        break;
                                }
                            }
                        });
                    }
                    if (ddfVar.k(dcv.p)) {
                        final int i4 = 0;
                        opcVarD.d(new iho() { // from class: dam
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        hyc hycVar2 = hycVar;
                                        pyn pynVar = pynVarA4;
                                        lda ldaVar2 = ldaVar;
                                        iat iatVar = (iat) pynVar.get();
                                        iau iauVarA = iav.a();
                                        iauVarA.a = "CameraLockIndicator";
                                        iauVarA.c(ope.J(jrl.PHOTO, jrl.LONG_EXPOSURE, jrl.MOTION_BLUR));
                                        iauVarA.b(ope.H(lwd.BACK));
                                        iauVarA.e(false);
                                        iauVarA.d(ldaVar2);
                                        iauVarA.b = ojc.i((ian) pynVar.get());
                                        hycVar2.a(iatVar, iauVarA.a());
                                        break;
                                    default:
                                        hyc hycVar3 = hycVar;
                                        pyn pynVar2 = pynVarA4;
                                        lda ldaVar3 = ldaVar;
                                        iat iatVar2 = (iat) pynVar2.get();
                                        iau iauVarA2 = iav.a();
                                        iauVarA2.a = "SelfieAngleAdvice";
                                        iauVarA2.c(ope.H(jrl.PHOTO));
                                        iauVarA2.b(ope.H(lwd.FRONT));
                                        iauVarA2.e(true);
                                        iauVarA2.d(ldaVar3);
                                        hycVar3.a(iatVar2, iauVarA2.a());
                                        break;
                                }
                            }
                        });
                    }
                    opeVarF = opcVarD.f();
                } else {
                    opeVarF = opcVarD.f();
                }
                qmd.ae(opeVarF);
                return opeVarF;
            case 11:
                return new dbv((dbx) this.c.get(), ((emd) this.d).get(), (hnx) this.f.get(), ((evv) this.e).a(), (fjs) this.b.get(), (ScheduledExecutorService) this.g.get(), (ddf) this.a.get());
            case 12:
                return new det(((dex) this.e).get(), ((dey) this.d).get(), ((dxb) this.f).get(), ((des) this.g).get(), ((dxw) this.a).get(), ((dxc) this.b).get(), (ljf) this.c.get(), null, null, null);
            case 13:
                ((emp) this.e).a();
                return new dph((lar) this.a.get(), ((ing) this.c).a(), (imt) this.f.get(), (ddf) this.g.get());
            case 14:
                ddf ddfVar2 = (ddf) this.g.get();
                ojc ojcVar = (ojc) this.f.get();
                final qkg qkgVar = this.d;
                final lvp lvpVar = (lvp) this.e.get();
                final brg brgVar = ((brh) this.a).get();
                final lap lapVar = (lap) this.c.get();
                final ljf ljfVar = (ljf) this.b.get();
                Object objH = (ddfVar2.k(ddc.a) && ojcVar.g()) ? ope.H(new bvv() { // from class: dqp
                    @Override // defpackage.bvv
                    public final /* synthetic */ String c() {
                        return aas.g(this);
                    }

                    @Override // defpackage.bvv
                    public final pht fz() {
                        ljf ljfVar2 = ljfVar;
                        qkg qkgVar2 = qkgVar;
                        lvp lvpVar2 = lvpVar;
                        brg brgVar2 = brgVar;
                        lap lapVar2 = lapVar;
                        ljfVar2.e("FCFrameConsumer.Startup");
                        final dqo dqoVar = (dqo) qkgVar2.get();
                        dqoVar.a(lvpVar2, brgVar2);
                        dqoVar.getClass();
                        lapVar2.c(new lie() { // from class: dqq
                            @Override // defpackage.lie, java.lang.AutoCloseable
                            public final void close() {
                                dqoVar.b();
                            }
                        });
                        ljfVar2.f();
                        return plk.V(true);
                    }
                }) : orx.a;
                qmd.ae(objH);
                return objH;
            case 15:
                final qkg qkgVar2 = this.f;
                final qkg qkgVar3 = this.g;
                gxm gxmVar = ((djc) this.e).get();
                ddf ddfVar3 = (ddf) this.d.get();
                nez nezVar = ((gjf) this.a).get();
                final bxy bxyVar = (bxy) this.c.get();
                final ljf ljfVar2 = (ljf) this.b.get();
                enl.G(gxmVar, ddfVar3, nezVar);
                return ope.H(new bvv() { // from class: dvl
                    @Override // defpackage.bvv
                    public final /* synthetic */ String c() {
                        return aas.g(this);
                    }

                    @Override // defpackage.bvv
                    public final pht fz() {
                        qkg qkgVar4 = qkgVar3;
                        bxy bxyVar2 = bxyVar;
                        final ljf ljfVar3 = ljfVar2;
                        final qkg qkgVar5 = qkgVar2;
                        dvn dvnVar = (dvn) qkgVar4;
                        Handler handler = dvnVar.get();
                        bxyVar2.getClass();
                        handler.post(new hfh(bxyVar2, 1));
                        dvnVar.get().post(new Runnable() { // from class: dvm
                            @Override // java.lang.Runnable
                            public final void run() {
                                ljf ljfVar4 = ljfVar3;
                                qkg qkgVar6 = qkgVar5;
                                ljfVar4.e("MICRO_ImageReaderModule_runningStartupTasks");
                                for (Runnable runnable : ((pyw) qkgVar6).get()) {
                                    ljfVar4.e("MICRO_ImageReaderModule_runSingleTask");
                                    runnable.run();
                                    ljfVar4.f();
                                }
                                ljfVar4.f();
                            }
                        });
                        return plk.V(true);
                    }
                });
            case 16:
                ddf ddfVar4 = (ddf) this.d.get();
                final qkg qkgVar4 = this.e;
                final ims imsVarA = ((ing) this.b).a();
                final imt imtVar = (imt) this.f.get();
                final lce lceVar = (lce) this.c.get();
                final lar larVar = (lar) this.a.get();
                final bui buiVar = (bui) this.g.get();
                return ddfVar4.k(ddm.ap) ? mip.eR(new Runnable() { // from class: eec
                    @Override // java.lang.Runnable
                    public final void run() {
                        qkg qkgVar5 = qkgVar4;
                        bui buiVar2 = buiVar;
                        imt imtVar2 = imtVar;
                        lar larVar2 = larVar;
                        ims imsVar = imsVarA;
                        final lce lceVar2 = lceVar;
                        ((eew) qkgVar5.get()).b();
                        lap lapVar2 = buiVar2.b;
                        imv imvVarA = imw.a();
                        imvVarA.a = "Falcon";
                        imvVarA.c(larVar2);
                        imvVarA.f(imsVar);
                        final int i5 = 1;
                        imvVarA.e(new Runnable() { // from class: eeb
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        lceVar2.fB(false);
                                        break;
                                    default:
                                        lceVar2.fB(true);
                                        break;
                                }
                            }
                        });
                        final int i6 = 0;
                        imvVarA.d(new Runnable() { // from class: eeb
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i6) {
                                    case 0:
                                        lceVar2.fB(false);
                                        break;
                                    default:
                                        lceVar2.fB(true);
                                        break;
                                }
                            }
                        });
                        lapVar2.c(imtVar2.d(imvVarA.a()));
                    }
                }) : bqi.g;
            case 17:
                return new ehj((lqv) this.f.get(), ((liq) this.d).get(), (ljf) this.b.get(), (ejj) this.a.get(), (ejm) this.e.get(), (lar) this.g.get(), (bta) this.c.get());
            case 18:
                return new eoy(((dzw) this.c).get(), (eam) this.f.get(), (nvb) this.b.get(), (eon) this.e.get(), ((epa) this.d).get(), (ddf) this.a.get(), (Executor) this.g.get(), null, null);
            case 19:
                Set setB = fff.b((hyc) this.c.get(), (fgb) this.f.get(), eyi.a(), (imt) this.b.get(), ((ffa) this.a).get(), ((etg) this.e).get(), ((ffg) this.g).a().booleanValue());
                qmd.ae(setB);
                return setB;
            default:
                return new flb(((emn) this.c).get(), ((emp) this.e).a(), (huf) this.b.get(), (fvv) this.f.get(), (ddf) this.a.get(), (ScheduledExecutorService) this.g.get(), ((cbi) this.d).get());
        }
    }
}

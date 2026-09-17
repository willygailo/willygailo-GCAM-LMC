package defpackage;

import android.content.Context;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class hah implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final /* synthetic */ int f;

    public hah(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i) {
        this.f = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    public hah(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[] bArr) {
        this.f = i;
        this.b = qkgVar;
        this.e = qkgVar2;
        this.c = qkgVar3;
        this.a = qkgVar4;
        this.d = qkgVar5;
    }

    public hah(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[] cArr) {
        this.f = i;
        this.e = qkgVar;
        this.a = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
        this.d = qkgVar5;
    }

    public hah(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, float[] fArr) {
        this.f = i;
        this.c = qkgVar;
        this.e = qkgVar2;
        this.d = qkgVar3;
        this.a = qkgVar4;
        this.b = qkgVar5;
    }

    public hah(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, int[] iArr) {
        this.f = i;
        this.e = qkgVar;
        this.d = qkgVar2;
        this.b = qkgVar3;
        this.c = qkgVar4;
        this.a = qkgVar5;
    }

    public hah(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, short[] sArr) {
        this.f = i;
        this.d = qkgVar;
        this.e = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
    }

    public hah(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, boolean[] zArr) {
        this.f = i;
        this.c = qkgVar;
        this.b = qkgVar2;
        this.e = qkgVar3;
        this.a = qkgVar4;
        this.d = qkgVar5;
    }

    public hah(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, byte[][] bArr) {
        this.f = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.e = qkgVar3;
        this.c = qkgVar4;
        this.d = qkgVar5;
    }

    public hah(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, char[][] cArr) {
        this.f = i;
        this.a = qkgVar;
        this.d = qkgVar2;
        this.c = qkgVar3;
        this.b = qkgVar4;
        this.e = qkgVar5;
    }

    public hah(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, int i, short[][] sArr) {
        this.f = i;
        this.a = qkgVar;
        this.c = qkgVar2;
        this.e = qkgVar3;
        this.d = qkgVar4;
        this.b = qkgVar5;
    }

    public static hah a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new hah(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 2, (char[]) null);
    }

    public static hah b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new hah(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, 3, (short[]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        lco lcoVarC;
        Object hctVar;
        Object objH;
        switch (this.f) {
            case 0:
                return new hag((ebe) this.a.get(), ((gjp) this.b).get(), ((gsi) this.c).get(), (ljf) this.d.get(), ((gzm) this.e).get());
            case 1:
                return new gyd((pht) this.b.get(), (lnc) this.e.get(), (ojc) this.c.get(), (ojc) this.a.get(), ((brh) this.d).get());
            case 2:
                boolean zBooleanValue = ((gqf) this.e).b().booleanValue();
                qkg qkgVar = this.a;
                ddf ddfVar = (ddf) this.b.get();
                qkg qkgVar2 = this.c;
                ljf ljfVar = (ljf) this.d.get();
                if (zBooleanValue) {
                    ArrayList arrayList = new ArrayList();
                    boolean zK = ddfVar.k(ddm.W);
                    boolean zK2 = ddfVar.k(ddm.L);
                    lco lcoVarB = ((hcs) qkgVar.get()).b();
                    final ljk ljkVarB = ljfVar.b("FrameAvailability");
                    ((lap) qkgVar2.get()).c(lcoVarB.a(new lij() { // from class: hcd
                        @Override // defpackage.lij
                        public final void fB(Object obj) {
                            ljkVarB.c(((Integer) obj).intValue());
                        }
                    }, pgr.INSTANCE));
                    arrayList.add(new hce(lcoVarB, (zK ? 1 : 0) + 1 + (zK2 ? 1 : 0) + 1));
                    ddi ddiVar = ddl.a;
                    ddfVar.b();
                    lcoVarC = lcv.c(arrayList);
                } else {
                    lcoVarC = lcv.g(false);
                }
                qmd.ae(lcoVarC);
                return lcoVarC;
            case 3:
                ojc ojcVar = (ojc) this.d.get();
                qkg qkgVar3 = this.e;
                ojc ojcVar2 = (ojc) this.c.get();
                qkg qkgVar4 = this.b;
                obr.aR(((gqf) this.a).b().booleanValue(), "No usable raw FrameStream present.");
                if (ojcVar.g()) {
                    hctVar = new hct((lqd) ojcVar.c());
                } else if (ojcVar2.g()) {
                    hctVar = new hct((lqd) ojcVar2.c());
                } else {
                    obr.aR(!((Map) qkgVar3.get()).isEmpty(), "No physical FrameStream is present!");
                    hctVar = ((Map) qkgVar3.get()).size() == 1 ? new hct((lqd) ((Map) qkgVar3.get()).values().iterator().next()) : (hcs) qkgVar4.get();
                }
                qmd.ae(hctVar);
                return hctVar;
            case 4:
                ddf ddfVar2 = (ddf) this.e.get();
                final hyc hycVar = (hyc) this.d.get();
                final boolean zBooleanValue2 = ((bpk) this.b).a().booleanValue();
                final pyn pynVarA = pyr.a(this.c);
                final pyn pynVarA2 = pyr.a(this.a);
                if (ddfVar2.k(dcv.b) && ddfVar2.k(ddx.j)) {
                    final ope opeVarI = ddfVar2.k(ddm.ab) ? ope.I(jrl.PHOTO, jrl.LONG_EXPOSURE) : ope.H(jrl.PHOTO);
                    objH = ope.H(new iho() { // from class: hfg
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z = zBooleanValue2;
                            hyc hycVar2 = hycVar;
                            pyn pynVar = pynVarA2;
                            ope opeVar = opeVarI;
                            pyn pynVar2 = pynVarA;
                            if (!z) {
                                iat iatVar = (iat) pynVar2.get();
                                iau iauVarA = iav.a();
                                iauVarA.a = "Portrait";
                                iauVarA.c(opeVar);
                                iauVarA.b(ope.I(lwd.BACK, lwd.FRONT));
                                hycVar2.a(iatVar, iauVarA.a());
                                return;
                            }
                            iat iatVar2 = (iat) pynVar.get();
                            iau iauVarA2 = iav.a();
                            iauVarA2.a = "PortraitBack";
                            iauVarA2.c(opeVar);
                            iauVarA2.b(ope.H(lwd.BACK));
                            hycVar2.a(iatVar2, iauVarA2.a());
                            iat iatVar3 = (iat) pynVar2.get();
                            iau iauVarA3 = iav.a();
                            iauVarA3.a = "PortraitFront";
                            iauVarA3.c(opeVar);
                            iauVarA3.b(ope.H(lwd.FRONT));
                            hycVar2.a(iatVar3, iauVarA3.a());
                        }
                    });
                } else {
                    objH = orx.a;
                }
                qmd.ae(objH);
                return objH;
            case 5:
                ljf ljfVar2 = (ljf) this.c.get();
                Context contextA = ((emp) this.b).a();
                ddf ddfVar3 = (ddf) this.e.get();
                return new hfz(ljfVar2, contextA, ddfVar3.k(ddx.n), ddfVar3.k(ddx.o), ddfVar3.k(ddx.p), ddfVar3.k(ddx.q), ddfVar3.k(ddx.r), this.a, this.d);
            case 6:
                return new hgb(((emn) this.c).get(), (fvv) this.e.get(), (lco) this.d.get(), (ScheduledExecutorService) this.a.get(), ((cbi) this.b).get());
            case 7:
                return new hof(((etg) this.b).get(), (lda) this.a.get(), (lco) this.e.get(), (lar) this.c.get(), (hpb) this.d.get());
            case 8:
                return new hpa((BottomBarController) this.a.get(), (jgq) this.d.get(), ((jny) this.c).get(), (jnr) this.b.get(), (ddf) this.e.get());
            default:
                return new hql(((hpx) this.a).get(), (hsh) this.c.get(), (ddf) this.e.get(), (fjs) this.d.get(), (Executor) this.b.get());
        }
    }
}

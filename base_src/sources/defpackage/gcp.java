package defpackage;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gcp implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final /* synthetic */ int h;

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i) {
        this.h = i;
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
    }

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, byte[] bArr) {
        this.h = i;
        this.b = qkgVar;
        this.d = qkgVar2;
        this.a = qkgVar3;
        this.f = qkgVar4;
        this.e = qkgVar5;
        this.g = qkgVar6;
        this.c = qkgVar7;
    }

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, char[] cArr) {
        this.h = i;
        this.f = qkgVar;
        this.c = qkgVar2;
        this.g = qkgVar3;
        this.e = qkgVar4;
        this.d = qkgVar5;
        this.a = qkgVar6;
        this.b = qkgVar7;
    }

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, float[] fArr) {
        this.h = i;
        this.f = qkgVar;
        this.g = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
        this.b = qkgVar5;
        this.e = qkgVar6;
        this.a = qkgVar7;
    }

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, int[] iArr) {
        this.h = i;
        this.e = qkgVar;
        this.f = qkgVar2;
        this.d = qkgVar3;
        this.c = qkgVar4;
        this.a = qkgVar5;
        this.b = qkgVar6;
        this.g = qkgVar7;
    }

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, short[] sArr) {
        this.h = i;
        this.e = qkgVar;
        this.g = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.a = qkgVar5;
        this.f = qkgVar6;
        this.b = qkgVar7;
    }

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, boolean[] zArr) {
        this.h = i;
        this.f = qkgVar;
        this.e = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.g = qkgVar5;
        this.b = qkgVar6;
        this.a = qkgVar7;
    }

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, byte[][] bArr) {
        this.h = i;
        this.b = qkgVar;
        this.f = qkgVar2;
        this.a = qkgVar3;
        this.g = qkgVar4;
        this.c = qkgVar5;
        this.d = qkgVar6;
        this.e = qkgVar7;
    }

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, char[][] cArr) {
        this.h = i;
        this.d = qkgVar;
        this.c = qkgVar2;
        this.a = qkgVar3;
        this.f = qkgVar4;
        this.g = qkgVar5;
        this.b = qkgVar6;
        this.e = qkgVar7;
    }

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, int[][] iArr) {
        this.h = i;
        this.c = qkgVar;
        this.d = qkgVar2;
        this.g = qkgVar3;
        this.f = qkgVar4;
        this.b = qkgVar5;
        this.e = qkgVar6;
        this.a = qkgVar7;
    }

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, short[][] sArr) {
        this.h = i;
        this.b = qkgVar;
        this.a = qkgVar2;
        this.f = qkgVar3;
        this.g = qkgVar4;
        this.d = qkgVar5;
        this.c = qkgVar6;
        this.e = qkgVar7;
    }

    public gcp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, int i, boolean[][] zArr) {
        this.h = i;
        this.d = qkgVar;
        this.f = qkgVar2;
        this.g = qkgVar3;
        this.b = qkgVar4;
        this.a = qkgVar5;
        this.e = qkgVar6;
        this.c = qkgVar7;
    }

    public static gcp a(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new gcp(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 0);
    }

    public static gcp b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new gcp(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 1, (byte[]) null);
    }

    public static gcp c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new gcp(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 2, (char[]) null);
    }

    public static gcp d(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new gcp(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 3, (short[]) null);
    }

    public static gcp e(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new gcp(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 4, (int[]) null);
    }

    public static gcp f(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new gcp(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 5, (boolean[]) null);
    }

    public static gcp g(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new gcp(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 6, (float[]) null);
    }

    public static gcp h(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        return new gcp(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6, qkgVar7, 9, (short[][]) null);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        lig ligVar;
        Object objH;
        switch (this.h) {
            case 0:
                return new gco(((liq) this.a).get(), ((hlj) this.b).a(), pyr.a(this.c), ((Long) this.d.get()).longValue(), (DynamicDepthUtils) this.e.get(), (ojc) ((pyt) this.f).a, (hkr) this.g.get());
            case 1:
                fqy fqyVar = (fqy) this.b.get();
                fus fusVar = (fus) this.d.get();
                return new fpa(fqyVar, fusVar, (lco) this.g.get(), ((gjo) this.c).get());
            case 2:
                lvp lvpVar = ((gjp) this.f).get();
                brg brgVar = ((brh) this.c).get();
                ddf ddfVar = (ddf) this.g.get();
                pht phtVar = (pht) this.e.get();
                hoh hohVar = ((hoi) this.d).get();
                gky gkyVar = ((gkz) this.a).get();
                egm egmVar = ((egn) this.b).get();
                ddi ddiVar = dcs.a;
                ddfVar.c();
                return new gkb(new gjz(lvpVar, brgVar, new bsj(gkyVar, brgVar, phtVar), hohVar, egmVar), ope.H(35));
            case 3:
                return new gpd((gib) this.e.get(), (pht) this.c.get(), ((dgb) this.g).get(), (box) this.d.get(), (huf) this.a.get(), pyr.a(this.f), (ljf) this.b.get());
            case 4:
                ghx ghxVar = ((gjo) this.e).get();
                gqs gqsVar = (gqs) this.f.get();
                lco lcoVar = ((giy) this.d).get();
                lco lcoVar2 = (lco) this.c.get();
                lco lcoVar3 = (lco) this.a.get();
                edm edmVar = (edm) this.b.get();
                return new gro(ghxVar, gqsVar, lcoVar, lcoVar2, lcoVar3, edmVar);
            case 5:
                final gfy gfyVar = (gfy) this.e.get();
                final lnc lncVar = (lnc) this.c.get();
                final eam eamVar = (eam) this.d.get();
                final hbq hbqVar = (hbq) this.g.get();
                final lap lapVar = (lap) this.b.get();
                final ddf ddfVar2 = (ddf) this.a.get();
                ddg ddgVar = dde.a;
                ddfVar2.b();
                hbqVar.f();
                return aas.d(new Runnable() { // from class: gvx
                    @Override // java.lang.Runnable
                    public final void run() {
                        lap lapVar2 = lapVar;
                        final hbq hbqVar2 = hbqVar;
                        eam eamVar2 = eamVar;
                        final ddf ddfVar3 = ddfVar2;
                        final lnc lncVar2 = lncVar;
                        gfy gfyVar2 = gfyVar;
                        lapVar2.c(lcv.b(hbqVar2.c(), eamVar2.c()).a(new lij() { // from class: gwa
                            @Override // defpackage.lij
                            public final void fB(Object obj) {
                                hbq hbqVar3 = hbqVar2;
                                ddf ddfVar4 = ddfVar3;
                                lnc lncVar3 = lncVar2;
                                List list = (List) obj;
                                hbp hbpVar = (hbp) list.get(0);
                                float fFloatValue = ((Float) list.get(1)).floatValue();
                                if (kdb.c == null || !hbqVar3.j()) {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList();
                                Float fValueOf = Float.valueOf(0.0f);
                                arrayList.add(fValueOf);
                                arrayList.add(Float.valueOf(hbpVar.a));
                                arrayList.add(Float.valueOf(hbpVar.b));
                                if (true != ddfVar4.j(dcz.b)) {
                                    fFloatValue = -1.0f;
                                }
                                arrayList.add(Float.valueOf(fFloatValue));
                                arrayList.add(fValueOf);
                                arrayList.add(Float.valueOf(hbpVar.c));
                                lncVar3.i(ope.I(mip.be(kdb.c, oxh.L(arrayList)), mip.be(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(hbpVar.d))));
                            }
                        }, pgr.INSTANCE));
                        lapVar2.c(gfyVar2.b.a(new lij() { // from class: gvz
                            @Override // defpackage.lij
                            public final void fB(Object obj) {
                                hbq hbqVar3 = hbqVar2;
                                lnc lncVar3 = lncVar2;
                                Integer num = (Integer) obj;
                                if (hbqVar3.j()) {
                                    return;
                                }
                                lncVar3.g(mip.be(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, num));
                            }
                        }, pgr.INSTANCE));
                    }
                }, "3aexcomp");
            case 6:
                jrl jrlVar = ((giv) this.f).get();
                lvp lvpVar2 = (lvp) this.g.get();
                gsf gsfVar = ((gsi) this.d).get();
                ddf ddfVar3 = (ddf) this.c.get();
                qkg qkgVar = this.b;
                int iIntValue = ((Integer) this.e.get()).intValue();
                long jLongValue = ((Long) this.a.get()).longValue();
                boolean zK = ddfVar3.k(ddm.X);
                if (jrlVar != jrl.PHOTO || zK) {
                    ligVar = ((gjc) qkgVar).get();
                } else {
                    ligVar = lhs.b.k(lhs.h(gsfVar.b)) ? dvv.b : dvv.a;
                }
                return fvq.j(lvpVar2.i(), new lwp(iIntValue, ligVar), 50, false, true, jLongValue == 0 ? null : Long.valueOf(jLongValue));
            case 7:
                ljf ljfVar = (ljf) this.b.get();
                Context contextA = ((emp) this.f).a();
                ddf ddfVar4 = (ddf) this.a.get();
                Executor executorA = ((bxs) this.g).a();
                qkg qkgVar2 = this.c;
                lar larVar = (lar) this.d.get();
                fhi fhiVar = ((fhq) this.e).get();
                hfy hfyVar = new hfy(ljfVar, contextA, ddfVar4, qkgVar2, executorA, ddfVar4.k(ddx.t));
                enl.e(larVar, fhiVar, hfyVar);
                return hfyVar;
            case 8:
                hgm hgmVar = (hgm) this.d.get();
                hgl hglVar = (hgl) this.c.get();
                gjw gjwVarC = gvo.c();
                Executor executorB = gvo.b();
                ((efz) this.a).get();
                return new hfw(hgmVar, hglVar, gjwVarC, executorB, (ddf) this.f.get(), (ead) this.g.get(), ((hoi) this.b).get(), this.e);
            case 9:
                final qkg qkgVar3 = this.b;
                final qkg qkgVar4 = this.a;
                final qkg qkgVar5 = this.f;
                final ojc ojcVarA = ((cjc) this.g).a();
                hko hkoVar = (hko) this.d.get();
                final lap lapVar2 = (lap) this.c.get();
                if (((djc) this.e).get().d()) {
                    hkoVar.e();
                    final Object obj = new Object();
                    final ExecutorService executorServiceBM = mip.bM("frame-quality-scorer");
                    lapVar2.c(new lie() { // from class: hku
                        @Override // defpackage.lie, java.lang.AutoCloseable
                        public final void close() {
                            Object obj2 = obj;
                            ExecutorService executorService = executorServiceBM;
                            synchronized (obj2) {
                                executorService.shutdown();
                            }
                        }
                    });
                    objH = ope.H(new Runnable() { // from class: hkw
                        @Override // java.lang.Runnable
                        public final void run() {
                            qkg qkgVar6 = qkgVar3;
                            final Object obj2 = obj;
                            final ExecutorService executorService = executorServiceBM;
                            final qkg qkgVar7 = qkgVar5;
                            final qkg qkgVar8 = qkgVar4;
                            lap lapVar3 = lapVar2;
                            ((fpo) qkgVar6.get()).g(new fpn() { // from class: hkt
                                @Override // defpackage.fpn
                                public final void a(long j) {
                                    Object obj3 = obj2;
                                    ExecutorService executorService2 = executorService;
                                    qkg qkgVar9 = qkgVar7;
                                    synchronized (obj3) {
                                        if (!executorService2.isShutdown()) {
                                            ((hkq) qkgVar9.get()).b(j);
                                        }
                                    }
                                }
                            }, pgr.INSTANCE);
                            ((dvp) qkgVar8.get()).f((dvq) qkgVar7.get(), executorService);
                            lapVar3.c(new lie() { // from class: hkv
                                @Override // defpackage.lie, java.lang.AutoCloseable
                                public final void close() {
                                    ((dvp) qkgVar8.get()).e((dvq) qkgVar7.get());
                                }
                            });
                        }
                    });
                } else {
                    objH = orx.a;
                }
                qmd.ae(objH);
                return objH;
            case 10:
                lnc lncVar2 = (lnc) this.c.get();
                hen henVar = (hen) this.d.get();
                return new hna(lncVar2, henVar);
            default:
                return new hoz((fjs) this.d.get(), (BottomBarController) this.f.get(), pyr.a(this.g), (jsc) this.b.get(), (img) this.a.get(), (lda) this.e.get(), (hug) this.c.get());
        }
    }
}

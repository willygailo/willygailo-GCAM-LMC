package defpackage;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class exh implements phh {
    final /* synthetic */ bws a;
    final /* synthetic */ lap b;
    final /* synthetic */ exi c;

    public exh(exi exiVar, bws bwsVar, lap lapVar) {
        this.c = exiVar;
        this.a = bwsVar;
        this.b = lapVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            ((oug) ((oug) ((oug) exi.b.c()).h(th)).G((char) 1547)).o("OneCamera open sequence was canceled, shutting down lifetime.");
        } else {
            ((oug) ((oug) ((oug) exi.b.c()).h(th)).G((char) 1546)).o("OneCamera failed to open, closing lifetime.");
        }
        this.b.close();
        this.c.n.a();
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final gfu gfuVar = (gfu) obj;
        gfuVar.getClass();
        if (this.a.a()) {
            return;
        }
        ljf ljfVar = this.c.f;
        final lap lapVar = this.b;
        ljfVar.d("onCameraStarted", new Runnable() { // from class: exg
            @Override // java.lang.Runnable
            public final void run() {
                exh exhVar = this.a;
                gfu gfuVar2 = gfuVar;
                lap lapVar2 = lapVar;
                final exi exiVar = exhVar.c;
                gfu gfuVar3 = exiVar.F;
                boolean z = gfuVar3 != null && gfuVar3 == gfuVar2;
                exiVar.F = gfuVar2;
                exiVar.E = null;
                if (z) {
                    return;
                }
                mip.ca(gfuVar2.h().g, new ewu(exiVar, 0), exiVar.d);
                exiVar.x();
                gfu gfuVar4 = exiVar.F;
                gfuVar4.getClass();
                gzf gzfVar = exiVar.al;
                lwd lwdVarD = exiVar.m.d();
                ewq ewqVar = new ewq(exiVar, 2);
                ddf ddfVar = (ddf) gzfVar.c.get();
                ddfVar.getClass();
                jtx jtxVar = ((cwd) gzfVar.a).get();
                cvo cvoVar = (cvo) gzfVar.f.get();
                cvoVar.getClass();
                lar larVar = (lar) gzfVar.d.get();
                larVar.getClass();
                lwf lwfVar = (lwf) gzfVar.h.get();
                lwfVar.getClass();
                dlt dltVar = (dlt) gzfVar.g.get();
                dltVar.getClass();
                dkm dkmVar = (dkm) gzfVar.b.get();
                dkmVar.getClass();
                cxz cxzVar = (cxz) gzfVar.e.get();
                cxzVar.getClass();
                lwdVarD.getClass();
                lapVar2.c(gfuVar4.c(new cvv(ddfVar, jtxVar, cvoVar, larVar, lwfVar, dltVar, dkmVar, cxzVar, lwdVarD, ewqVar, null, null, null)));
                if (exiVar.x.g()) {
                    lapVar2.c(((bys) exiVar.x.c()).a(jrl.PHOTO, gfuVar2.h().h));
                }
                if (exiVar.R.g()) {
                    ima imaVar = (ima) exiVar.R.c();
                    exiVar.F.getClass();
                    lapVar2.c(imaVar.d());
                }
                jhd jhdVar = exiVar.n;
                exiVar.ai.k();
                jrl jrlVar = jrl.UNINITIALIZED;
                jhdVar.c();
                hdi hdiVarH = gfuVar2.h();
                lco lcoVarJ = lcv.j(lcv.b(hdiVarH.f, hdiVarH.a, exiVar.U), new oiu() { // from class: ewo
                    @Override // defpackage.oiu
                    public final Object a(Object obj2) {
                        exi exiVar2 = exiVar;
                        List list = (List) obj2;
                        list.getClass();
                        obr.aF(list.size() == 3);
                        return Boolean.valueOf((((Boolean) list.get(0)).booleanValue() || ((Boolean) list.get(1)).booleanValue() || ((Boolean) list.get(2)).booleanValue() || exiVar2.c.fA() != gqx.ON) ? false : true);
                    }
                });
                lapVar2.c(exiVar.ab.a(gfuVar2, exiVar.ai, gfuVar2.h().b, lcv.i(gfuVar2.h().f, lcoVarJ), exiVar.u.g() && exiVar.ai.k() == lwd.BACK));
                exiVar.y.g().g();
                exiVar.s.l(true);
                final lap lapVar3 = exiVar.Q;
                mip.bZ(exiVar.I, new lht() { // from class: ewv
                    @Override // defpackage.lht
                    public final void a(Object obj2) {
                        exi exiVar2 = exiVar;
                        bro broVar = (bro) obj2;
                        if (lapVar3.a()) {
                            return;
                        }
                        broVar.getClass();
                        broVar.d(exiVar2.ai.i());
                    }
                });
                exiVar.P.d(gfuVar2.h().a);
                lapVar2.c(lcoVarJ.a(new ewm(exiVar, 0), exiVar.d));
                AccessibilityManager accessibilityManager = exiVar.C;
                dnj dnjVar = exiVar.B;
                ghx ghxVar = exiVar.ai;
                gvb gvbVar = exiVar.e;
                fvx fvxVar = exiVar.D;
                fvxVar.getClass();
                enl enlVar = ((bvk) exiVar.y.g()).B;
                ddf ddfVar2 = exiVar.W;
                ddi ddiVar = ddl.a;
                ddfVar2.b();
                ddf ddfVar3 = exiVar.W;
                ddi ddiVar2 = dee.a;
                ddfVar3.d();
                exiVar.ai.f();
                exiVar.G = new fws(accessibilityManager, dnjVar, ghxVar, gvbVar, fvxVar, enlVar, ddfVar2, null, null, null, null, null);
                lap lapVar4 = exiVar.Q;
                fws fwsVar = exiVar.G;
                gfu gfuVar5 = exiVar.F;
                gfuVar5.getClass();
                lapVar4.c(fwsVar.a(gfuVar5.h().c, exiVar.d));
                if (exiVar.R.g()) {
                    lap lapVar5 = exiVar.Q;
                    gfu gfuVar6 = exiVar.F;
                    gfuVar6.getClass();
                    final lco lcoVar = gfuVar6.h().d;
                    lco lcoVarA = ((ima) exiVar.R.c()).a();
                    final lar larVar2 = exiVar.d;
                    final AtomicReference atomicReference = new AtomicReference();
                    final lie lieVarA = lcoVarA.a(new lij() { // from class: fwr
                        @Override // defpackage.lij
                        public final void fB(Object obj2) {
                            AtomicReference atomicReference2 = atomicReference;
                            lco lcoVar2 = lcoVar;
                            lar larVar3 = larVar2;
                            if (((Boolean) obj2).booleanValue()) {
                                atomicReference2.set(lcoVar2.a(new lij() { // from class: fwq
                                    @Override // defpackage.lij
                                    public final void fB(Object obj3) {
                                    }
                                }, larVar3));
                                return;
                            }
                            if (atomicReference2.get() != null) {
                                ((lie) atomicReference2.get()).close();
                            }
                            ppm ppmVar = pjt.b.a;
                            if (ppmVar.isEmpty()) {
                                return;
                            }
                            pjs pjsVar = (pjs) ppmVar.get(0);
                            pjv pjvVar = pjsVar.b;
                            if (pjvVar == null) {
                                pjvVar = pjv.c;
                            }
                            pju pjuVar = pjvVar.b;
                            if (pjuVar == null) {
                                pjuVar = pju.e;
                            }
                            int i = pjuVar.a;
                            pjv pjvVar2 = pjsVar.b;
                            if (pjvVar2 == null) {
                                pjvVar2 = pjv.c;
                            }
                            pju pjuVar2 = pjvVar2.b;
                            if (pjuVar2 == null) {
                                pjuVar2 = pju.e;
                            }
                            int i2 = pjuVar2.b;
                            pjv pjvVar3 = pjsVar.b;
                            if (pjvVar3 == null) {
                                pjvVar3 = pjv.c;
                            }
                            pju pjuVar3 = pjvVar3.b;
                            if (pjuVar3 == null) {
                                pjuVar3 = pju.e;
                            }
                            int i3 = pjuVar3.a;
                            pjv pjvVar4 = pjsVar.b;
                            if (pjvVar4 == null) {
                                pjvVar4 = pjv.c;
                            }
                            pju pjuVar4 = pjvVar4.b;
                            if (pjuVar4 == null) {
                                pjuVar4 = pju.e;
                            }
                            int i4 = i3 + pjuVar4.c;
                            pjv pjvVar5 = pjsVar.b;
                            if (pjvVar5 == null) {
                                pjvVar5 = pjv.c;
                            }
                            pju pjuVar5 = pjvVar5.b;
                            if (pjuVar5 == null) {
                                pjuVar5 = pju.e;
                            }
                            int i5 = pjuVar5.b;
                            pjv pjvVar6 = pjsVar.b;
                            if (pjvVar6 == null) {
                                pjvVar6 = pjv.c;
                            }
                            pju pjuVar6 = pjvVar6.b;
                            if (pjuVar6 == null) {
                                pjuVar6 = pju.e;
                            }
                            new Rect(i, i2, i4, i5 + pjuVar6.d);
                        }
                    }, larVar2);
                    lapVar5.c(new lie() { // from class: fwo
                        @Override // defpackage.lie, java.lang.AutoCloseable
                        public final void close() {
                            AtomicReference atomicReference2 = atomicReference;
                            lie lieVar = lieVarA;
                            if (atomicReference2.get() != null) {
                                ((lie) atomicReference2.get()).close();
                            }
                            lieVar.close();
                        }
                    });
                }
                fvx fvxVar2 = exiVar.D;
                fvxVar2.getClass();
                lig ligVar = fvxVar2.d.a;
                exiVar.W.b();
                exiVar.u();
                if (((Boolean) exiVar.Y.d).booleanValue()) {
                    return;
                }
                exiVar.Y.fB(true);
            }
        });
    }
}

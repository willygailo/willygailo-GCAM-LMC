package defpackage;

import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.zoomui.ZoomUi;

/* JADX INFO: loaded from: classes2.dex */
class ixi extends ihr {
    final /* synthetic */ ixj b;

    public ixi(ixj ixjVar) {
        this.b = ixjVar;
        final int i = 0;
        epj epjVar = ixjVar.b;
        epjVar.getClass();
        ixd ixdVar = new ixd(epjVar, 0);
        final int i2 = 1;
        final gtg gtgVar = ixjVar.d;
        gtgVar.getClass();
        iib iibVar = new iib() { // from class: ixe
            @Override // defpackage.iib
            public final lie a() {
                final gtg gtgVar2 = gtgVar;
                gtgVar2.l();
                return new lie() { // from class: gsq
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        gtgVar2.j();
                    }
                };
            }
        };
        final int i3 = 2;
        final jak jakVar = ixjVar.f;
        jakVar.getClass();
        final kas kasVar = ixjVar.e;
        final jgq jgqVar = ixjVar.j;
        jgqVar.getClass();
        jlb jlbVar = ixjVar.h;
        jlbVar.getClass();
        BottomBarController bottomBarController = ixjVar.c;
        bottomBarController.getClass();
        BottomBarController bottomBarController2 = ixjVar.c;
        bottomBarController2.getClass();
        final jgq jgqVar2 = ixjVar.j;
        jgqVar2.getClass();
        a(mip.eO("CameraUi.SocialShare"), ixdVar, iibVar, new iib(this) { // from class: ixf
            public final /* synthetic */ ixi a;

            {
                this.a = this;
            }

            @Override // defpackage.iib
            public final lie a() {
                switch (i) {
                    case 0:
                        final ixi ixiVar = this.a;
                        ((dnj) ixiVar.b.g.get()).a();
                        return new lie() { // from class: ixb
                            @Override // defpackage.lie, java.lang.AutoCloseable
                            public final void close() {
                                ((dnj) ixiVar.b.g.get()).b();
                            }
                        };
                    case 1:
                        ixi ixiVar2 = this.a;
                        lda ldaVarB = ixiVar2.b.l.b(htu.l);
                        String str = (String) ((lce) ldaVarB).d;
                        jrl jrlVar = (jrl) ixiVar2.b.m.fA();
                        if (!ixiVar2.b.k.i() || !"torch".equals(str) || (!jrl.SLOW_MOTION.equals(jrlVar) && !jrl.VIDEO.equals(jrlVar))) {
                            return jmf.b;
                        }
                        ldaVarB.fB("off");
                        return new ixc(ldaVarB, 0);
                    default:
                        return this.a.b.n.e(elx.FIRST_RUN_TOAST);
                }
            }
        }, new iib(this) { // from class: ixf
            public final /* synthetic */ ixi a;

            {
                this.a = this;
            }

            @Override // defpackage.iib
            public final lie a() {
                switch (i2) {
                    case 0:
                        final ixi ixiVar = this.a;
                        ((dnj) ixiVar.b.g.get()).a();
                        return new lie() { // from class: ixb
                            @Override // defpackage.lie, java.lang.AutoCloseable
                            public final void close() {
                                ((dnj) ixiVar.b.g.get()).b();
                            }
                        };
                    case 1:
                        ixi ixiVar2 = this.a;
                        lda ldaVarB = ixiVar2.b.l.b(htu.l);
                        String str = (String) ((lce) ldaVarB).d;
                        jrl jrlVar = (jrl) ixiVar2.b.m.fA();
                        if (!ixiVar2.b.k.i() || !"torch".equals(str) || (!jrl.SLOW_MOTION.equals(jrlVar) && !jrl.VIDEO.equals(jrlVar))) {
                            return jmf.b;
                        }
                        ldaVarB.fB("off");
                        return new ixc(ldaVarB, 0);
                    default:
                        return this.a.b.n.e(elx.FIRST_RUN_TOAST);
                }
            }
        }, new iib() { // from class: ixg
            @Override // defpackage.iib
            public final lie a() {
                final jak jakVar2 = jakVar;
                jakVar2.d(false);
                return new lie() { // from class: jai
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        jakVar2.d(true);
                    }
                };
            }
        }, new iib() { // from class: ixa
            @Override // defpackage.iib
            public final lie a() {
                final kbi kbiVar = (kbi) kasVar;
                ZoomUi zoomUi = kbiVar.H;
                if (zoomUi != null && zoomUi.getVisibility() == 8) {
                    final int i4 = 1;
                    return new lie() { // from class: kba
                        @Override // defpackage.lie, java.lang.AutoCloseable
                        public final void close() {
                            switch (i4) {
                                case 0:
                                    kbi kbiVar2 = kbiVar;
                                    kbiVar2.v(true);
                                    kbiVar2.h();
                                    break;
                                default:
                                    kbiVar.g();
                                    break;
                            }
                        }
                    };
                }
                final int i5 = 0;
                kbiVar.v(false);
                return new lie() { // from class: kba
                    @Override // defpackage.lie, java.lang.AutoCloseable
                    public final void close() {
                        switch (i5) {
                            case 0:
                                kbi kbiVar2 = kbiVar;
                                kbiVar2.v(true);
                                kbiVar2.h();
                                break;
                            default:
                                kbiVar.g();
                                break;
                        }
                    }
                };
            }
        }, new iib() { // from class: ixh
            @Override // defpackage.iib
            public final lie a() {
                switch (i2) {
                    case 0:
                        return jgqVar.h();
                    default:
                        return jgqVar.e();
                }
            }
        }, new iwz(jlbVar, 0), new iwy(bottomBarController, 0), new iwy(bottomBarController2, 2), new iib() { // from class: ixh
            @Override // defpackage.iib
            public final lie a() {
                switch (i) {
                    case 0:
                        return jgqVar2.h();
                    default:
                        return jgqVar2.e();
                }
            }
        }, new iib(this) { // from class: ixf
            public final /* synthetic */ ixi a;

            {
                this.a = this;
            }

            @Override // defpackage.iib
            public final lie a() {
                switch (i3) {
                    case 0:
                        final ixi ixiVar = this.a;
                        ((dnj) ixiVar.b.g.get()).a();
                        return new lie() { // from class: ixb
                            @Override // defpackage.lie, java.lang.AutoCloseable
                            public final void close() {
                                ((dnj) ixiVar.b.g.get()).b();
                            }
                        };
                    case 1:
                        ixi ixiVar2 = this.a;
                        lda ldaVarB = ixiVar2.b.l.b(htu.l);
                        String str = (String) ((lce) ldaVarB).d;
                        jrl jrlVar = (jrl) ixiVar2.b.m.fA();
                        if (!ixiVar2.b.k.i() || !"torch".equals(str) || (!jrl.SLOW_MOTION.equals(jrlVar) && !jrl.VIDEO.equals(jrlVar))) {
                            return jmf.b;
                        }
                        ldaVarB.fB("off");
                        return new ixc(ldaVarB, 0);
                    default:
                        return this.a.b.n.e(elx.FIRST_RUN_TOAST);
                }
            }
        });
    }

    @Override // defpackage.ihr
    public void d() {
    }
}

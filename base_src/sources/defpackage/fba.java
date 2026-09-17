package defpackage;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
final class fba implements phh {
    final /* synthetic */ fbb a;

    public fba(fbb fbbVar) {
        this.a = fbbVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) fbb.b.b()).h(th)).G((char) 1605)).o("Error starting camera");
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        fwc fwcVar = (fwc) obj;
        fwcVar.getClass();
        fbb fbbVar = this.a;
        fbbVar.V = fwcVar;
        fbbVar.d.g().g();
        mip.ca(fwcVar.h().g, new lht() { // from class: fay
            @Override // defpackage.lht
            public final void a(Object obj2) {
                this.a.a.d.g().h(false);
            }
        }, this.a.e);
        final int i = 1;
        this.a.z.l(true);
        this.a.r.h();
        final int i2 = 0;
        this.a.K.c(fwcVar.b().a(new lij(this) { // from class: faz
            public final /* synthetic */ fba a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj2) {
                switch (i2) {
                    case 0:
                        this.a.a.v(((Boolean) obj2).booleanValue());
                        break;
                    default:
                        fba fbaVar = this.a;
                        if (((ggp) obj2).b.b == hkd.ACTIVE_SCAN) {
                            fbaVar.a.L.b();
                        }
                        break;
                }
            }
        }, this.a.e));
        if (this.a.s.k(ddm.ab) && this.a.B.g()) {
            fbb fbbVar2 = this.a;
            fbbVar2.K.c(((bys) fbbVar2.B.c()).a(jrl.PORTRAIT, fwcVar.h().h));
        }
        fbb fbbVar3 = this.a;
        fwc fwcVar2 = fbbVar3.V;
        fwcVar2.getClass();
        fbbVar3.K.c(fwcVar2.h().c.a(fbbVar3.T, mip.bM("PortFcDet")));
        fbbVar3.N = fwcVar2.h().e;
        fvx fvxVar = fwcVar2.b;
        AccessibilityManager accessibilityManager = fbbVar3.o;
        dnj dnjVar = fbbVar3.p;
        ghx ghxVar = fwcVar2.c;
        gvb gvbVar = fbbVar3.n;
        enl enlVar = ((bvk) fbbVar3.d.g()).B;
        ddf ddfVar = fbbVar3.s;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        fwcVar2.c.f();
        fbbVar3.M = new fws(accessibilityManager, dnjVar, ghxVar, gvbVar, fvxVar, enlVar, ddfVar, null, null, null, null, null);
        fbbVar3.K.c(fbbVar3.M.a(fwcVar2.h().c, fbbVar3.e));
        lig ligVar = fvxVar.d.a;
        this.a.s.b();
        fwcVar.a.c(this.a.i.a(fwcVar, fwcVar.c, fwcVar.h().b, lcv.g(false), this.a.s.k(dde.f)));
        this.a.K.c(fwcVar.h().b.a(new lij(this) { // from class: faz
            public final /* synthetic */ fba a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj2) {
                switch (i) {
                    case 0:
                        this.a.a.v(((Boolean) obj2).booleanValue());
                        break;
                    default:
                        fba fbaVar = this.a;
                        if (((ggp) obj2).b.b == hkd.ACTIVE_SCAN) {
                            fbaVar.a.L.b();
                        }
                        break;
                }
            }
        }, mip.bM("PortAfCb")));
        jhd jhdVar = this.a.l;
        fwcVar.c.k();
        lwd lwdVar = lwd.FRONT;
        jrl jrlVar = jrl.UNINITIALIZED;
        jhdVar.c();
        fbb fbbVar4 = this.a;
        fbbVar4.e.execute(new far(fbbVar4, i2));
    }
}

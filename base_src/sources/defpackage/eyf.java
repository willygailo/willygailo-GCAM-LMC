package defpackage;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
final class eyf implements phh {
    final /* synthetic */ eyg a;

    public eyf(eyg eygVar) {
        this.a = eygVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        ((oug) ((oug) ((oug) eyg.b.b()).h(th)).G((char) 1577)).o("Error starting camera");
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        fwc fwcVar = (fwc) obj;
        fwcVar.getClass();
        mip.ca(fwcVar.h().g, new lht() { // from class: eyc
            @Override // defpackage.lht
            public final void a(Object obj2) {
                this.a.a.e.g().h(false);
            }
        }, this.a.f);
        eyg eygVar = this.a;
        eygVar.T = fwcVar;
        eygVar.e.g().g();
        this.a.x(((Boolean) fwcVar.b().fA()).booleanValue());
        this.a.I.c(fwcVar.b().a(new lij() { // from class: eyd
            @Override // defpackage.lij
            public final void fB(Object obj2) {
                this.a.a.x(((Boolean) obj2).booleanValue());
            }
        }, this.a.f));
        boolean z = this.a.n.g() && fwcVar.c.k() == lwd.BACK;
        eyg eygVar2 = this.a;
        fwc fwcVar2 = eygVar2.T;
        fwcVar2.getClass();
        fvx fvxVar = fwcVar2.b;
        AccessibilityManager accessibilityManager = eygVar2.w;
        dnj dnjVar = eygVar2.x;
        ghx ghxVar = fwcVar2.c;
        gvb gvbVar = eygVar2.y;
        enl enlVar = ((bvk) eygVar2.e.g()).B;
        ddf ddfVar = eygVar2.s;
        ddi ddiVar = ddl.a;
        ddfVar.b();
        fwcVar2.c.f();
        eygVar2.J = new fws(accessibilityManager, dnjVar, ghxVar, gvbVar, fvxVar, enlVar, ddfVar, null, null, null, null, null);
        eygVar2.I.c(eygVar2.J.a(fwcVar2.h().c, eygVar2.f));
        lig ligVar = fvxVar.d.a;
        this.a.s.b();
        fwcVar.a.c(this.a.l.a(fwcVar, fwcVar.c, fwcVar.h().b, fwcVar.h().f, z));
        eyg eygVar3 = this.a;
        eygVar3.f.execute(new exr(eygVar3, 0));
        this.a.f.execute(new Runnable() { // from class: eye
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.z.p();
            }
        });
        eyg eygVar4 = this.a;
        if (eygVar4.K) {
            fks fksVar = eygVar4.O;
            fksVar.g(fksVar.e);
            this.a.t.b("cuttlefish_steady_advice");
            this.a.K = false;
        }
    }
}

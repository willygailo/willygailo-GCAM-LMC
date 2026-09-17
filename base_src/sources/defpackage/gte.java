package defpackage;

import com.google.android.apps.camera.optionsbar.view.OptionsMenuContainer;

/* JADX INFO: loaded from: classes.dex */
public final class gte implements gtu {
    final /* synthetic */ OptionsMenuContainer a;
    final /* synthetic */ gtg b;

    public gte(gtg gtgVar, OptionsMenuContainer optionsMenuContainer) {
        this.b = gtgVar;
        this.a = optionsMenuContainer;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    @Override // defpackage.gtu
    public final void a() {
        if (!this.b.bg.f() && !this.b.e.k(ddl.br)) {
            this.b.bg.g(true);
        }
        if (this.b.g.E()) {
            this.b.g.h();
        } else {
            gtg gtgVar = this.b;
            if (!gtgVar.g.D((jrl) gtgVar.b.fA())) {
                this.b.g.h();
            }
        }
        this.b.h.b();
        this.b.aZ.fB(false);
    }

    @Override // defpackage.gtu
    public final void b() {
        this.a.v(this.b.aY);
    }

    @Override // defpackage.gtu
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.gtu
    public final void d() {
        this.b.bg.b(true);
        this.b.h.e();
        if (!this.b.e.k(ddl.V)) {
            this.b.g.g();
        }
        if (!this.b.i.m("perf_has_shown_options_bar")) {
            this.b.i.l("perf_has_shown_options_bar", true);
        }
        this.b.aZ.fB(true);
        this.a.v(this.b.aY);
    }
}

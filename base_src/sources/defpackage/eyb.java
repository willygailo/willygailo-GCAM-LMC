package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class eyb extends jlj {
    final /* synthetic */ eam a;
    final /* synthetic */ fwt b;
    final /* synthetic */ fly c;
    final /* synthetic */ fle d;
    final /* synthetic */ ddf e;
    final /* synthetic */ fks f;
    final /* synthetic */ eyg g;
    final /* synthetic */ hjn h;

    public eyb(eyg eygVar, eam eamVar, fwt fwtVar, fly flyVar, fle fleVar, ddf ddfVar, hjn hjnVar, fks fksVar) {
        this.g = eygVar;
        this.a = eamVar;
        this.b = fwtVar;
        this.c = flyVar;
        this.d = fleVar;
        this.e = ddfVar;
        this.h = hjnVar;
        this.f = fksVar;
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterButtonClick() {
        fwc fwcVar = this.g.T;
        if (fwcVar == null) {
            return;
        }
        if (((Boolean) ((lce) fwcVar.h().f).d).booleanValue() && this.a.n()) {
            if (this.a.o()) {
                this.b.a();
                this.c.b();
                this.d.c();
                return;
            } else {
                this.b.a();
                this.c.a();
                this.d.c();
                if (this.e.k(ddm.D)) {
                    this.h.e();
                    return;
                }
                return;
            }
        }
        this.f.f();
        this.g.K = false;
        this.g.N.f();
        eyg eygVar = this.g;
        if (eygVar.p.e()) {
            eygVar.u();
            return;
        }
        int i = ((hti) eygVar.q.fA()).g;
        if (i > 0) {
            eygVar.D(i);
        } else {
            eygVar.F();
        }
    }

    @Override // defpackage.jlj, defpackage.jli
    public final void onShutterTouchStart() {
        this.g.N.e();
    }
}

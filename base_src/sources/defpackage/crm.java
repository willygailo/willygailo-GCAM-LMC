package defpackage;

/* JADX INFO: loaded from: classes.dex */
class crm extends csa {
    final /* synthetic */ cro b;

    public crm(cro croVar) {
        this.b = croVar;
    }

    @Override // defpackage.csa, defpackage.crx
    public void c() {
        cro croVar = this.b;
        if (croVar.f.k(dcu.J)) {
            if (croVar.j.g()) {
                ((ctw) croVar.j.c()).g(false);
            }
            croVar.h.v(false);
            croVar.h.l(false);
        } else {
            croVar.m.b();
        }
        croVar.i.b();
        croVar.e.startHfrRecording();
        croVar.g.M();
    }

    @Override // defpackage.csa, defpackage.ihs, defpackage.iht
    public final void f() {
        cro croVar = this.b;
        croVar.l = this;
        croVar.k.ax = false;
    }

    @Override // defpackage.crx
    public final boolean fK() {
        return false;
    }

    @Override // defpackage.crx
    public final int j() {
        return 1;
    }
}

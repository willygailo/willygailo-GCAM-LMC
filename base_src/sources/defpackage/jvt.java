package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class jvt extends jvr {
    final /* synthetic */ jvx b;

    public jvt(jvx jvxVar) {
        this.b = jvxVar;
    }

    @Override // defpackage.jvr
    public void b() {
        this.b.e.pause();
    }

    @Override // defpackage.jvr
    public void c() {
        this.b.d.b(0);
    }

    @Override // defpackage.jvr
    public void d() {
        this.b.e.pause();
    }

    @Override // defpackage.jvr, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.e.start();
        jwd jwdVar = (jwd) this.b.d;
        jwdVar.m = false;
        if (jwdVar.n) {
            jwdVar.c();
        }
        this.b.g.f();
    }

    @Override // defpackage.jvr, defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.g.g();
    }
}

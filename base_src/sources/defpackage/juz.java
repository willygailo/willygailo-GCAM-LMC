package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class juz extends juy {
    final /* synthetic */ jvb a;

    public juz(jvb jvbVar) {
        this.a = jvbVar;
    }

    @Override // defpackage.juy
    public void a() {
    }

    @Override // defpackage.juy
    public void c() {
    }

    @Override // defpackage.juy, defpackage.ihs, defpackage.iht
    public final void f() {
        jwd jwdVar = (jwd) this.a.a.get();
        jwdVar.n = false;
        jwdVar.l.animate().alpha(0.0f).setDuration(jwdVar.e).withEndAction(new jwb(jwdVar, 1)).start();
        jwdVar.g.animate().alpha(0.0f).setDuration(jwdVar.e).withEndAction(new jwb(jwdVar, 0)).start();
        jwdVar.h.animate().alpha(0.0f).setDuration(jwdVar.e).withEndAction(new jwb(jwdVar, 2)).start();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class jvm extends jvl {
    final /* synthetic */ jvo b;

    public jvm(jvo jvoVar) {
        this.b = jvoVar;
    }

    @Override // defpackage.jvl
    public void a() {
    }

    @Override // defpackage.jvl, defpackage.ihs, defpackage.iht
    public final void f() {
        jvq jvqVar = this.b.e;
        if (jvqVar.d) {
            return;
        }
        jvqVar.d = true;
        jvqVar.b.postDelayed(jvqVar.c, 10L);
    }

    @Override // defpackage.jvl, defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.e.d = false;
    }
}

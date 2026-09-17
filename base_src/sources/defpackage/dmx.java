package defpackage;

/* JADX INFO: loaded from: classes.dex */
class dmx extends dmu {
    final /* synthetic */ dna a;

    public dmx(dna dnaVar) {
        this.a = dnaVar;
    }

    @Override // defpackage.dmu
    public void c() {
    }

    @Override // defpackage.dmu
    public void d(float f, dmg dmgVar) {
        this.a.d.fB(true);
        this.a.k.fB(false);
        this.a.m(f, dmgVar);
    }

    @Override // defpackage.dmu, defpackage.ihs, defpackage.iht
    public final void f() {
    }

    @Override // defpackage.dmu, defpackage.ihs, defpackage.iht
    public final void g() {
        this.a.d.fB(false);
        dna dnaVar = this.a;
        if (dnaVar.f) {
            return;
        }
        dnaVar.i();
    }
}

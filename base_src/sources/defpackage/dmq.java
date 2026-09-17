package defpackage;

/* JADX INFO: loaded from: classes.dex */
class dmq extends dmo {
    final /* synthetic */ dmt a;

    public dmq(dmt dmtVar) {
        this.a = dmtVar;
    }

    @Override // defpackage.dmo
    public void b(int i, int i2, float f) {
        dna dnaVar = this.a.d;
        dnaVar.g = i;
        dnaVar.h = i2 - i;
        dnaVar.i = f;
    }

    @Override // defpackage.dmo, defpackage.ihs, defpackage.iht
    public final void f() {
        this.a.a.setVisibility(8);
        this.a.d.l();
    }

    @Override // defpackage.dmo, defpackage.ihs, defpackage.iht
    public final void g() {
    }
}

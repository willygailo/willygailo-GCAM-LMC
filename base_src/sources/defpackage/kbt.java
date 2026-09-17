package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class kbt extends kbk {
    final /* synthetic */ kbx b;

    public kbt(kbx kbxVar) {
        this.b = kbxVar;
    }

    @Override // defpackage.kbk
    public final void a() {
        this.b.s(false);
    }

    @Override // defpackage.kbk
    public void d() {
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.j.setEnabled(false);
        this.b.i.setEnabled(false);
        this.b.A(1);
        this.b.x();
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.j.setEnabled(true);
        this.b.i.setEnabled(true);
    }

    @Override // defpackage.kbk
    public void gu() {
        kbx kbxVar = this.b;
        if (kbxVar.x) {
            return;
        }
        kbxVar.v();
    }

    @Override // defpackage.kbk
    public void i() {
        this.b.v();
    }

    @Override // defpackage.kbk
    public void j(int i) {
        this.b.B(i);
    }

    @Override // defpackage.kbk
    public final void m(float f, int i) {
        this.b.z(kbx.y(i), ((Float) this.b.h.fA()).floatValue(), f);
        if (i != 1) {
            kbx kbxVar = this.b;
            if (kbxVar.w) {
                kbxVar.v();
            }
        }
        kbx kbxVar2 = this.b;
        kbxVar2.n.setFloatValues(((Float) kbxVar2.h.fA()).floatValue(), f);
        this.b.n.start();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class kbu extends kbk {
    final /* synthetic */ kbx b;

    public kbu(kbx kbxVar) {
        this.b = kbxVar;
    }

    @Override // defpackage.kbk
    public void a() {
        this.b.s(true);
    }

    @Override // defpackage.kbk
    public void d() {
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void f() {
        this.b.A(3);
        this.b.x();
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void g() {
    }

    @Override // defpackage.kbk
    public void gu() {
    }

    @Override // defpackage.kbk
    public final void j(int i) {
        this.b.B(i);
    }

    @Override // defpackage.kbk
    public void k() {
    }

    @Override // defpackage.kbk
    public void l(boolean z) {
        this.b.r = z;
    }

    @Override // defpackage.kbk
    public void m(float f, int i) {
        this.b.z(kbx.y(i), ((Float) this.b.h.fA()).floatValue(), f);
        kbx kbxVar = this.b;
        kbxVar.m.setFloatValues(((Float) kbxVar.h.fA()).floatValue(), f);
        this.b.m.start();
    }

    @Override // defpackage.kbk
    public final void o() {
        kbx kbxVar = this.b;
        if (kbxVar.w) {
            float fFloatValue = ((Float) kbxVar.h.fA()).floatValue();
            kbx kbxVar2 = this.b;
            float f = kbxVar2.t;
            if (fFloatValue < f) {
                kbxVar2.h.fB(Float.valueOf(f));
            }
            this.b.r();
            this.b.w();
        }
    }

    @Override // defpackage.kbk
    public final void p() {
        this.b.u();
        this.b.q.a();
        this.b.i.a(true);
        this.b.i.setAccessibilityLiveRegion(2);
        kbx kbxVar = this.b;
        kbxVar.z(10, kbxVar.t, ((Float) kbxVar.h.fA()).floatValue());
    }
}

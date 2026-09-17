package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class kbv extends kbk {
    private float a;
    final /* synthetic */ kbx b;

    public kbv(kbx kbxVar) {
        this.b = kbxVar;
    }

    @Override // defpackage.kbk
    public void a() {
        this.b.s(true);
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void f() {
        obr.aG(this.b.s != 0.0f, "max zoom value hasn't been initialized properly");
        this.b.A(4);
        this.b.r();
        this.b.i.a(true);
        this.b.i.b(true);
        this.a = ((Float) this.b.h.fA()).floatValue();
        this.b.i.setAccessibilityLiveRegion(2);
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.i.a(false);
    }

    @Override // defpackage.kbk
    public void n() {
        this.b.i.a(false);
        kbx kbxVar = this.b;
        if (kbxVar.w) {
            kbxVar.r();
            this.b.w();
        }
        kbx kbxVar2 = this.b;
        kbxVar2.z(5, this.a, ((Float) kbxVar2.h.fA()).floatValue());
    }
}

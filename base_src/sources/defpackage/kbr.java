package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class kbr extends kbk {
    private float a;
    final /* synthetic */ kbx b;

    public kbr(kbx kbxVar) {
        this.b = kbxVar;
    }

    @Override // defpackage.kbk
    public void a() {
        this.b.s(true);
    }

    @Override // defpackage.kbk
    public void b() {
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void f() {
        obr.aG(this.b.s != 0.0f, "max zoom value hasn't been initialized properly");
        this.a = ((Float) this.b.h.fA()).floatValue();
        kbx kbxVar = this.b;
        float f = kbxVar.r ? kbxVar.s : kbxVar.t;
        kbxVar.l.setFloatValues(((Float) kbxVar.h.fA()).floatValue(), f);
        float fAbs = Math.abs(f - ((Float) this.b.h.fA()).floatValue());
        kbx kbxVar2 = this.b;
        kbxVar2.l.setDuration((int) ((fAbs / (kbxVar2.s - kbxVar2.t)) * 2000.0f));
        this.b.l.start();
        this.b.A(5);
        this.b.i.setAccessibilityLiveRegion(2);
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void g() {
        kbx kbxVar = this.b;
        kbxVar.z(7, this.a, ((Float) kbxVar.h.fA()).floatValue());
        this.b.l.cancel();
    }
}

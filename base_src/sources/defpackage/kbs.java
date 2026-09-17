package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class kbs extends kbk {
    final /* synthetic */ kbx b;

    public kbs(kbx kbxVar) {
        this.b = kbxVar;
    }

    @Override // defpackage.kbk
    public void a() {
        this.b.s(true);
    }

    @Override // defpackage.kbk
    public void c() {
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void f() {
        obr.aG(this.b.s != 0.0f, "max zoom value hasn't been initialized properly");
        obr.aG(this.b.t != 0.0f, "min zoom value hasn't been initialized properly");
        kbx kbxVar = this.b;
        if (kbxVar.w && !kbxVar.x) {
            kbxVar.u();
        }
        float fFloatValue = ((jrl) this.b.u.fA()).equals(jrl.PORTRAIT) ? this.b.t : ((Float) this.b.o.fA()).floatValue();
        float fFloatValue2 = ((jrl) this.b.u.fA()).equals(jrl.PORTRAIT) ? ((Float) this.b.v.g(ddx.h).c()).floatValue() : fFloatValue + fFloatValue;
        if (((Float) this.b.h.fA()).floatValue() != fFloatValue) {
            fFloatValue2 = fFloatValue;
        }
        if (fFloatValue2 == fFloatValue) {
            kbx kbxVar2 = this.b;
            kbxVar2.z(3, ((Float) kbxVar2.h.fA()).floatValue(), fFloatValue2);
        } else {
            kbx kbxVar3 = this.b;
            kbxVar3.z(2, ((Float) kbxVar3.h.fA()).floatValue(), fFloatValue2);
        }
        kbx kbxVar4 = this.b;
        kbxVar4.k.setFloatValues(((Float) kbxVar4.h.fA()).floatValue(), fFloatValue2);
        this.b.k.start();
        this.b.A(6);
        this.b.i.setAccessibilityLiveRegion(2);
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void g() {
        this.b.k.cancel();
    }
}

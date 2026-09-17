package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class kbw extends kbk {
    final /* synthetic */ kbx b;

    public kbw(kbx kbxVar) {
        this.b = kbxVar;
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void f() {
        obr.aG(this.b.s != 0.0f, "max zoom value hasn't been initialized properly");
        if (!this.b.v.k(ddl.T)) {
            obr.aG(this.b.t >= 1.0f, "min zoom value hasn't been initialized properly");
        }
        kbx kbxVar = this.b;
        if (kbxVar.w && !kbxVar.x) {
            kbxVar.u();
        }
        this.b.A(2);
        this.b.i.setAccessibilityLiveRegion(2);
    }

    @Override // defpackage.kbk, defpackage.ihs, defpackage.iht
    public final void g() {
    }

    @Override // defpackage.kbk
    public void n() {
        kbx kbxVar = this.b;
        if (kbxVar.w) {
            kbxVar.r();
            this.b.w();
        }
    }

    @Override // defpackage.kbk
    public void o() {
        kbx kbxVar = this.b;
        if (kbxVar.w) {
            kbxVar.r();
            this.b.w();
        }
    }

    @Override // defpackage.kbk
    public final void q(float f) {
        float fFloatValue = (((((Float) this.b.h.fA()).floatValue() + 0.33f) * f) * f) - 0.33f;
        kbx kbxVar = this.b;
        float f2 = kbxVar.s;
        if (fFloatValue > f2) {
            fFloatValue = f2;
        } else {
            float f3 = kbxVar.t;
            if (fFloatValue < f3) {
                fFloatValue = f3;
            }
        }
        kbxVar.h.fB(Float.valueOf(fFloatValue));
        this.b.r();
    }
}

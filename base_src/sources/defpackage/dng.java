package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dng extends dmy {
    final /* synthetic */ dni b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dng(dni dniVar) {
        super(dniVar);
        this.b = dniVar;
    }

    @Override // defpackage.dmy, defpackage.dmu
    public final void a() {
        this.b.o.e();
        dni dniVar = this.b;
        dniVar.o.g(dniVar.p);
    }

    @Override // defpackage.dmy, defpackage.dmu
    public final void d(float f, dmg dmgVar) {
        this.b.o.e();
        super.d(f, dmgVar);
        dni dniVar = this.b;
        dniVar.o.g(dniVar.r);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acv extends act {
    public final acu q;

    public acv(hle hleVar, byte[] bArr) {
        super(hleVar, (byte[]) null);
        acu acuVar = new acu();
        this.q = acuVar;
        acuVar.b = b() * 62.5f;
    }

    @Override // defpackage.act
    public final boolean f(long j) {
        acu acuVar = this.q;
        float f = this.i;
        float f2 = this.h;
        acq acqVar = acuVar.c;
        double d = f2;
        double dExp = Math.exp((j / 1000.0f) * acuVar.a);
        Double.isNaN(d);
        acqVar.b = (float) (d * dExp);
        acq acqVar2 = acuVar.c;
        float f3 = acqVar2.b;
        acqVar2.a = f + ((f3 - f2) / acuVar.a);
        if (acuVar.a(f3)) {
            acuVar.c.b = 0.0f;
        }
        acq acqVar3 = acuVar.c;
        float f4 = acqVar3.a;
        this.i = f4;
        float f5 = acqVar3.b;
        this.h = f5;
        float f6 = this.o;
        if (f4 < f6) {
            this.i = f6;
            return true;
        }
        float f7 = this.n;
        if (f4 <= f7) {
            return f4 >= f7 || f4 <= f6 || this.q.a(f5);
        }
        this.i = f7;
        return true;
    }
}

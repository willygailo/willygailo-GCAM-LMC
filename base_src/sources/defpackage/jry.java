package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jry {
    public final ojc a;

    public jry() {
        this.a = oih.a;
    }

    public jry(ojc ojcVar) {
        this.a = ojcVar;
    }

    public jry(ojc ojcVar, byte[] bArr) {
        this.a = ojcVar;
    }

    public final float a(mad madVar) {
        ojc ojcVarP = fcy.p(this.a, madVar.d());
        if (!ojcVarP.g()) {
            return 0.0f;
        }
        ftm ftmVar = (ftm) ojcVarP.c();
        float fAbs = Math.abs(ftmVar.b);
        double dAbs = Math.abs(ftmVar.c);
        if (fAbs > 10.0d || dAbs > 10.0d) {
            return -1.0f;
        }
        double dExp = 1.0d / (Math.exp(dAbs) + 1.0d);
        return (float) ((dExp + dExp) - 1.0d);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qpa {
    private final qpe[] a;

    public qpa(int i) {
        qpe[] qpeVarArr = new qpe[i];
        for (int i2 = 0; i2 < i; i2++) {
            qpeVarArr[i2] = qnt.i(null);
        }
        this.a = qpeVarArr;
    }

    public final qpe a(int i) {
        return this.a[i];
    }
}

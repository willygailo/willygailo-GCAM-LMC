package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class otw extends otu {
    final int[] b;

    public otw(int[] iArr, oiu oiuVar) {
        super(oiuVar);
        this.b = iArr;
    }

    @Override // defpackage.otx
    public final int a() {
        return 257;
    }

    @Override // defpackage.otu
    public final int c(int i) {
        int i2 = i & 255;
        if (i == this.b[i2]) {
            return i2;
        }
        return 256;
    }
}

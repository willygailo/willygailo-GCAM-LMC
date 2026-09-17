package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hiz {
    public final int[] a;

    public hiz() {
        this.a = new int[2];
    }

    public hiz(int[] iArr) {
        this.a = iArr;
    }

    public final int a(int i) {
        return this.a[i - 1];
    }

    public final void b(int i) {
        int[] iArr = this.a;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
    }
}

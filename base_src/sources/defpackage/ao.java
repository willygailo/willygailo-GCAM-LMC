package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ao {
    public final Object[] a = new Object[256];
    public int b;

    public final Object a() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.b = i2;
        return obj;
    }

    public final void b(Object obj) {
        int i = this.b;
        if (i < 256) {
            this.a[i] = obj;
            this.b = i + 1;
        }
    }
}

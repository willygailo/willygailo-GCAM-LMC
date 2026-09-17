package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class xi {
    static final xi a;
    static final xi b;
    final boolean c;
    final Throwable d;

    static {
        if (xq.a) {
            b = null;
            a = null;
        } else {
            b = new xi(false, null);
            a = new xi(true, null);
        }
    }

    public xi(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class asd {
    static final asd a;
    static final asd b;
    final boolean c;
    final Throwable d;

    static {
        if (asl.a) {
            b = null;
            a = null;
        } else {
            b = new asd(false, null);
            a = new asd(true, null);
        }
    }

    public asd(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}

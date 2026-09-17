package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pfl {
    static final pfl a;
    static final pfl b;
    final boolean c;
    final Throwable d;

    static {
        if (pfx.d) {
            b = null;
            a = null;
        } else {
            b = new pfl(false, null);
            a = new pfl(true, null);
        }
    }

    public pfl(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}

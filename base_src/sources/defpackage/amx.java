package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class amx extends gf {
    public final Throwable a;

    public amx(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return String.format("FAILURE (%s)", this.a.getMessage());
    }
}

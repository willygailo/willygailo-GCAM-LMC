package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class xj extends Throwable {
    public xj() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}

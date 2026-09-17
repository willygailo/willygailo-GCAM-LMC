package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class xs extends Throwable {
    public xs(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}

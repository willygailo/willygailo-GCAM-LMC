package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ofw extends Exception {
    public ofw() {
    }

    public ofw(byte[] bArr) {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

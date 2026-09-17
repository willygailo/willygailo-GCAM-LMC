package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class okf extends RuntimeException {
    public okf() {
    }

    public okf(String str) {
        super(str);
    }

    public okf(Throwable th) {
        super(th);
    }

    public okf(Throwable th, byte[] bArr) {
        super("Initialize library failed.", th);
    }
}

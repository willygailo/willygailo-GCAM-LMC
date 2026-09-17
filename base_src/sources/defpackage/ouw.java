package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ouw extends Exception {
    public ouw(Throwable th, ovf ovfVar, StackTraceElement[] stackTraceElementArr) {
        super(ovfVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kdw implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ kdx a;

    public kdw(kdx kdxVar) {
        this.a = kdxVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        kfa kfaVar = this.a.d;
        if (kfaVar != null) {
            kfaVar.o("Job execution failed", th);
        }
    }
}

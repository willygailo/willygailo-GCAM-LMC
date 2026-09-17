package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class bup implements Thread.UncaughtExceptionHandler {
    private static final ouj a = ouj.h("com/google/android/apps/camera/app/silentfeedback/UncaughtExceptionHandlerBase");
    private final Thread.UncaughtExceptionHandler b;
    private final lar c = lar.b;

    public bup(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = uncaughtExceptionHandler;
    }

    protected abstract void a(Throwable th);

    public final void b(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(final Thread thread, final Throwable th) {
        a(th);
        if (lar.d()) {
            b(thread, th);
        } else {
            ((oug) ((oug) ((oug) a.b()).h(th)).G((char) 127)).r("Uncaught exception in background thread %s", thread);
            this.c.execute(new Runnable() { // from class: buo
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b(thread, th);
                }
            });
        }
    }
}

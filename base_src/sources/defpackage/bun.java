package defpackage;

import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
public final class bun extends bup {
    public static final ouj a = ouj.h("com/google/android/apps/camera/app/silentfeedback/UncaughtExceptionForwarder");
    public final bus b;
    private final lar c;

    public bun(bus busVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        super(uncaughtExceptionHandler);
        this.c = lar.b;
        this.b = busVar;
    }

    @Override // defpackage.bup
    protected final void a(final Throwable th) {
        if (this.b != null) {
            if (!lar.d()) {
                ((oug) ((oug) ((oug) a.b()).h(th)).G('~')).o("Uncaught exception in background thread");
            }
            this.c.c(new Runnable() { // from class: bum
                @Override // java.lang.Runnable
                public final void run() {
                    bun bunVar = this.a;
                    Throwable th2 = th;
                    for (bur burVar : bunVar.b) {
                        try {
                            burVar.a(th2);
                        } catch (Throwable th3) {
                            ((oug) ((oug) ((oug) bun.a.b()).h(th3)).G(R.styleable.AppCompatTheme_windowMinWidthMinor)).y("%s failed to handle %s", burVar, th2);
                        }
                    }
                }
            });
        }
    }
}

package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lar implements Executor {
    public static final las a;
    public static final lar b;
    private static final ThreadLocal c;
    private final las d;

    static {
        lam lamVar = new lam(mip.bV(Looper.getMainLooper()));
        a = lamVar;
        b = new lar(lamVar);
        c = new laq();
    }

    @Deprecated
    public lar() {
        this(a);
    }

    public lar(las lasVar) {
        this.d = lasVar;
    }

    public static void a() {
        obr.aR(d(), "Not main thread.");
    }

    public static void b() {
        obr.aR(!d(), "Is main thread.");
    }

    public static boolean d() {
        Boolean bool = (Boolean) c.get();
        return bool != null && bool.booleanValue();
    }

    public final void c(Runnable runnable) {
        if (d()) {
            runnable.run();
        } else {
            this.d.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.execute(runnable);
    }
}

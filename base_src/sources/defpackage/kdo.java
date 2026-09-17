package defpackage;

import android.content.Context;
import android.util.LogPrinter;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kdo {
    public static volatile kdo a;
    public final Context b;
    public Thread.UncaughtExceptionHandler c;
    public volatile kdi d;
    private final kdl e;

    public kdo(Context context) {
        Context applicationContext = context.getApplicationContext();
        mip.dk(applicationContext);
        this.b = applicationContext;
        this.e = new kdl(this);
        new CopyOnWriteArrayList();
        int i = kdh.a;
        new LogPrinter(4, "GA/LogCatTransport");
    }

    public static void a() {
        if (!(Thread.currentThread() instanceof kdn)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void b(Runnable runnable) {
        mip.dk(runnable);
        this.e.submit(runnable);
    }
}

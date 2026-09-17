package defpackage;

import android.os.StrictMode;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class bea implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ beb b;

    public bea(beb bebVar, Runnable runnable) {
        this.b = bebVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.a) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            this.a.run();
        } catch (Throwable th) {
            if (Log.isLoggable("GlideExecutor", 6)) {
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }
    }
}

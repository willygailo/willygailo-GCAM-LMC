package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class anj {
    public final Handler a = Handler.createAsync(Looper.getMainLooper());

    public final void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }
}

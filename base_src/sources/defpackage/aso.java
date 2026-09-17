package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aso {
    public final arq a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Executor c = new asn(this);

    public aso(Executor executor) {
        this.a = new arq(executor);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}

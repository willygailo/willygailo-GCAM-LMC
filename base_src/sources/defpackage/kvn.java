package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class kvn implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public kvn(int i) {
        this.b = i;
        this.a = new ksg(Looper.getMainLooper());
    }

    public kvn(Looper looper, int i) {
        this.b = i;
        this.a = new ksg(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.b) {
            case 0:
                this.a.post(runnable);
                break;
            default:
                this.a.post(runnable);
                break;
        }
    }
}

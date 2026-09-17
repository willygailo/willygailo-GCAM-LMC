package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ofk implements Executor {
    private final Handler a;
    private final /* synthetic */ int b;

    public ofk(int i) {
        this.b = i;
        this.a = new Handler(Looper.getMainLooper());
    }

    public ofk(Handler handler, int i) {
        this.b = i;
        this.a = handler;
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

package defpackage;

import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class mmv implements Executor {
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(16);
    public boolean b;

    public final void a() {
        execute(new mmu(this));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.a.put(runnable);
        } catch (InterruptedException e) {
            Log.w("BlockingEventLoop", "Interrupted while attempting to post event: Dropping event.");
        }
    }
}

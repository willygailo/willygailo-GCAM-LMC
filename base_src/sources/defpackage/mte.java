package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mte implements Runnable {
    public final /* synthetic */ mtf a;

    public /* synthetic */ mte(mtf mtfVar) {
        this.a = mtfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mtf mtfVar = this.a;
        synchronized (mtfVar.a) {
            obr.aQ(mtfVar.d);
            Runnable runnable = (Runnable) mtfVar.c.pollFirst();
            if (runnable == null) {
                mtfVar.d = false;
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                Log.e("SingleTaskExec", "Exception occurred on single-threaded executor", th);
            }
            mtfVar.b.execute(new mte(mtfVar));
        }
    }
}

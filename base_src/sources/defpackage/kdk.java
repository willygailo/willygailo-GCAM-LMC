package defpackage;

import android.util.Log;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
final class kdk extends FutureTask {
    final /* synthetic */ kdl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdk(kdl kdlVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.a = kdlVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a.a.c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 37);
            sb.append("MeasurementExecutor: job failed with ");
            sb.append(strValueOf);
            Log.e("GAv4", sb.toString());
        }
        super.setException(th);
    }
}

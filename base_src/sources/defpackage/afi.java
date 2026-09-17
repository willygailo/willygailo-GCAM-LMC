package defpackage;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class afi implements Callable {
    final /* synthetic */ afl a;

    public afi(afl aflVar) {
        this.a = aflVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Throwable th;
        Object objA;
        this.a.e.set(true);
        try {
            Process.setThreadPriority(10);
            objA = this.a.a();
            try {
                Binder.flushPendingCommands();
                this.a.d(objA);
                return objA;
            } catch (Throwable th2) {
                th = th2;
                try {
                    this.a.d.set(true);
                    throw th;
                } catch (Throwable th3) {
                    this.a.d(objA);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            objA = null;
        }
    }
}

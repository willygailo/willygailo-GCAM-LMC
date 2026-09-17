package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
final class bdy extends Thread {
    public bdy(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(9);
        super.run();
    }
}

package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class wf extends Thread {
    public wf(Runnable runnable) {
        super(runnable);
        setName("CXCP-Camera2-E");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(-3);
        super.run();
    }
}

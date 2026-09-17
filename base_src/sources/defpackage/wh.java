package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class wh extends Thread {
    final /* synthetic */ qpc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh(qpc qpcVar, Runnable runnable) {
        super(runnable);
        this.a = qpcVar;
        setName(qno.a("CXCP-", qno.p(String.valueOf(qpcVar.c()))));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(-3);
        super.run();
    }
}

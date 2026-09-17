package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bwq implements pys {
    private final qkg a;
    private final /* synthetic */ int b;

    public bwq(qkg qkgVar, int i) {
        this.b = i;
        this.a = qkgVar;
    }

    public final Executor a() {
        switch (this.b) {
            case 0:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.get();
                ScheduledExecutorService scheduledExecutorService2 = bwk.a;
                qmd.ae(scheduledExecutorService);
                return scheduledExecutorService;
            default:
                ExecutorService executorServiceA = ((bwn) this.a).a();
                ScheduledExecutorService scheduledExecutorService3 = bwk.a;
                return executorServiceA;
        }
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.b) {
            case 0:
                break;
        }
        return a();
    }
}

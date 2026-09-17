package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lav implements Executor {
    private final lar a;

    public lav(lar larVar) {
        this.a = larVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (lar.d()) {
            runnable.run();
            return;
        }
        pih pihVarF = pih.f();
        this.a.execute(new lau(runnable, pihVarF, 0));
        try {
            pihVarF.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }
}

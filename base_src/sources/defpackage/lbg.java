package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class lbg extends lbh {
    public lbg(RunnableScheduledFuture runnableScheduledFuture) {
        super(runnableScheduledFuture);
    }

    @Override // defpackage.lbh, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        try {
            super.run();
            if (!super.isDone() || super.isCancelled()) {
                return;
            }
            super.get();
        } catch (InterruptedException e) {
        } catch (CancellationException e2) {
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3.getMessage(), e3);
        }
    }
}

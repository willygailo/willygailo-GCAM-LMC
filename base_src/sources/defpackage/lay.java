package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
final class lay implements Runnable {
    final /* synthetic */ lba a;
    private final Future b;

    public lay(lba lbaVar, Future future) {
        this.a = lbaVar;
        this.b = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            plk.ad(this.b);
        } catch (ExecutionException e) {
            this.a.a.execute(new nfs(e, 1));
        } catch (Throwable th) {
            this.a.a.execute(new kqn(th, 3));
        }
    }
}

package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nfs implements Runnable {
    public final /* synthetic */ ExecutionException a;
    private final /* synthetic */ int b;

    public /* synthetic */ nfs(ExecutionException executionException, int i) {
        this.b = i;
        this.a = executionException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                throw new RuntimeException(this.a.getCause());
            default:
                throw new laz(this.a.getCause());
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fwb extends pfx {
    private final Runnable a;

    public fwb(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.pfx
    public final boolean a(Throwable th) {
        return super.a(th);
    }

    public final void b(fwc fwcVar) {
        super.o(fwcVar);
    }

    @Override // defpackage.pfx, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return super.cancel(z);
    }
}

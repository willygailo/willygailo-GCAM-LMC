package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class awp implements Runnable {
    final /* synthetic */ awq a;

    public awp(awq awqVar) {
        this.a = awqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.b) {
            this.a.b.notifyAll();
        }
    }
}

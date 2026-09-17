package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class aja implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ ajb b;

    public aja(ajb ajbVar, Runnable runnable) {
        this.b = ajbVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } finally {
            this.b.a();
        }
    }
}

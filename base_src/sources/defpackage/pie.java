package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pie implements Runnable {
    final /* synthetic */ Runnable a;

    public pie(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        return this.a.toString();
    }
}

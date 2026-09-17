package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bwg implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bwh b;

    public bwg(bwh bwhVar, Runnable runnable) {
        this.b = bwhVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.execute(this.a);
    }
}

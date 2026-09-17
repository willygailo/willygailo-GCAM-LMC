package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kuy implements Runnable {
    final /* synthetic */ kuz a;

    public kuy(kuz kuzVar) {
        this.a = kuzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            this.a.b.a.countDown();
        }
    }
}

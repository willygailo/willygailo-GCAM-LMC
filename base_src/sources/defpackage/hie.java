package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hie implements Runnable {
    final /* synthetic */ hif a;

    public hie(hif hifVar) {
        this.a = hifVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a.decrementAndGet() == 0) {
            synchronized (this.a.c) {
                this.a.a();
            }
        }
    }
}

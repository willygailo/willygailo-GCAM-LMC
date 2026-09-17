package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dyg implements Runnable {
    final /* synthetic */ Object a;

    public dyg(Object obj) {
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }
}

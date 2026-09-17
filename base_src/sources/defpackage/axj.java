package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class axj implements Runnable {
    final /* synthetic */ axk a;

    public axj(axk axkVar) {
        this.a = axkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }
}

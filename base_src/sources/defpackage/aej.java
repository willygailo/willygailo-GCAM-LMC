package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class aej implements Runnable {
    final /* synthetic */ aem a;

    public aej(aem aemVar) {
        this.a = aemVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.a.b) {
            obj = this.a.g;
            this.a.g = aem.a;
        }
        this.a.g(obj);
    }
}

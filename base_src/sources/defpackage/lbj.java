package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lbj implements Runnable {
    final /* synthetic */ lbk a;

    public lbj(lbk lbkVar) {
        this.a = lbkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            lbk lbkVar = this.a;
            Runnable runnable = lbkVar.b;
            if (runnable != null) {
                lbkVar.b = null;
                runnable.run();
            }
        }
    }
}

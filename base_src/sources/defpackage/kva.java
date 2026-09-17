package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kva implements Runnable {
    final /* synthetic */ kvk a;
    final /* synthetic */ kvb b;

    public kva(kvb kvbVar, kvk kvkVar) {
        this.b = kvbVar;
        this.a = kvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            kvc kvcVar = this.b.b;
            if (kvcVar != null) {
                kvcVar.a(this.a);
            }
        }
    }
}

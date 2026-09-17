package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class kvg implements Runnable {
    final /* synthetic */ kvk a;
    final /* synthetic */ kvh b;

    public kvg(kvh kvhVar, kvk kvkVar) {
        this.b = kvhVar;
        this.a = kvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            kvi kviVar = this.b.b;
            if (kviVar != null) {
                kviVar.b(this.a.c());
            }
        }
    }
}

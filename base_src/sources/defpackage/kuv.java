package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kuv implements Runnable {
    final /* synthetic */ kvk a;
    final /* synthetic */ kuw b;

    public kuv(kuw kuwVar, kvk kvkVar) {
        this.b = kuwVar;
        this.a = kvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((kvp) this.a).c) {
            kvp kvpVar = this.b.b;
            synchronized (kvpVar.a) {
                if (kvpVar.b) {
                    return;
                }
                kvpVar.b = true;
                kvpVar.c = true;
                kvpVar.f.d(kvpVar);
                return;
            }
        }
        try {
            this.b.b.l(this.b.a.a(this.a));
        } catch (kvj e) {
            if (e.getCause() instanceof Exception) {
                this.b.b.k((Exception) e.getCause());
            } else {
                this.b.b.k(e);
            }
        } catch (Exception e2) {
            this.b.b.k(e2);
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lac implements Runnable {
    final /* synthetic */ lae a;

    public lac(lae laeVar) {
        this.a = laeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this.a.d) {
            lae laeVar = this.a;
            z = true;
            if (laeVar.f || laeVar.b != 0) {
                z = false;
            } else {
                laeVar.f = true;
            }
        }
        if (z) {
            this.a.a.close();
        }
    }
}

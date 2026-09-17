package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kwt implements Runnable {
    final /* synthetic */ kyw a;
    final /* synthetic */ kwv b;

    public kwt(kwv kwvVar, kyw kywVar) {
        this.b = kwvVar;
        this.a = kywVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}

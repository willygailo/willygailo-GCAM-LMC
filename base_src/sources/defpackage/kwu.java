package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class kwu implements Runnable {
    final /* synthetic */ kxh a;
    final /* synthetic */ kwv b;

    public kwu(kwv kwvVar, kxh kxhVar) {
        this.b = kwvVar;
        this.a = kxhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b.a);
        this.a.a(this.b.a.e);
    }
}

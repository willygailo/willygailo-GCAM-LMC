package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qgv implements Runnable {
    final /* synthetic */ qgw a;
    private final qgu b;

    public qgv(qgw qgwVar, qgu qguVar) {
        this.a = qgwVar;
        this.b = qguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.f(this.b);
    }
}

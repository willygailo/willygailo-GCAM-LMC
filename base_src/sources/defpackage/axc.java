package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class axc implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ axg b;

    public axc(axg axgVar, int i) {
        this.b = axgVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}

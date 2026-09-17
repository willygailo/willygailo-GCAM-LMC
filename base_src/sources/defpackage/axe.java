package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class axe implements Runnable {
    final /* synthetic */ RuntimeException a;
    final /* synthetic */ axg b;

    public axe(axg axgVar, RuntimeException runtimeException) {
        this.b = axgVar;
        this.a = runtimeException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}

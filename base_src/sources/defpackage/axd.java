package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class axd implements Runnable {
    final /* synthetic */ RuntimeException a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ axg e;

    public axd(axg axgVar, RuntimeException runtimeException, String str, int i, int i2) {
        this.e = axgVar;
        this.a = runtimeException;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a.b(this.a, this.b, this.c, this.d);
    }
}

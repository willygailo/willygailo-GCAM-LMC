package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class avy implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ awb b;

    public avy(awb awbVar, int i) {
        this.b = awbVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.a(this.a);
    }
}

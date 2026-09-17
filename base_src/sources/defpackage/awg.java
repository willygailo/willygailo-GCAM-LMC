package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class awg implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ awl b;

    public awg(awl awlVar, boolean z) {
        this.b = awlVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c().obtainMessage(501, this.a ? 1 : 0, 0).sendToTarget();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class avs implements Runnable {
    final /* synthetic */ awq a;
    final /* synthetic */ awr b;

    public avs(awr awrVar, awq awqVar) {
        this.b = awrVar;
        this.a = awqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a().obtainMessage(2).sendToTarget();
        this.b.a().post(this.a.a);
    }
}

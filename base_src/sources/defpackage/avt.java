package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class avt implements Runnable {
    final /* synthetic */ awr a;

    public avt(awr awrVar) {
        this.a = awrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a().removeCallbacksAndMessages(null);
        this.a.a().obtainMessage(2).sendToTarget();
    }
}

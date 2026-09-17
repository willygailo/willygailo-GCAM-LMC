package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class awe implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ awl b;

    public awe(awl awlVar, int i) {
        this.b = awlVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c().obtainMessage(502, this.a, 0).sendToTarget();
    }
}

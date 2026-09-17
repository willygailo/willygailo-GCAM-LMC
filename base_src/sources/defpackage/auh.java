package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class auh implements Runnable {
    final /* synthetic */ auq a;
    final /* synthetic */ aui b;

    public auh(aui auiVar, auq auqVar) {
        this.b = auiVar;
        this.a = auqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.c.e(-16);
        this.b.c.b.obtainMessage(601, this.a).sendToTarget();
    }
}

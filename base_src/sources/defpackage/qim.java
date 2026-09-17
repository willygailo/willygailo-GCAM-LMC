package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qim implements Runnable {
    final /* synthetic */ qin a;
    private final qcu b;
    private final Runnable c;

    public qim(qin qinVar, qcu qcuVar, Runnable runnable) {
        this.a = qinVar;
        this.b = qcuVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qcr.h(this.b, this.a.b(this.c));
    }
}

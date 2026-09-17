package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qij implements Runnable {
    final /* synthetic */ qio a;
    private final qik b;

    public qij(qio qioVar, qik qikVar) {
        this.a = qioVar;
        this.b = qikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qik qikVar = this.b;
        qcr.h(qikVar.b, this.a.b(qikVar));
    }
}

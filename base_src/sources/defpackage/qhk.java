package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qhk extends qbu {
    final qbw a;
    final qco b;

    public qhk(qbw qbwVar, qco qcoVar) {
        this.b = qcoVar;
        this.a = qbwVar;
    }

    @Override // defpackage.qbu
    protected final void o(qbv qbvVar) {
        this.a.n(new qhj(qbvVar, this.b));
    }
}

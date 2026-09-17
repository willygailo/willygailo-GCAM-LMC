package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qhq extends qbu {
    final qbw a;
    final qco b;

    public qhq(qbw qbwVar, qco qcoVar) {
        this.a = qbwVar;
        this.b = qcoVar;
    }

    @Override // defpackage.qbu
    protected final void o(qbv qbvVar) {
        this.a.n(new qhp(qbvVar, this.b));
    }
}

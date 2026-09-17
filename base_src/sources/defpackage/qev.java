package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qev extends qbu {
    final qyl a;
    final Object b;

    public qev(qyl qylVar, Object obj) {
        this.a = qylVar;
        this.b = obj;
    }

    @Override // defpackage.qbu
    protected final void o(qbv qbvVar) {
        this.a.g(new qeu(qbvVar, this.b));
    }
}

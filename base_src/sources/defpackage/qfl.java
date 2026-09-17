package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qfl extends qbu {
    final qbl a;
    final Object b;

    public qfl(qbl qblVar, Object obj) {
        this.a = qblVar;
        this.b = obj;
    }

    @Override // defpackage.qbu
    protected final void o(qbv qbvVar) {
        this.a.a(new qfk(qbvVar, this.b));
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qen implements qyn {
    final qym a;
    final Object b;
    boolean c;

    public qen(Object obj, qym qymVar) {
        this.b = obj;
        this.a = qymVar;
    }

    @Override // defpackage.qyn
    public final void g() {
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
        if (j <= 0 || this.c) {
            return;
        }
        this.c = true;
        qym qymVar = this.a;
        qymVar.e(this.b);
        qymVar.gO();
    }
}

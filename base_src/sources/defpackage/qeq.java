package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qeq extends qei {
    final ntq c;

    public qeq(qbh qbhVar, ntq ntqVar) {
        super(qbhVar);
        this.c = ntqVar;
    }

    @Override // defpackage.qbh
    protected final void h(qym qymVar) {
        if (qymVar instanceof qde) {
            this.b.f(new qje((qde) qymVar, this.c));
        } else {
            this.b.f(new qjf(qymVar, this.c));
        }
    }
}

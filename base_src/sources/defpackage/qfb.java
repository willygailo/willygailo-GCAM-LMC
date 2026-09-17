package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qfb extends qbh {
    final int b;

    public qfb(int i) {
        this.b = i;
    }

    @Override // defpackage.qbh
    public final void h(qym qymVar) {
        if (qymVar instanceof qde) {
            qymVar.a(new qez((qde) qymVar, this.b));
        } else {
            qymVar.a(new qfa(qymVar, this.b));
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qrn extends qvg {
    final /* synthetic */ qro a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qrn(qvh qvhVar, qro qroVar, Object obj) {
        super(qvhVar);
        this.a = qroVar;
        this.b = obj;
    }

    @Override // defpackage.qvm
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ((qvh) obj).getClass();
        if (this.a.v() == this.b) {
            return null;
        }
        return qvf.a;
    }
}

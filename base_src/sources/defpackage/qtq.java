package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qtq implements qtr {
    public final qmy a;
    private final qtr b;

    public qtq(qtr qtrVar, qmy qmyVar) {
        this.b = qtrVar;
        this.a = qmyVar;
    }

    @Override // defpackage.qtr
    public final Object a(qts qtsVar, qlh qlhVar) {
        qnr qnrVar = new qnr();
        qnrVar.a = qum.a;
        Object objA = this.b.a(new qtp(this, qnrVar, qtsVar), qlhVar);
        return objA == qlp.COROUTINE_SUSPENDED ? objA : qks.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qtx implements qtr {
    final /* synthetic */ qtr a;

    public qtx(qtr qtrVar) {
        this.a = qtrVar;
    }

    @Override // defpackage.qtr
    public final Object a(qts qtsVar, qlh qlhVar) {
        Object objA = this.a.a(new qty(qtsVar), qlhVar);
        return objA == qlp.COROUTINE_SUSPENDED ? objA : qks.a;
    }
}

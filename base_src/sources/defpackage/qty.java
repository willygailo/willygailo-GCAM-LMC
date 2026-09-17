package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qty implements qts {
    final /* synthetic */ qts a;

    public qty(qts qtsVar) {
        this.a = qtsVar;
    }

    @Override // defpackage.qts
    public final Object emit(Object obj, qlh qlhVar) {
        qts qtsVar = this.a;
        qnm.v(qtsVar);
        Object objA = ((qtr) obj).a(qtsVar, qlhVar);
        if (objA != qlp.COROUTINE_SUSPENDED) {
            objA = qks.a;
        }
        return objA == qlp.COROUTINE_SUSPENDED ? objA : qks.a;
    }
}

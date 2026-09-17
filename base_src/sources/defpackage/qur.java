package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qur implements qts {
    private final qtk a;

    public qur(qtk qtkVar) {
        qtkVar.getClass();
        this.a = qtkVar;
    }

    @Override // defpackage.qts
    public final Object emit(Object obj, qlh qlhVar) {
        Object objR = this.a.r(obj, qlhVar);
        return objR == qlp.COROUTINE_SUSPENDED ? objR : qks.a;
    }
}

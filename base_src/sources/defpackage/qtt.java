package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qtt implements qtr {
    final /* synthetic */ Object a;

    public qtt(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.qtr
    public final Object a(qts qtsVar, qlh qlhVar) {
        Object objEmit = qtsVar.emit(this.a, qlhVar);
        return objEmit == qlp.COROUTINE_SUSPENDED ? objEmit : qks.a;
    }
}

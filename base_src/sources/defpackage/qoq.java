package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qoq extends qnp implements qmu {
    final /* synthetic */ qmy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qoq(qmy qmyVar) {
        super(1);
        this.a = qmyVar;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        qla qlaVar = (qla) obj;
        qlaVar.getClass();
        return Boolean.valueOf(((Boolean) this.a.invoke(Integer.valueOf(qlaVar.a), qlaVar.b)).booleanValue());
    }
}

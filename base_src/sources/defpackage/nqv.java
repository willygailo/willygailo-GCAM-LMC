package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nqv extends qnp implements qmu {
    final /* synthetic */ qfg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqv(qfg qfgVar) {
        super(1);
        this.a = qfgVar;
    }

    @Override // defpackage.qmu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        Throwable th = (Throwable) obj;
        th.getClass();
        this.a.c(th);
        return qks.a;
    }
}

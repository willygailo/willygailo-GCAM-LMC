package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "kotlinx.coroutines.channels.AbstractChannel", c = "AbstractChannel.kt", d = "receiveCatching-JP2dKIU", e = {633})
final class qsn extends qlu {
    /* synthetic */ Object a;
    final /* synthetic */ qso b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsn(qso qsoVar, qlh qlhVar) {
        super(qlhVar);
        this.b = qsoVar;
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(this);
        return objC == qlp.COROUTINE_SUSPENDED ? objC : qsz.a(objC);
    }
}

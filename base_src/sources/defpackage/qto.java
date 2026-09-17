package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$$inlined$collect$1", c = "Distinct.kt", d = "emit", e = {139})
public final class qto extends qlu {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ qtp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qto(qtp qtpVar, qlh qlhVar) {
        super(qlhVar);
        this.c = qtpVar;
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}

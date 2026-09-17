package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@qlw(b = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$$inlined$collect$1", c = "Merge.kt", d = "emit", e = {136})
public final class que extends qlu {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ quf c;
    Object d;
    Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public que(quf qufVar, qlh qlhVar) {
        super(qlhVar);
        this.c = qufVar;
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class quq extends qnp implements qmy {
    final /* synthetic */ qun a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quq(qun qunVar) {
        super(2);
        this.a = qunVar;
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        qlk qlkVar = (qlk) obj2;
        qll key = qlkVar.getKey();
        qlk qlkVar2 = this.a.b.get(key);
        if (key != qrg.c) {
            return Integer.valueOf(qlkVar != qlkVar2 ? Integer.MIN_VALUE : iIntValue + 1);
        }
        qrg qrgVar = (qrg) qlkVar2;
        qrg qrgVarC = (qrg) qlkVar;
        qrg qrgVar2 = null;
        while (qrgVarC != null) {
            if (qrgVarC == qrgVar || !(qrgVarC instanceof qvo)) {
                qrgVar2 = qrgVarC;
                break;
            }
            qps qpsVarA = ((qvo) qrgVarC).A();
            qrgVarC = qpsVarA == null ? null : qpsVarA.c();
        }
        if (qrgVar2 == qrgVar) {
            if (qrgVar != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + qrgVar2 + ", expected child of " + qrgVar + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}

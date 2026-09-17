package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ndt implements ndu {
    private final /* synthetic */ int a;

    public ndt(int i) {
        this.a = i;
    }

    @Override // defpackage.ndu
    public final /* synthetic */ String a(pql pqlVar) {
        switch (this.a) {
            case 0:
                return ((qwu) ((poy) pqlVar).b).e;
            case 1:
                return ((qyk) ((poy) pqlVar).b).n;
            default:
                return ((qxo) ((poy) pqlVar).b).b;
        }
    }

    @Override // defpackage.ndu
    public final /* synthetic */ String b(pql pqlVar) {
        switch (this.a) {
            case 0:
                return ((qwu) ((poy) pqlVar).b).d;
            case 1:
                return ((qyk) ((poy) pqlVar).b).d;
            default:
                return ((qxo) ((poy) pqlVar).b).d;
        }
    }

    @Override // defpackage.ndu
    public final /* synthetic */ void c(pql pqlVar, Long l) {
        switch (this.a) {
            case 0:
                if (l == null) {
                    poy poyVar = (poy) pqlVar;
                    if (poyVar.c) {
                        poyVar.m();
                        poyVar.c = false;
                    }
                    qwu qwuVar = (qwu) poyVar.b;
                    qwu qwuVar2 = qwu.k;
                    qwuVar.a &= -3;
                    qwuVar.c = 0L;
                } else {
                    long jLongValue = l.longValue();
                    poy poyVar2 = (poy) pqlVar;
                    if (poyVar2.c) {
                        poyVar2.m();
                        poyVar2.c = false;
                    }
                    qwu qwuVar3 = (qwu) poyVar2.b;
                    qwu qwuVar4 = qwu.k;
                    qwuVar3.a |= 2;
                    qwuVar3.c = jLongValue;
                }
                break;
            case 1:
                if (l == null) {
                    poy poyVar3 = (poy) pqlVar;
                    if (poyVar3.c) {
                        poyVar3.m();
                        poyVar3.c = false;
                    }
                    qyk qykVar = (qyk) poyVar3.b;
                    qyk qykVar2 = qyk.t;
                    qykVar.a &= -3;
                    qykVar.c = 0L;
                } else {
                    long jLongValue2 = l.longValue();
                    poy poyVar4 = (poy) pqlVar;
                    if (poyVar4.c) {
                        poyVar4.m();
                        poyVar4.c = false;
                    }
                    qyk qykVar3 = (qyk) poyVar4.b;
                    qyk qykVar4 = qyk.t;
                    qykVar3.a |= 2;
                    qykVar3.c = jLongValue2;
                }
                break;
            default:
                if (l != null) {
                    long jLongValue3 = l.longValue();
                    poy poyVar5 = (poy) pqlVar;
                    if (poyVar5.c) {
                        poyVar5.m();
                        poyVar5.c = false;
                    }
                    qxo qxoVar = (qxo) poyVar5.b;
                    qxo qxoVar2 = qxo.e;
                    qxoVar.a |= 2;
                    qxoVar.c = jLongValue3;
                } else {
                    poy poyVar6 = (poy) pqlVar;
                    if (poyVar6.c) {
                        poyVar6.m();
                        poyVar6.c = false;
                    }
                    qxo qxoVar3 = (qxo) poyVar6.b;
                    qxo qxoVar4 = qxo.e;
                    qxoVar3.a &= -3;
                    qxoVar3.c = 0L;
                }
                break;
        }
    }

    @Override // defpackage.ndu
    public final /* synthetic */ void d(pql pqlVar) {
        switch (this.a) {
            case 0:
                poy poyVar = (poy) pqlVar;
                if (poyVar.c) {
                    poyVar.m();
                    poyVar.c = false;
                }
                qwu qwuVar = (qwu) poyVar.b;
                qwu qwuVar2 = qwu.k;
                qwuVar.a &= -5;
                qwuVar.d = qwu.k.d;
                break;
            case 1:
                poy poyVar2 = (poy) pqlVar;
                if (poyVar2.c) {
                    poyVar2.m();
                    poyVar2.c = false;
                }
                qyk qykVar = (qyk) poyVar2.b;
                qyk qykVar2 = qyk.t;
                qykVar.a &= -5;
                qykVar.d = qyk.t.d;
                break;
            default:
                poy poyVar3 = (poy) pqlVar;
                if (poyVar3.c) {
                    poyVar3.m();
                    poyVar3.c = false;
                }
                qxo qxoVar = (qxo) poyVar3.b;
                qxo qxoVar2 = qxo.e;
                qxoVar.a &= -5;
                qxoVar.d = qxo.e.d;
                break;
        }
    }
}

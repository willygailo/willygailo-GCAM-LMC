package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qtp implements qts {
    final /* synthetic */ qtq a;
    final /* synthetic */ qnr b;
    final /* synthetic */ qts c;

    public qtp(qtq qtqVar, qnr qnrVar, qts qtsVar) {
        this.a = qtqVar;
        this.b = qnrVar;
        this.c = qtsVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qts
    public final Object emit(Object obj, qlh qlhVar) {
        qto qtoVar;
        if (qlhVar instanceof qto) {
            qtoVar = (qto) qlhVar;
            int i = qtoVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qtoVar.b = i - Integer.MIN_VALUE;
            } else {
                qtoVar = new qto(this, qlhVar);
            }
        } else {
            qtoVar = new qto(this, qlhVar);
        }
        Object obj2 = qtoVar.a;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (qtoVar.b) {
            case 0:
                qmd.M(obj2);
                if (this.b.a == qum.a || !((Boolean) this.a.a.invoke(this.b.a, obj)).booleanValue()) {
                    this.b.a = obj;
                    qts qtsVar = this.c;
                    qtoVar.b = 1;
                    if (qtsVar.emit(obj, qtoVar) == qlpVar) {
                        return qlpVar;
                    }
                }
                break;
            case 1:
                qmd.M(obj2);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qks.a;
    }
}

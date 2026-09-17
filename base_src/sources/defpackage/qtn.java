package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qtn implements qtr {
    private final qmy a;

    public qtn() {
    }

    public qtn(qmy qmyVar) {
        this.a = qmyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qtr
    public final Object a(qts qtsVar, qlh qlhVar) throws Throwable {
        qtm qtmVar;
        Throwable th;
        Object obj;
        if (qlhVar instanceof qtm) {
            qtmVar = (qtm) qlhVar;
            int i = qtmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qtmVar.d = i - Integer.MIN_VALUE;
            } else {
                qtmVar = new qtm(this, qlhVar);
            }
        } else {
            qtmVar = new qtm(this, qlhVar);
        }
        Object obj2 = qtmVar.b;
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        switch (qtmVar.d) {
            case 0:
                qmd.M(obj2);
                qun qunVar = new qun(qtsVar, qtmVar.getContext());
                try {
                    qtmVar.a = qunVar;
                    qtmVar.d = 1;
                    Object objInvoke = this.a.invoke(qunVar, qtmVar);
                    if (objInvoke != qlp.COROUTINE_SUSPENDED) {
                        objInvoke = qks.a;
                        break;
                    }
                    if (objInvoke == qlpVar) {
                        return qlpVar;
                    }
                    obj = qunVar;
                    ((qun) obj).releaseIntercepted();
                    return qks.a;
                } catch (Throwable th2) {
                    th = th2;
                    obj = qunVar;
                    ((qun) obj).releaseIntercepted();
                    throw th;
                }
            case 1:
                obj = qtmVar.a;
                try {
                    qmd.M(obj2);
                    ((qun) obj).releaseIntercepted();
                    return qks.a;
                } catch (Throwable th3) {
                    th = th3;
                    ((qun) obj).releaseIntercepted();
                    throw th;
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

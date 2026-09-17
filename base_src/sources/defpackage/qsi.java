package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qsi implements qsw {
    public final qso a;
    public Object b = qsp.d;

    public qsi(qso qsoVar) {
        this.a = qsoVar;
    }

    private static final boolean c(Object obj) throws Throwable {
        if (!(obj instanceof qta)) {
            return true;
        }
        qta qtaVar = (qta) obj;
        if (qtaVar.a == null) {
            return false;
        }
        throw qvq.b(qtaVar.e());
    }

    @Override // defpackage.qsw
    public final Object a(qlh qlhVar) {
        if (this.b != qsp.d) {
            return Boolean.valueOf(c(this.b));
        }
        Object objA = this.a.a();
        this.b = objA;
        if (objA != qsp.d) {
            return Boolean.valueOf(c(this.b));
        }
        qpo qpoVarJ = qmd.j(qmd.c(qlhVar));
        qsk qskVar = new qsk(this, qpoVarJ);
        while (!this.a.g(qskVar)) {
            Object objA2 = this.a.a();
            this.b = objA2;
            if (objA2 instanceof qta) {
                qta qtaVar = (qta) objA2;
                if (qtaVar.a == null) {
                    qpoVarJ.resumeWith(false);
                } else {
                    qpoVarJ.resumeWith(qmd.L(qtaVar.e()));
                }
            } else if (objA2 != qsp.d) {
                qpoVarJ.b(true, null);
            }
            Object objG = qpoVarJ.g();
            qlp qlpVar = qlp.COROUTINE_SUSPENDED;
            return objG;
        }
        qso.n(qpoVarJ, qskVar);
        Object objG2 = qpoVarJ.g();
        qlp qlpVar2 = qlp.COROUTINE_SUSPENDED;
        return objG2;
    }

    @Override // defpackage.qsw
    public final Object b() throws Throwable {
        Object obj = this.b;
        if (obj instanceof qta) {
            throw qvq.b(((qta) obj).e());
        }
        if (obj == qsp.d) {
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
        this.b = qsp.d;
        return obj;
    }
}

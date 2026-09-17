package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qsc extends qvo {
    public qln b;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsc(qln qlnVar, qlh qlhVar) {
        super(qlnVar.get(qsd.a) == null ? qlnVar.plus(qsd.a) : qlnVar, qlhVar);
        qlnVar.getClass();
        qlhVar.getClass();
    }

    public final boolean L() {
        if (this.b == null) {
            return false;
        }
        this.b = null;
        this.e = null;
        return true;
    }

    @Override // defpackage.qvo, defpackage.qpg
    protected final void hi(Object obj) {
        qln qlnVar = this.b;
        if (qlnVar != null) {
            qvt.c(qlnVar, this.e);
            this.b = null;
            this.e = null;
        }
        Object objH = qmd.h(obj, this.f);
        qlh qlhVar = this.f;
        qln context = qlhVar.getContext();
        Object objB = qvt.b(context, null);
        qsc qscVarC = objB != qvt.a ? qqd.c(qlhVar, context, objB) : null;
        try {
            this.f.resumeWith(objH);
            if (qscVarC == null || qscVarC.L()) {
            }
        } finally {
            if (qscVarC == null || qscVarC.L()) {
                qvt.c(context, objB);
            }
        }
    }
}

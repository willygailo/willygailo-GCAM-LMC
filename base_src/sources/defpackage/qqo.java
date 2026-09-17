package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qqo extends qwg {
    public int e;

    public qqo(int i) {
        super(0L, qwf.a);
        this.e = i;
    }

    public Object i(Object obj) {
        return obj;
    }

    public abstract Object j();

    public Throwable k(Object obj) {
        qpy qpyVar = obj instanceof qpy ? (qpy) obj : null;
        if (qpyVar == null) {
            return null;
        }
        return qpyVar.b;
    }

    public abstract qlh l();

    public void o(Object obj, Throwable th) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [qlh, qlv] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objL;
        Object objL2;
        boolean z = qql.a;
        qwh qwhVar = this.h;
        try {
            quz quzVar = (quz) l();
            ?? r2 = quzVar.b;
            Object obj = quzVar.d;
            qln context = r2.getContext();
            Object objB = qvt.b(context, obj);
            qsc qscVarC = objB != qvt.a ? qqd.c(r2, context, objB) : null;
            try {
                qln context2 = r2.getContext();
                Object objJ = j();
                Throwable thK = k(objJ);
                qrg qrgVar = (thK == null && qnm.e(this.e)) ? (qrg) context2.get(qrg.c) : null;
                if (qrgVar != null && !qrgVar.hl()) {
                    Throwable thM = qrgVar.m();
                    o(objJ, thM);
                    if (qql.b) {
                        thM = qvq.a(thM, r2);
                    }
                    r2.resumeWith(qmd.L(thM));
                } else if (thK != null) {
                    r2.resumeWith(qmd.L(thK));
                } else {
                    r2.resumeWith(i(objJ));
                }
                if (qscVarC == null || qscVarC.L()) {
                    qvt.c(context, objB);
                }
                try {
                    qwhVar.g();
                    objL2 = qks.a;
                } catch (Throwable th) {
                    objL2 = qmd.L(th);
                }
                u(null, qkn.a(objL2));
            } catch (Throwable th2) {
                if (qscVarC == null || qscVarC.L()) {
                    qvt.c(context, objB);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                qwhVar.g();
                objL = qks.a;
            } catch (Throwable th4) {
                objL = qmd.L(th4);
            }
            u(th3, qkn.a(objL));
        }
    }

    public final void u(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            qmd.P(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        qnm.l(l().getContext(), new qqk("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class qpg extends qro implements qrg, qlh, qqj {
    public final qln a;

    public qpg(qln qlnVar) {
        C((qrg) qlnVar.get(qrg.c));
        this.a = qlnVar.plus(this);
    }

    @Override // defpackage.qro
    protected final String a() {
        return qno.a(qnm.f(this), " was cancelled");
    }

    @Override // defpackage.qro
    public final void e(Throwable th) {
        qnm.l(this.a, th);
    }

    protected void f(Throwable th, boolean z) {
    }

    protected void g(Object obj) {
    }

    @Override // defpackage.qlh
    public final qln getContext() {
        return this.a;
    }

    @Override // defpackage.qro
    protected final void h(Object obj) {
        if (!(obj instanceof qpy)) {
            g(obj);
        } else {
            qpy qpyVar = (qpy) obj;
            f(qpyVar.b, qpyVar.c.a());
        }
    }

    @Override // defpackage.qro
    public final String hg() {
        String strA = qqd.a(this.a);
        if (strA == null) {
            return qnm.f(this);
        }
        return '\"' + strA + "\":" + qnm.f(this);
    }

    @Override // defpackage.qqj
    public final qln hh() {
        return this.a;
    }

    protected void hi(Object obj) {
        j(obj);
    }

    public final void i(int i, Object obj, qmy qmyVar) {
        switch (i - 1) {
            case 0:
                qnm.m(qmyVar, obj, this);
                break;
            case 2:
                qmd.c(qmd.b(qmyVar, obj, this)).resumeWith(qks.a);
                break;
        }
    }

    @Override // defpackage.qlh
    public final void resumeWith(Object obj) throws Throwable {
        Object objHj = hj(qmd.i(obj));
        if (objHj == qrp.b) {
            return;
        }
        hi(objHj);
    }
}

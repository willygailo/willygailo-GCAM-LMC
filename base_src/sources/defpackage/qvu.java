package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qvu implements qry {
    private final Object a;
    private final ThreadLocal b;
    private final qll c;

    public qvu(Object obj, ThreadLocal threadLocal) {
        this.a = obj;
        this.b = threadLocal;
        this.c = new qvv(threadLocal);
    }

    @Override // defpackage.qry
    public final Object a(qln qlnVar) {
        Object obj = this.b.get();
        this.b.set(this.a);
        return obj;
    }

    @Override // defpackage.qry
    public final void b(Object obj) {
        this.b.set(obj);
    }

    @Override // defpackage.qln
    public final Object fold(Object obj, qmy qmyVar) {
        return qmd.d(this, obj, qmyVar);
    }

    @Override // defpackage.qlk, defpackage.qln
    public final qlk get(qll qllVar) {
        qllVar.getClass();
        if (qno.c(this.c, qllVar)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.qlk
    public final qll getKey() {
        return this.c;
    }

    @Override // defpackage.qln
    public final qln minusKey(qll qllVar) {
        qllVar.getClass();
        return qno.c(this.c, qllVar) ? qlo.a : this;
    }

    @Override // defpackage.qln
    public final qln plus(qln qlnVar) {
        qlnVar.getClass();
        return qmd.g(this, qlnVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.a + ", threadLocal = " + this.b + ')';
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class qlc implements qlk {
    private final qll key;

    public qlc(qll qllVar) {
        qllVar.getClass();
        this.key = qllVar;
    }

    @Override // defpackage.qln
    public Object fold(Object obj, qmy qmyVar) {
        qmyVar.getClass();
        return qmd.d(this, obj, qmyVar);
    }

    @Override // defpackage.qlk, defpackage.qln
    public qlk get(qll qllVar) {
        qllVar.getClass();
        return qmd.e(this, qllVar);
    }

    @Override // defpackage.qlk
    public qll getKey() {
        return this.key;
    }

    @Override // defpackage.qln
    public qln minusKey(qll qllVar) {
        qllVar.getClass();
        return qmd.f(this, qllVar);
    }

    @Override // defpackage.qln
    public qln plus(qln qlnVar) {
        qlnVar.getClass();
        return qmd.g(this, qlnVar);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qsd implements qlk, qll {
    public static final qsd a = new qsd();

    private qsd() {
    }

    @Override // defpackage.qln
    public final Object fold(Object obj, qmy qmyVar) {
        return qmd.d(this, obj, qmyVar);
    }

    @Override // defpackage.qlk, defpackage.qln
    public final qlk get(qll qllVar) {
        return qmd.e(this, qllVar);
    }

    @Override // defpackage.qlk
    public final qll getKey() {
        return this;
    }

    @Override // defpackage.qln
    public final qln minusKey(qll qllVar) {
        return qmd.f(this, qllVar);
    }

    @Override // defpackage.qln
    public final qln plus(qln qlnVar) {
        return qmd.g(this, qlnVar);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class quj implements qlk {
    public static final qli b = new qli();
    public final Throwable a;
    private final qll c = b;

    public quj(Throwable th) {
        this.a = th;
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
        return this.c;
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

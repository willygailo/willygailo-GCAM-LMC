package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gxu implements gxk {
    private boolean a;
    private final lng b;

    public gxu(lng lngVar) {
        this.b = lngVar;
    }

    @Override // defpackage.gxk
    public final lnv a() {
        lnu lnuVarA = lnv.a();
        lnuVarA.c(3);
        lnuVarA.b(4);
        lnuVarA.e(3);
        lnuVarA.d(false);
        return lnuVarA.a();
    }

    @Override // defpackage.gxk, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        this.a = true;
        gxv.c(this.b, false);
    }
}

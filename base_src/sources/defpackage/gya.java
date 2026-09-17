package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gya implements gxk {
    private final /* synthetic */ int a;

    public gya(int i) {
        this.a = i;
    }

    @Override // defpackage.gxk
    public final lnv a() {
        switch (this.a) {
            case 0:
                lnu lnuVarA = lnv.a();
                lnuVarA.c(3);
                lnuVarA.b(4);
                lnuVarA.e(3);
                lnuVarA.d(false);
                return lnuVarA.a();
            default:
                lnu lnuVarA2 = lnv.a();
                lnuVarA2.c(4);
                lnuVarA2.b(4);
                lnuVarA2.e(1);
                lnuVarA2.d(true);
                return lnuVarA2.a();
        }
    }

    @Override // defpackage.gxk, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
    }
}

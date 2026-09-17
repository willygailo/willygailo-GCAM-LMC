package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lkt extends lzt {
    private final lky a;
    private boolean b;

    public lkt(lzp lzpVar, lky lkyVar) {
        super(lzpVar);
        this.b = false;
        this.a = lkyVar;
    }

    @Override // defpackage.lzt, defpackage.lzp, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.a();
            super.close();
        }
    }
}

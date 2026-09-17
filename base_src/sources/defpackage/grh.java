package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class grh implements lie {
    public final lzv a;
    final /* synthetic */ gri b;
    private boolean c;

    public grh(gri griVar, lzv lzvVar) {
        this.b = griVar;
        this.a = lzvVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b.b) {
            if (this.c) {
                return;
            }
            boolean z = true;
            this.c = true;
            gri griVar = this.b;
            int i = griVar.k - 1;
            griVar.k = i;
            if (i != 0 || !griVar.l) {
                z = false;
            }
            if (z) {
                this.b.b();
            }
        }
    }
}

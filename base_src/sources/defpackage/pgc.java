package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class pgc implements Runnable {
    final /* synthetic */ pht a;
    final /* synthetic */ int b;
    final /* synthetic */ pge c;

    public pgc(pge pgeVar, pht phtVar, int i) {
        this.c = pgeVar;
        this.a = phtVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.a.isCancelled()) {
                pge pgeVar = this.c;
                pgeVar.a = null;
                pgeVar.cancel(false);
            } else {
                this.c.h(this.b, this.a);
            }
        } finally {
            this.c.i(null);
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bsg {
    private static final bsd b = new brn();
    public bsd a;
    private final lar c;
    private final bse d;

    public bsg(lar larVar, bse bseVar) {
        this.c = larVar;
        this.d = bseVar;
    }

    public final bsd a(brk brkVar) {
        bsd bsdVar = this.a;
        if (bsdVar != null && bsdVar.c() != 3) {
            return b;
        }
        this.a = this.d.a(brkVar);
        this.c.execute(new Runnable() { // from class: bsf
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b();
            }
        });
        return this.a;
    }
}

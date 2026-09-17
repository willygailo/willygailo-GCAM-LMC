package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fox implements fig, fie, fik {
    public final fnv a;
    public volatile int b = 1;
    private final lda c;
    private final ddf d;

    public fox(fnv fnvVar, lda ldaVar, ddf ddfVar) {
        this.a = fnvVar;
        this.c = ldaVar;
        this.d = ddfVar;
    }

    public final boolean a() {
        jrl jrlVar = (jrl) this.c.fA();
        int i = this.b;
        if (i != 3 && i != 2) {
            return false;
        }
        if (jrlVar == jrl.PHOTO) {
            return true;
        }
        ddf ddfVar = this.d;
        ddi ddiVar = ddl.a;
        ddfVar.d();
        this.d.e();
        return false;
    }

    @Override // defpackage.fie
    public final void fU() {
        this.a.g(false);
        this.a.k(this);
    }

    @Override // defpackage.fig
    public final void fV() {
        this.a.j(this);
        this.a.g(a());
    }
}

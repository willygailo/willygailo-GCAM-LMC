package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gib {
    public final ljf a;
    public final lar b;
    public final Object c;
    public phv d;
    public boolean e;

    public gib(lir lirVar, ljf ljfVar, lar larVar) {
        this.b = larVar;
        this.a = ljfVar;
        lirVar.a("CommandExecutor");
        this.c = new Object();
        this.e = false;
    }

    public final boolean a() {
        boolean z;
        synchronized (this.c) {
            z = this.e;
        }
        return z;
    }

    public final void b(ghz ghzVar) {
        synchronized (this.c) {
            if (this.e) {
                plk.V(null);
                return;
            }
            if (this.d == null) {
                this.d = plk.J(gfp.b());
            }
            phv phvVar = this.d;
            phvVar.getClass();
            phvVar.submit(new gia(this, ghzVar));
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fqy {
    private final fpo a;
    private final ojc b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;

    public fqy(fpo fpoVar, ojc ojcVar) {
        this.a = fpoVar;
        this.b = ojcVar;
    }

    private final void c() {
        boolean z = this.e || this.f;
        if (this.d == z && this.c) {
            return;
        }
        this.c = true;
        if (z) {
            this.a.i();
            if (this.b.g()) {
                ((dve) this.b.c()).a(true);
            }
        } else {
            this.a.i();
            if (this.b.g()) {
                ((dve) this.b.c()).a(false);
            }
        }
        this.d = z;
    }

    public final synchronized void a(boolean z) {
        this.e = z;
        c();
    }

    public final synchronized void b(boolean z) {
        this.f = z;
        c();
    }
}

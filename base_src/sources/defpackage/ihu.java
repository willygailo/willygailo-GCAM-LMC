package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ihu {
    int a = 1;
    private final ihw b;
    private ihw c;
    private final boolean d;

    public ihu(ihw ihwVar, boolean z) {
        this.c = ihwVar;
        this.b = ihwVar;
        this.d = z;
    }

    public final ihw a() {
        if (this.a != 2) {
            return null;
        }
        return this.c;
    }

    public final void b() {
        obr.aQ(this.a == 3);
        this.c = this.b;
    }

    public final void c() {
        if (this.a == 3) {
            if (!this.d) {
                this.c = this.b;
            }
            ihw ihwVar = this.c;
            obr.ao(ihwVar);
            ihwVar.f();
            this.a = 2;
        }
    }

    public final void d() {
        if (this.a == 2) {
            ihw ihwVar = this.c;
            obr.ao(ihwVar);
            ihwVar.g();
            this.a = 3;
        }
    }

    public final void e() {
        ihw ihwVar = this.c;
        ihwVar.getClass();
        ihwVar.g();
        this.c = null;
    }

    public final void f() {
        this.a = 3;
    }

    public final void g(ihw ihwVar) {
        ihwVar.getClass();
        obr.aR(this.c == null, "Setting new state without first exiting current state");
        if (this.a == 1) {
            this.a = 2;
        }
        this.c = ihwVar;
        ihwVar.f();
    }
}

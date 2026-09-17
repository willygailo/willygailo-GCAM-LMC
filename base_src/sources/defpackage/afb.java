package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afb extends aen {
    public final int j;
    public final afh k;
    public afc l;
    private aee m;

    public afb(int i, afh afhVar) {
        this.j = i;
        this.k = afhVar;
        if (afhVar.h != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        afhVar.h = this;
        afhVar.b = i;
    }

    @Override // defpackage.aem
    protected final void d() {
        if (afa.b(2)) {
            String str = "  Starting: " + this;
        }
        afh afhVar = this.k;
        afhVar.d = true;
        afhVar.f = false;
        afhVar.e = false;
        afhVar.h();
    }

    @Override // defpackage.aem
    protected final void e() {
        if (afa.b(2)) {
            String str = "  Stopping: " + this;
        }
        afh afhVar = this.k;
        afhVar.d = false;
        afhVar.i();
    }

    @Override // defpackage.aem
    public final void f(aeo aeoVar) {
        super.f(aeoVar);
        this.m = null;
        this.l = null;
    }

    public final void i() {
        aee aeeVar = this.m;
        afc afcVar = this.l;
        if (aeeVar == null || afcVar == null) {
            return;
        }
        super.f(afcVar);
        c(aeeVar, afcVar);
    }

    public final void j() {
        if (afa.b(3)) {
            String str = "  Destroying: " + this;
        }
        this.k.f();
        this.k.e = true;
        afc afcVar = this.l;
        if (afcVar != null) {
            f(afcVar);
            if (afcVar.c) {
                if (afa.b(2)) {
                    String str2 = "  Resetting: " + afcVar.a;
                }
                afcVar.b.d();
            }
        }
        afh afhVar = this.k;
        afb afbVar = afhVar.h;
        if (afbVar == null) {
            throw new IllegalStateException("No listener register");
        }
        if (afbVar != this) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        afhVar.h = null;
        afhVar.f = true;
        afhVar.d = false;
        afhVar.e = false;
        afhVar.g = false;
    }

    final void k(aee aeeVar, aez aezVar) {
        afc afcVar = new afc(this.k, aezVar);
        c(aeeVar, afcVar);
        aeo aeoVar = this.l;
        if (aeoVar != null) {
            f(aeoVar);
        }
        this.m = aeeVar;
        this.l = afcVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.j);
        sb.append(" : ");
        sb.append(this.k.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.k)));
        sb.append("}}");
        return sb.toString();
    }
}

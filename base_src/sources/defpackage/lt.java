package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lt implements gp {
    int a;
    final /* synthetic */ lu b;
    private boolean c = false;

    protected lt(lu luVar) {
        this.b = luVar;
    }

    @Override // defpackage.gp
    public final void a() {
        this.c = true;
    }

    @Override // defpackage.gp
    public final void b() {
        if (this.c) {
            return;
        }
        lu luVar = this.b;
        luVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.gp
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    public final void d(go goVar, int i) {
        this.b.f = goVar;
        this.a = i;
    }
}

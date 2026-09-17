package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gxc implements Runnable {
    public final /* synthetic */ gxi a;
    private final /* synthetic */ int b;

    public /* synthetic */ gxc(gxi gxiVar, int i) {
        this.b = i;
        this.a = gxiVar;
    }

    public gxc(gxi gxiVar, int i, byte[] bArr) {
        this.b = i;
        this.a = gxiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.c.j(aap.f());
                break;
            case 1:
                this.a.c.j(aap.e());
                break;
            case 2:
                gxi gxiVar = this.a;
                if (gxiVar.g.a == jrl.LONG_EXPOSURE) {
                    gxiVar.h.d();
                    gxiVar.h.a(gxiVar.p);
                } else {
                    gxiVar.g.a(gxiVar.p);
                }
                break;
            default:
                this.a.c();
                pih pihVar = this.a.i;
                if (pihVar != null) {
                    pihVar.o(null);
                }
                break;
        }
    }
}

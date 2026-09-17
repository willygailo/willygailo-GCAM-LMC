package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ckg implements lie {
    public final gvb a;
    private final ddf f;
    private final lco g;
    private lap h;
    public final lce b = new lce(0);
    public final lce c = new lce(lic.CLOCKWISE_0);
    public final Object d = new Object();
    public boolean e = false;
    private final lyy i = new ckf(this);

    public ckg(lco lcoVar, gvb gvbVar, ddf ddfVar) {
        this.g = lcoVar;
        this.a = gvbVar;
        this.f = ddfVar;
    }

    public final lco a() {
        c();
        return this.c;
    }

    public final Integer b(lic licVar) {
        lco lcoVar = this.g;
        lcoVar.getClass();
        cwi cwiVar = (cwi) lcoVar.fA();
        cwiVar.a();
        return Integer.valueOf(brg.c(cwiVar.a.f(), licVar.e, cwiVar.b(), this.f));
    }

    public final void c() {
        synchronized (this.d) {
            lap lapVar = this.h;
            if (lapVar == null || lapVar.a()) {
                lap lapVar2 = new lap();
                this.b.fB(b(this.a.c()));
                this.c.fB(lic.b(b(this.a.c()).intValue()));
                this.a.g(this.i);
                lapVar2.c(this.g.a(new lij() { // from class: cke
                    @Override // defpackage.lij
                    public final void fB(Object obj) {
                        ckg ckgVar = this.a;
                        synchronized (ckgVar.d) {
                            Integer numB = ckgVar.b(ckgVar.a.c());
                            ckgVar.b.fB(numB);
                            ckgVar.c.fB(lic.b(numB.intValue()));
                        }
                    }
                }, pgr.INSTANCE));
                this.h = lapVar2;
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            lap lapVar = this.h;
            if (lapVar != null && !lapVar.a()) {
                this.a.h(this.i);
                lapVar.close();
                this.h = null;
            }
        }
    }
}

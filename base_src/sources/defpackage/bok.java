package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bok implements bnw, lij {
    public final bnl a;
    public jsj b;
    public jsj c;
    public pih d;
    private final lar e;
    private final lap f;
    private volatile boolean g;
    private final lak h;

    public bok(lar larVar, bnl bnlVar, lco lcoVar) {
        lap lapVar = new lap();
        this.f = lapVar;
        this.g = true;
        this.b = null;
        this.c = null;
        this.h = new boj(this);
        this.e = larVar;
        this.a = bnlVar;
        lapVar.c(lcoVar.a(this, larVar));
    }

    @Override // defpackage.bnw
    public final void b() {
        this.g = true;
    }

    @Override // defpackage.bnw
    public final void c() {
        this.g = false;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        ggp ggpVar = (ggp) obj;
        if (this.g) {
            if (this.b == null && this.c == null && ggpVar.a.b != hkd.PASSIVE_SCAN && ggpVar.b.b == hkd.PASSIVE_SCAN) {
                jsj jsjVarP = this.a.p();
                this.b = jsjVarP;
                jsjVarP.b(new jsi() { // from class: boh
                    @Override // defpackage.jsi
                    public final void a() {
                        this.a.b = null;
                    }
                });
                if (this.b != null) {
                    this.d = pih.f();
                    mip.cb(this.b.a(), this.d, this.h, this.e);
                }
            }
            if (this.d != null && ggpVar.a.b == hkd.PASSIVE_SCAN && ggpVar.b.b.b()) {
                hkd hkdVar = ggpVar.b.b;
                boolean z = true;
                if (hkdVar != hkd.PASSIVE_FOCUSED && hkdVar != hkd.FOCUSED_LOCKED) {
                    z = false;
                }
                this.d.o(Boolean.valueOf(z));
            }
        }
    }
}

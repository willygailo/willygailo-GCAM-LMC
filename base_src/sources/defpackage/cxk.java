package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cxk extends cxf {
    public final aii a;
    public final aia b;
    public final aia c;
    public final aiy d;
    private final aiy e;

    public cxk(aii aiiVar) {
        this.a = aiiVar;
        this.b = new cxg(aiiVar);
        this.c = new cxh(aiiVar);
        this.d = new cxi(aiiVar);
        this.e = new cxj(aiiVar);
    }

    @Override // defpackage.cxf
    public final void a() {
        this.a.g();
        ake akeVarE = this.e.e();
        this.a.h();
        try {
            akeVarE.a();
            this.a.j();
        } finally {
            this.a.i();
            this.e.f(akeVarE);
        }
    }
}

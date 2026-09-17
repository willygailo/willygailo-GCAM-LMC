package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cxr extends cxm {
    public final aii a;
    public final aia b;
    public final aiy c;
    public final aiy d;
    private final ahz e;

    public cxr(aii aiiVar) {
        this.a = aiiVar;
        this.b = new cxn(aiiVar);
        this.e = new cxo(aiiVar);
        this.c = new cxp(aiiVar);
        this.d = new cxq(aiiVar);
    }

    @Override // defpackage.cxm
    public final void a(cxl cxlVar) {
        this.a.g();
        this.a.h();
        try {
            this.e.a(cxlVar);
            this.a.j();
        } finally {
            this.a.i();
        }
    }
}

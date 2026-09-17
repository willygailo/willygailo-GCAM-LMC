package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bpq implements lij {
    final /* synthetic */ ddf a;
    final /* synthetic */ gfy b;
    final /* synthetic */ bpr c;
    final /* synthetic */ imy d;
    private boolean e = true;

    public bpq(bpr bprVar, ddf ddfVar, gfy gfyVar, imy imyVar, byte[] bArr) {
        this.c = bprVar;
        this.a = ddfVar;
        this.b = gfyVar;
        this.d = imyVar;
    }

    @Override // defpackage.lij
    public final /* bridge */ /* synthetic */ void fB(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.e) {
            this.e = false;
            return;
        }
        if (this.a.k(ddl.br)) {
            if (bool.booleanValue() || ((Boolean) ((lce) this.b.a).d).booleanValue()) {
                return;
            }
            this.c.close();
            return;
        }
        if (bool.booleanValue() || ((Boolean) ((lce) this.d.a).d).booleanValue() || ((Boolean) ((lce) this.b.a).d).booleanValue()) {
            return;
        }
        this.c.close();
    }
}

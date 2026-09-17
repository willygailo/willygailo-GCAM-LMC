package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bpr implements lie, bpn {
    public final lda a;
    private final lie b;
    private boolean c;

    public bpr(dmh dmhVar, gfy gfyVar, imy imyVar, huq huqVar, ddf ddfVar, byte[] bArr) {
        lce lceVar = new lce(bpo.INITIAL);
        this.a = lceVar;
        if (ddfVar.k(ddl.br) && ((Boolean) ((lce) dmhVar.c()).d).booleanValue()) {
            lceVar.fB(bpo.AE_LOCKED);
        }
        dmhVar.q(new bpp(this, ddfVar));
        this.b = huqVar.b.a(new bpq(this, ddfVar, gfyVar, imyVar, null), pgr.INSTANCE);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
    }
}

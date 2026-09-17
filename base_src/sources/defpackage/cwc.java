package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cwc {
    public final lar a;
    public final cwm b;
    public final lis c;
    public final cwf d;
    public final jtx e;
    private final cxz f;

    public cwc(lar larVar, cxz cxzVar, cwm cwmVar, jtx jtxVar, lis lisVar, cwf cwfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = larVar;
        this.f = cxzVar;
        this.b = cwmVar;
        this.e = jtxVar;
        this.d = cwfVar;
        this.c = lisVar.a("FallbackHandler");
    }

    public final void a(lwd lwdVar, int i, int i2) {
        pht phtVarA;
        int iM;
        int iL;
        if (i2 == 3) {
            phtVarA = this.f.b(lwdVar);
            iM = this.e.o();
            iL = this.e.n();
        } else {
            phtVarA = this.f.a(lwdVar);
            iM = this.e.m();
            iL = this.e.l();
        }
        plk.af(phtVarA, new cwb(this, lwdVar, i, i2, iM, iL), this.a);
    }
}

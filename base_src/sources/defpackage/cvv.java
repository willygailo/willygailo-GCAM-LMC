package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cvv implements lmo {
    public final cvo a;
    public final Runnable b;
    public final lwd c;
    private final ddf d;
    private final lar e;
    private final dlt f;
    private final dkm g;
    private final cxz h;
    private final lwf i;
    private final jtx j;

    public cvv(ddf ddfVar, jtx jtxVar, cvo cvoVar, lar larVar, lwf lwfVar, dlt dltVar, dkm dkmVar, cxz cxzVar, lwd lwdVar, Runnable runnable, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = ddfVar;
        this.j = jtxVar;
        this.a = cvoVar;
        this.e = larVar;
        this.i = lwfVar;
        this.f = dltVar;
        this.g = dkmVar;
        this.h = cxzVar;
        this.b = runnable;
        this.c = lwdVar;
    }

    @Override // defpackage.lmo
    public final void a(lju ljuVar, long j) {
        if (lju.e(ljuVar)) {
            if (j < this.j.p() && this.j.s()) {
                this.h.h(this.c);
                this.e.execute(new Runnable() { // from class: cvu
                    @Override // java.lang.Runnable
                    public final void run() {
                        cvv cvvVar = this.a;
                        cvvVar.a.f(cvvVar.c);
                        cvvVar.a.h(cvvVar.b);
                    }
                });
            } else {
                lvs lvsVarB = this.g.b(this.i, this.d, this.c);
                lvsVarB.getClass();
                this.f.f(new dlu(lvsVarB, ljuVar, j));
            }
        }
    }

    @Override // defpackage.lmo
    public final void b() {
        this.h.g(this.c);
    }
}

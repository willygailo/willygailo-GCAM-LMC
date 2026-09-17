package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class clu implements lmo {
    final /* synthetic */ pih a;
    final /* synthetic */ clx b;

    public clu(clx clxVar, pih pihVar) {
        this.b = clxVar;
        this.a = pihVar;
    }

    @Override // defpackage.lmo
    public final void a(lju ljuVar, long j) {
        synchronized (this.b.c) {
            pih pihVar = this.a;
            ckd ckdVar = this.b.g;
            ckdVar.getClass();
            pihVar.a(new dlu(ckdVar.a, ljuVar, j));
        }
    }

    @Override // defpackage.lmo
    public final void b() {
        lwd lwdVarK;
        clx clxVar = this.b;
        cxz cxzVar = clxVar.k;
        synchronized (clxVar.c) {
            lvq lvqVar = clxVar.l.a;
            ckd ckdVar = clxVar.g;
            ckdVar.getClass();
            lwdVarK = lvqVar.a(ckdVar.a).k();
        }
        cxzVar.g(lwdVarK);
    }
}

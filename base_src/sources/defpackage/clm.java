package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class clm implements lmo {
    final /* synthetic */ pih a;
    final /* synthetic */ clp b;

    public clm(clp clpVar, pih pihVar) {
        this.b = clpVar;
        this.a = pihVar;
    }

    @Override // defpackage.lmo
    public final void a(lju ljuVar, long j) {
        synchronized (this.b.c) {
            pih pihVar = this.a;
            ckd ckdVar = this.b.i;
            ckdVar.getClass();
            pihVar.a(new dlu(ckdVar.a, ljuVar, j));
        }
    }

    @Override // defpackage.lmo
    public final void b() {
        lwd lwdVarK;
        clp clpVar = this.b;
        cxz cxzVar = clpVar.g;
        synchronized (clpVar.c) {
            lvq lvqVar = clpVar.m.a;
            ckd ckdVar = clpVar.i;
            ckdVar.getClass();
            lwdVarK = lvqVar.a(ckdVar.a).k();
        }
        cxzVar.g(lwdVarK);
    }
}

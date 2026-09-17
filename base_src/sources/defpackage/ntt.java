package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ntt implements qco {
    final /* synthetic */ nty a;
    final /* synthetic */ nrl b;

    public ntt(nty ntyVar, nrl nrlVar) {
        this.a = ntyVar;
        this.b = nrlVar;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        nqi nqiVar = (nqi) obj;
        nqiVar.getClass();
        nty ntyVar = this.a;
        nrl nrlVar = this.b;
        if (!nqiVar.a.l) {
            return qbu.k(nqiVar);
        }
        qhg qhgVar = new qhg(ntyVar.g.a(nrlVar, qmd.q(nqiVar)).l(noi.a), new ntm(ntyVar, nrlVar));
        qco qcoVar = qmd.m;
        return qhgVar;
    }
}

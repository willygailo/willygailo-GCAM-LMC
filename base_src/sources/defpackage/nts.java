package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nts implements qco {
    final /* synthetic */ nty a;
    private final /* synthetic */ int b;

    public nts(nty ntyVar, int i) {
        this.b = i;
        this.a = ntyVar;
    }

    @Override // defpackage.qco
    public final /* synthetic */ Object a(Object obj) {
        switch (this.b) {
            case 0:
                nuj nujVar = (nuj) obj;
                nujVar.getClass();
                return this.a.b.b(nujVar.a, nujVar.b, nujVar.c, ntz.c).l(new ntp(nujVar, 1));
            case 1:
                nuj nujVar2 = (nuj) obj;
                nujVar2.getClass();
                nty ntyVar = this.a;
                qeq qeqVar = new qeq(qbh.i(nujVar2.d.size()), new ntq(nujVar2));
                qco qcoVar = qmd.i;
                return qeqVar.d(qbh.c(nujVar2), new ntv(ntyVar, 1)).a(noi.f).e(nujVar2);
            default:
                nuj nujVar3 = (nuj) obj;
                nujVar3.getClass();
                nty ntyVar2 = this.a;
                String str = nujVar3.b.n;
                qbu qbuVarK = str == null ? null : qbu.k(str);
                if (qbuVarK == null) {
                    nre nreVar = ntyVar2.d;
                    qfh qfhVar = new qfh(new nqy(new nrd(nreVar), nreVar, new ntn(nujVar3)));
                    qco qcoVar2 = qmd.l;
                    qff qffVar = new qff(qfhVar, noi.e);
                    qco qcoVar3 = qmd.l;
                    qfl qflVar = new qfl(qffVar, nnk.a.a);
                    qco qcoVar4 = qmd.m;
                    qbuVarK = qflVar;
                }
                return qbuVarK.l(new ntw(ntyVar2, nujVar3)).g(new ntx(ntyVar2, nujVar3)).h().d(qbh.c(nujVar3), new ntv(ntyVar2, 0)).a(noi.h).e(nujVar3);
        }
    }
}

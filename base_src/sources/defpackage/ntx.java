package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class ntx implements qco {
    final /* synthetic */ nty a;
    final /* synthetic */ nuj b;

    public ntx(nty ntyVar, nuj nujVar) {
        this.a = ntyVar;
        this.b = nujVar;
    }

    @Override // defpackage.qco
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        ptm ptmVar = (ptm) obj;
        ptmVar.getClass();
        ohh ohhVar = this.a.i;
        poc pocVarD = ptmVar.d();
        String str = this.b.b.o;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        qbt qbtVar = qka.b;
        qco qcoVar = qmd.g;
        qmd.W(timeUnit, "unit is null");
        qmd.W(qbtVar, "scheduler is null");
        qhu qhuVar = new qhu(timeUnit, qbtVar);
        qco qcoVar2 = qmd.m;
        return qhuVar.g(new nue(ohhVar, pocVarD, str, null, null));
    }
}

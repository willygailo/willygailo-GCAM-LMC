package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class quh extends qud {
    public final qtr b;
    public final int c;

    public quh(qtr qtrVar, int i, qln qlnVar) {
        super(qlnVar);
        this.b = qtrVar;
        this.c = i;
    }

    @Override // defpackage.qud
    protected final String b() {
        return qno.a("concurrency=", Integer.valueOf(this.c));
    }

    @Override // defpackage.qud
    public final qtg c(qqj qqjVar) {
        qqjVar.getClass();
        qln qlnVar = this.a;
        qmy qucVar = new quc(this, null);
        quk qukVar = new quk(qqd.b(qqjVar, qlnVar), qnt.l(-2, 0, 6));
        qukVar.i(3, qukVar, qucVar);
        return qukVar;
    }
}

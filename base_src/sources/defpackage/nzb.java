package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class nzb extends nze {
    final /* synthetic */ nzf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzb(nzf nzfVar) {
        super(nzfVar);
        this.a = nzfVar;
    }

    @Override // defpackage.nze
    protected final float a() {
        nzf nzfVar = this.a;
        return nzfVar.n + nzfVar.o;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class grr extends mip {
    public final fjs a;
    private final lar b;

    public grr(fjs fjsVar, lar larVar) {
        this.a = fjsVar;
        this.b = larVar;
    }

    @Override // defpackage.mip
    public final void fw(lux luxVar) {
        if (luxVar == null || luxVar.a() == 0) {
            this.b.execute(new grq(this));
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bmt {
    public final bnl a;
    public final ddf b;
    public final iud c;
    private final lar d;

    public bmt(lar larVar, bnl bnlVar, ddf ddfVar, iud iudVar) {
        this.d = larVar;
        this.a = bnlVar;
        this.b = ddfVar;
        this.c = iudVar;
    }

    public final lie a(lco lcoVar) {
        this.d.execute(new bms(this, 1));
        return lcoVar.a(new lij() { // from class: bmr
            @Override // defpackage.lij
            public final void fB(Object obj) {
                this.a.a.fB((ggp) obj);
            }
        }, this.d);
    }

    public final void b() {
        this.d.execute(new bms(this, 0));
    }
}

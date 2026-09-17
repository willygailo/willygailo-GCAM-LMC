package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dlb implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public dlb(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dld get() {
        pyr.a(this.a);
        dlc dlcVar = new dlc();
        ddf ddfVar = (ddf) this.b.get();
        bqg bqgVar = ((etg) this.c).get();
        if (ddfVar.k(ddl.aK)) {
            ddfVar.b();
            ddfVar.b();
        }
        bqgVar.i().c(dlcVar);
        return dlcVar;
    }
}

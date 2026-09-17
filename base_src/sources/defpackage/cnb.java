package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cnb implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public cnb(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cna get() {
        return new cna(((cpk) this.a).get(), (lef) this.b.get(), ((lev) this.c).get(), ((let) this.d).get(), null);
    }
}

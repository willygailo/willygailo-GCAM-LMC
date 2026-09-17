package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ese implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public ese(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final esd get() {
        return new esd(pyr.a(this.a), (hcg) this.b.get(), (pko) this.c.get(), ((pks) this.d).get(), (ljf) this.e.get());
    }
}

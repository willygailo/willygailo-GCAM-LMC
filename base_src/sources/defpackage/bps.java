package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bps implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public bps(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpr get() {
        return new bpr((dmh) this.a.get(), (gfy) this.b.get(), (imy) this.c.get(), (huq) this.d.get(), (ddf) this.e.get(), null);
    }
}

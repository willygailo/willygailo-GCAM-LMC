package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ghk implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;

    public ghk(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ghj get() {
        return new ghj((lld) this.a.get(), ((fwj) this.b).get(), (lwf) this.c.get(), (jng) this.d.get(), (ddf) this.e.get(), (dkm) this.f.get());
    }
}

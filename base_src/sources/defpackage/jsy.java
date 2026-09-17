package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jsy implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;
    private final qkg h;

    public jsy(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7, qkg qkgVar8) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
        this.h = qkgVar8;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jsx get() {
        return new jsx(this.a, this.b, (huf) this.c.get(), (hug) this.d.get(), ((jtn) this.e).get(), (lar) this.f.get(), ((etf) this.g).get(), (fjs) this.h.get());
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class chb implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;
    private final qkg g;

    public chb(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6, qkg qkgVar7) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
        this.g = qkgVar7;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cha get() {
        return new cha(((cva) this.a).get(), (chu) this.b.get(), (chj) this.c.get(), (chj) this.d.get(), (nvb) this.e.get(), ((lhr) this.f).get(), (ddf) this.g.get(), null, null, null);
    }
}

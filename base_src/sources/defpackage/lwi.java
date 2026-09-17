package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lwi implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public lwi(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lwh get() {
        return new lwh(((lhq) this.a).get(), (lvw) this.b.get(), (ljf) this.c.get(), ((liq) this.d).get());
    }
}

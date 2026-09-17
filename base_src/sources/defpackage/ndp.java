package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ndp implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public ndp(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ndo get() {
        return new ndo(((emp) this.a).a(), (ojc) ((pyt) this.b).a, (ojc) ((pyt) this.c).a, (ojc) ((pyt) this.d).a, (ojc) ((pyt) this.e).a);
    }
}

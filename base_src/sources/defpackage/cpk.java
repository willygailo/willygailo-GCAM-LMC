package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cpk implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public cpk(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static cpk b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new cpk(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cpj get() {
        return new cpj((huf) this.a.get(), (nvb) this.b.get(), (ddf) this.c.get(), null, null);
    }
}

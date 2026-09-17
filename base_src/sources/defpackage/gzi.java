package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gzi implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public gzi(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public static gzi b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gzi(qkgVar, qkgVar2, qkgVar3, qkgVar4);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gzh get() {
        return new gzh((lnc) this.a.get(), (lnx) this.b.get(), (lqd) this.c.get(), (gmu) this.d.get());
    }
}

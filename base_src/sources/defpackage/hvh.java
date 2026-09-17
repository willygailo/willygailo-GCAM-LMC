package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvh implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public hvh(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static hvh b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new hvh(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hvg get() {
        return new hvg((hub) this.a.get(), (lwf) this.b.get(), (ddf) this.c.get());
    }
}

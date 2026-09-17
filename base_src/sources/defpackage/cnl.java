package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cnl implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public cnl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cnk get() {
        return new cnk(((cnn) this.a).get(), ((emt) this.b).get(), (lda) this.c.get(), (lda) this.d.get(), (ddf) this.e.get());
    }
}

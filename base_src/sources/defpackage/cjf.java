package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cjf implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public cjf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cje get() {
        return new cje((cvo) this.a.get(), (ddf) this.b.get(), (lda) this.c.get(), (lda) this.d.get());
    }
}

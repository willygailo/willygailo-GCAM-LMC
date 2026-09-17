package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ilh implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;

    public ilh(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ilg get() {
        return new ilg((lda) this.a.get(), (lda) this.b.get(), (lda) this.c.get(), (hur) this.d.get(), (huq) this.e.get(), (huf) this.f.get());
    }
}

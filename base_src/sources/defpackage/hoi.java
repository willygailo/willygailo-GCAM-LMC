package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hoi implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public hoi(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hoh get() {
        lda ldaVar = (lda) this.a.get();
        ddf ddfVar = (ddf) this.b.get();
        ((hog) this.c).get();
        return new hoh(ldaVar, ddfVar);
    }
}

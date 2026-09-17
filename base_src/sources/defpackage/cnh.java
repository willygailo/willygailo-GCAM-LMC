package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cnh implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public cnh(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cng get() {
        return new cng(((eme) this.a).get(), ((emt) this.b).get(), (lda) this.c.get(), (lda) this.d.get(), (lda) this.e.get());
    }
}

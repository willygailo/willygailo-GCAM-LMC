package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lhr implements pys {
    private final qkg a;
    private final qkg b;

    public lhr(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lvq get() {
        ojc ojcVar = (ojc) ((pyt) this.a).a;
        lvq lvqVar = (lvq) this.b.get();
        lvqVar.getClass();
        return ojcVar.g() ? (lvq) ojcVar.c() : lvqVar;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lkl implements pys {
    private final qkg a;
    private final qkg b;

    public lkl(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mbg get() {
        ojc ojcVar = (ojc) ((pyt) this.a).a;
        return ojcVar.g() ? (mbg) ojcVar.c() : ((lkk) this.b).get();
    }
}

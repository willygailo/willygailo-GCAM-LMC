package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nsw implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public nsw(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nsv get() {
        return new nsv((noq) this.a.get(), ((nss) this.b).get(), (nrk) this.c.get());
    }
}

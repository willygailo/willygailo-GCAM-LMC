package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ncf implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public ncf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nce get() {
        return new nce(((emp) this.a).a(), (mdf) this.b.get(), this.c);
    }
}

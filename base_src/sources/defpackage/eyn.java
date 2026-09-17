package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eyn implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public eyn(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eym get() {
        return new eym((huf) this.a.get(), ((jnw) this.b).get(), (lar) this.c.get());
    }
}

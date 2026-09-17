package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cgz implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public cgz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cgy get() {
        return new cgy((fjs) this.a.get(), (lco) this.b.get(), (cib) this.c.get());
    }
}

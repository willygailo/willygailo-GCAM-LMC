package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mwl implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public mwl(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mwk get() {
        return new mwk((String) this.a.get(), ((mxd) this.b).get(), (mdf) this.c.get(), this.d);
    }
}

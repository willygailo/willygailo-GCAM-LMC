package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class epa implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public epa(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eoz get() {
        return new eoz((hsh) this.a.get(), (ddf) this.b.get(), (dxp) this.c.get());
    }
}

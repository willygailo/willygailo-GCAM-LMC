package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dxg implements pys {
    private final qkg a;
    private final qkg b;

    public dxg(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dxf get() {
        return new dxf(((dey) this.a).get(), ((dew) this.b).get());
    }
}

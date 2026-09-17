package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bzk implements pys {
    private final qkg a;
    private final qkg b;

    public bzk(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final caa get() {
        return new caa(((emd) this.a).get(), ((jnw) this.b).get().k);
    }
}

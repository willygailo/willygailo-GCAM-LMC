package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class djt implements pys {
    private final qkg a;
    private final qkg b;

    public djt(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final djs get() {
        return new djs(((emp) this.a).a(), (lar) this.b.get());
    }
}

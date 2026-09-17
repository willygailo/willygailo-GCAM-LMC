package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ncc implements pys {
    private final qkg a;
    private final qkg b;

    public ncc(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ncb get() {
        return new ncb(((emp) this.a).a(), this.b);
    }
}

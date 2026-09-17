package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lpl implements pys {
    private final qkg a;
    private final qkg b;

    public lpl(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lvp get() {
        return ((lhr) this.a).get().a(((lpn) this.b).get().a);
    }
}

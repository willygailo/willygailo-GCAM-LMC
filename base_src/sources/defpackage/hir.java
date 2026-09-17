package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hir implements pys {
    private final qkg a;

    public hir(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static hir a(qkg qkgVar) {
        return new hir(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hiq get() {
        return new hiq((ljf) this.a.get());
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fub implements pys {
    private final qkg a;

    public fub(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static fub b(qkg qkgVar) {
        return new fub(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fua get() {
        return new fua((dyx) this.a.get());
    }
}

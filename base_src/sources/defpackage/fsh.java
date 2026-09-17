package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fsh implements pys {
    private final qkg a;

    public fsh(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static fsh b(qkg qkgVar) {
        return new fsh(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fsg get() {
        return new fsg(((djc) this.a).get(), null);
    }
}

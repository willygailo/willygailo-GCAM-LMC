package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fpd implements pys {
    private final qkg a;

    public fpd(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static fpd b(qkg qkgVar) {
        return new fpd(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fpc get() {
        return new fpc(((ftj) this.a).get());
    }
}

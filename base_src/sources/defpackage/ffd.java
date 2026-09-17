package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ffd implements pys {
    private final qkg a;
    private final qkg b;

    public ffd(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ffc get() {
        return new ffc(((ffb) this.a).get(), (fjs) this.b.get(), null);
    }
}

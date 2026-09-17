package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fkv implements pys {
    private final qkg a;
    private final qkg b;

    public fkv(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fku get() {
        return new fku((btt) this.a.get(), (ddf) this.b.get());
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bte implements pys {
    private final qkg a;
    private final qkg b;

    public bte(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btd get() {
        return new btd(((emp) this.a).a(), (lda) this.b.get());
    }
}

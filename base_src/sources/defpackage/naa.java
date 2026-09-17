package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class naa implements pys {
    private final qkg a;
    private final qkg b;

    public naa(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mzz get() {
        return new mzz(this.a, ((emp) this.b).a());
    }
}

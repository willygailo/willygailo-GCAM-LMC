package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nss implements pys {
    private final qkg a;
    private final qkg b;

    public nss(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nsr get() {
        return new nsr((nrm) this.a.get(), (nov) this.b.get());
    }
}

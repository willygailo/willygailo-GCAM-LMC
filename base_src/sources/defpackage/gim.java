package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gim implements pys {
    private final qkg a;
    private final qkg b;

    public gim(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static gim b(qkg qkgVar, qkg qkgVar2) {
        return new gim(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gil get() {
        return new gil(((gra) this.a).a(), (lce) this.b.get());
    }
}

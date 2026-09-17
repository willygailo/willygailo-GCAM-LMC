package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hvp implements pys {
    private final qkg a;
    private final qkg b;

    public hvp(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static hvp b(qkg qkgVar, qkg qkgVar2) {
        return new hvp(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hvo get() {
        return new hvo(((emn) this.a).get(), (hug) this.b.get());
    }
}

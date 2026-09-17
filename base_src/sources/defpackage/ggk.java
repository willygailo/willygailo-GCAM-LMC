package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ggk implements pys {
    private final qkg a;
    private final qkg b;

    public ggk(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static ggk b(qkg qkgVar, qkg qkgVar2) {
        return new ggk(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ggj get() {
        return new ggj((lce) this.a.get(), (lco) this.b.get());
    }
}

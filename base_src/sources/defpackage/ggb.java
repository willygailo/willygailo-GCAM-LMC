package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ggb implements pys {
    private final qkg a;
    private final qkg b;

    public ggb(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static ggb b(qkg qkgVar, qkg qkgVar2) {
        return new ggb(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gga get() {
        return new gga((lce) this.a.get(), (lco) this.b.get());
    }
}

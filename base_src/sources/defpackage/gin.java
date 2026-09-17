package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gin implements pys {
    private final qkg a;
    private final qkg b;

    public gin(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static gin a(qkg qkgVar, qkg qkgVar2) {
        return new gin(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jdy get() {
        return new jdy(((gra) this.a).a(), ((giv) this.b).get());
    }
}

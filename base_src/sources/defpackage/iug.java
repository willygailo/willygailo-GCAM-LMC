package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iug implements pys {
    private final qkg a;

    public iug(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static iug b(qkg qkgVar) {
        return new iug(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final iuf get() {
        return new iuf(((ems) this.a).get());
    }
}

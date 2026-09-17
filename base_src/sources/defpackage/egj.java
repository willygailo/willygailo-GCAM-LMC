package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class egj implements pys {
    private final qkg a;

    public egj(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static egj b(qkg qkgVar) {
        return new egj(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final egi get() {
        return new egi(((gix) this.a).get());
    }
}

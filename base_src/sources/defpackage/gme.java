package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gme implements pys {
    private final qkg a;

    public gme(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static gme a(qkg qkgVar) {
        return new gme(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kme get() {
        return ((gma) this.a).get();
    }
}

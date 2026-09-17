package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gha implements pys {
    private final qkg a;

    public gha(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static gha b(qkg qkgVar) {
        return new gha(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ggz get() {
        return new ggz((nle) this.a.get(), null, null);
    }
}

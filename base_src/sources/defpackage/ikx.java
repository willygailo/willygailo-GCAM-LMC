package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ikx implements pys {
    private final qkg a;

    public ikx(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ikp get() {
        ikp ikpVar = (ikp) this.a.get();
        qmd.ae(ikpVar);
        return ikpVar;
    }
}

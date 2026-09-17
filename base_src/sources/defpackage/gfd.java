package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gfd implements pys {
    private final qkg a;
    private final qkg b;

    public gfd(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static gfd b(qkg qkgVar, qkg qkgVar2) {
        return new gfd(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gfh get() {
        gfh gfhVarA = ((djc) this.b).get().d() ? (gfh) ((qkg) ((ojj) ((evv) this.a).a()).a).get() : gfp.a();
        qmd.ae(gfhVarA);
        return gfhVarA;
    }
}

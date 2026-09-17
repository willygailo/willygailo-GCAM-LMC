package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bom implements pys {
    private final qkg a;
    private final qkg b;

    public bom(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bol get() {
        return new bol(this.a, this.b);
    }
}

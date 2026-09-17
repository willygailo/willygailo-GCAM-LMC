package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cul implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public cul(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cuk get() {
        return new cuk(((emd) this.a).get(), (ius) this.b.get(), (ddf) this.c.get());
    }
}

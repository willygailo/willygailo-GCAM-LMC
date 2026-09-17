package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cjq implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public cjq(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cjp get() {
        lef lefVar = (lef) this.a.get();
        return new cjp(lefVar, (lwf) this.c.get());
    }
}

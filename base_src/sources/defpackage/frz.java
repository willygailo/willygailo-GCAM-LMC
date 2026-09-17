package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class frz implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public frz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static frz b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new frz(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fry get() {
        return new fry((lzb) this.a.get(), ((gjp) this.b).get(), ((hoi) this.c).get());
    }
}

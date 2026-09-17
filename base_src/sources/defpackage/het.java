package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class het implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public het(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public static het b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new het(qkgVar, qkgVar2, qkgVar3, qkgVar4);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hes get() {
        return new hes(((her) this.a).get(), (ebe) this.b.get(), (ddf) this.c.get(), (lap) this.d.get(), null, null);
    }
}

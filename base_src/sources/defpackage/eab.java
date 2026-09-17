package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eab implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;

    public eab(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
    }

    public static eab b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5) {
        return new eab(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eaa get() {
        return new eaa((lap) this.a.get(), (ebe) this.b.get(), ((giy) this.c).get(), (lda) this.d.get(), ((liq) this.e).get());
    }
}

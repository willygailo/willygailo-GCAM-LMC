package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ech implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;

    public ech(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    public static ech b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        return new ech(qkgVar, qkgVar2, qkgVar3, qkgVar4, qkgVar5, qkgVar6);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ecg get() {
        return new ecg((ddf) this.a.get(), (jtx) this.b.get(), (gkw) this.c.get(), (dxp) this.d.get(), ((liq) this.e).get(), (ljf) this.f.get());
    }
}

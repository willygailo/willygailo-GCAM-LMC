package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gkz implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public gkz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public static gkz b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new gkz(qkgVar, qkgVar2, qkgVar3, qkgVar4);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gky get() {
        return new gky(((brh) this.a).get(), (hia) this.b.get(), ((gsi) this.c).get(), ((gme) this.d).get(), null, null);
    }
}

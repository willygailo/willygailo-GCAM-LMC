package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class brh implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public brh(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public static brh b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new brh(qkgVar, qkgVar2, qkgVar3, qkgVar4);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brg get() {
        lzb lzbVar = (lzb) this.a.get();
        lvp lvpVar = (lvp) this.c.get();
        return new brg(lzbVar, (ddf) this.d.get(), lvpVar.f(), lvpVar.k() == lwd.FRONT);
    }
}

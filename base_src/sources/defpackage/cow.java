package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cow implements pys {
    private final cou a;
    private final qkg b;
    private final qkg c;

    public cow(cou couVar, qkg qkgVar, qkg qkgVar2) {
        this.a = couVar;
        this.b = qkgVar;
        this.c = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lvp get() {
        cou couVar = this.a;
        lwf lwfVar = (lwf) this.b.get();
        lvs lvsVarB = couVar.a.b(lwfVar, (ddf) this.c.get(), lwd.BACK);
        lvsVarB.getClass();
        return lwfVar.f(lvsVarB);
    }
}

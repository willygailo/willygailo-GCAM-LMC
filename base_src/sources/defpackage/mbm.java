package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mbm implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public mbm(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mbl get() {
        mbj mbjVar = ((ikv) this.a).get();
        mxm mxmVar = ((mav) this.b).get();
        mbg mbgVar = ((mbh) this.c).get();
        return new mbl(mbjVar, mxmVar, mbgVar, null);
    }
}

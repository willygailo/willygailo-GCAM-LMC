package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lvr implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public lvr(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lvx get() {
        return !((Boolean) ((evv) this.a).a().e(false)).booleanValue() ? ((lwi) this.b).get() : ((lwb) this.c).get();
    }
}

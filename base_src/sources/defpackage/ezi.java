package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ezi implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public ezi(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ghu get() {
        ghr ghrVar = (ghr) this.a.get();
        qkg qkgVar = this.b;
        return ghrVar.a(((fbg) qkgVar).get(), ((ewk) this.c).b(), new nez(false), jrl.MOTION_BLUR);
    }
}

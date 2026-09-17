package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class egf implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;
    private final qkg e;
    private final qkg f;

    public egf(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4, qkg qkgVar5, qkg qkgVar6) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
        this.e = qkgVar5;
        this.f = qkgVar6;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ege get() {
        return new ege(((hlj) this.a).a(), ((gjo) this.b).get(), ((efz) this.c).get(), (ddf) this.d.get(), ((Boolean) this.e.get()).booleanValue(), ((edv) this.f).get());
    }
}

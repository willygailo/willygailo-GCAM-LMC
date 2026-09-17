package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bnz implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;
    private final qkg d;

    public bnz(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
        this.d = qkgVar4;
    }

    public static bnz b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, qkg qkgVar4) {
        return new bnz(qkgVar, qkgVar2, qkgVar3, qkgVar4);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bny get() {
        return new bny((gsn) this.a.get(), gfp.f(), ((gjo) this.b).get(), (lzh) this.c.get(), (ddf) this.d.get(), null, null, null, null);
    }
}

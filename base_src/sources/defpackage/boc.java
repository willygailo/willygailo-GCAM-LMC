package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class boc implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public boc(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static boc b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new boc(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bob get() {
        return new bob((ggo) this.a.get(), ((gha) this.b).get(), bpw.c(), ((bpk) this.c).a().booleanValue(), null);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bog implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public bog(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static bog b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new bog(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bof get() {
        return new bof((ggo) this.a.get(), ((gha) this.b).get(), bpw.c(), ((bpk) this.c).a().booleanValue(), null);
    }
}

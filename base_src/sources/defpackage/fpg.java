package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fpg implements pys {
    private final qkg a;
    private final qkg b;

    public fpg(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static fpg b(qkg qkgVar, qkg qkgVar2) {
        return new fpg(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fpf get() {
        return new fpf((fpo) this.a.get(), (fou) this.b.get());
    }
}

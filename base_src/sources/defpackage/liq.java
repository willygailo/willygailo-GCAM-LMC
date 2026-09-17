package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class liq implements pys {
    private final qkg a;

    public liq(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static lis b(ojc ojcVar) {
        return (lis) ((ojj) ojcVar).a;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final lis get() {
        return b(((evv) this.a).a());
    }
}

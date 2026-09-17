package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ncr extends ncu {
    private final boolean a;

    public ncr(qyj qyjVar, boolean z) {
        super(qyjVar);
        this.a = z;
    }

    private final qyj f(Long l) {
        return this.a ? e(l) : d();
    }

    @Override // defpackage.ncu
    public final long a(String str) {
        qyj qyjVarF = f(null);
        if (qyjVarF.equals(qyj.d)) {
            return 1000L;
        }
        return qyjVarF.b;
    }

    @Override // defpackage.ncu
    public final qyj b(Long l) {
        return f(l);
    }

    @Override // defpackage.ncu
    public final boolean c() {
        return this.a;
    }
}

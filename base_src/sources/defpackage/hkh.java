package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hkh implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public hkh(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hkg get() {
        return new hkg(((bpk) this.a).a().booleanValue(), ((bpk) this.b).a().booleanValue(), ((bpk) this.c).a().booleanValue());
    }
}

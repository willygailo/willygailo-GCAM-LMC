package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cnv implements pys {
    private final qkg a;
    private final qkg b;

    public cnv(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cnu get() {
        return new cnu((ctd) this.a.get(), (cib) this.b.get());
    }
}

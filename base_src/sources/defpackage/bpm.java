package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bpm implements pys {
    private final qkg a;
    private final qkg b;

    public bpm(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpl get() {
        return new bpl((dmh) this.a.get(), this.b);
    }
}

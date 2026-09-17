package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fwj implements pys {
    private final qkg a;
    private final qkg b;

    public fwj(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fwi get() {
        return new fwi(((fwa) this.a).get(), ((dgb) this.b).get());
    }
}

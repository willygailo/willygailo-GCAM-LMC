package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lhq implements pys {
    private final qkg a;

    public lhq(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vm get() {
        vh vhVar = (vh) this.a.get();
        vhVar.getClass();
        vm vmVar = (vm) vhVar.a.f.get();
        qmd.ae(vmVar);
        return vmVar;
    }
}

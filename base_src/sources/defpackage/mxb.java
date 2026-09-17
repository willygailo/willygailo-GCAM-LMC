package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mxb implements pys {
    private final qkg a;

    public mxb(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mxa get() {
        return new mxa(((ncc) this.a).get());
    }
}

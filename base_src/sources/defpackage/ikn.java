package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ikn implements pys {
    private final qkg a;
    private final qkg b;

    public ikn(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ikm get() {
        return new ikm(((emd) this.a).get(), (ddf) this.b.get());
    }
}

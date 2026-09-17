package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ftf implements pys {
    private final qkg a;
    private final qkg b;

    public ftf(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String get() {
        huf hufVar = (huf) this.a.get();
        ddf ddfVar = (ddf) this.b.get();
        ((Boolean) hufVar.c(htu.r)).booleanValue();
        ddi ddiVar = ddr.a;
        ddfVar.d();
        return "video/avc";
    }
}

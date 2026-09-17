package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gis implements pys {
    private final qkg a;

    public gis(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static gis a(qkg qkgVar) {
        return new gis(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jdy get() {
        return new jdy(((giv) this.a).get());
    }
}

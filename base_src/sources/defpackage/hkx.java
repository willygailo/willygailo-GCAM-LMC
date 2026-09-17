package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hkx implements pys {
    private final qkg a;

    public hkx(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static hkx a(qkg qkgVar) {
        return new hkx(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jry get() {
        return new jry(((evv) this.a).a(), null);
    }
}

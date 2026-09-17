package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class efx implements pys {
    private final qkg a;
    private final qkg b;

    public efx(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public static efx a(qkg qkgVar, qkg qkgVar2) {
        return new efx(qkgVar, qkgVar2);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long get() {
        return Long.valueOf(Math.max(1000000000L, ((((ddf) this.b.get()).k(ddm.W) ? efw.b : efw.a) * ((long) ((ead) this.a.get()).c)) + mip.ea(500)));
    }
}

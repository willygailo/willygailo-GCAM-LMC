package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class huh implements pys {
    private final qkg a;
    private final qkg b;

    public huh(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final htp get() {
        return new htp((hub) this.a.get(), ((dgb) this.b).get());
    }
}

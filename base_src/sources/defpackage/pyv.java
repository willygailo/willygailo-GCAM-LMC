package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pyv implements qkg {
    private final qkg a;

    private pyv(qkg qkgVar) {
        this.a = qkgVar;
    }

    public static qkg b(qkg qkgVar) {
        qkgVar.getClass();
        return new pyv(qkgVar);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pyn get() {
        return pyr.a(this.a);
    }
}

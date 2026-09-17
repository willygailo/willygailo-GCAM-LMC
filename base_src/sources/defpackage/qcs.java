package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum qcs implements qdg {
    INSTANCE,
    NEVER;

    public static void e(qbq qbqVar) {
        qbqVar.gR(INSTANCE);
        qbqVar.gQ();
    }

    public static void f(Throwable th, qbe qbeVar) {
        qbeVar.gR(INSTANCE);
        qbeVar.b(th);
    }

    public static void g(Throwable th, qbq qbqVar) {
        qbqVar.gR(INSTANCE);
        qbqVar.b(th);
    }

    public static void h(Throwable th, qbv qbvVar) {
        qbvVar.gR(INSTANCE);
        qbvVar.b(th);
    }

    @Override // defpackage.qdl
    public final void c() {
    }

    @Override // defpackage.qdl
    public final Object gS() {
        return null;
    }

    @Override // defpackage.qbz
    public final void gT() {
    }

    @Override // defpackage.qdl
    public final boolean gU(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return true;
    }

    @Override // defpackage.qdh
    public final int k() {
        return 2;
    }
}

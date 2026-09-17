package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum qjk implements qdi {
    INSTANCE;

    public static void a(qym qymVar) {
        qymVar.a(INSTANCE);
        qymVar.gO();
    }

    public static void d(Throwable th, qym qymVar) {
        qymVar.a(INSTANCE);
        qymVar.j(th);
    }

    @Override // defpackage.qdl
    public final void c() {
    }

    @Override // defpackage.qyn
    public final void g() {
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
        qjn.d(j);
    }

    @Override // defpackage.qdl
    public final Object gS() {
        return null;
    }

    @Override // defpackage.qdl
    public final boolean gU(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return true;
    }

    @Override // defpackage.qdh
    public final int k() {
        return 2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }
}

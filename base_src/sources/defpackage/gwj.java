package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gwj implements ggx {
    private static final ouj b = ouj.h("com/google/android/apps/camera/pixelcamerakit/aaa/PckLock3A");
    public final long a;
    private final lng c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private boolean g;

    public gwj(lng lngVar, long j, boolean z, boolean z2, boolean z3) {
        this.c = lngVar;
        this.a = j;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // defpackage.ggx
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ggx, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        try {
            lng lngVar = this.c;
            plk.af(((lqb) lngVar).a.d(this.d, this.e, this.f, false), new gxy(1), pgr.INSTANCE);
        } catch (llv e) {
            ((oug) ((oug) ((oug) b.b()).h(e)).G((char) 2158)).o("Error unlocking 3A.");
        }
    }
}

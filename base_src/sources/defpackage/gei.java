package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gei implements gdp {
    public static final ouj a = ouj.h("com/google/android/apps/camera/moments/SafeMomentsTrackEncoder");
    private final gdp b;
    private int c = 1;

    public gei(gdp gdpVar) {
        this.b = gdpVar;
    }

    @Override // defpackage.gdp
    public final synchronized gbp a(mln mlnVar, lic licVar) {
        try {
            int i = this.c;
            if (i > 0) {
                this.c = i + 1;
                return new geh(this, this.b.a(mlnVar, licVar));
            }
            ((oug) ((oug) a.c()).G(2064)).o("Attempting to launch already-closed MomentsTrackEncoder!");
            mlnVar.close();
            return new geg(0);
        } catch (RuntimeException e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 2065)).o("Cannot create MomentsTrackEncoder! Moments will be disabled!");
        }
    }

    @Override // defpackage.gdp
    public final synchronized void b() {
        try {
            if (this.c > 0) {
                this.b.b();
            }
        } catch (RuntimeException e) {
            ((oug) ((oug) ((oug) a.c()).h(e)).G((char) 2066)).o("Failed to prewarm MomentsTrackEncoder! Will instantiate during snapshot.");
        }
    }

    public final synchronized void c() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.close();
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        c();
    }
}

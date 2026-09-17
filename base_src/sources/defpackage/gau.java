package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gau implements gbp {
    private static final ouj a = ouj.h("com/google/android/apps/camera/moments/EncoderStartingImageSink");
    private final gdp b;
    private final mln c;
    private final lic d;
    private gbp e = null;
    private boolean f = false;

    public gau(gdp gdpVar, mln mlnVar, lic licVar) {
        this.b = gdpVar;
        this.c = mlnVar;
        this.d = licVar;
    }

    @Override // defpackage.gbp
    public final synchronized boolean a(mad madVar) {
        if (this.f) {
            madVar.d();
            madVar.close();
            return false;
        }
        if (this.e == null) {
            this.e = this.b.a(this.c, this.d);
        }
        gbp gbpVar = this.e;
        gbpVar.getClass();
        return gbpVar.a(madVar);
    }

    @Override // defpackage.gbp, defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f) {
            ((oug) ((oug) a.c()).G((char) 2052)).o("Closing sink more than once");
            return;
        }
        gbp gbpVar = this.e;
        if (gbpVar != null) {
            gbpVar.close();
        } else {
            this.c.close();
        }
        this.f = true;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class geh implements gbp {
    final /* synthetic */ gei a;
    private final gbp b;
    private boolean c = false;

    public geh(gei geiVar, gbp gbpVar) {
        this.a = geiVar;
        this.b = gbpVar;
    }

    @Override // defpackage.gbp
    public final synchronized boolean a(mad madVar) {
        try {
            try {
                if (this.c) {
                    ((oug) ((oug) gei.a.c()).G(2062)).o("Attempting to enqueue image on closed sink!");
                    madVar.close();
                    return false;
                }
                boolean zA = this.b.a(madVar);
                madVar.close();
                return zA;
            } catch (RuntimeException e) {
                ((oug) ((oug) ((oug) gei.a.b()).h(e)).G(2063)).o("Could not encode out image");
            }
        } catch (Throwable th) {
            madVar.close();
            throw th;
        }
    }

    @Override // defpackage.gbp, defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.c) {
            this.b.close();
            this.c = true;
            this.a.c();
        }
    }
}

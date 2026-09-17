package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gat implements gbp {
    private final gbp a;
    private mad b = null;
    private boolean c = false;

    public gat(gbp gbpVar) {
        this.a = gbpVar;
    }

    @Override // defpackage.gbp
    public final synchronized boolean a(mad madVar) {
        if (this.c) {
            return this.a.a(madVar);
        }
        lwk lwkVar = new lwk(madVar);
        mad madVar2 = this.b;
        if (madVar2 != null) {
            madVar2.close();
        }
        mad madVarK = lwkVar.k();
        madVarK.getClass();
        this.b = new ged(madVarK, lwkVar.d() + 100000);
        return this.a.a(lwkVar);
    }

    @Override // defpackage.gbp, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.c = true;
            mad madVar = this.b;
            if (madVar != null) {
                this.a.a(madVar);
                this.b = null;
            }
        }
        this.a.close();
    }
}

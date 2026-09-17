package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cpy implements cpt {
    private final cpt a;
    private int d = 2;
    private boolean b = false;
    private final Object c = new Object();

    public cpy(cpt cptVar) {
        this.a = cptVar;
    }

    @Override // defpackage.cpt
    public final pht a(hsq hsqVar) {
        synchronized (this.c) {
            int i = this.d;
            if (i == 1) {
                return plk.U(new IllegalStateException("has been closed."));
            }
            if (i == 3) {
                return plk.U(new IllegalStateException("there is already a snapshot request in flight."));
            }
            obr.aQ(i == 2);
            this.d = 3;
            pht phtVarA = this.a.a(hsqVar);
            phtVarA.d(new cpx(this, 1), pgr.INSTANCE);
            return phtVarA;
        }
    }

    @Override // defpackage.cpt
    public final pht b(lwd lwdVar, lic licVar) {
        synchronized (this.c) {
            int i = this.d;
            boolean z = true;
            if (i == 1) {
                return plk.U(new IllegalStateException("has been closed."));
            }
            if (i == 3) {
                return plk.U(new IllegalStateException("there is already a snapshot request in flight."));
            }
            if (i != 2) {
                z = false;
            }
            obr.aQ(z);
            this.d = 3;
            pht phtVarB = this.a.b(lwdVar, licVar);
            phtVarB.d(new cpx(this, 0), pgr.INSTANCE);
            return phtVarB;
        }
    }

    public final void c() {
        synchronized (this.c) {
            if (this.d != 2) {
                this.d = 2;
                if (this.b) {
                    close();
                }
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            int i = this.d;
            if (i != 1) {
                if (i == 3) {
                    this.b = true;
                    return;
                }
                this.a.close();
                this.d = 1;
                this.b = false;
            }
        }
    }
}

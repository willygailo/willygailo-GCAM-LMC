package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class clo extends mip {
    final /* synthetic */ pih a;
    final /* synthetic */ lmr b;
    final /* synthetic */ clp c;

    public clo(clp clpVar, pih pihVar, lmr lmrVar) {
        this.c = clpVar;
        this.a = pihVar;
        this.b = lmrVar;
    }

    @Override // defpackage.mip
    public final void fF() {
        synchronized (this.c.c) {
            try {
                lnx lnxVar = this.c.l;
                if (lnxVar == null) {
                    this.a.a(new IllegalStateException("Snapshot is not available"));
                } else {
                    mad madVarD = this.b.d(lnxVar);
                    if (madVarD == null) {
                        this.a.a(new IllegalStateException("Snapshot is null"));
                    } else if (!this.a.o(madVarD)) {
                        madVarD.close();
                    }
                }
                this.b.close();
            } catch (Throwable th) {
                this.b.close();
                throw th;
            }
        }
    }

    @Override // defpackage.mip
    public final void fx() {
        this.a.a(new IllegalStateException("Snapshot request is aborted"));
        this.b.close();
    }
}

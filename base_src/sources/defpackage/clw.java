package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class clw extends mip {
    final /* synthetic */ pih a;
    final /* synthetic */ lmr b;
    final /* synthetic */ clx c;

    public clw(clx clxVar, pih pihVar, lmr lmrVar) {
        this.c = clxVar;
        this.a = pihVar;
        this.b = lmrVar;
    }

    @Override // defpackage.mip
    public final void fF() {
        synchronized (this.c.c) {
            try {
                lnx lnxVar = this.c.j;
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

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nrb implements kvc {
    final /* synthetic */ nre a;
    final /* synthetic */ nrl b;
    final /* synthetic */ qdv c;

    public nrb(qdv qdvVar, nre nreVar, nrl nrlVar) {
        this.c = qdvVar;
        this.a = nreVar;
        this.b = nrlVar;
    }

    @Override // defpackage.kvc
    public final void a(kvk kvkVar) {
        qbz qbzVar;
        if (!kvkVar.e()) {
            Exception excB = kvkVar.b();
            if (excB == null) {
                excB = new IllegalStateException("Unknown F250Authenticator error");
            }
            this.a.b.a(this.b.c(17, excB, null, null));
            this.c.b(excB);
            return;
        }
        qdv qdvVar = this.c;
        if (qdvVar.get() == qcr.DISPOSED || (qbzVar = (qbz) qdvVar.getAndSet(qcr.DISPOSED)) == qcr.DISPOSED) {
            return;
        }
        try {
            qdvVar.a.e();
            if (qbzVar != null) {
            }
        } finally {
            if (qbzVar != null) {
                qbzVar.gT();
            }
        }
    }
}

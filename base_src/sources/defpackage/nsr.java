package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nsr {
    private static final ovk c = ovk.i();
    public final nrm a;
    public final nov b;

    public nsr(nrm nrmVar, nov novVar) {
        nrmVar.getClass();
        novVar.getClass();
        this.a = nrmVar;
        this.b = novVar;
    }

    private final void b(Throwable th, nrl nrlVar, nnj nnjVar, npe npeVar) {
        this.a.a(nrlVar.c(21, th, nnjVar, npeVar));
    }

    public final boolean a(nrl nrlVar, nqh nqhVar, npe npeVar) {
        npk npkVar;
        if (npeVar == null) {
            npkVar = null;
        } else {
            try {
                npkVar = npeVar.h;
            } catch (IllegalStateException e) {
                ((ovg) ((ovg) c.b()).h(e)).o("Checked status of asset that cannot be uploaded.");
                return false;
            }
        }
        if (npkVar == null) {
            npkVar = nqhVar.r;
        }
        if (npkVar.d != nmr.IN_AIRLOCK) {
            IllegalStateException illegalStateException = new IllegalStateException(qno.a("Not in airlock: airlockFileState ", npkVar.d));
            b(illegalStateException, nrlVar, nqhVar, npeVar);
            throw illegalStateException;
        }
        switch (npkVar.e) {
            case UNKNOWN_UPLOAD_STATE:
            case UPLOAD_FAILED_PERMANENTLY:
                IllegalStateException illegalStateException2 = new IllegalStateException(qno.a("Permanent failure: uploadState ", npkVar.e));
                b(illegalStateException2, nrlVar, nqhVar, npeVar);
                throw illegalStateException2;
            case UPLOAD_NOT_REQUESTED:
            case UPLOAD_PENDING:
            case UPLOAD_IN_PROGRESS:
            case UPLOAD_PAUSED:
                return true;
            case UPLOADED_TO_F250:
                return false;
            default:
                throw new qkk();
        }
    }
}

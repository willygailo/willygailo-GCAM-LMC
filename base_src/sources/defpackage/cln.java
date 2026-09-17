package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class cln extends mip {
    final /* synthetic */ clp a;

    public cln(clp clpVar) {
        this.a = clpVar;
    }

    @Override // defpackage.mip
    public final void fv(lnx lnxVar, long j) {
        synchronized (this.a.c) {
            if (lnxVar.equals(this.a.j)) {
                ((oug) ((oug) clp.a.c()).G(468)).q("onBufferLost in viewfinderStream => frame number: %d", j);
            } else if (lnxVar.equals(this.a.k)) {
                ((oug) ((oug) clp.a.c()).G(467)).q("onBufferLost in recordingStream => frame number: %d", j);
            }
        }
    }
}

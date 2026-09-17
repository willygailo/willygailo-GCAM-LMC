package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class clv extends mip {
    final /* synthetic */ clx a;

    public clv(clx clxVar) {
        this.a = clxVar;
    }

    @Override // defpackage.mip
    public final void fv(lnx lnxVar, long j) {
        synchronized (this.a.c) {
            if (lnxVar.equals(this.a.h)) {
                ((oug) ((oug) clx.a.c()).G(484)).q("onBufferLost in viewfinderStream => frame number: %d", j);
            } else if (lnxVar.equals(this.a.i)) {
                ((oug) ((oug) clx.a.c()).G(483)).q("onBufferLost in recordingStream => frame number: %d", j);
            }
        }
    }
}

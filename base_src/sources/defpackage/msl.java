package defpackage;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes2.dex */
class msl implements msn {
    protected final msn a;

    public msl(msn msnVar) {
        this.a = msnVar;
    }

    @Override // defpackage.msn
    public final void a(msa msaVar) {
        this.a.a(msaVar);
    }

    @Override // defpackage.msn
    public final void b(long j) {
        this.a.b(j);
    }

    @Override // defpackage.msn
    public final void c(MediaCodec.BufferInfo bufferInfo) {
        this.a.c(bufferInfo);
    }

    @Override // defpackage.msn
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.msn
    public void e(int i) {
        this.a.e(i);
    }
}

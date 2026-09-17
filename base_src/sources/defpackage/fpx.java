package defpackage;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
final class fpx implements msn {
    final /* synthetic */ fpz a;

    public fpx(fpz fpzVar) {
        this.a = fpzVar;
    }

    @Override // defpackage.msn
    public final void a(msa msaVar) {
    }

    @Override // defpackage.msn
    public final void b(long j) {
    }

    @Override // defpackage.msn
    public final void c(MediaCodec.BufferInfo bufferInfo) {
        this.a.e.incrementAndGet();
        bufferInfo.flags = 1;
        this.a.a(false);
    }

    @Override // defpackage.msn
    public final void d() {
    }

    @Override // defpackage.msn
    public final void e(int i) {
    }
}

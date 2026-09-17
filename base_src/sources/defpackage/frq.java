package defpackage;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
final class frq implements msn {
    final /* synthetic */ fqn a;
    final /* synthetic */ frr b;

    public frq(frr frrVar, fqn fqnVar) {
        this.b = frrVar;
        this.a = fqnVar;
    }

    @Override // defpackage.msn
    public final void a(msa msaVar) {
        frr frrVar = this.b;
        frrVar.d.post(new frp(frrVar, 5));
    }

    @Override // defpackage.msn
    public final void b(long j) {
        boolean z = fps.a;
        boolean z2 = fps.a;
    }

    @Override // defpackage.msn
    public final void c(MediaCodec.BufferInfo bufferInfo) {
        if (this.b.l.compareAndSet(0L, bufferInfo.presentationTimeUs)) {
            long j = bufferInfo.presentationTimeUs;
        }
        if ((bufferInfo.flags & 1) != 0) {
            this.b.m.set(this.b.n.getAndSet(0));
        } else {
            this.b.n.incrementAndGet();
        }
        if (((fqc) this.a).g(bufferInfo.presentationTimeUs).n()) {
            bufferInfo.flags |= Integer.MIN_VALUE;
        }
        this.b.i.incrementAndGet();
        this.b.j.incrementAndGet();
        this.b.k.set(bufferInfo.presentationTimeUs);
        this.b.b.b(bufferInfo);
    }

    @Override // defpackage.msn
    public final void d() {
    }

    @Override // defpackage.msn
    public final void e(int i) {
    }
}

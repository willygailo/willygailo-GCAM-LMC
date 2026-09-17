package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
final class fre implements mln {
    final /* synthetic */ pih a;
    final /* synthetic */ mln b;
    final /* synthetic */ frg c;

    public fre(frg frgVar, pih pihVar, mln mlnVar) {
        this.c = frgVar;
        this.a = pihVar;
        this.b = mlnVar;
    }

    @Override // defpackage.mln
    public final void a(pht phtVar) {
        this.a.e(phtVar);
        this.b.a(phtVar);
    }

    @Override // defpackage.msx
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.b.b(byteBuffer, bufferInfo);
        if (!this.a.isDone()) {
            ((oug) ((oug) frg.a.c()).G((char) 1922)).o("Configured format not yet available for packet; stats might be inaccurate");
            return;
        }
        if (this.a.isCancelled()) {
            return;
        }
        try {
            MediaFormat mediaFormat = (MediaFormat) plk.ad(this.a);
            fvq.b();
            if (mip.aG(mediaFormat.getString("mime"))) {
                synchronized (this.c.b) {
                    frf frfVar = this.c.b;
                    if (frfVar.b == 0) {
                        frfVar.c = Long.MAX_VALUE;
                    }
                    if ((bufferInfo.flags & 1) != 0) {
                        this.c.b.a++;
                    }
                    frf frfVar2 = this.c.b;
                    frfVar2.b++;
                    frfVar2.c = Math.min(bufferInfo.presentationTimeUs, this.c.b.c);
                    this.c.b.d = Math.max(bufferInfo.presentationTimeUs, this.c.b.d);
                }
            }
        } catch (ExecutionException e) {
            throw new AssertionError("... we just checked for isDone.");
        }
    }

    @Override // defpackage.msx, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}

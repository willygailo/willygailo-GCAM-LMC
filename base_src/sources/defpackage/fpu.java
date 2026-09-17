package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class fpu implements mln {
    private final mln a;
    private final pih b;

    public fpu(mln mlnVar, pih pihVar) {
        this.a = mlnVar;
        this.b = pihVar;
    }

    @Override // defpackage.mln
    public final void a(pht phtVar) {
        this.a.a(phtVar);
    }

    @Override // defpackage.msx
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.a.b(byteBuffer, bufferInfo);
            if ((bufferInfo.flags & 1) != 0) {
                this.b.o(Long.valueOf(bufferInfo.presentationTimeUs));
            }
        } catch (CancellationException e) {
            this.b.cancel(false);
        } catch (Throwable th) {
            this.b.cancel(false);
            throw th;
        }
    }

    @Override // defpackage.msx, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.close();
            if (this.b.isDone()) {
                return;
            }
            this.b.o(null);
        } catch (CancellationException e) {
            this.b.cancel(false);
        } catch (Throwable th) {
            this.b.cancel(false);
            throw th;
        }
    }
}

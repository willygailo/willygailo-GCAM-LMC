package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class frd implements mln {
    private final mln a;

    public frd(mln mlnVar) {
        this.a = mlnVar;
    }

    @Override // defpackage.mln
    public final void a(pht phtVar) {
        this.a.a(phtVar);
    }

    @Override // defpackage.msx
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & Integer.MIN_VALUE) != 0) {
            long j = bufferInfo.presentationTimeUs;
        } else {
            this.a.b(byteBuffer, bufferInfo);
        }
    }

    @Override // defpackage.msx, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}

package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class fqg implements mln {
    private final mln a;
    private volatile boolean b = false;

    public fqg(mln mlnVar) {
        this.a = mlnVar;
    }

    @Override // defpackage.mln
    public final void a(pht phtVar) {
        this.a.a(phtVar);
    }

    @Override // defpackage.msx
    public final void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 1) != 0) {
            this.b = true;
        }
        if (this.b) {
            this.a.b(byteBuffer, bufferInfo);
        }
    }

    @Override // defpackage.msx, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}

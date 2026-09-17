package defpackage;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
final class gbm implements gbe {
    final /* synthetic */ MediaCodec.BufferInfo a;
    final /* synthetic */ gbe b;

    public gbm(MediaCodec.BufferInfo bufferInfo, gbe gbeVar) {
        this.a = bufferInfo;
        this.b = gbeVar;
    }

    @Override // defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}

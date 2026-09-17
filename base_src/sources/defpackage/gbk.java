package defpackage;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
final class gbk implements gbe {
    final /* synthetic */ MediaCodec.BufferInfo a;
    final /* synthetic */ MediaCodec b;
    final /* synthetic */ int c;

    public gbk(MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.a = bufferInfo;
        this.b = mediaCodec;
        this.c = i;
    }

    @Override // defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.releaseOutputBuffer(this.c, false);
    }
}

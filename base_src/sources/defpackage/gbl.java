package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class gbl implements gbe {
    final /* synthetic */ MediaCodec.BufferInfo a;
    final /* synthetic */ MediaFormat b;
    final /* synthetic */ ByteBuffer c;

    public gbl(MediaCodec.BufferInfo bufferInfo, MediaFormat mediaFormat, ByteBuffer byteBuffer) {
        this.a = bufferInfo;
        this.b = mediaFormat;
        this.c = byteBuffer;
    }

    @Override // defpackage.mmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

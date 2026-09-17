package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface msx extends AutoCloseable {
    void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    @Override // java.lang.AutoCloseable
    void close();
}

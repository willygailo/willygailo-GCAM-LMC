package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface mkd extends AutoCloseable {
    mkc a(int i, MediaFormat mediaFormat);

    void b(String str, Object obj);

    void c(float f);

    @Override // java.lang.AutoCloseable
    void close();

    void d(float f, float f2);

    void e(int i);

    void f(mkc mkcVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
}

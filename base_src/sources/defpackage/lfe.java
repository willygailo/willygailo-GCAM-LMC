package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface lfe extends lie {
    ojc a(MediaFormat mediaFormat);

    void b(MediaFormat mediaFormat);

    void c(lff lffVar);

    void d(long j);

    void e(MediaFormat mediaFormat);

    void f();

    void g(lff lffVar);

    void h(FileDescriptor fileDescriptor);

    void i();

    void j(long j);

    void k();

    void l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void m(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i);

    void n(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    boolean o();

    void p(Object obj);
}

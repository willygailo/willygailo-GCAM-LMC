package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class lvk implements mah, lzl {
    private final MediaMuxer a;

    public lvk(MediaMuxer mediaMuxer) {
        this.a = mediaMuxer;
    }

    @Override // defpackage.mah
    public final int a(MediaFormat mediaFormat) {
        return this.a.addTrack(mediaFormat);
    }

    @Override // defpackage.mah
    public final void b(String str, Object obj) {
        throw new UnsupportedOperationException("Can't write out metadata using the framework muxer.");
    }

    @Override // defpackage.mah
    public final void c() {
        this.a.release();
    }

    @Override // defpackage.mah
    public final void d(float f, float f2) {
        this.a.setLocation(f, f2);
    }

    @Override // defpackage.mah
    public final void e(int i) {
        this.a.setOrientationHint(i);
    }

    @Override // defpackage.mah
    public final void f() {
        this.a.start();
    }

    @Override // defpackage.mah
    public final void g() {
        this.a.stop();
    }

    @Override // defpackage.mah
    public final void h(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a.writeSampleData(i, byteBuffer, bufferInfo);
    }

    @Override // defpackage.mah
    public final boolean i() {
        return false;
    }

    @Override // defpackage.lzl
    public final kkm j() {
        return new kkm(this.a);
    }
}

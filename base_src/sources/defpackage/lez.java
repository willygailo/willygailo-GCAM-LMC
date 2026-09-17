package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class lez implements lfe {
    private final pht a;

    public lez(pht phtVar) {
        this.a = phtVar;
    }

    private final lfe q() {
        try {
            return (lfe) this.a.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("MuxerProcessor isn't available", e);
        }
    }

    @Override // defpackage.lfe
    public final ojc a(MediaFormat mediaFormat) {
        return q().a(mediaFormat);
    }

    @Override // defpackage.lfe
    public final void b(MediaFormat mediaFormat) {
        q().b(mediaFormat);
    }

    @Override // defpackage.lfe
    public final void c(lff lffVar) {
        q().c(lffVar);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        q().close();
    }

    @Override // defpackage.lfe
    public final void d(long j) {
        q().d(j);
    }

    @Override // defpackage.lfe
    public final void e(MediaFormat mediaFormat) {
        q().e(mediaFormat);
    }

    @Override // defpackage.lfe
    public final void f() {
        q().f();
    }

    @Override // defpackage.lfe
    public final void g(lff lffVar) {
        q().g(lffVar);
    }

    @Override // defpackage.lfe
    public final void h(FileDescriptor fileDescriptor) {
        q().h(fileDescriptor);
    }

    @Override // defpackage.lfe
    public final void i() {
        q().i();
    }

    @Override // defpackage.lfe
    public final void j(long j) {
        q().j(j);
    }

    @Override // defpackage.lfe
    public final void k() {
        q().k();
    }

    @Override // defpackage.lfe
    public final void l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        q().l(byteBuffer, bufferInfo);
    }

    @Override // defpackage.lfe
    public final void m(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        q().m(byteBuffer, bufferInfo, i);
    }

    @Override // defpackage.lfe
    public final void n(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        q().n(byteBuffer, bufferInfo);
    }

    @Override // defpackage.lfe
    public final boolean o() {
        if (this.a.isDone()) {
            return q().o();
        }
        return false;
    }

    @Override // defpackage.lfe
    public final void p(Object obj) {
        q().p(obj);
    }
}

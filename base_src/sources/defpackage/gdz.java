package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class gdz implements gdp {
    public final AtomicInteger a = new AtomicInteger(0);
    public final AtomicInteger b = new AtomicInteger(0);
    public final lvp c;
    public final MediaFormat d;
    public final hht e;
    public final lis f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final mpi j;
    public final hoh k;
    private final Handler l;

    public gdz(MediaFormat mediaFormat, Handler handler, hht hhtVar, lvp lvpVar, mpi mpiVar, ddf ddfVar, lis lisVar, hoh hohVar) {
        boolean z = false;
        this.d = mediaFormat;
        this.l = handler;
        this.e = hhtVar;
        this.g = ddfVar.k(dds.y);
        this.h = ddfVar.k(dds.z);
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        StringBuilder sb = new StringBuilder(23);
        sb.append(integer);
        sb.append("x");
        sb.append(integer2);
        this.f = lix.j(sb.toString(), lisVar.a("MomentsTrackEncoder"));
        int integer3 = mediaFormat.getInteger("color-format");
        if (integer3 == 21 || integer3 == 2141391872) {
            z = true;
        }
        obr.aF(z);
        this.i = dvv.a(mediaFormat);
        this.j = mpiVar;
        this.c = lvpVar;
        this.k = hohVar;
    }

    public static void c(msx msxVar, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBufferAllocateDirect.put(byteBuffer);
        msxVar.b(byteBufferAllocateDirect, bufferInfo2);
    }

    @Override // defpackage.gdp
    public final gbp a(mln mlnVar, lic licVar) {
        if (this.b.get() > 0) {
            this.f.h("Reached maximum number of active codecs running. Dropping moments track...");
            mlnVar.close();
            return new geg(1);
        }
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
            this.b.incrementAndGet();
            lis lisVar = this.f;
            int i = this.b.get();
            StringBuilder sb = new StringBuilder(54);
            sb.append("Created codec successfully; current count: ");
            sb.append(i);
            lisVar.b(sb.toString());
            try {
                return new gdy(this, mediaCodecCreateEncoderByType, this.l, licVar).a(mlnVar);
            } catch (MediaCodec.CodecException e) {
                this.f.i("Exception trying to launch encoder...", e);
                mediaCodecCreateEncoderByType.release();
                mlnVar.close();
                this.b.decrementAndGet();
                return new geg(1);
            }
        } catch (IOException e2) {
            mlnVar.close();
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.gdp
    public final void b() {
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
    }
}

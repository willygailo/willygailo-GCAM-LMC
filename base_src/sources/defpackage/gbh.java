package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gbh implements gbp {
    private final gbg a;
    private final mln b;
    private final gbf c;
    private boolean d = false;

    public gbh(gbg gbgVar, mln mlnVar, gbf gbfVar) {
        this.a = gbgVar;
        this.b = mlnVar;
        this.c = gbfVar;
    }

    @Override // defpackage.gbp
    public final synchronized boolean a(mad madVar) {
        try {
            gbg gbgVar = this.a;
            gbf gbfVar = this.c;
            gbg gbgVar2 = ((gbi) gbgVar).a;
            for (int i = 0; i < 3; i++) {
                try {
                    gbg gbgVar3 = ((gbi) gbgVar2).a;
                    long jIncrementAndGet = ((long) ((gbj) gbgVar3).a.incrementAndGet()) * 1000000;
                    long jD = madVar.d();
                    gbe gbeVarA = ((gbj) gbgVar3).b.a(new gbn(madVar, jIncrementAndGet), gbfVar);
                    long jConvert = TimeUnit.MICROSECONDS.convert(jD, TimeUnit.NANOSECONDS);
                    MediaCodec.BufferInfo bufferInfo = ((gbk) gbeVarA).a;
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    bufferInfo2.presentationTimeUs = jConvert;
                    bufferInfo2.size = bufferInfo.size;
                    bufferInfo2.offset = bufferInfo.offset;
                    bufferInfo2.flags = bufferInfo.flags;
                    gbm gbmVar = new gbm(bufferInfo2, gbeVarA);
                    try {
                        MediaFormat outputFormat = ((gbk) gbmVar.b).b.getOutputFormat();
                        MediaCodec.BufferInfo bufferInfo3 = gbmVar.a;
                        MediaCodec.BufferInfo bufferInfo4 = new MediaCodec.BufferInfo();
                        bufferInfo4.presentationTimeUs = bufferInfo3.presentationTimeUs;
                        bufferInfo4.flags = bufferInfo3.flags;
                        bufferInfo4.offset = bufferInfo3.offset;
                        bufferInfo4.size = bufferInfo3.size;
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo4.size);
                        gbe gbeVar = gbmVar.b;
                        ByteBuffer outputBuffer = ((gbk) gbeVar).b.getOutputBuffer(((gbk) gbeVar).c);
                        outputBuffer.getClass();
                        ByteBuffer byteBufferDuplicate = outputBuffer.duplicate();
                        byteBufferAllocateDirect.put(byteBufferDuplicate.slice());
                        gbl gblVar = new gbl(bufferInfo4, outputFormat, byteBufferAllocateDirect);
                        gbmVar.close();
                        MediaCodec.BufferInfo bufferInfo5 = gblVar.a;
                        if (!this.d) {
                            this.b.a(plk.V(gblVar.b));
                            this.d = true;
                        }
                        if ((bufferInfo5.flags & 4) == 0 && (bufferInfo5.flags & 2) == 0) {
                            this.b.b(gblVar.c, bufferInfo5);
                        }
                        madVar.close();
                    } catch (Throwable th) {
                        try {
                            gbmVar.close();
                        } catch (Throwable th2) {
                        }
                        throw th;
                    }
                } catch (IllegalStateException e) {
                    ((oug) ((oug) ((oug) gbo.a.c()).h(e)).G((char) 2058)).o("Encoding failed. Retrying...");
                }
            }
            throw new IllegalStateException("Max attempts to encode reached! Encoding failed!");
        } catch (Throwable th3) {
            madVar.close();
            throw th3;
        }
        return true;
    }

    @Override // defpackage.gbp, defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b.close();
    }
}

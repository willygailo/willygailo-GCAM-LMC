package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class ekq extends Thread {
    final /* synthetic */ ekr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekq(ekr ekrVar) {
        super("EncoderDrainerDrainThread");
        this.a = ekrVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            ekr ekrVar = this.a;
            if (ekrVar.g) {
                return;
            }
            MediaCodec mediaCodecA = ekrVar.b.a();
            ByteBuffer[] outputBuffers = mediaCodecA.getOutputBuffers();
            while (ekrVar.i) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                try {
                    int iDequeueOutputBuffer = mediaCodecA.dequeueOutputBuffer(bufferInfo, 250000L);
                    if (iDequeueOutputBuffer == -1) {
                        if (!ekrVar.g || ekrVar.l == 0) {
                            ((oug) ((oug) ekr.a.c()).G((char) 1227)).o("MediaCodec timed out.");
                            break;
                        }
                    } else if (iDequeueOutputBuffer == -3) {
                        outputBuffers = mediaCodecA.getOutputBuffers();
                    } else if (iDequeueOutputBuffer == -2) {
                        ekrVar.f = ekrVar.c.a(mediaCodecA.getOutputFormat());
                    } else if (iDequeueOutputBuffer < 0) {
                        continue;
                    } else {
                        ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                        if (byteBuffer == null) {
                            ((oug) ((oug) ekr.a.b()).G(1226)).p("encoderOutputBuffer %s was null", iDequeueOutputBuffer);
                            break;
                        }
                        if ((bufferInfo.flags & 2) != 0) {
                            bufferInfo.size = 0;
                        }
                        if (bufferInfo.size != 0) {
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.get(bArr);
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                            ekrVar.l++;
                            synchronized (ekrVar.e) {
                                ekrVar.d.offer(new mss(byteBufferWrap, bufferInfo));
                                ekrVar.e.notifyAll();
                            }
                        }
                        mediaCodecA.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        if ((bufferInfo.flags & 4) != 0) {
                            ekrVar.g = true;
                            break;
                        }
                    }
                } catch (IllegalStateException e) {
                    ((oug) ((oug) ((oug) ekr.a.b()).h(e)).G((char) 1228)).o("Illegal state when dequeueing output buffer");
                    ekrVar.g = true;
                }
            }
        }
    }
}

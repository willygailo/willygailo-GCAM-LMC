package defpackage;

import android.media.AudioRecord;
import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ejw extends Thread {
    public static final ouj a = ouj.h("com/google/android/apps/camera/imax/cyclops/audio/AudioRecorderThread");
    private final AudioRecord d;
    private final ejt e;
    private final byte[] f = new byte[2048];
    public boolean b = false;
    public long c = 0;

    public ejw(ejt ejtVar, AudioRecord audioRecord) {
        this.e = ejtVar;
        this.d = audioRecord;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AudioRecord audioRecord = this.d;
        if (audioRecord == null) {
            this.b = false;
            return;
        }
        this.b = true;
        try {
            audioRecord.startRecording();
        } catch (IllegalStateException e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1212)).r("%s", e.getMessage());
        }
        while (this.b) {
            int i = this.d.read(this.f, 0, 2048);
            if (i == -3 || i == -2) {
                ((oug) ((oug) a.b()).G((char) 1213)).o("Error reading audio");
                break;
            }
            if (this.c != 0) {
                long jNanoTime = (System.nanoTime() / 1000) + this.c;
                ejt ejtVar = this.e;
                byte[] bArr = this.f;
                if (ejtVar.d) {
                    try {
                        ByteBuffer[] inputBuffers = ejtVar.b.getInputBuffers();
                        int iDequeueInputBuffer = ejtVar.b.dequeueInputBuffer(-1L);
                        if (iDequeueInputBuffer < 0) {
                            ((oug) ((oug) ejt.a.b()).G((char) 1201)).o("Could not find a valid buffer, will drop frame!");
                        } else {
                            ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                            byteBuffer.put(bArr);
                            int i2 = true != ejtVar.c ? 0 : 4;
                            MediaCodec mediaCodec = ejtVar.b;
                            int length = bArr.length;
                            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 2048, jNanoTime, i2);
                            if (ejtVar.c) {
                                ejtVar.d = false;
                                ejtVar.c = false;
                            }
                        }
                    } catch (IllegalStateException e2) {
                        ((oug) ((oug) ((oug) ejt.a.b()).h(e2)).G((char) 1202)).o("MediaCodec got into an illegal state");
                    }
                }
            }
        }
        try {
            this.d.stop();
        } catch (IllegalStateException e3) {
            ((oug) ((oug) ((oug) a.b()).h(e3)).G((char) 1211)).r("%s", e3.getMessage());
        }
        this.d.release();
        this.b = false;
    }
}

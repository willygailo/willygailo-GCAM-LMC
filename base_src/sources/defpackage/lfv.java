package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
final class lfv extends MediaCodec.Callback {
    final /* synthetic */ lfy a;

    public lfv(lfy lfyVar) {
        this.a = lfyVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        String str = String.format("%s failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", "AudioEncoder", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        if (codecException.isTransient()) {
            Log.e("AudioEncoder", str);
            return;
        }
        this.a.B = true;
        String strValueOf = String.valueOf(str);
        Log.e("AudioEncoder", strValueOf.length() != 0 ? "Stopping recording due to: ".concat(strValueOf) : new String("Stopping recording due to: "), codecException);
        this.a.g(new Runnable() { // from class: lfs
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.N.o(null);
            }
        }, this.a.c);
        this.a.m.a(lga.MEDIA_CODEC_ERROR_AUDIO);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(final MediaCodec mediaCodec, final int i) {
        int i2;
        ByteBuffer inputBuffer;
        lfy lfyVar = this.a;
        if (lfyVar.n) {
            synchronized (lfyVar.f) {
                lfy lfyVar2 = this.a;
                if (!lfyVar2.E) {
                    lfyVar2.G.add(Integer.valueOf(i));
                    return;
                }
            }
        }
        if (this.a.N.isDone()) {
            return;
        }
        final lfy lfyVar3 = this.a;
        if (!lfyVar3.p) {
            lfyVar3.g(new Runnable() { // from class: lfu
                @Override // java.lang.Runnable
                public final void run() {
                    lfv lfvVar = this.a;
                    lfvVar.a.e(mediaCodec, i);
                }
            }, this.a.b);
            return;
        }
        if (lfyVar3.h.a() != 3) {
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("Index");
            sb.append(i);
            sb.append(" is invalid");
            Log.e("AudioEncoder", sb.toString());
            return;
        }
        synchronized (lfyVar3.g) {
            Future future = lfyVar3.I;
            if (future != null && !future.isDone()) {
                if (lfyVar3.K == -1) {
                    lfyVar3.K = i;
                    return;
                }
                if (lfyVar3.J == -1 || SystemClock.elapsedRealtime() - lfyVar3.J <= 50 || (inputBuffer = mediaCodec.getInputBuffer(i)) == null || inputBuffer.limit() <= 0) {
                    i2 = 0;
                } else {
                    byte[] bArr = lfyVar3.L;
                    if (bArr == null || bArr.length != inputBuffer.limit()) {
                        lfyVar3.L = new byte[inputBuffer.limit()];
                    }
                    byte[] bArr2 = lfyVar3.L;
                    bArr2.getClass();
                    inputBuffer.put(bArr2);
                    int iLimit = inputBuffer.limit();
                    lfyVar3.r += 25000;
                    lfyVar3.J += 25;
                    i2 = iLimit;
                }
                mediaCodec.queueInputBuffer(i, 0, i2, lfyVar3.r, 0);
                if (i2 == 0) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e) {
                    }
                }
                return;
            }
            lfyVar3.I = lfyVar3.d.submit(new Runnable() { // from class: lfp
                @Override // java.lang.Runnable
                public final void run() {
                    int i3;
                    lfy lfyVar4 = lfyVar3;
                    MediaCodec mediaCodec2 = mediaCodec;
                    int i4 = i;
                    ByteBuffer inputBuffer2 = mediaCodec2.getInputBuffer(i4);
                    if (inputBuffer2 == null || inputBuffer2.limit() < 0) {
                        mediaCodec2.queueInputBuffer(i4, 0, 0, lfyVar4.r, 0);
                        return;
                    }
                    lgp lgpVarE = lfyVar4.h.e(inputBuffer2, inputBuffer2.limit());
                    if (lgpVarE == null) {
                        mediaCodec2.queueInputBuffer(i4, 0, 0, lfyVar4.r, lfyVar4.h.a() == 3 ? 0 : 4);
                        return;
                    }
                    long jD = lfyVar4.d(TimeUnit.MICROSECONDS.convert(lgpVarE.b(), TimeUnit.NANOSECONDS));
                    int iA = lgpVarE.a();
                    long j = lfyVar4.r;
                    if (jD <= j) {
                        jD = j;
                        i3 = 0;
                    } else {
                        if (j != -1 && jD - j > 25000) {
                            synchronized (lfyVar4.g) {
                                int i5 = lfyVar4.K;
                                if (i5 != -1) {
                                    long j2 = lfyVar4.r + 25000;
                                    lfyVar4.r = j2;
                                    mediaCodec2.queueInputBuffer(i5, 0, iA, j2, 0);
                                    lfyVar4.K = -1;
                                }
                            }
                        }
                        i3 = iA;
                    }
                    mediaCodec2.queueInputBuffer(i4, 0, i3, jD, 0);
                    lfyVar4.r = jD;
                    lfyVar4.J = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, final int i, final MediaCodec.BufferInfo bufferInfo) {
        lfy lfyVar = this.a;
        if (lfyVar.n) {
            synchronized (lfyVar.f) {
                lfy lfyVar2 = this.a;
                if (!lfyVar2.E) {
                    lfyVar2.H.add(Integer.valueOf(i));
                    return;
                }
            }
        }
        if (this.a.N.isDone()) {
            return;
        }
        this.a.g(new Runnable() { // from class: lft
            @Override // java.lang.Runnable
            public final void run() {
                lfv lfvVar = this.a;
                int i2 = i;
                MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
                lfy lfyVar3 = lfvVar.a;
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(35);
                    sb.append("unexpected outputIndex: ");
                    sb.append(i2);
                    Log.w("AudioEncoder", sb.toString());
                    return;
                }
                if ((bufferInfo2.flags & 2) != 0) {
                    bufferInfo2.size = 0;
                }
                if (bufferInfo2.size != 0) {
                    Deque deque = lfyVar3.q;
                    long j = bufferInfo2.presentationTimeUs;
                    while (true) {
                        if (!deque.isEmpty()) {
                            orj orjVar = (orj) deque.peek();
                            orjVar.getClass();
                            if (!orjVar.a(Long.valueOf(j))) {
                                if (!orjVar.m() || ((Long) orjVar.j()).longValue() <= j) {
                                    String.valueOf(String.valueOf(orjVar)).length();
                                    deque.poll();
                                }
                            }
                        }
                        ByteBuffer outputBuffer = lfyVar3.i.getOutputBuffer(i2);
                        bufferInfo2.presentationTimeUs -= lfyVar3.t;
                        if (lfyVar3.v.get() == 0) {
                            long j2 = bufferInfo2.presentationTimeUs;
                        }
                        lfyVar3.v.set(bufferInfo2.presentationTimeUs);
                        AtomicLong atomicLong = lfyVar3.w;
                        double d = bufferInfo2.presentationTimeUs;
                        double d2 = lfyVar3.l;
                        Double.isNaN(d);
                        atomicLong.set((long) (d / d2));
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfo2.size);
                        byteBufferAllocate.put(outputBuffer);
                        lfyVar3.o.offer(new lfx(bufferInfo2, byteBufferAllocate));
                        if (lfyVar3.o.size() > 1000) {
                            Log.w("AudioEncoder", "Too many audio buffers in queue to be written. Video frame is very delayed.");
                            lfyVar3.m.a(lga.VIDEO_BUFFER_DELAY);
                        }
                    }
                }
                lfyVar3.i.releaseOutputBuffer(i2, false);
                if (lfyVar3.y) {
                    if ((bufferInfo2.presentationTimeUs < lfyVar3.s || (bufferInfo2.flags & 2) != 0) && (bufferInfo2.flags & 4) == 0 && !((lfyVar3.x && lfyVar3.z) || lfyVar3.A || lfyVar3.B)) {
                        return;
                    }
                    lfyVar3.N.o(null);
                }
            }
        }, this.a.c);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        lfy lfyVar = this.a;
        if (lfyVar.n) {
            synchronized (lfyVar.f) {
                lfy lfyVar2 = this.a;
                if (!lfyVar2.E) {
                    lfyVar2.F = mediaFormat;
                    return;
                }
            }
        }
        this.a.f(mediaFormat);
    }
}

package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class mrw extends MediaCodec.Callback {
    final /* synthetic */ mrx a;

    public mrw(mrx mrxVar) {
        this.a = mrxVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        if (codecException.isTransient()) {
            Log.w("AsynchMediaCodec", "Transient error occurred while processing data.", codecException);
        } else if (codecException.isRecoverable()) {
            Log.w("AsynchMediaCodec", "Recoverable error occurred while encoding data.", codecException);
            this.a.e.a(codecException);
            this.a.c();
        } else {
            Log.e("AsynchMediaCodec", "Unrecoverable error occurred while encoding data.", codecException);
            this.a.e.a(codecException);
            this.a.c();
        }
        this.a.b.set(3);
        this.a.n.e(3);
        this.a.g.getAndSet(false);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            if (this.a.e.isDone()) {
                return;
            }
            if (this.a.f.getAndSet(false)) {
                this.a.e(i);
            } else {
                this.a.d.addLast(Integer.valueOf(i));
                this.a.n.a(this.a);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            if (this.a.e.isDone()) {
                return;
            }
            boolean z = this.a.h.get();
            int i2 = bufferInfo.flags & 2;
            if (bufferInfo.size <= 0 || z || i2 != 0) {
                try {
                    try {
                        mediaCodec.releaseOutputBuffer(i, false);
                        this.a.a(bufferInfo);
                    } catch (Throwable th) {
                        Log.e("AsynchMediaCodec", "Exception occurred while trying to release output buffer", th);
                        return;
                    }
                } catch (MediaCodec.CodecException e) {
                    this.a.j.onError(mediaCodec, e);
                    return;
                }
            }
            this.a.n.c(bufferInfo);
            try {
                try {
                    mth mthVar = this.a.m;
                    mrx mrxVar = this.a;
                    mrv mrvVar = new mrv(mrxVar, mediaCodec, mediaCodec.getOutputBuffer(i), bufferInfo, null, i);
                    synchronized (mrxVar) {
                        mrxVar.l.add(mrvVar);
                    }
                    mthVar.a(mrvVar);
                } catch (Throwable th2) {
                    Log.e("AsynchMediaCodec", "Exception occurred while trying construct media data", th2);
                }
            } catch (MediaCodec.CodecException e2) {
                this.a.j.onError(mediaCodec, e2);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.a.m.b(mediaFormat);
    }
}

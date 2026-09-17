package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class lgs extends MediaCodec.Callback {
    final /* synthetic */ lgt a;

    public lgs(lgt lgtVar) {
        this.a = lgtVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        String str = String.format("%s failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", "VideoEncoder", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        if (codecException.isTransient()) {
            Log.e("VideoEncoder", str);
            return;
        }
        this.a.t = true;
        this.a.h.o(null);
        String strValueOf = String.valueOf(str);
        Log.e("VideoEncoder", strValueOf.length() != 0 ? "Stopping recording due to: ".concat(strValueOf) : new String("Stopping recording due to: "), codecException);
        this.a.e.a(lga.MEDIA_CODEC_ERROR_VIDEO);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        Log.e("VideoEncoder", "InputBuffer handling is not implemented (yet) since it's not needed forsurfaces.");
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        lgt lgtVar = this.a;
        if (lgtVar.l) {
            synchronized (lgtVar.b) {
                lgt lgtVar2 = this.a;
                if (!lgtVar2.v) {
                    lgtVar2.u.add(Integer.valueOf(i));
                    this.a.d(true);
                    return;
                }
            }
        }
        this.a.f(i, bufferInfo);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        lgt lgtVar = this.a;
        if (lgtVar.l) {
            synchronized (lgtVar.b) {
                lgt lgtVar2 = this.a;
                if (!lgtVar2.v) {
                    lgtVar2.w = mediaFormat;
                    return;
                }
            }
        }
        this.a.c(mediaFormat);
    }
}

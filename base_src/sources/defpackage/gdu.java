package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
final class gdu extends MediaCodec.Callback {
    final /* synthetic */ mln a;
    final /* synthetic */ gdy b;

    public gdu(gdy gdyVar, mln mlnVar) {
        this.b = gdyVar;
        this.a = mlnVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.b.h.set(true);
        this.b.b(codecException);
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.b.h.set(true);
        this.b.a.addLast(Integer.valueOf(i));
        this.b.c();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.b.h.set(true);
        this.b.b.addLast(Pair.create(Integer.valueOf(i), bufferInfo));
        this.b.c();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.b.h.set(true);
        this.a.a(plk.V(mediaFormat));
    }
}

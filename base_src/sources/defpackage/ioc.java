package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class ioc extends MediaCodec.Callback {
    final /* synthetic */ ddf a;
    final /* synthetic */ iod b;

    public ioc(iod iodVar, ddf ddfVar) {
        this.b = iodVar;
        this.a = ddfVar;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        if (codecException.isTransient()) {
            ((oug) ((oug) iod.a.b()).G(3050)).C("CheetahFrSelector failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        } else {
            ((oug) ((oug) ((oug) iod.a.b()).h(codecException)).G(3051)).C("Stopping recording due to: CheetahFrSelector failed due to error (%d), transient: %s, recoverable: %s, message: %s, info: %s)", Integer.valueOf(codecException.getErrorCode()), Boolean.valueOf(codecException.isTransient()), Boolean.valueOf(codecException.isRecoverable()), codecException.getMessage(), codecException.getDiagnosticInfo());
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.b.s) {
            iod iodVar = this.b;
            ldv ldvVar = iodVar.B;
            ldvVar.getClass();
            iqo iqoVar = iodVar.v;
            iqoVar.getClass();
            iql iqlVar = iodVar.u;
            iqlVar.getClass();
            lfj lfjVar = ldvVar.a;
            lfjVar.getClass();
            ddf ddfVar = this.a;
            ddg ddgVar = deg.a;
            ddfVar.b();
            lfjVar.n(i, bufferInfo);
            if ((bufferInfo.flags & 2) == 0 && bufferInfo.size > 0) {
                this.b.e.set(TimeUnit.SECONDS.toMillis(this.b.f.incrementAndGet()) / ((long) this.b.y.f));
                this.b.p.set(TimeUnit.SECONDS.toMillis(this.b.m.incrementAndGet()) / ((long) this.b.y.f));
            }
            iqoVar.h(this.b.d());
            iqoVar.i(this.b.c());
            iqoVar.c(this.b.a());
            iqoVar.d(this.b.b());
            iod iodVar2 = this.b;
            iqlVar.e(TimeUnit.SECONDS.toMillis(iodVar2.k.get()) / ((long) iodVar2.e().f));
            iqlVar.g(this.b.p.get());
            this.b.m.get();
            iqlVar.h();
            iod iodVar3 = this.b;
            iodVar3.k.get();
            iodVar3.m.get();
            iqlVar.i();
            pih pihVar = this.b.x;
            if (pihVar != null && !pihVar.isDone() && this.b.m.get() > 1) {
                ((oug) ((oug) iod.a.c()).G(3052)).q("At least %d frames are encoded. ", this.b.m.get());
                iod iodVar4 = this.b;
                iodVar4.x.o(iodVar4.A);
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.b.s) {
            ldv ldvVar = this.b.B;
            ldvVar.getClass();
            lfj lfjVar = ldvVar.a;
            lfjVar.getClass();
            lfjVar.l(mediaCodec.getOutputFormat());
        }
    }
}

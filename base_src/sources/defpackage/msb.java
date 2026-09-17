package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class msb implements msc {
    private final msa a;
    private final pht b;

    public msb(MediaFormat mediaFormat, msx msxVar, msn msnVar, Handler handler, boolean z, final Surface surface) throws IOException {
        mrz mrzVar = new mrz(mediaFormat);
        mrzVar.b = handler;
        if (z) {
            mrzVar.c = true;
            mrzVar.d = imd.l;
        } else if (surface != null) {
            mrzVar.c = false;
            mrzVar.d = new oiu() { // from class: mry
                @Override // defpackage.oiu
                public final Object a(Object obj) {
                    Surface surface2 = surface;
                    ((MediaCodec) obj).setInputSurface(surface2);
                    return surface2;
                }
            };
        }
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(mrzVar.a.getString("mime"));
        boolean z2 = mot.a;
        mrx mrxVar = new mrx(mediaCodecCreateEncoderByType, mrzVar.a, mrzVar.d, mrzVar.c, mrzVar.b);
        this.a = mrxVar;
        if (mrxVar.i.get()) {
            throw new IllegalStateException("Not allowed to update the listener after start.");
        }
        mrxVar.n = msnVar;
        mti mtiVar = new mti(msxVar);
        if (mrxVar.i.get()) {
            throw new IllegalStateException("Not allowed to update the frame processor after start.");
        }
        mrxVar.m = mtiVar;
        this.b = mtiVar.b;
    }

    @Override // defpackage.msc
    public final Surface a() {
        return ((mrx) this.a).c;
    }

    @Override // defpackage.msc
    public final pht b() {
        return this.b;
    }

    @Override // defpackage.msi
    public final void c() {
        this.a.f();
    }

    @Override // defpackage.msc
    public final mru d() {
        return this.a.g();
    }

    @Override // defpackage.msi
    public final void e() {
        mrx mrxVar = (mrx) this.a;
        if (!mrxVar.g.getAndSet(true)) {
            switch (mrxVar.b.get()) {
                case 1:
                    mrxVar.d();
                    break;
                case 3:
                case 4:
                    mrxVar.b();
                    break;
            }
        }
        plk.W(mrxVar.e);
    }
}

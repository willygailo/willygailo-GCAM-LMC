package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.Matrix;
import android.os.Bundle;
import android.view.Surface;
import java.io.IOException;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final class eku implements eko {
    public static final ouj a = ouj.h("com/google/android/apps/camera/imax/cyclops/video/SurfaceVideoEncoder");
    public final Bundle b;
    public MediaCodec c;
    public ekv d;
    public nlb e;
    public final ekt f;
    public int g;
    public boolean h;
    private final Semaphore i = new Semaphore(1);

    public eku(MediaCodec mediaCodec, ekt ektVar) {
        Bundle bundle = new Bundle();
        this.b = bundle;
        this.g = 0;
        this.h = false;
        this.c = mediaCodec;
        this.f = ektVar;
        bundle.putInt("request-sync", 0);
    }

    @Override // defpackage.eko
    public final MediaCodec a() {
        return this.c;
    }

    @Override // defpackage.eko
    public final void b() {
        if (this.h) {
            this.c.signalEndOfInputStream();
        }
    }

    @Override // defpackage.eko
    public final void c() {
        if (this.h) {
            this.h = false;
            try {
                this.c.stop();
            } catch (IllegalStateException e) {
                ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1248)).o("Illegal state when stopping MediaCodec");
            }
            this.c.release();
            this.e.a();
        }
    }

    @Override // defpackage.eko
    public final boolean d() {
        ekt ektVar = this.f;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", ektVar.b, ektVar.c);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.f.a);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", Math.max(1, 10));
        try {
            this.c.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            nlb nlbVar = new nlb(this.f.e, this.c.createInputSurface());
            this.e = nlbVar;
            nlbVar.b();
            ekt ektVar2 = this.f;
            ekv ekvVar = new ekv(ektVar2.f, ektVar2.d);
            this.d = ekvVar;
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            ekvVar.a(fArr);
            EGL14.eglMakeCurrent(this.e.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            try {
                this.c.start();
                this.h = true;
                return true;
            } catch (IllegalStateException e) {
                ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1250)).o("Cannot start encoder");
                return false;
            }
        } catch (Exception e2) {
            ((oug) ((oug) ((oug) a.b()).h(e2)).G((char) 1249)).o("Exception when configuring MediaCodec");
            this.c.release();
            try {
                this.c = MediaCodec.createEncoderByType("video/avc");
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return false;
        }
    }

    public final void e() {
        try {
            this.i.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException("Unable to lock frame data", e);
        }
    }

    public final void f() {
        this.i.release();
    }
}

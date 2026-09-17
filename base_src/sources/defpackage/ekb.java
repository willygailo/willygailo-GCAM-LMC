package defpackage;

import android.media.MediaCodec;
import android.opengl.EGL14;
import com.google.android.libraries.vision.opengl.Texture;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ekb implements ejy {
    public static final ouj a = ouj.h("com/google/android/apps/camera/imax/cyclops/capture/CameraRecorder");
    private ejx h = null;
    private Texture i = null;
    public eky b = null;
    public eku c = null;
    public ejv d = null;
    public egy g = null;
    public boolean e = false;
    public int f = -1;

    @Override // defpackage.ejy
    public final void a(float[] fArr, long j) {
        ejv ejvVar;
        if (!this.e && (ejvVar = this.d) != null) {
            ejvVar.b.c = (j / 1000) - (System.nanoTime() / 1000);
            this.e = true;
        }
        eky ekyVar = this.b;
        if (ekyVar != null && ekyVar.f) {
            ekyVar.g.incrementAndGet();
            ekyVar.b.e();
            ekx ekxVar = ekyVar.e;
            ekxVar.sendMessage(ekxVar.obtainMessage(1, (int) (j >> 32), (int) j, fArr));
        }
    }

    @Override // defpackage.ejy
    public final void b(int i, int i2) {
    }

    @Override // defpackage.ejy
    public final void c(Texture texture, ejx ejxVar) {
        this.i = texture;
        this.h = ejxVar;
        f();
    }

    @Override // defpackage.ejy
    public final void d() {
        eky ekyVar = this.b;
        if (ekyVar == null) {
            return;
        }
        eku ekuVar = ekyVar.b;
        ekuVar.e();
        ekuVar.f();
    }

    @Override // defpackage.ejy
    public final void e(egy egyVar) {
        this.g = egyVar;
    }

    public final void f() {
        try {
            int i = this.f;
            if (i <= 0) {
                float f = this.h.b / 1080.0f;
                i = (int) ((f + (f * f)) * 0.5f * 1.2E7f);
            }
            ejx ejxVar = this.h;
            this.c = new eku(MediaCodec.createEncoderByType("video/avc"), new ekt(ejxVar.a, ejxVar.b, ejxVar.c, EGL14.eglGetCurrentContext(), this.i, i));
        } catch (IOException e) {
            ((oug) ((oug) a.b()).G((char) 1215)).o("Could not instantiate a video recorder!");
            this.c = null;
        }
    }
}

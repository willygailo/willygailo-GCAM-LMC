package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ekx extends Handler {
    private final WeakReference a;

    public ekx(eky ekyVar, Looper looper) {
        super(looper);
        this.a = new WeakReference(ekyVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        eky ekyVar = (eky) this.a.get();
        if (ekyVar == null) {
        }
        switch (message.what) {
            case 1:
                long j = (((long) message.arg1) << 32) | (((long) message.arg2) & 4294967295L);
                float[] fArr = (float[]) message.obj;
                eku ekuVar = ekyVar.b;
                if (!ekuVar.h) {
                    ((oug) ((oug) eku.a.b()).G((char) 1247)).o("Received a frame to process, but the encoder either hasn't started or has already stopped. This should not happen.");
                    ekuVar.f();
                } else {
                    ekuVar.e.b();
                    ekuVar.d.a(fArr);
                    ekuVar.f();
                    nlb nlbVar = ekuVar.e;
                    EGLExt.eglPresentationTimeANDROID(nlbVar.a, nlbVar.b, j);
                    nlb nlbVar2 = ekuVar.e;
                    EGL14.eglSwapBuffers(nlbVar2.a, nlbVar2.b);
                    ekuVar.g++;
                }
                break;
            case 2:
                ekyVar.c.a();
                break;
            case 3:
                getLooper().quitSafely();
                break;
        }
    }
}

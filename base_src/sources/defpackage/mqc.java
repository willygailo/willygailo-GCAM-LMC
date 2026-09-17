package defpackage;

import android.opengl.EGL14;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;

/* JADX INFO: loaded from: classes2.dex */
final class mqc implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Throwable b;
    final /* synthetic */ mqd c;

    public mqc(mqd mqdVar, Runnable runnable, Throwable th) {
        this.c = mqdVar;
        this.a = runnable;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iIncrementAndGet = this.c.a.incrementAndGet();
        boolean z = this.c.b.get();
        this.a.run();
        Runnable runnable = this.a;
        Throwable th = this.b;
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            mwp.k(runnable, iIncrementAndGet, iEglGetError, GLES30.glGetError(), z);
            String eGLErrorString = GLUtils.getEGLErrorString(iEglGetError);
            String string = runnable.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 37 + String.valueOf(eGLErrorString).length());
            sb.append("Executing EGL task '");
            sb.append(string);
            sb.append("' caused error: ");
            sb.append(eGLErrorString);
            sb.append("!");
            throw new RuntimeException(sb.toString(), th);
        }
        Runnable runnable2 = this.a;
        Throwable th2 = this.b;
        int iGlGetError = GLES30.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        mwp.k(runnable2, iIncrementAndGet, EGL14.eglGetError(), iGlGetError, z);
        String strGluErrorString = GLU.gluErrorString(iGlGetError);
        String string2 = runnable2.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string2).length() + 35 + String.valueOf(strGluErrorString).length());
        sb2.append("Executing GL task '");
        sb2.append(string2);
        sb2.append("' caused error ");
        sb2.append(strGluErrorString);
        sb2.append("!");
        throw new RuntimeException(sb2.toString(), th2);
    }

    public final String toString() {
        String string = this.a.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 10);
        sb.append("checked [");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}

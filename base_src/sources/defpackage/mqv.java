package defpackage;

import android.opengl.EGL14;
import android.opengl.GLES30;
import android.opengl.GLUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class mqv {
    public static final int[] a = new int[2];

    public static int a() {
        int[] iArr = new int[1];
        GLES30.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    public static mqq b(mtu mtuVar) {
        int iA = a();
        mrf mrfVar = (mrf) mtuVar.c();
        GLES30.glBindFramebuffer(36160, iA);
        GLES30.glFramebufferTexture2D(36160, 36064, ((mrb) mrfVar.c()).c, ((mrb) mrfVar.c()).b, 0);
        mqq mqqVar = (mqq) mrfVar.b.h().c();
        return new mqu(mqqVar.h(), mqqVar.f(), mqqVar.g(), mqqVar.e(), mqqVar.d(), iA, mrfVar.b(), mqqVar, iA, mtuVar);
    }

    public static String c() {
        return GLUtils.getEGLErrorString(EGL14.eglGetError());
    }

    public static void d(int i) {
        GLES30.glDeleteFramebuffers(1, new int[]{i}, 0);
    }

    public static void e(int i) {
        GLES30.glDeleteRenderbuffers(1, new int[]{i}, 0);
    }
}

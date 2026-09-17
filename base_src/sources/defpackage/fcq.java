package defpackage;

import android.opengl.GLES20;
import android.opengl.GLU;

/* JADX INFO: loaded from: classes.dex */
public final class fcq extends Exception {
    private static final ouj a = ouj.h("com/google/android/apps/camera/legacy/lightcycle/opengl/OpenGLException");

    public fcq(String str) {
        super(str);
        ((oug) ((oug) ((oug) a.b()).h(this)).G((char) 1641)).r("%s", str);
    }

    public fcq(String str, String str2) {
        super(str);
        ((oug) ((oug) ((oug) a.b()).h(this)).G(1642)).y("%s : %s", str, str2);
    }

    public static void a(String str) throws fcq {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String strGluErrorString = GLU.gluErrorString(iGlGetError);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(strGluErrorString).length());
        sb.append(str);
        sb.append(": glError ");
        sb.append(strGluErrorString);
        sb.append(" ");
        sb.append(iGlGetError);
        throw new fcq(sb.toString());
    }
}

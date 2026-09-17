package defpackage;

import android.opengl.GLES20;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class nlc {
    private static final String a = nlc.class.getSimpleName();
    private int b;
    private int c;
    private int d;

    public nlc(String str, String str2) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.b = f(35633, str);
        this.c = f(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.d = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, this.b);
        GLES20.glAttachShader(this.d, this.c);
        GLES20.glLinkProgram(this.d);
    }

    private static int f(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        Log.e(a, strGlGetShaderInfoLog);
        GLES20.glDeleteShader(iGlCreateShader);
        String strValueOf = String.valueOf(strGlGetShaderInfoLog);
        throw new IllegalArgumentException(strValueOf.length() != 0 ? "Shader compilation failed: ".concat(strValueOf) : new String("Shader compilation failed: "));
    }

    public final nle a(String str) {
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.d, str);
        if (iGlGetUniformLocation >= 0) {
            return new nle(iGlGetUniformLocation);
        }
        Log.e(a, str.length() != 0 ? "Could not find uniform named ".concat(str) : new String("Could not find uniform named "));
        return null;
    }

    public final void b() {
        GLES20.glUseProgram(this.d);
    }

    public final void c() {
        GLES20.glDeleteShader(this.b);
        GLES20.glDeleteShader(this.c);
        GLES20.glDeleteProgram(this.d);
    }

    public final void d() {
        GLES20.glUseProgram(0);
    }

    public final nle e(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.d, str);
        if (iGlGetAttribLocation >= 0) {
            return new nle(iGlGetAttribLocation);
        }
        Log.e(a, str.length() != 0 ? "Could not find attribute named ".concat(str) : new String("Could not find attribute named "));
        return null;
    }
}

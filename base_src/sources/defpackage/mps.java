package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES30;
import android.util.Log;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class mps implements Callable {
    private final mrh a;
    private final mov b;

    public mps(mrh mrhVar, mov movVar) {
        this.a = mrhVar;
        this.b = movVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        mrh mrhVar = this.a;
        mov movVar = this.b;
        mme mmeVarD = mmf.d(1, 1);
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            String strValueOf = String.valueOf(mqv.c());
            throw new mow(strValueOf.length() != 0 ? "EGL Error: Bad display: ".concat(strValueOf) : new String("EGL Error: Bad display: "));
        }
        synchronized (mqv.a) {
            if (mqv.a[0] == 0 && !EGL14.eglInitialize(eGLDisplayEglGetDisplay, mqv.a, 0, mqv.a, 1)) {
                String strValueOf2 = String.valueOf(mqv.c());
                throw new mow(strValueOf2.length() != 0 ? "EGL Error: eglInitialize failed: ".concat(strValueOf2) : new String("EGL Error: eglInitialize failed: "));
            }
        }
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0)) {
            throw new IllegalArgumentException("EGL Error: eglChooseConfig failed!");
        }
        if (iArr[0] == 0) {
            throw new IllegalArgumentException("Could not find suitable EGLConfig!");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, mrhVar.b, 12344}, 0);
        if (eGLContextEglCreateContext == null || eGLContextEglCreateContext == EGL14.EGL_NO_CONTEXT) {
            throw mow.a(mrhVar);
        }
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, mmeVarD.b(), 12374, mmeVarD.a(), 12344}, 0);
        if (eGLSurfaceEglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
            String strValueOf3 = String.valueOf(mqv.c());
            throw new mow(strValueOf3.length() != 0 ? "EGL Error: Bad surface: ".concat(strValueOf3) : new String("EGL Error: Bad surface: "));
        }
        EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        String strGlGetString = GLES30.glGetString(7938);
        String[] strArrSplit = strGlGetString.split("\\s");
        if (strArrSplit.length < 3 || !strArrSplit[0].equals("OpenGL") || !strArrSplit[1].equals("ES")) {
            StringBuilder sb = new StringBuilder(String.valueOf(strGlGetString).length() + 32);
            sb.append("Unexpected GL version string '");
            sb.append(strGlGetString);
            sb.append("'!");
            throw new mow(sb.toString());
        }
        String str = strArrSplit[2];
        String[] strArrSplit2 = str.split("\\.");
        if (strArrSplit2.length == 1) {
            strArrSplit2 = new String[]{strArrSplit2[0], "0"};
        }
        int length = strArrSplit2.length;
        if (length != 2 && length != 3) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32);
            sb2.append("Unexpected GL version format '");
            sb2.append(str);
            sb2.append("'!");
            throw new mow(sb2.toString());
        }
        try {
            mqr mqrVar = new mqr(new mrh(Integer.parseInt(strArrSplit2[0]), Integer.parseInt(strArrSplit2[1])), eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext, eGLConfig, mwp.p(movVar.a, mmeVarD), eGLDisplayEglGetDisplay);
            if (((mqh) mqrVar).a.compareTo(mrhVar) >= 0) {
                return mqrVar;
            }
            String strValueOf4 = String.valueOf(mrhVar);
            String strValueOf5 = String.valueOf(((mqh) mqrVar).a);
            StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf4).length() + 17 + String.valueOf(strValueOf5).length());
            sb3.append("Wanted ");
            sb3.append(strValueOf4);
            sb3.append(" but got: ");
            sb3.append(strValueOf5);
            Log.e("GLRootCanvasCore", sb3.toString());
            mqrVar.close();
            throw mow.a(mrhVar);
        } catch (NumberFormatException e) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 42);
            sb4.append("Unexpected numerical GL version format '");
            sb4.append(str);
            sb4.append("'!");
            throw new mow(sb4.toString());
        }
    }
}

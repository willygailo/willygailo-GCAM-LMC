package com.google.vr.cardboard;

import android.opengl.GLES20;
import android.util.Log;
import defpackage.pwa;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes.dex */
public class EglReadyListener {
    private volatile EGLContext a;
    private volatile int b;
    private volatile pwa e;
    private volatile int c = 2;
    private final Object d = new Object();
    private final Object f = new Object();

    public void onEglReady() {
        int iIndexOf;
        int numericValue;
        synchronized (this.d) {
            this.a = ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
            if (this.a == null || this.a == EGL10.EGL_NO_CONTEXT) {
                Log.e("EglReadyListener", "Unable to obtain the application's OpenGL context.");
            }
            String strGlGetString = GLES20.glGetString(7938);
            int i = 2;
            if (strGlGetString != null && (iIndexOf = strGlGetString.indexOf(46)) > 0 && (numericValue = Character.getNumericValue(strGlGetString.charAt(iIndexOf - 1))) >= 0) {
                i = numericValue;
            } else {
                Log.e("EglReadyListener", "Unable to determine the OpenGL major version.");
            }
            this.c = i;
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(33310, iArr, 0);
            GLES20.glGetError();
            this.b = iArr[0];
        }
        synchronized (this.f) {
        }
    }
}

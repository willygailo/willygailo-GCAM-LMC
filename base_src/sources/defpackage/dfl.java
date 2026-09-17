package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes.dex */
public final class dfl {
    private static final ouj c = ouj.h("com/google/android/apps/camera/data/GlideFilmstripManager");
    private static lig d;
    public final lig a;
    public final int b;
    private final Context e;

    public dfl(Context context, ddf ddfVar) {
        this.e = context;
        int iIntValue = ((Integer) ddfVar.a(ddl.e).c()).intValue();
        this.a = new lig(iIntValue, iIntValue);
        this.b = ((Integer) ddfVar.a(ddl.f).c()).intValue();
    }

    public static lig d(lig ligVar, double d2, lig ligVar2) {
        int i = ligVar.a;
        int i2 = ligVar.b;
        if (i * i2 < d2 && i < ligVar2.a && i2 < ligVar2.b) {
            return ligVar;
        }
        double dB = ligVar.b();
        Double.isNaN(dB);
        double dMin = Math.min(Math.sqrt(d2 / dB), 1.0d);
        double d3 = ligVar.a;
        Double.isNaN(d3);
        int iRound = (int) Math.round(d3 * dMin);
        double d4 = ligVar.b;
        Double.isNaN(d4);
        int iRound2 = (int) Math.round(d4 * dMin);
        int i3 = ligVar2.a;
        if (iRound <= i3 && iRound2 <= ligVar2.b) {
            return new lig(iRound, iRound2);
        }
        double d5 = ligVar.a;
        double d6 = i3;
        Double.isNaN(d6);
        Double.isNaN(d5);
        double d7 = d6 / d5;
        double d8 = ligVar2.b;
        double d9 = ligVar.b;
        Double.isNaN(d8);
        Double.isNaN(d9);
        double d10 = d8 / d9;
        if (d7 > d10) {
            d7 = d10;
        }
        Double.isNaN(d5);
        int iMin = Math.min((int) Math.round(d5 * d7), ligVar2.a);
        double d11 = ligVar.b;
        Double.isNaN(d11);
        return new lig(iMin, Math.min((int) Math.round(d11 * d7), ligVar2.b));
    }

    public static lig e() {
        Integer numValueOf;
        if (d == null) {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (iArr2[0] == 0) {
                ((oug) ((oug) c.c()).G((char) 741)).o("No EGL configurations found!");
                numValueOf = null;
            } else {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
                int[] iArr3 = new int[1];
                GLES20.glGetIntegerv(3379, iArr3, 0);
                int i = iArr3[0];
                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                numValueOf = Integer.valueOf(i);
            }
            if (numValueOf == null) {
                d = new lig(2048, 2048);
            } else if (numValueOf.intValue() > 4096) {
                d = new lig(4096, 4096);
            } else {
                d = new lig(numValueOf.intValue(), numValueOf.intValue());
            }
        }
        return d;
    }

    public static final bkx f() {
        return (bkx) new bkx().w(bif.a, 0L);
    }

    public final ayk a() {
        return axv.c(this.e).b();
    }

    public final ayk b() {
        return axv.c(this.e).c();
    }

    public final bkx c(azp azpVar, lig ligVar) {
        lig ligVarD = d(ligVar, this.b, e());
        return (bkx) ((bkx) ((bkx) ((bkx) new bkx().x(azpVar)).H()).p()).t(ligVarD.a, ligVarD.b);
    }
}

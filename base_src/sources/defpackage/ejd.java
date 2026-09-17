package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.SystemClock;
import com.google.android.libraries.vision.opengl.Texture;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class ejd implements GLSurfaceView.Renderer, lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/imax/ImaxSceneRenderer");
    public final int b;
    public Texture d;
    public SurfaceTexture e;
    public ejk f;
    public final AtomicBoolean h;
    public final eij i;
    public final eir j;
    public final ein k;
    private final Context l;
    private float o;
    private float p;
    private long q;
    private final ArrayList r;
    private final lap s;
    private final egs t;
    private final ejm u;
    private final ejx v;
    private final ehw w;
    private final egy y;
    public final int c = ejn.a;
    private final float[] m = new float[16];
    private final float[] n = new float[16];
    private final SurfaceTexture.OnFrameAvailableListener x = new ejc(this);
    public final pih g = pih.f();

    public ejd(egs egsVar, egy egyVar, ejm ejmVar, ehw ehwVar, eij eijVar, eir eirVar, ein einVar, eja ejaVar, eit eitVar, eip eipVar, eil eilVar, Context context) {
        this.q = 0L;
        this.t = egsVar;
        this.y = egyVar;
        this.v = ejmVar.b;
        this.u = ejmVar;
        this.w = ehwVar;
        this.i = eijVar;
        this.j = eirVar;
        this.k = einVar;
        this.l = context;
        ArrayList arrayList = new ArrayList();
        this.r = arrayList;
        this.s = new lap();
        this.h = new AtomicBoolean(false);
        this.q = SystemClock.elapsedRealtime();
        double d = ejn.a;
        double dA = ejmVar.a();
        Double.isNaN(d);
        this.b = (int) ((d * dA) / 360.0d);
        eijVar.h = ehwVar.k();
        arrayList.add(eirVar);
        arrayList.add(einVar);
        arrayList.add(ejaVar);
        arrayList.add(eitVar);
        arrayList.add(eipVar);
        arrayList.add(eilVar);
    }

    private final float a(float f) {
        return (this.i.d / this.o) * f;
    }

    private final float b(float f) {
        return (this.i.e / this.p) * f;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.s.close();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((eii) arrayList.get(i)).a();
        }
        EGL14.eglReleaseThread();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float f;
        float f2;
        float f3;
        if (this.s.a()) {
            return;
        }
        GLES20.glDisable(3042);
        if (this.h.getAndSet(false)) {
            SurfaceTexture surfaceTexture = this.e;
            obr.ao(surfaceTexture);
            this.t.d();
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(this.m);
            long timestamp = surfaceTexture.getTimestamp();
            this.f.a.f(this.n);
            this.f.a.e(this.m);
            this.t.a(this.m, timestamp);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.q;
        this.q = jElapsedRealtime;
        float fAbs = Math.abs(this.w.g());
        float fMin = Math.min((jElapsedRealtime - j) * (((Math.min(fAbs, 0.15f) / 0.15f) * 2.4300002E-4f) + 7.0E-6f), fAbs - this.i.g);
        eij eijVar = this.i;
        float f4 = eijVar.g + fMin;
        eijVar.g = f4;
        if (f4 > 1.0f) {
            eijVar.g = 1.0f;
        }
        ehw ehwVar = this.w;
        boolean z = !ehwVar.e.get() || ehwVar.a.d.getCaptureProgress() >= 0.0f;
        eijVar.m = z;
        Matrix.setRotateEulerM(this.i.f, 0, 0.0f, 0.0f, (float) (-this.w.o));
        eij eijVar2 = this.i;
        if (eijVar2.h) {
            float f5 = eijVar2.g;
            float f6 = eijVar2.q;
            float fMax = Math.max(f5 + f6, f6 + f6);
            float f7 = this.b;
            f = (f7 + f7) / (this.c * fMax);
        } else {
            float f8 = eijVar2.g;
            float f9 = eijVar2.p;
            float fMax2 = Math.max(f8 + f9, f9 + f9);
            float f10 = this.i.a;
            f = ((f10 + f10) * this.b) / (this.c * fMax2);
        }
        eij eijVar3 = this.i;
        eijVar3.getClass();
        boolean z2 = eijVar3.h;
        if (z2) {
            f2 = 0.9f * f;
            eijVar3.d = f2;
            f3 = (f / this.o) * this.p;
            eijVar3.e = f3;
        } else {
            float f11 = 0.9f * f;
            eijVar3.e = f11;
            float f12 = (f / this.p) * this.o;
            eijVar3.d = f12;
            f2 = f12;
            f3 = f11;
        }
        float f13 = (float) this.w.f;
        if (z2) {
            eijVar3.b = (f13 / this.o) * f2;
            boolean z3 = eijVar3.m;
            float fMin2 = Math.min(1.0f - (f3 * 0.5f), b(eijVar3.g * (this.p + 360.0f)) * 0.5f) - b((float) this.w.g);
            if (!z3) {
                fMin2 = -fMin2;
            }
            eijVar3.c = fMin2;
        } else {
            boolean z4 = eijVar3.m;
            float fMin3 = Math.min(eijVar3.a - (f2 * 0.5f), a(eijVar3.g * (this.o + 360.0f)) * 0.5f) - a((float) this.w.g);
            if (!z4) {
                fMin3 = -fMin3;
            }
            eijVar3.b = fMin3;
            eij eijVar4 = this.i;
            eijVar4.c = ((-f13) / this.p) * eijVar4.e;
        }
        eij eijVar5 = this.i;
        eijVar5.n = eijVar5.o != null && this.w.j();
        this.f.b();
        eij eijVar6 = this.i;
        GLES20.glViewport(0, 0, eijVar6.j, eijVar6.k);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((eii) arrayList.get(i)).b();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        eij eijVar = this.i;
        eijVar.j = i;
        eijVar.k = i2;
        eijVar.a = i / i2;
        int rotation = ((Activity) this.l).getWindowManager().getDefaultDisplay().getRotation() * 90;
        Matrix.setRotateEulerM(this.n, 0, 0.0f, 0.0f, -rotation);
        ehw ehwVar = this.w;
        ehwVar.n = rotation;
        this.i.h = ehwVar.k();
        if (this.i.h) {
            double dA = this.u.a();
            ejx ejxVar = this.v;
            this.p = (((float) dA) * ejxVar.b) / ejxVar.a;
            this.o = (float) this.u.a();
        } else {
            double dA2 = this.u.a();
            ejx ejxVar2 = this.v;
            this.o = (((float) dA2) * ejxVar2.b) / ejxVar2.a;
            this.p = (float) this.u.a();
        }
        eij eijVar2 = this.i;
        eijVar2.l = eijVar2.h ? eijVar2.k / eijVar2.j : 1.0f;
        eijVar2.p = this.o / 360.0f;
        eijVar2.q = this.p / 360.0f;
        this.t.b(i, i2);
        this.f.c(i, i2);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((eii) arrayList.get(i3)).c(i, i2);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        ejx ejxVar = this.v;
        this.d = new Texture(ejxVar.a, ejxVar.b, 36197);
        this.f = new ejk(this.d, this.i);
        SurfaceTexture surfaceTexture = this.e;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.e = null;
        }
        Texture texture = this.d;
        obr.ao(texture);
        final SurfaceTexture surfaceTexture2 = new SurfaceTexture(texture.getName());
        ejx ejxVar2 = this.v;
        surfaceTexture2.setDefaultBufferSize(ejxVar2.a, ejxVar2.b);
        surfaceTexture2.setOnFrameAvailableListener(this.x);
        this.e = surfaceTexture2;
        this.g.o(surfaceTexture2);
        this.s.c(new lie() { // from class: ejb
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                ejd ejdVar = this.a;
                surfaceTexture2.release();
                ejdVar.e = null;
                Texture texture2 = ejdVar.d;
                obr.ao(texture2);
                texture2.delete();
                ejdVar.f.a();
            }
        });
        this.t.e(this.y);
        egs egsVar = this.t;
        Texture texture2 = this.d;
        obr.ao(texture2);
        egsVar.c(texture2, this.v);
    }
}

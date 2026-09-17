package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.R;
import com.google.android.apps.camera.legacy.lightcycle.ui.PhotoSphereMessageOverlay;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class fdm implements GLSurfaceView.Renderer {
    public feg E;
    public fdj F;
    public fcr H;
    public fcr I;
    private final fds J;
    private int Z;
    public fcp a;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private final gvb ai;
    private fea ak;
    private fea al;
    private final Context as;
    public fdr c;
    public final fdv d;
    public final PhotoSphereMessageOverlay e;
    public fco f;
    public fco g;
    public fdt h;
    public fej i;
    public fcs j;
    public feh k;
    public int o;
    public int p;
    public final fdp b = new fdp();
    private final float[] K = new float[16];
    private final float[] L = new float[16];
    private final float[] M = new float[16];
    private final float[] N = new float[16];
    private final float[] O = new float[16];
    private final float[] P = new float[16];
    private final float[] Q = new float[16];
    private final float[] R = new float[16];
    private float[] S = new float[16];
    private float T = 60.0f;
    private float U = 100.0f;
    private float V = 100.0f;
    private int W = R.styleable.AppCompatTheme_windowFixedHeightMajor;
    private int X = 80;
    public boolean l = false;
    public boolean m = false;
    private boolean Y = false;
    public boolean n = true;
    private boolean ae = false;
    private int af = 0;
    private boolean ag = false;
    public boolean q = false;
    private final ArrayList ah = new ArrayList();
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public int G = 1;
    public boolean u = false;
    private boolean aj = false;
    public boolean v = false;
    public boolean w = false;
    public int x = com.google.android.GoogleCameraEngR18F1.R.string.hit_target_to_start;
    private final fcw aw = new fcw();
    private boolean am = false;
    private long an = 0;
    private boolean ao = false;
    public fdw y = null;
    public boolean z = false;
    public int A = 0;
    public int B = 0;
    public byte[] C = null;
    public boolean D = false;
    private double ap = 0.0d;
    private double aq = 0.0d;
    private final Vector ar = new Vector();
    private int at = 0;
    private float au = -1.0f;
    private final HashMap av = new HashMap();

    public fdm(Context context, fds fdsVar, PhotoSphereMessageOverlay photoSphereMessageOverlay, gvb gvbVar) {
        this.as = context;
        this.J = fdsVar;
        this.e = photoSphereMessageOverlay;
        this.ai = gvbVar;
        this.d = new fdv(context);
    }

    private final float g(float f) {
        int i = this.ab;
        if (i >= this.ac) {
            return f;
        }
        double dTan = Math.tan(Math.toRadians(f) / 2.0d);
        double d = i;
        Double.isNaN(d);
        double d2 = d / (dTan + dTan);
        double d3 = this.ac;
        Double.isNaN(d3);
        double dAtan = Math.atan(d3 / (d2 + d2));
        return (float) Math.toDegrees(dAtan + dAtan);
    }

    private final synchronized void h(boolean z) {
        float[] fArrProcessFrame;
        fdt fdtVar;
        String strAddImage;
        fdt fdtVar2 = this.h;
        if (fdtVar2 != null && this.m) {
            fdw fdwVar = this.y;
            byte[] bArr = this.C;
            int i = this.A;
            int i2 = this.B;
            boolean z2 = fdtVar2.h && this.F.s;
            if (bArr != null) {
                synchronized (fcz.a) {
                    if (!fcz.b.booleanValue()) {
                        throw new IllegalStateException("State is not ready.");
                    }
                    fArrProcessFrame = LightCycleNative.ProcessFrame(bArr, i, i2, z2);
                }
                fdwVar.c = fArrProcessFrame;
                fdwVar.a = fdwVar.c[0] != -1.0f;
                fdwVar.b = fcz.u();
            }
            this.at++;
            if (!z) {
                boolean z3 = this.y.a;
                this.ad = z3;
                this.ag = fcz.s();
                fdw fdwVar2 = this.y;
                if (fdwVar2.b && z3 && !this.t) {
                    float[] fArr = fdwVar2.c;
                    int iB = this.c.b(fArr);
                    synchronized (fcz.a) {
                        if (!fcz.b.booleanValue()) {
                            throw new IllegalStateException("State is not ready.");
                        }
                        strAddImage = LightCycleNative.AddImage(fArr);
                    }
                    int iE = this.c.e() - 1;
                    fdj fdjVar = this.F;
                    if (!fdjVar.r && fdjVar.s) {
                        fdjVar.E.add(strAddImage);
                        fdjVar.r = true;
                        new fdc(fdjVar).execute(new Void[0]);
                        fdjVar.D.add(fArr);
                        Vector vector = fdjVar.m;
                        vector.setSize(Math.max(iE + 1, vector.size()));
                        fdjVar.m.set(iE, Integer.valueOf(iB));
                    }
                    this.c.f(iE, false);
                    this.ah.add(Integer.valueOf(iE));
                    this.q = true;
                    i();
                    this.n = false;
                    this.e.a();
                    this.ao = false;
                    this.am = false;
                }
                if (this.r) {
                    if (this.ah.size() > 0) {
                        int iIntValue = ((Integer) this.ah.get(0)).intValue();
                        this.ah.remove(0);
                        this.c.f(iIntValue, true);
                    }
                    this.d.a();
                    this.e.d(this.w, this.F.n);
                    this.r = false;
                }
                if (!this.h.h) {
                    boolean zV = fcz.v();
                    int iC = fcz.c();
                    if (this.v || this.h.g || !zV || iC != 0) {
                        fdtVar = this.h;
                        if (fdtVar.g && (!zV || this.ag || iC != 0)) {
                            fdtVar.a();
                        }
                    } else {
                        fdj fdjVar2 = this.F;
                        if (fdjVar2.s) {
                            this.v = true;
                            fck fckVar = fdjVar2.c;
                            fdk fdkVar = new fdk(this);
                            if (fckVar.d) {
                                axh axhVarF = fckVar.b.f();
                                axhVarF.s = awv.AUTO;
                                fckVar.b.m(axhVarF);
                                fckVar.b.j(fckVar.a, fdkVar);
                            } else {
                                fdkVar.a(true, null);
                            }
                        } else {
                            iC = 0;
                            fdtVar = this.h;
                            if (fdtVar.g) {
                                fdtVar.a();
                            }
                        }
                    }
                    if (this.t) {
                        this.h.a();
                    }
                }
                this.z = false;
            }
        }
    }

    private final void i() {
        this.c.e();
        this.c.e();
    }

    private static final int j(int i, int i2) {
        return (i * 31) + i2;
    }

    private static final fea k(int i) {
        if (i == 2) {
            return new fec(true);
        }
        if (i == 3) {
            return new fec(false);
        }
        if (i == 1) {
            return new feb();
        }
        if (i == 5) {
            return new fdz();
        }
        if (i == 4) {
            return new fed();
        }
        return null;
    }

    private static final float l(float f, float f2) {
        double d = f2;
        double d2 = f;
        Double.isNaN(d2);
        double dTan = Math.tan(((d2 * 0.5d) / 180.0d) * 3.141592653589793d);
        Double.isNaN(d);
        return (float) (Math.atan(d * dTan) * 114.59155902616465d);
    }

    public final void a(float f) {
        e(f);
        this.T = this.U;
        this.l = false;
    }

    public final void b() {
        a(this.U / this.T);
    }

    public final void c() {
        this.q = false;
    }

    public final synchronized void d() {
        int iE = this.c.e();
        fdr fdrVar = this.c;
        synchronized (fdrVar.g) {
            if (fdrVar.g.size() > 0) {
                Vector vector = fdrVar.g;
                vector.removeElementAt(vector.size() - 1);
            }
        }
        while (this.ar.size() > iE) {
            Vector vector2 = this.ar;
            vector2.removeElementAt(vector2.size() - 1);
        }
        if (this.ar.size() == iE) {
            double dDoubleValue = this.ap - ((Double) this.ar.lastElement()).doubleValue();
            this.ap = dDoubleValue;
            this.aq = dDoubleValue / 45.0d;
            Vector vector3 = this.ar;
            vector3.removeElementAt(vector3.size() - 1);
        }
        i();
        fdl fdlVar = new fdl(this);
        fdlVar.start();
        try {
            fdlVar.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public final void e(float f) {
        float f2 = this.T / f;
        this.U = f2;
        float fMin = Math.min(f2, this.W);
        this.U = fMin;
        float fMax = Math.max(fMin, this.X);
        this.U = fMax;
        this.V = g(fMax);
    }

    public final void f(int i) {
        int i2 = this.G;
        this.G = i;
        this.w = false;
        this.x = com.google.android.GoogleCameraEngR18F1.R.string.hit_target_to_start;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i3) {
            case 0:
                this.d.e(0);
                break;
            case 1:
                this.x = com.google.android.GoogleCameraEngR18F1.R.string.tap_to_start;
                this.e.a();
                this.d.e(1);
                this.aj = true;
                this.aw.b();
                break;
            case 2:
                this.x = com.google.android.GoogleCameraEngR18F1.R.string.tap_to_start;
                this.e.a();
                this.d.e(2);
                this.aj = true;
                this.aw.b();
                break;
            case 3:
                this.x = com.google.android.GoogleCameraEngR18F1.R.string.tap_to_start;
                this.e.a();
                this.d.e(3);
                this.aj = true;
                this.aw.b();
                break;
            case 4:
                this.e.a();
                this.d.e(4);
                this.aj = true;
                this.aw.b();
                break;
            case 5:
                this.e.d(false, this.F.n);
                this.w = true;
                break;
        }
        this.ak = k(i2);
        this.al = k(i);
    }

    /* JADX WARN: Code duplicated, block: B:229:0x0859  */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        boolean zBooleanValue;
        float[] fArr;
        if (!this.m || this.s || this.ab == 0) {
            return;
        }
        GLES20.glClear(16384);
        if (!this.m || this.s) {
            return;
        }
        synchronized (fcz.a) {
            zBooleanValue = fcz.b.booleanValue();
        }
        if (zBooleanValue) {
            if (!this.ae) {
                kus.d();
                int iD = kus.d();
                fcz.i(iD, this.A, this.B);
                fdp fdpVar = this.b;
                fdpVar.d.clear();
                kus kusVar = new kus((char[]) null);
                fdpVar.k.add(kusVar);
                fdpVar.d.add(0, kusVar);
                ((kus) fdpVar.d.get(0)).a = iD;
                this.ae = true;
                int iC = kus.c();
                this.p = iC;
                fcz.i(iC, this.A, this.B);
                int iC2 = kus.c();
                this.o = iC2;
                fcz.i(iC2, this.A, this.B);
            }
            if (!this.q && this.z) {
                if (this.G != 1 || this.u) {
                    h(false);
                } else {
                    h(true);
                }
            }
            if (this.n) {
                this.E.c(0.0d);
            } else {
                double d = this.ap;
                if (d != 0.0d) {
                    double dAbs = Math.abs(d);
                    double dAbs2 = Math.abs(this.aq);
                    if (dAbs < dAbs2 + dAbs2) {
                        feg fegVar = this.E;
                        fegVar.c(fegVar.a() + this.ap);
                        this.ap = 0.0d;
                    } else {
                        feg fegVar2 = this.E;
                        fegVar2.c(fegVar2.a() + this.aq);
                        this.ap -= this.aq;
                    }
                }
            }
            float[] fArrF = this.E.f();
            this.S = fArrF;
            fcz.m(fArrF);
            if (this.D) {
                fcz.q(this.p);
            }
            if (this.af > 0) {
                int i = this.p;
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                float f = this.ab / this.ac;
                float f2 = this.V;
                double dA = this.aw.a();
                if (this.G != 1) {
                    if (this.aj) {
                        double d2 = this.V;
                        Double.isNaN(d2);
                        f2 = (float) (d2 + (dA * 18.0d));
                    } else {
                        double d3 = this.V;
                        Double.isNaN(d3);
                        f2 = (float) (d3 + ((1.0d - dA) * 18.0d));
                    }
                }
                double d4 = f2;
                Double.isNaN(d4);
                float fTan = ((float) Math.tan((d4 / 360.0d) * 3.141592653589793d)) * 0.1f;
                float f3 = fTan * f;
                Matrix.frustumM(this.M, 0, -f3, f3, -fTan, fTan, 0.1f, 200.0f);
                Matrix.setIdentityM(this.N, 0);
                Matrix.rotateM(this.N, 0, this.ai.f().a() - this.E.k, 0.0f, 0.0f, 1.0f);
                Matrix.multiplyMM(this.K, 0, this.M, 0, this.N, 0);
                if (!this.Y) {
                    Matrix.orthoM(this.P, 0, 0.0f, this.ab, 0.0f, this.ac, -50.0f, 50.0f);
                    Integer numValueOf = Integer.valueOf(j(this.ab, this.ac));
                    fdt fdtVar = (fdt) this.av.get(numValueOf);
                    if (fdtVar != null) {
                        this.h = fdtVar;
                    } else {
                        fdt fdtVar2 = new fdt(this.as, this.E, this.ab, this.ac);
                        this.h = fdtVar2;
                        this.av.put(numValueOf, fdtVar2);
                        this.av.put(Integer.valueOf(j(this.ac, this.ab)), new fdt(this.as, this.E, this.ac, this.ab));
                    }
                    fdv fdvVar = this.d;
                    int i2 = this.ab;
                    int i3 = this.ac;
                    fdt fdtVar3 = this.h;
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = false;
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(fdvVar.c.getResources(), com.google.android.GoogleCameraEngR18F1.R.drawable.pano_target_default, options);
                    if (bitmapDecodeResource != null) {
                        bitmapDecodeResource.recycle();
                    }
                    fdvVar.e = new fct();
                    fdvVar.e.g(fdvVar.c, com.google.android.GoogleCameraEngR18F1.R.drawable.pano_target_default, -1.0f);
                    fdvVar.f = new fct();
                    fdvVar.f.g(fdvVar.c, com.google.android.GoogleCameraEngR18F1.R.drawable.pano_target_activated, -1.0f);
                    try {
                        fdvVar.g = new fei();
                        fdvVar.h = new feh();
                    } catch (fcq e) {
                        e.printStackTrace();
                    }
                    fct fctVar = fdvVar.e;
                    fei feiVar = fdvVar.g;
                    fctVar.e = feiVar;
                    fdvVar.f.e = feiVar;
                    fdvVar.m = i2 / 2.0f;
                    fdvVar.n = i3 / 2.0f;
                    Matrix.setIdentityM(fdvVar.w, 0);
                    fdvVar.x = fdtVar3;
                    this.d.q = this.E;
                    Context context = this.as;
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inScaled = false;
                    options2.inJustDecodeBounds = true;
                    BitmapFactory.decodeResource(context.getResources(), com.google.android.GoogleCameraEngR18F1.R.drawable.focus_quadrant_1, options2);
                    int iA = (int) (new axn(options2.outWidth, options2.outHeight).a() * 0.85f);
                    int i4 = this.ac / 2;
                    float f4 = this.ab / 2;
                    PointF pointF = new PointF(f4, i4 + iA);
                    PointF pointF2 = new PointF(f4, i4 - iA);
                    this.f = new fco();
                    this.g = new fco();
                    this.f.g(this.as, com.google.android.GoogleCameraEngR18F1.R.drawable.pano_alignhint_up, -1.0f);
                    this.g.g(this.as, com.google.android.GoogleCameraEngR18F1.R.drawable.pano_alignhint_down, -1.0f);
                    this.f.b(pointF);
                    this.g.b(pointF2);
                    try {
                        this.k = new feh();
                    } catch (fcq e2) {
                        e2.printStackTrace();
                    }
                    fco fcoVar = this.f;
                    feh fehVar = this.k;
                    fcoVar.e = fehVar;
                    this.g.e = fehVar;
                    this.Y = true;
                }
                fdp fdpVar2 = this.b;
                fdpVar2.l = true;
                if (this.D) {
                    fdpVar2.m = true;
                } else {
                    fdpVar2.m = false;
                }
                boolean z = this.at > 3;
                boolean z2 = this.c.e() == 0 && z;
                this.D = z2;
                if (!z2) {
                    this.b.m = false;
                }
                fdp fdpVar3 = this.b;
                fdpVar3.l = z;
                fdpVar3.e(i);
                fds fdsVar = this.J;
                boolean z3 = this.c.e() > 0 && !this.F.A.b;
                if (z3 != fdsVar.a) {
                    fdsVar.a = z3;
                }
                GLES20.glViewport(0, 0, this.Z, this.aa);
                GLES20.glClear(256);
                GLES20.glEnable(2929);
                try {
                    Matrix.multiplyMM(this.O, 0, this.N, 0, this.S, 0);
                    Matrix.multiplyMM(this.K, 0, this.M, 0, this.O, 0);
                    GLES20.glLineWidth(2.0f);
                    this.a.c(this.K);
                    GLES20.glDisable(2929);
                    GLES20.glEnable(3042);
                    this.c.a(this.K);
                    Matrix.setIdentityM(this.N, 0);
                    Matrix.rotateM(this.N, 0, this.ai.f().a() - this.E.k, 0.0f, 0.0f, 1.0f);
                    Matrix.rotateM(this.N, 0, 180.0f, 1.0f, 0.0f, 0.0f);
                    Matrix.multiplyMM(this.L, 0, this.M, 0, this.N, 0);
                    this.j.j(fcj.c);
                    if ((!this.l && this.ad) || this.n) {
                        this.i.c();
                        this.i.j(1.0f);
                        this.b.a(this.L);
                    }
                    fdv fdvVar2 = this.d;
                    fdvVar2.l = this.S;
                    float[] fArr2 = this.K;
                    float[] fArr3 = this.P;
                    int iF = fcz.f();
                    if (iF >= 0) {
                        float f5 = fdvVar2.o;
                        fdvVar2.o = f5 + ((1.0f - f5) * 0.1f);
                    } else {
                        fdvVar2.o = 0.0f;
                    }
                    float fMax = ((((Math.max(Math.min((float) Math.sqrt(fdvVar2.q.m), 0.6981317f), 0.17453292f) - 0.17453292f) / 0.5235988f) * 0.75f) + 2.75f) * 0.017453292f;
                    synchronized (fcz.a) {
                        if (!fcz.b.booleanValue()) {
                            throw new IllegalStateException("State is not ready.");
                        }
                        LightCycleNative.SetTargetHitAngleRadians(fMax);
                    }
                    float[] fArr4 = fdvVar2.l;
                    jub jubVar = new jub(-fArr4[2], -fArr4[6], -fArr4[10]);
                    GLES20.glBlendFunc(1, 771);
                    fdvVar2.g.c();
                    GLES20.glUniform1f(fdvVar2.g.e, 1.0f);
                    fdvVar2.g.j(1.0f);
                    try {
                        synchronized (fdvVar2.d) {
                            for (Map.Entry entry : fdvVar2.d.entrySet()) {
                                float[] fArr5 = (float[]) entry.getValue();
                                Matrix.multiplyMM(fdvVar2.k, 0, fArr2, 0, fArr5, 0);
                                Matrix.multiplyMV(fdvVar2.j, 0, fdvVar2.k, 0, fdvVar2.i, 0);
                                fdu fduVar = fdvVar2.r;
                                jub jubVar2 = new jub(-fArr5[8], -fArr5[9], -fArr5[10]);
                                float fAcos = (float) Math.acos((jubVar2.a * jubVar.a) + (jubVar2.b * jubVar.b) + (jubVar2.c * jubVar.c));
                                if (fAcos < fdv.b) {
                                    fduVar.a = 1.0f;
                                    fduVar.b = 1.0f;
                                } else if (fAcos < fdv.a) {
                                    float f6 = 1.0f - ((fAcos - fdv.b) / (fdv.a - fdv.b));
                                    fduVar.a = f6 + 0.0f;
                                    fduVar.b = (f6 * 0.6f) + 0.4f;
                                } else {
                                    fduVar.a = 0.0f;
                                    fduVar.b = 0.4f;
                                }
                                float fMax2 = !fdvVar2.p ? fdvVar2.r.a : 1.0f;
                                float f7 = fdvVar2.r.b;
                                if (fdvVar2.d.size() == 1) {
                                    fMax2 = Math.max(0.75f, fMax2);
                                    fArr3 = fArr3;
                                    f7 = 1.0f;
                                } else if (!fdvVar2.s || fdvVar2.p) {
                                    fArr3 = fArr3;
                                } else {
                                    fMax2 = Math.max(fdvVar2.u, fMax2);
                                    if (fdvVar2.t) {
                                        float f8 = fdvVar2.u;
                                        float f9 = f8 + ((1.0f - f8) * 0.01f);
                                        fdvVar2.u = f9;
                                        if (f9 > 0.9f) {
                                            if (fdvVar2.v == 0) {
                                                fdvVar2.v = SystemClock.elapsedRealtimeNanos();
                                            } else {
                                                double dElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - fdvVar2.v;
                                                Double.isNaN(dElapsedRealtimeNanos);
                                                if (dElapsedRealtimeNanos / 1.0E9d > 0.5d) {
                                                    fdvVar2.t = false;
                                                }
                                                fdvVar2.u = 0.9f;
                                            }
                                        }
                                    } else {
                                        fdvVar2.u *= 0.985f;
                                    }
                                    if (fdvVar2.u < 0.01f) {
                                        fdvVar2.u = 0.0f;
                                        fdvVar2.s = false;
                                    }
                                }
                                float[] fArr6 = fdvVar2.j;
                                if (fArr6[3] >= 0.0f) {
                                    fdv.c(fArr6);
                                    float[] fArr7 = fdvVar2.j;
                                    float f10 = fArr7[0];
                                    float f11 = fdvVar2.m;
                                    float f12 = (f10 * f11) + f11;
                                    float f13 = fArr7[1];
                                    float f14 = fdvVar2.n;
                                    float f15 = (f13 * f14) + f14;
                                    if (((Integer) entry.getKey()).intValue() == iF) {
                                        fdvVar2.g.j(fMax2);
                                        float[] fArr8 = fArr3;
                                        fdvVar2.f.f(fArr8, f12, f15, f7);
                                        fdvVar2.g.j(1.0f - fMax2);
                                        fdvVar2.e.f(fArr8, f12, f15, f7);
                                        fdvVar2.g.j(1.0f);
                                        fArr3 = fArr8;
                                    } else {
                                        float[] fArr9 = fArr3;
                                        fdvVar2.g.j(fMax2);
                                        fdvVar2.e.f(fArr9, f12, f15, f7);
                                        fArr3 = fArr9;
                                    }
                                } else {
                                    fArr3 = fArr3;
                                }
                            }
                            fArr = fArr3;
                        }
                        fdt fdtVar4 = fdvVar2.x;
                        if (fdtVar4 != null && fdtVar4.i) {
                            if (fdtVar4.g) {
                                double dElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - fdtVar4.c;
                                Double.isNaN(dElapsedRealtimeNanos2);
                                int i5 = ((int) (((long) ((int) (dElapsedRealtimeNanos2 / 1000000.0d))) / 400)) + 1;
                                fdtVar4.f = i5;
                                if (i5 >= fdtVar4.a.size() - 1) {
                                    fdtVar4.g = false;
                                    fdtVar4.h = true;
                                    double dElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos() - fdtVar4.c;
                                    Double.isNaN(dElapsedRealtimeNanos3);
                                    int i6 = (int) (dElapsedRealtimeNanos3 / 1000000.0d);
                                    feg fegVar3 = fdtVar4.b;
                                    float[] fArrW = fcz.w(fegVar3.e(), fegVar3.i, i6);
                                    float f16 = fArrW[0];
                                    float f17 = fArrW[1];
                                    float f18 = fArrW[2];
                                    StringBuilder sb = new StringBuilder(56);
                                    sb.append("Bias : ");
                                    sb.append(f16);
                                    sb.append(", ");
                                    sb.append(f17);
                                    sb.append(", ");
                                    sb.append(f18);
                                    sb.toString();
                                    fdtVar4.f = fdtVar4.a.size() - 1;
                                }
                            }
                            GLES20.glEnable(3042);
                            fdtVar4.d.c();
                            if (fdtVar4.g) {
                                GLES20.glBlendFunc(1, 771);
                                fdtVar4.d.j(1.2f);
                            } else {
                                GLES20.glBlendFunc(770, 771);
                                fdtVar4.d.j(0.5f);
                            }
                            fct fctVar2 = (fct) fdtVar4.a.get(fdtVar4.f);
                            float f19 = fdtVar4.e.x;
                            float f20 = fdtVar4.e.y;
                            if (fctVar2.l) {
                                fcr fcrVar = fctVar2.e;
                                if (fcrVar != null) {
                                    fcrVar.c();
                                    fctVar2.e.g(fctVar2.a);
                                    fctVar2.e.e(fctVar2.b);
                                    Matrix.translateM(fctVar2.j, 0, fArr, 0, f19 + fctVar2.h, f20 + fctVar2.i, 0.0f);
                                    Matrix.rotateM(fctVar2.j, 0, 0.0f, 0.0f, 0.0f, 1.0f);
                                    fctVar2.e.f(fctVar2.j);
                                    if (fctVar2.d.size() != 0) {
                                        kus kusVar2 = (kus) fctVar2.d.get(0);
                                        fcr fcrVar2 = fctVar2.e;
                                        kusVar2.f();
                                        GLES20.glDrawElements(4, fctVar2.k, 5123, fctVar2.c);
                                    }
                                }
                            } else {
                                ((oug) ((oug) fct.f.b()).G((char) 1644)).o("Sprite not initialized.");
                            }
                        }
                    } catch (fcq e3) {
                        e3.printStackTrace();
                    }
                    GLES20.glBlendFunc(770, 771);
                    if (this.G != 1 && !this.u) {
                        double dA2 = this.aw.a();
                        Matrix.multiplyMM(this.L, 0, this.M, 0, this.N, 0);
                        if (this.aj) {
                            this.ak.a(1.0f - ((float) dA2), this.d, this.P, this.ab, this.ac);
                            fcw fcwVar = this.aw;
                            if (fcwVar.a) {
                                fcwVar.b();
                                this.aj = false;
                            }
                        } else {
                            this.al.a((float) dA2, this.d, this.P, this.ab, this.ac);
                        }
                    }
                    GLES20.glDisable(3042);
                    GLES20.glDisable(2929);
                    GLES20.glBlendFunc(770, 771);
                    GLES20.glDisable(2929);
                    GLES20.glEnable(3042);
                    int iC3 = fcz.c();
                    if (iC3 == 0) {
                        if (!this.ao && fcz.t()) {
                            this.ao = true;
                            this.am = false;
                        }
                        if (this.ao && !fcz.t()) {
                            this.ao = false;
                            this.am = true;
                            this.an = SystemClock.elapsedRealtimeNanos();
                        }
                        if (this.am) {
                            double dElapsedRealtimeNanos4 = SystemClock.elapsedRealtimeNanos() - this.an;
                            Double.isNaN(dElapsedRealtimeNanos4);
                            if (dElapsedRealtimeNanos4 / 1.0E9d > 0.25d) {
                                this.am = false;
                                PhotoSphereMessageOverlay photoSphereMessageOverlay = this.e;
                                TextView textView = (TextView) photoSphereMessageOverlay.findViewById(com.google.android.GoogleCameraEngR18F1.R.id.short_info_message);
                                photoSphereMessageOverlay.c(com.google.android.GoogleCameraEngR18F1.R.string.too_fast);
                                photoSphereMessageOverlay.a.postDelayed(new fep(textView), 750L);
                                iC3 = 0;
                            } else {
                                iC3 = 0;
                            }
                        } else {
                            iC3 = 0;
                        }
                    }
                    int i7 = this.G;
                    boolean z4 = i7 == 2 || i7 == 3 || i7 == 4;
                    if (this.n && !z4) {
                        float[] fArr10 = this.P;
                        float f21 = -this.E.f()[6];
                        GLES20.glEnable(3042);
                        if (f21 > 0.34906584f) {
                            try {
                                this.k.c();
                                this.k.j(0.5f);
                                this.g.a(fArr10);
                            } catch (fcq e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (f21 < -0.34906584f) {
                            this.k.c();
                            this.k.j(0.5f);
                            this.f.a(fArr10);
                        }
                    }
                    if (iC3 != 0) {
                        boolean z5 = iC3 == -1;
                        PhotoSphereMessageOverlay photoSphereMessageOverlay2 = this.e;
                        photoSphereMessageOverlay2.a.post(new feq(photoSphereMessageOverlay2, z5));
                    } else {
                        PhotoSphereMessageOverlay photoSphereMessageOverlay3 = this.e;
                        photoSphereMessageOverlay3.a.post(new fer(photoSphereMessageOverlay3, 0));
                    }
                } catch (fcq e5) {
                    e5.printStackTrace();
                }
            }
            int i8 = this.p;
            this.p = this.o;
            this.o = i8;
            this.af++;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        if (i == this.ab && i2 == this.ac) {
            return;
        }
        this.ab = i;
        this.ac = i2;
        this.Z = i;
        this.aa = i2;
        this.Y = false;
        this.z = false;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            float fA = this.au;
            if (fA < 0.0f) {
                fA = this.F.a();
                this.au = fA;
            }
            this.U = l(fA, 1.7f);
            this.W = (int) l(this.au, 2.5f);
            this.X = (int) l(this.au, 1.1f);
            float f = this.U;
            this.T = f;
            this.V = g(f);
            this.H = new fcr((byte[]) null);
            this.j = new fcs();
            this.I = new fcr((char[]) null);
            this.i = new fej();
            this.j.j(fcj.a);
            this.c = new fdr(this.b);
            new BitmapFactory.Options().inScaled = false;
            this.a = new fdn();
            fdp fdpVar = this.b;
            fdpVar.e = this.i;
            fdpVar.j = this.j;
            if (this.D) {
                fdpVar.m = true;
                fdpVar.l = true;
            }
            Matrix.setIdentityM(this.Q, 0);
            float[] fArr = this.Q;
            fArr[0] = 0.0f;
            fArr[1] = -1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            Matrix.setIdentityM(this.S, 0);
            GLES20.glClearColor(fcj.b[0], fcj.b[1], fcj.b[2], fcj.b[3]);
            this.m = true;
            if (this.w) {
                this.e.d(true, 0);
            }
            Matrix.setIdentityM(this.R, 0);
        } catch (fcq e) {
            e.printStackTrace();
        }
        this.z = false;
    }
}

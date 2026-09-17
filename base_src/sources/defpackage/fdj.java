package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.location.Location;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final class fdj implements View.OnClickListener {
    public static final ouj a = ouj.h("com/google/android/apps/camera/legacy/lightcycle/panorama/LightCycleController");
    public final fcx A;
    public fet B;
    public final khx J;
    private float K;
    private final fix L;
    private final LocalSessionStorage M;
    public fdm b;
    public final fck c;
    public boolean d;
    public float e;
    public float f;
    public final feg g;
    public double h;
    public double i;
    public boolean j;
    public int k;
    public FileWriter o;
    public final Context p;
    public final ddf q;
    public dyi t;
    public boolean v;
    public final Handler y;
    public final HandlerThread z;
    public final Semaphore l = new Semaphore(0);
    public final Vector m = new Vector(100);
    public int n = 0;
    public boolean r = false;
    public boolean s = false;
    public boolean u = false;
    public fet w = null;
    public fet x = null;
    public final List C = new ArrayList();
    public final List D = new ArrayList();
    public final List E = new ArrayList();
    public final fdo F = new fdo();
    public boolean G = false;
    public final fde I = new fde(this);
    private final awc N = new fdd();
    private final fde P = new fde(this);
    private final awc O = new fdg(this);
    public final Handler H = mip.bV(Looper.getMainLooper());

    public fdj(Context context, ddf ddfVar, fck fckVar, feg fegVar, LocalSessionStorage localSessionStorage, fcx fcxVar, fdm fdmVar, fix fixVar, khx khxVar, byte[] bArr, byte[] bArr2) {
        this.o = null;
        this.v = false;
        this.J = khxVar;
        this.p = context;
        this.q = ddfVar;
        this.g = fegVar;
        this.M = localSessionStorage;
        this.A = fcxVar;
        this.L = fixVar;
        try {
            this.o = new FileWriter(localSessionStorage.i);
        } catch (IOException e) {
            ((oug) ((oug) a.b()).G(1657)).r("Could not create file writer for : %s", this.M.i);
        }
        HandlerThread handlerThread = new HandlerThread("FileHandlerThread");
        this.z = handlerThread;
        handlerThread.start();
        this.y = mip.bV(handlerThread.getLooper());
        this.c = fckVar;
        if (fckVar == null) {
            return;
        }
        this.b = fdmVar;
        fdmVar.F = this;
        this.J.n().getDefaultDisplay();
        fdm fdmVar2 = this.b;
        fdmVar2.E = fegVar;
        fdmVar2.y = new fdw();
        this.g.l = new fda(this);
        this.F.c = fcv.c();
        this.v = ddfVar.k(ddw.c);
    }

    public static final float i(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public final float a() {
        float fB = b();
        if (fB > 0.0f) {
            return fB;
        }
        float f = this.K;
        if (f > 75.0f) {
            return 55.0f;
        }
        return f;
    }

    public final float b() {
        if (this.c == null) {
            throw new IllegalStateException("Cannot use stopped controller");
        }
        int iIntValue = ((Integer) this.q.a(ddw.a).c()).intValue();
        if (iIntValue > 0) {
            return iIntValue / 1000.0f;
        }
        fcu fcuVar = fcv.a;
        return fcv.a(this.K);
    }

    public final synchronized int c() {
        int i = this.n;
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        this.n = i - 1;
        List list = this.C;
        list.remove(list.size() - 1);
        try {
            this.o.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.M.i));
            StringBuilder sb = new StringBuilder();
            for (int i3 = 0; i3 < this.n; i3++) {
                sb.append(bufferedReader.readLine());
                sb.append("\n");
            }
            bufferedReader.close();
            FileWriter fileWriter = new FileWriter(this.M.i);
            this.o = fileWriter;
            fileWriter.write(sb.toString());
            this.o.flush();
        } catch (IOException e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G((char) 1655)).o("undo image exception:");
        }
        int i4 = this.n;
        if (i4 == 0) {
            this.u = false;
        } else {
            i2 = i4;
        }
        this.G = true;
        return i2;
    }

    public final void d(awl awlVar) {
        awlVar.o(this.H, this.P, this.N, this.O);
        ojc ojcVarD = this.L.d();
        List list = this.C;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Location location = (Location) ojcVarD.f();
        feg fegVar = this.g;
        float[] fArr = new float[16];
        jub jubVar = fegVar.c;
        SensorManager.getRotationMatrix(fArr, null, new float[]{jubVar.a, jubVar.b, jubVar.c}, fegVar.e);
        float[] fArr2 = new float[16];
        SensorManager.remapCoordinateSystem(fArr, 1, 3, fArr2);
        float[] fArr3 = new float[3];
        SensorManager.getOrientation(fArr2, fArr3);
        double d = fArr3[0] * 180.0f;
        Double.isNaN(d);
        list.add(new few(jCurrentTimeMillis, location, (int) (d / 3.141592653589793d)));
        this.G = false;
    }

    public final void e() {
        float[] fArrGetFrameGeometry;
        synchronized (fcz.a) {
            if (!fcz.b.booleanValue()) {
                throw new IllegalStateException("State is not ready.");
            }
            fArrGetFrameGeometry = LightCycleNative.GetFrameGeometry(2, 2);
        }
        fdp fdpVar = this.b.b;
        fdpVar.f = 6;
        fdpVar.a = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        fdpVar.b = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i = fdpVar.f;
        fdpVar.c = ByteBuffer.allocateDirect(i + i).order(ByteOrder.nativeOrder()).asShortBuffer();
        fdpVar.i = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asShortBuffer();
        int i2 = 0;
        for (int i3 = 0; i3 < 12; i3++) {
            fdpVar.a.put(i3, fArrGetFrameGeometry[i3]);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 2; i5++) {
            float f = i5;
            for (int i6 = 0; i6 < 2; i6++) {
                fdpVar.b.put(i4, i6);
                fdpVar.b.put(i4 + 1, f);
                i4 += 2;
            }
        }
        int i7 = 0;
        for (char c = 0; c <= 0; c = 1) {
            int i8 = 0;
            int i9 = 2;
            for (char c2 = 0; c2 <= 0; c2 = 1) {
                int i10 = i7 + 1;
                short s = (short) i8;
                fdpVar.c.put(i7, s);
                int i11 = i10 + 1;
                int i12 = i9 + 1;
                short s2 = (short) i12;
                fdpVar.c.put(i10, s2);
                int i13 = i11 + 1;
                fdpVar.c.put(i11, (short) i9);
                int i14 = i13 + 1;
                fdpVar.c.put(i13, s);
                int i15 = i14 + 1;
                i8++;
                fdpVar.c.put(i14, (short) i8);
                i7 = i15 + 1;
                fdpVar.c.put(i15, s2);
                i9 = i12;
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < 2) {
            fdpVar.i.put(i17, (short) i16);
            i16++;
            i17++;
        }
        while (i2 < 2) {
            fdpVar.i.put(i17, (short) (i2 + i2 + 1));
            i2++;
            i17++;
        }
        int i18 = 1;
        while (i18 >= 0) {
            fdpVar.i.put(i17, (short) (i18 + 2));
            i18--;
            i17++;
        }
        int i19 = 1;
        while (i19 >= 0) {
            fdpVar.i.put(i17, (short) (i19 + i19));
            i19--;
            i17++;
        }
        fdpVar.g = i17 - 1;
        fdpVar.h = true;
    }

    public final synchronized void f() {
        if (this.s) {
            this.s = false;
            this.b.s = true;
            fck fckVar = this.c;
            if (fckVar != null) {
                awl awlVar = fckVar.b;
                if (awlVar == null) {
                    fev.d(this.M.h, this.C);
                    try {
                        this.o.close();
                        return;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                if (awlVar.g().a() != 1) {
                    awl awlVar2 = fckVar.b;
                    if (!awlVar2.g().d()) {
                        awq awqVar = new awq();
                        try {
                            awlVar2.h().b(new awk(awlVar2, awqVar, 0), awqVar.b, "stop preview");
                        } catch (RuntimeException e2) {
                            awlVar2.d().c().c(e2);
                        }
                    }
                    fckVar.b.p(fckVar.a, null);
                    fckVar.b.k(true);
                    awl awlVar3 = fckVar.b;
                    awlVar3.c().sendMessageAtFrontOfQueue(awlVar3.c().obtainMessage(302));
                    awlVar3.c().sendEmptyMessage(305);
                }
                fckVar.e = null;
                fev.d(this.M.h, this.C);
                this.o.close();
                return;
                throw th;
            }
        } else {
            ((oug) ((oug) a.c()).G((char) 1658)).o("stopCamera invoked, but camera is already stopped!");
        }
    }

    public final void g() {
        this.K = this.c.b.b().getHorizontalViewAngle();
    }

    public final void h(int i) {
        String str = this.M.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                fcz.j(str, a());
                break;
            case 1:
                float fA = a();
                synchronized (fcz.a) {
                    LightCycleNative.ResetForHorizontalCapture(str, fA);
                    fcz.b = true;
                    break;
                }
                break;
            case 2:
                float fA2 = a();
                synchronized (fcz.a) {
                    LightCycleNative.ResetForVerticalCapture(str, fA2);
                    fcz.b = true;
                    break;
                }
                break;
            case 3:
                float fA3 = a();
                synchronized (fcz.a) {
                    LightCycleNative.ResetForWideCapture(str, fA3);
                    fcz.b = true;
                    break;
                }
                break;
            case 4:
                float fA4 = a();
                synchronized (fcz.a) {
                    LightCycleNative.ResetForFisheyeCapture(str, fA4);
                    fcz.b = true;
                    break;
                }
                break;
            default:
                fcz.j(str, a());
                break;
        }
        fdm fdmVar = this.b;
        fdmVar.d.d();
        fdmVar.e.a();
        if (i == 6) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            fdm fdmVar2 = this.b;
            fdmVar2.d.b(fArr);
            if (fdmVar2.n && fdmVar2.G == 1) {
                fdmVar2.e.c(fdmVar2.x);
            }
            fdmVar2.u = true;
        }
        this.u = false;
        this.n = 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}

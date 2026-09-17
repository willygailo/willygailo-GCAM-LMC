package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.jni.tracking.RoiTrackerNative;

/* JADX INFO: loaded from: classes2.dex */
public final class itg implements itq {
    private static final ouj a = ouj.h("com/google/android/apps/camera/tracking/RoiTrackerImpl");
    private boolean b;
    private final long c;
    private volatile long d;
    private volatile int e;
    private final ojc f;
    private final ojc g;

    public itg() {
        throw null;
    }

    public itg(ojc ojcVar, ojc ojcVar2, Context context) {
        this.f = ojcVar;
        this.g = ojcVar2;
        this.c = RoiTrackerNative.createHandle(context, context != null ? context.getCacheDir().getAbsolutePath() : "", (ojcVar2.g() ? (itr) ojcVar2.c() : itr.OPTICAL_FLOW).ordinal());
        this.d = 0L;
        this.e = 0;
    }

    @Override // defpackage.itq
    public final synchronized void a() {
        if (!this.b) {
            RoiTrackerNative.prepare(this.c);
        }
    }

    @Override // defpackage.itq
    public final synchronized void b() {
        if (this.b) {
            return;
        }
        RoiTrackerNative.stopTracking(this.c);
        if (this.f.g()) {
            ((itx) this.f.c()).a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable] */
    @Override // defpackage.itq
    public final synchronized itz c(mad madVar, PointF pointF) {
        if (this.b) {
            ((oug) ((oug) a.c()).G((char) 3155)).o("Cannot start tracking: tracker is closed");
            return itz.b();
        }
        this.d = madVar.d();
        this.e = 0;
        itr itrVar = this.g.g() ? (itr) this.g.c() : itr.OPTICAL_FLOW;
        if (this.f.g()) {
            if (!((itx) this.f.c()).b(new lig(madVar.c(), madVar.b()), madVar.d())) {
                ((oug) ((oug) a.c()).G((char) 3154)).o("Cannot start motion estimator for tracking");
            }
            hjz hjzVarB = ((itx) this.f.c()).a.b();
            if (hjzVarB != null && hjzVarB.c > 50000000 && hjzVarB.e > 350) {
                itrVar = itr.GYRO;
            }
        }
        mac macVar = (mac) madVar.g().get(0);
        mac macVar2 = (mac) madVar.g().get(1);
        mac macVar3 = (mac) madVar.g().get(2);
        int iC = madVar.c();
        int iB = madVar.b();
        float f = iC;
        float f2 = iB;
        float[] fArr = {(pointF.x * f) - 5.0f, (pointF.y * f2) - 5.0f, 11.0f, 11.0f};
        HardwareBuffer hardwareBufferF = madVar.f();
        try {
            int iStartTracking = RoiTrackerNative.startTracking(this.c, true, itrVar.ordinal(), 0, 1.0f, iC, iB, macVar.getBuffer(), macVar.getPixelStride(), macVar.getRowStride(), macVar2.getBuffer(), macVar2.getPixelStride(), macVar2.getRowStride(), macVar3.getBuffer(), macVar3.getPixelStride(), macVar3.getRowStride(), hardwareBufferF, fArr);
            if (hardwareBufferF != null) {
                hardwareBufferF.close();
            }
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[2];
            float f6 = fArr[3];
            this.e += RoiTrackerNative.getIsRefresherCalled(this.c) ? 1 : 0;
            ity ityVarA = itz.a();
            ityVarA.d(new RectF(f3 / f, f4 / f2, ((f3 + f5) - 1.0f) / f, ((f4 + f6) - 1.0f) / f2));
            ityVarA.b(1.0f);
            ityVarA.a = iub.a(iStartTracking);
            ityVarA.f(itr.a(RoiTrackerNative.getCurrentTrackerIndex(this.c)));
            ityVarA.c(this.e);
            ityVarA.e(0L);
            return ityVarA.a();
        } catch (Throwable th) {
            if (hardwareBufferF == null) {
                throw th;
            }
            try {
                hardwareBufferF.close();
                throw th;
            } catch (Throwable th2) {
                throw th;
            }
        }
    }

    @Override // defpackage.itq, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        b();
        if (this.f.g()) {
            ((itx) this.f.c()).close();
        }
        RoiTrackerNative.releaseHandle(this.c);
        this.b = true;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    @Override // defpackage.itq
    public final synchronized itz d(mad madVar) {
        if (this.b) {
            return itz.b();
        }
        mac macVar = (mac) madVar.g().get(0);
        mac macVar2 = (mac) madVar.g().get(1);
        mac macVar3 = (mac) madVar.g().get(2);
        int iC = madVar.c();
        int iB = madVar.b();
        float[] fArr = new float[5];
        float[] fArrC = this.f.g() ? ((itx) this.f.c()).c(madVar.d()) : new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        HardwareBuffer hardwareBufferF = madVar.f();
        try {
            int iUpdateRoi = RoiTrackerNative.updateRoi(this.c, 0, 1.0f, iC, iB, macVar.getBuffer(), macVar.getPixelStride(), macVar.getRowStride(), macVar2.getBuffer(), macVar2.getPixelStride(), macVar2.getRowStride(), macVar3.getBuffer(), macVar3.getPixelStride(), macVar3.getRowStride(), fArrC, hardwareBufferF, fArr);
            if (hardwareBufferF != null) {
                hardwareBufferF.close();
            }
            float f = fArr[0];
            float f2 = iC;
            float f3 = fArr[1];
            float f4 = iB;
            float f5 = fArr[2];
            float f6 = fArr[3];
            float f7 = fArr[4];
            this.e += RoiTrackerNative.getIsRefresherCalled(this.c) ? 1 : 0;
            ity ityVarA = itz.a();
            ityVarA.d(new RectF(f / f2, f3 / f4, ((f + f5) - 1.0f) / f2, ((f3 + f6) - 1.0f) / f4));
            ityVarA.b(f7);
            ityVarA.a = iub.a(iUpdateRoi);
            ityVarA.f(itr.a(RoiTrackerNative.getCurrentTrackerIndex(this.c)));
            ityVarA.c(this.e);
            ityVarA.e((madVar.d() - this.d) / 1000000);
            return ityVarA.a();
        } catch (Throwable th) {
            if (hardwareBufferF == null) {
                throw th;
            }
            try {
                hardwareBufferF.close();
                throw th;
            } catch (Throwable th2) {
                throw th;
            }
        }
    }
}

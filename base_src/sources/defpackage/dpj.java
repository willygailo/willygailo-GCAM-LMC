package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.jni.faceobfuscation.GpuRedactorNative;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class dpj implements dpy {
    private static final ouj c = ouj.h("com/google/android/apps/camera/faceobfuscation/FaceObfuscationEffectImpl");
    public final Object a = new Object();
    public long b = 0;
    private int d = 0;
    private List e = new ArrayList();
    private float f;
    private volatile boolean g;

    public dpj(Executor executor) {
        executor.execute(new Runnable() { // from class: dpi
            @Override // java.lang.Runnable
            public final void run() {
                dpj dpjVar = this.a;
                synchronized (dpjVar.a) {
                    dpjVar.b = GpuRedactorNative.createRedactor(true);
                }
            }
        });
    }

    @Override // defpackage.jws
    public final jwt a() {
        return jwt.FACE_OBFUSCATION;
    }

    @Override // defpackage.jws
    public final /* synthetic */ String b() {
        return mip.dL(this);
    }

    @Override // defpackage.jws
    public final boolean c() {
        return !this.g;
    }

    @Override // defpackage.jws, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            GpuRedactorNative.releaseRedactor(j);
            this.b = 0L;
        }
    }

    @Override // defpackage.jws
    public final void d(lmr lmrVar, lnx lnxVar, lmr lmrVar2) {
        lzv lzvVarC = lmrVar.c();
        if (lzvVarC == null) {
            this.d++;
            ((oug) ((oug) c.c()).G(884)).p("Using previous faceMetadata: metadata missed for %d consecutive frames.", this.d);
        } else {
            this.d = 0;
            Face[] faceArr = (Face[]) lzvVarC.d(CaptureResult.STATISTICS_FACES);
            Rect rect = (Rect) lzvVarC.d(CaptureResult.SCALER_CROP_REGION);
            ArrayList arrayList = new ArrayList();
            if (faceArr != null && rect != null) {
                if (kda.m == null || lzvVarC.d(kda.m) == null || kda.q == null || lzvVarC.d(kda.q) == null) {
                    for (Face face : faceArr) {
                        Rect bounds = face.getBounds();
                        Point leftEyePosition = face.getLeftEyePosition();
                        Point rightEyePosition = face.getRightEyePosition();
                        dpa dpaVarA = dpb.a(enl.N(bounds, rect));
                        dpaVarA.b = enl.M(leftEyePosition, rect);
                        dpaVarA.c = enl.M(rightEyePosition, rect);
                        dpaVarA.b(Float.MAX_VALUE);
                        arrayList.add(dpaVarA.a());
                    }
                } else {
                    for (lzs lzsVar : lzs.b(lzvVarC)) {
                        Face face2 = lzsVar.a;
                        Rect bounds2 = face2.getBounds();
                        Point leftEyePosition2 = face2.getLeftEyePosition();
                        Point rightEyePosition2 = face2.getRightEyePosition();
                        float f = hjy.b(lzsVar).l;
                        dpa dpaVarA2 = dpb.a(enl.N(bounds2, rect));
                        dpaVarA2.b = enl.M(leftEyePosition2, rect);
                        dpaVarA2.c = enl.M(rightEyePosition2, rect);
                        dpaVarA2.b(f);
                        arrayList.add(dpaVarA2.a());
                    }
                }
                this.f = rect.width() / rect.height();
            }
            this.e = arrayList;
        }
        mad madVarD = lmrVar.d(lnxVar);
        try {
            mad madVarD2 = lmrVar2.d(lnxVar);
            try {
                madVarD.getClass();
                madVarD2.getClass();
                int i = this.d;
                if (!this.e.isEmpty() && i <= 3) {
                    synchronized (this.a) {
                        if (this.b != 0 && !this.g) {
                            HardwareBuffer hardwareBufferF = madVarD.f();
                            try {
                                long j = this.b;
                                hardwareBufferF.getClass();
                                GpuRedactorNative.process(j, hardwareBufferF, true, hardwareBufferF, true, madVarD.c(), madVarD.b(), this.e.toArray(), this.f);
                                hardwareBufferF.close();
                            } catch (Throwable th) {
                                if (hardwareBufferF != null) {
                                    try {
                                        hardwareBufferF.close();
                                    } catch (Throwable th2) {
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                }
                madVarD2.close();
                madVarD.close();
            } catch (Throwable th3) {
                if (madVarD2 != null) {
                    try {
                        madVarD2.close();
                    } catch (Throwable th4) {
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            if (madVarD != null) {
                try {
                    madVarD.close();
                } catch (Throwable th6) {
                }
            }
            throw th5;
        }
    }

    @Override // defpackage.dpy
    public final void e(boolean z) {
        this.g = z;
    }
}

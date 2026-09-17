package defpackage;

import android.hardware.HardwareBuffer;
import com.google.android.apps.camera.jni.facebeautification.GpuRetoucherNative;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class doy implements jws, lie {
    private static final ouj c = ouj.h("com/google/android/apps/camera/facebeautification/live/LiveFaceBeautificationFullEffect");
    private final lco d;
    private dov f;
    public final Object a = new Object();
    public long b = 0;
    private int e = 0;

    public doy(Executor executor, lco lcoVar) {
        this.d = lcoVar;
        executor.execute(new Runnable() { // from class: dox
            @Override // java.lang.Runnable
            public final void run() {
                doy doyVar = this.a;
                synchronized (doyVar.a) {
                    doyVar.b = GpuRetoucherNative.createRetoucher(false, 1);
                }
            }
        });
    }

    @Override // defpackage.jws
    public final jwt a() {
        return jwt.FACE_BEAUTIFICATION;
    }

    @Override // defpackage.jws
    public final /* synthetic */ String b() {
        return mip.dL(this);
    }

    @Override // defpackage.jws
    public final boolean c() {
        return this.d.fA() != htf.OFF;
    }

    @Override // defpackage.jws, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            GpuRetoucherNative.releaseRetoucher(j);
            this.b = 0L;
        }
    }

    @Override // defpackage.jws
    public final void d(lmr lmrVar, lnx lnxVar, lmr lmrVar2) {
        lzv lzvVarC = lmrVar.c();
        if (lzvVarC == null) {
            this.e++;
            ((oug) ((oug) c.c()).G(878)).p("Using previous faceMetadata: metadata missed for %d consecutive frames.", this.e);
        } else {
            this.e = 0;
            this.f = dov.a(lzvVarC);
        }
        mad madVarD = lmrVar.d(lnxVar);
        try {
            mad madVarD2 = lmrVar2.d(lnxVar);
            try {
                madVarD.getClass();
                madVarD2.getClass();
                int i = this.e;
                dov dovVar = this.f;
                if (dovVar != null && i <= 3 && !dovVar.a.isEmpty()) {
                    synchronized (this.a) {
                        if (this.b != 0) {
                            HardwareBuffer hardwareBufferF = madVarD.f();
                            try {
                                long j = this.b;
                                hardwareBufferF.getClass();
                                GpuRetoucherNative.process(j, hardwareBufferF, true, hardwareBufferF, true, madVarD.c(), madVarD.b(), dovVar.a.toArray(), dovVar.b, ((htf) this.d.fA()).f);
                                hardwareBufferF.close();
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
                }
                madVarD2.close();
                madVarD.close();
            } catch (Throwable th3) {
                if (madVarD2 == null) {
                    throw th3;
                }
                try {
                    madVarD2.close();
                    throw th3;
                } catch (Throwable th4) {
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            if (madVarD == null) {
                throw th5;
            }
            try {
                madVarD.close();
                throw th5;
            } catch (Throwable th6) {
                throw th5;
            }
        }
    }
}

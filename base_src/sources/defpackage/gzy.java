package defpackage;

import android.hardware.HardwareBuffer;
import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import android.util.Log;
import android.util.Range;
import android.view.Surface;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.PhysicalStabilityThresholds;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.YuvWriteView;
import j$.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gzy implements goy {
    public static final Long a = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(100));
    public static final Duration b = Duration.ofSeconds(2);
    public static final Duration c = Duration.ofMillis(500);
    public final lis d;
    public final ojc e;
    public final bta f;
    public final eam g;
    public final ebe h;
    public final lvp i;
    public final boolean j;
    public final ljf k;
    public hnl l;
    public hnl m;
    public boolean n = false;
    public flh o;
    private final gzp p;
    private final lnc q;
    private final ojc r;
    private final lap s;
    private lap t;
    private final gzf u;

    public gzy(lis lisVar, ojc ojcVar, lnc lncVar, ojc ojcVar2, pht phtVar, lvp lvpVar, lvq lvqVar, lap lapVar, ojc ojcVar3, bta btaVar, ddf ddfVar, ebe ebeVar, eam eamVar, lvp lvpVar2, jrl jrlVar, ljf ljfVar, gzf gzfVar, gzp gzpVar, byte[] bArr) {
        this.d = lisVar.a("PckLongExposureCmd");
        this.p = gzpVar;
        this.e = ojcVar;
        this.r = ojcVar2;
        this.q = lncVar;
        this.f = btaVar;
        this.s = lapVar;
        this.g = eamVar;
        this.h = ebeVar;
        this.i = lvpVar2;
        this.j = jrlVar == jrl.LONG_EXPOSURE;
        this.k = ljfVar;
        this.u = gzfVar;
        if (ddfVar.k(ddq.e) && jrlVar == jrl.LONG_EXPOSURE) {
            final flh flhVar = new flh(lvpVar, lvqVar);
            lapVar.c(flhVar);
            mip.bZ(phtVar, new lht() { // from class: gzv
                @Override // defpackage.lht
                public final void a(Object obj) {
                    gzy gzyVar = this.a;
                    flh flhVar2 = flhVar;
                    final Surface surface = (Surface) obj;
                    if (surface != null) {
                        final pke pkeVar = flhVar2.a;
                        synchronized (pkeVar.d) {
                            if (!pkeVar.f) {
                                pkeVar.e.execute(new Runnable() { // from class: pka
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        pke pkeVar2 = pkeVar;
                                        pkeVar2.a.notifySurfaceChanged(pkeVar2.i, surface);
                                    }
                                });
                            }
                        }
                        gzyVar.n = true;
                    }
                }
            });
            this.o = flhVar;
        }
        d();
    }

    private final void d() {
        hnl hnlVar = this.l;
        if (hnlVar != null) {
            hnlVar.b();
        }
        hnl hnlVar2 = this.m;
        if (hnlVar2 != null) {
            hnlVar2.b();
        }
        if (this.e.g() && this.r.g()) {
            lmv lmvVarR = this.q.r((lqd) this.r.c(), 3);
            lap lapVarB = this.s.b();
            this.t = lapVarB;
            lapVarB.c(lmvVarR);
            lmvVarR.k(new lmu() { // from class: gzw
                @Override // defpackage.lmu
                public final void a(lrr lrrVar) {
                    final gzy gzyVar = this.a;
                    if (lrrVar.b() == null) {
                        return;
                    }
                    mip.bj(lrrVar, new lnn() { // from class: gzx
                        @Override // defpackage.lnn
                        public final void a(lmr lmrVar) {
                            boolean zC;
                            gzy gzyVar2 = gzyVar;
                            try {
                                final lzv lzvVarC = lmrVar.c();
                                if (lzvVarC == null) {
                                    gzyVar2.d.d("Error retrieving metadata, ignoring frame");
                                } else {
                                    gzyVar2.k.e("StabilityProcessing");
                                    try {
                                        int iA = gzyVar2.h.a(lzvVarC);
                                        float fA = gzyVar2.h.m(iA).a().a();
                                        PhysicalStabilityThresholds physicalStabilityThresholdsA = gzyVar2.h.m(iA).a();
                                        float fPhysicalStabilityThresholds_braced_speed_rad_per_sec_get = GcamModuleJNI.PhysicalStabilityThresholds_braced_speed_rad_per_sec_get(physicalStabilityThresholdsA.a, physicalStabilityThresholdsA) * 1.6f;
                                        if (gzyVar2.l == null && fA < fPhysicalStabilityThresholds_braced_speed_rad_per_sec_get) {
                                            gzyVar2.l = new hnl(new Range(Float.valueOf(fA), Float.valueOf(fPhysicalStabilityThresholds_braced_speed_rad_per_sec_get)), gzy.b, gzy.c);
                                        }
                                        if (gzyVar2.m == null) {
                                            gzyVar2.m = new hnl(new Range(Float.valueOf(0.0f), Float.valueOf(fA)), gzy.b, gzy.c);
                                        }
                                        float fA2 = gzyVar2.h.n(iA).a();
                                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                        hnl hnlVar3 = gzyVar2.l;
                                        if (hnlVar3 != null) {
                                            hnlVar3.a(fA2, jElapsedRealtimeNanos);
                                        }
                                        hnl hnlVar4 = gzyVar2.m;
                                        if (hnlVar4 != null) {
                                            hnlVar4.a(fA2, jElapsedRealtimeNanos);
                                        }
                                        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                                        hnl hnlVar5 = gzyVar2.m;
                                        boolean z = true;
                                        if (hnlVar5 != null) {
                                            zC = hnlVar5.c(jElapsedRealtimeNanos2);
                                        } else {
                                            float fA3 = gzyVar2.h.n(iA).a();
                                            zC = fA3 >= 0.0f && fA3 <= gzyVar2.h.m(iA).a().a();
                                        }
                                        hnl hnlVar6 = gzyVar2.l;
                                        boolean zC2 = hnlVar6 != null ? hnlVar6.c(jElapsedRealtimeNanos2) : false;
                                        gzyVar2.k.f();
                                        gzyVar2.g.g(lzvVarC, zC, zC2, gzyVar2.i.k(), gzyVar2.j);
                                        gzyVar2.f.a(lzvVarC);
                                        Long l = (Long) lzvVarC.d(CaptureResult.SENSOR_EXPOSURE_TIME);
                                        l.getClass();
                                        if (l.longValue() > gzy.a.longValue()) {
                                            lis lisVar = gzyVar2.d;
                                            String strValueOf = String.valueOf(lzvVarC.d(CaptureResult.SENSOR_EXPOSURE_TIME));
                                            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 45);
                                            sb.append("Frame dropped with ultra long exposure time: ");
                                            sb.append(strValueOf);
                                            lisVar.h(sb.toString());
                                        } else if (gzyVar2.o != null && gzyVar2.n) {
                                            final mad madVarD = lmrVar.d((lnx) gzyVar2.e.c());
                                            if (madVarD == null) {
                                                gzyVar2.d.h("Received incomplete frame");
                                            } else {
                                                final pke pkeVar = gzyVar2.o.a;
                                                obr.aG(madVarD.a() == 35, "yuvImage must be YUV_420_888 format.");
                                                synchronized (pkeVar.d) {
                                                    if (pkeVar.f) {
                                                        Log.e("SeeDarkSession", "Unable to process new image: the session is closing or already closed.");
                                                        madVarD.close();
                                                    } else {
                                                        Future future = pkeVar.g;
                                                        boolean z2 = (future == null || future.isDone() || pkeVar.g.isCancelled()) ? false : true;
                                                        Future future2 = pkeVar.h;
                                                        if (future2 == null || future2.isDone() || pkeVar.h.isCancelled()) {
                                                            z = false;
                                                        }
                                                        if (z2 || z) {
                                                            madVarD.d();
                                                            madVarD.close();
                                                        } else {
                                                            pkeVar.g = pkeVar.e.submit(new Callable() { // from class: pkd
                                                                @Override // java.util.concurrent.Callable
                                                                public final Object call() {
                                                                    pke pkeVar2 = pkeVar;
                                                                    final mad madVar = madVarD;
                                                                    lzv lzvVar = lzvVarC;
                                                                    try {
                                                                        long jE = YuvWriteView.e(pkeVar2.b.c(madVar));
                                                                        final HardwareBuffer hardwareBufferF = madVar.f();
                                                                        hardwareBufferF.getClass();
                                                                        pkeVar2.a.processAndCloseFrame(pkeVar2.i, jE, hardwareBufferF, new Runnable() { // from class: pjx
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                HardwareBuffer hardwareBuffer = hardwareBufferF;
                                                                                mad madVar2 = madVar;
                                                                                hardwareBuffer.close();
                                                                                madVar2.close();
                                                                            }
                                                                        }, FrameMetadata.b(pkeVar2.c.k(lzvVar)), pkeVar2.c.p(lzvVar).a);
                                                                        return null;
                                                                    } catch (RuntimeException e) {
                                                                        long jD = madVar.d();
                                                                        StringBuilder sb2 = new StringBuilder(44);
                                                                        sb2.append("Could not process frame ");
                                                                        sb2.append(jD);
                                                                        Log.e("SeeDarkSession", sb2.toString(), e);
                                                                        madVar.close();
                                                                        return null;
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (IllegalArgumentException e) {
                                        gzyVar2.k.f();
                                        gzyVar2.d.i("Error getting physical camera ID", e);
                                    }
                                }
                                lmrVar.close();
                            } catch (Throwable th) {
                                try {
                                    lmrVar.close();
                                } catch (Throwable th2) {
                                }
                                throw th;
                            }
                        }
                    });
                }
            });
        }
        if (this.j) {
            return;
        }
        this.g.f(false, this.i.k(), false, false);
    }

    @Override // defpackage.goy
    public final lco a() {
        return this.p.a;
    }

    @Override // defpackage.goy
    public final lco b() {
        return this.p.b();
    }

    @Override // defpackage.goy
    public final void c(gox goxVar, gog gogVar) throws Throwable {
        hsa hsaVar = gogVar.b;
        this.k.e("mv-setup");
        ojc ojcVarH = hsaVar instanceof hqo ? ojc.h((hqo) hsaVar) : oih.a;
        if (!ojcVarH.g()) {
            lis lisVar = this.d;
            String strValueOf = String.valueOf(hsaVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 50);
            sb.append("Capture session not a LongExposureCaptureSession: ");
            sb.append(strValueOf);
            lisVar.h(sb.toString());
        }
        boolean zG = ojcVarH.g();
        fow fowVarB = this.u.b(gogVar);
        if (zG) {
            this.k.e("mv-beginMoments");
            fowVarB.b();
            this.k.g("mv-startMicrovideo");
            ojc ojcVarA = fowVarB.a();
            if (ojcVarA.g()) {
                this.k.g("mv-attachSession");
                ((hqo) ojcVarH.c()).d = ojc.i((fpl) ojcVarA.c());
            }
            this.k.f();
        }
        this.k.f();
        flh flhVar = this.o;
        if (flhVar != null) {
            try {
                this.k.e("startCapture");
                pkf pkfVar = new pkf();
                lic licVar = lic.CLOCKWISE_0;
                if (licVar == null) {
                    throw new NullPointerException("Null imageRotation");
                }
                pkfVar.a = licVar;
                lic licVar2 = pkfVar.a;
                if (licVar2 == null) {
                    throw new IllegalStateException("Missing required properties: imageRotation");
                }
                final pkg pkgVar = new pkg(licVar2);
                pkh pkhVar = new pkh();
                pkhVar.a = 0L;
                pkhVar.b = oge.c;
                pkhVar.c = oge.d;
                pkhVar.d = oge.e;
                Long l = pkhVar.a;
                if (l != null && pkhVar.b != null && pkhVar.c != null && pkhVar.d != null) {
                    final pki pkiVar = new pki(l.longValue(), pkhVar.b, pkhVar.c, pkhVar.d);
                    final pke pkeVar = flhVar.a;
                    synchronized (pkeVar.d) {
                        if (pkeVar.f) {
                            Log.e("SeeDarkSession", "Unable to startCapture(): the session is closing or already closed.");
                        } else {
                            pkeVar.e.execute(new Runnable() { // from class: pkb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    pke pkeVar2 = pkeVar;
                                    pkg pkgVar2 = pkgVar;
                                    pki pkiVar2 = pkiVar;
                                    ShotParams shotParams = new ShotParams();
                                    shotParams.d(GcamModuleJNI.DegreesToImageRotation(pkgVar2.a.e));
                                    shotParams.e(true);
                                    pkeVar2.a.startCapture(pkeVar2.i, shotParams.a, "", pkiVar2.a, pkiVar2.b, pkiVar2.c);
                                }
                            });
                        }
                    }
                    this.k.g("cameraLifetime#close");
                    this.t.close();
                    this.k.g("captureImage");
                    this.p.c(goxVar, gogVar);
                    this.k.g("attachBuffer");
                    d();
                    this.k.g("finishCapture");
                    flhVar.a();
                }
                StringBuilder sb2 = new StringBuilder();
                if (pkhVar.a == null) {
                    sb2.append(" shotId");
                }
                if (pkhVar.b == null) {
                    sb2.append(" onFinish");
                }
                if (pkhVar.c == null) {
                    sb2.append(" onError");
                }
                if (pkhVar.d == null) {
                    sb2.append(" onComplete");
                }
                String strValueOf2 = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf2).length() + 28);
                sb3.append("Missing required properties:");
                sb3.append(strValueOf2);
                throw new IllegalStateException(sb3.toString());
            } catch (Throwable th) {
                this.k.g("attachBuffer");
                d();
                this.k.g("finishCapture");
                flhVar.a();
                throw th;
            }
        }
        this.k.e("captureImage");
        this.p.c(goxVar, gogVar);
        this.k.f();
        if (zG) {
            this.k.e("mv-endMoments");
            fowVarB.c();
            this.k.f();
        }
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.b("delegate", this.p);
        return ojbVarAZ.toString();
    }
}

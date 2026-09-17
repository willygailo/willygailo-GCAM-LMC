package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class csw {
    private static final ouj d = ouj.h("com/google/android/apps/camera/camcorder/topshot/FrameServerQualityScoreProcessor");
    public final lap a;
    public final Object b = new Object();
    public ExecutorService c;
    private final lnc e;
    private final brg f;
    private final lnz g;
    private final hki h;
    private final hkr i;
    private final jth j;

    public csw(lnc lncVar, brg brgVar, lnz lnzVar, hki hkiVar, hkr hkrVar, jth jthVar, lap lapVar) {
        this.e = lncVar;
        this.f = brgVar;
        this.g = lnzVar;
        this.h = hkiVar;
        this.i = hkrVar;
        this.j = jthVar;
        this.a = lapVar;
    }

    final synchronized lie a() {
        final lmv lmvVarR;
        final lnx lnxVarA = this.e.b().a(this.g);
        lmvVarR = this.e.r(this.e.s(lnxVarA), 2);
        lmvVarR.k(new lmu() { // from class: cst
            @Override // defpackage.lmu
            public final void a(lrr lrrVar) {
                final csw cswVar = this.a;
                final lnx lnxVar = lnxVarA;
                mip.bj(lrrVar, new lnn() { // from class: csu
                    @Override // defpackage.lnn
                    public final void a(final lmr lmrVar) {
                        final csw cswVar2 = cswVar;
                        final lnx lnxVar2 = lnxVar;
                        synchronized (cswVar2.b) {
                            ExecutorService executorService = cswVar2.c;
                            if (executorService == null) {
                                return;
                            }
                            executorService.execute(new Runnable() { // from class: csv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cswVar2.b(lmrVar, lnxVar2);
                                }
                            });
                        }
                    }
                });
            }
        });
        return new lie() { // from class: css
            @Override // defpackage.lie, java.lang.AutoCloseable
            public final void close() {
                lmvVarR.close();
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    public final synchronized void b(lmr lmrVar, lnx lnxVar) {
        String str;
        lzr lzrVar;
        lzr lzrVar2;
        try {
            mad madVarD = lmrVar.d(lnxVar);
            try {
                lzv lzvVarC = lmrVar.c();
                if (madVarD == null) {
                    ((oug) ((oug) d.c()).G(632)).r("Image from frame %s null", lmrVar);
                } else if (lzvVarC == null) {
                    ((oug) ((oug) d.c()).G(631)).r("Result from frame %s null", lmrVar);
                    madVarD.close();
                } else {
                    lic licVarB = this.f.b();
                    String str2 = (String) lzvVarC.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                    Rect rect = null;
                    if (str2 != null) {
                        Map mapG = lzvVarC.g();
                        if (mapG.isEmpty()) {
                            str = str2;
                            lzrVar = lzvVarC;
                        } else {
                            if (mapG.containsKey(str2)) {
                                lzrVar2 = (lzr) mapG.get(str2);
                            } else {
                                Map.Entry entry = (Map.Entry) ((oor) mapG).entrySet().iterator().next();
                                str2 = (String) entry.getKey();
                                lzrVar2 = (lzr) entry.getValue();
                            }
                            rect = (Rect) lzrVar2.d(CaptureResult.SCALER_CROP_REGION);
                            str = str2;
                            lzrVar = lzrVar2;
                        }
                    } else {
                        str = str2;
                        lzrVar = lzvVarC;
                    }
                    Rect rect2 = (Rect) this.j.a(str).l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    this.i.f(this.h.a(madVarD, new hjz(lzrVar, licVarB.e, rect2, str, rect == null ? rect2 : rect)));
                    madVarD.close();
                }
                lmrVar.close();
            } catch (Throwable th) {
                if (madVarD != null) {
                    try {
                        madVarD.close();
                    } catch (Throwable th2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            lmrVar.close();
            throw th3;
        }
    }
}

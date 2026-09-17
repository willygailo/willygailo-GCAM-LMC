package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import com.eszdman;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class dkl {
    private static final ouj c = ouj.h("com/google/android/apps/camera/device/CameraDeviceVerifier");
    public final Object a = new Object();
    public pih b;
    private final eszdman cameraManager2;
    private final CameraManager d;
    private final pyn e;
    private final Executor f;
    private final lle g;

    public dkl(CameraManager cameraManager, pyn pynVar, Executor executor, lle lleVar) {
        this.d = cameraManager;
        this.cameraManager2 = new eszdman(cameraManager);
        this.e = pynVar;
        this.f = executor;
        this.g = lleVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x010c A[Catch: all -> 0x0144, TryCatch #1 {all -> 0x0144, blocks: (B:46:0x00ed, B:48:0x010c, B:52:0x011e, B:49:0x0118, B:51:0x011c, B:36:0x00e3, B:35:0x00e0), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0118 A[Catch: all -> 0x0144, TryCatch #1 {all -> 0x0144, blocks: (B:46:0x00ed, B:48:0x010c, B:52:0x011e, B:49:0x0118, B:51:0x011c, B:36:0x00e3, B:35:0x00e0), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011c A[Catch: all -> 0x0144, TryCatch #1 {all -> 0x0144, blocks: (B:46:0x00ed, B:48:0x010c, B:52:0x011e, B:49:0x0118, B:51:0x011c, B:36:0x00e3, B:35:0x00e0), top: B:64:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    public final dkk a(int i) throws Throwable {
        lju ljuVarA;
        lju ljuVar;
        ((oug) ((oug) c.c()).G(814)).s("Attempting to reconnect to the camera service with a %dms timeout in %dms increments.", i, 200);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        dkj dkjVar = null;
        try {
            try {
                lap lapVar = new lap();
                try {
                    dkj dkjVar2 = new dkj(atomicBoolean);
                    try {
                        this.d.registerAvailabilityCallback(dkjVar2, mip.bW(lapVar, "PollUntilReconnect"));
                        for (int i2 = 0; i2 < 35; i2++) {
                            try {
                                String[] cameraIdList = this.cameraManager2.getCameraIdList();
                                if (cameraIdList != null && cameraIdList.length > 0 && atomicBoolean.get()) {
                                    ((oug) ((oug) c.c()).G(817)).p("Camera Manager reconnect attempted and succeeded after ~%dms", (i2 + 1) * 200);
                                    ((lkm) this.e.get()).az(1, lju.CAMERAS_NOT_ENUMERATED, lju.CAMERAS_NOT_ENUMERATED.c(), 2);
                                    this.g.i();
                                    dkk dkkVar = new dkk(true);
                                    lapVar.close();
                                    this.d.unregisterAvailabilityCallback(dkjVar2);
                                    return dkkVar;
                                }
                                Thread.sleep(200L, 0);
                            } catch (CameraAccessException e) {
                                e = e;
                                dkjVar = dkjVar2;
                                ((oug) ((oug) ((oug) c.b()).h(e)).G(737)).o("Camera Manager reconnect failed, or there are no cameras on this device.");
                                ljuVarA = lju.CAMERA_ERROR_CODE_UNKNOWN;
                                if (e instanceof CameraAccessException) {
                                    ljuVarA = lju.a(((CameraAccessException) e).getReason());
                                } else if (e instanceof InterruptedException) {
                                    ljuVarA = lju.CAMERAS_NOT_ENUMERATED;
                                }
                                this.g.e(ljuVarA);
                                ((lkm) this.e.get()).az(3, ljuVarA, e.getMessage(), 2);
                                if (dkjVar != null) {
                                    this.d.unregisterAvailabilityCallback(dkjVar);
                                }
                                ljuVar = ljuVarA;
                            } catch (InterruptedException e2) {
                                e = e2;
                                dkjVar = dkjVar2;
                                ((oug) ((oug) ((oug) c.b()).h(e)).G(737)).o("Camera Manager reconnect failed, or there are no cameras on this device.");
                                ljuVarA = lju.CAMERA_ERROR_CODE_UNKNOWN;
                                if (e instanceof CameraAccessException) {
                                    ljuVarA = lju.a(((CameraAccessException) e).getReason());
                                } else if (e instanceof InterruptedException) {
                                    ljuVarA = lju.CAMERAS_NOT_ENUMERATED;
                                }
                                this.g.e(ljuVarA);
                                ((lkm) this.e.get()).az(3, ljuVarA, e.getMessage(), 2);
                                if (dkjVar != null) {
                                    this.d.unregisterAvailabilityCallback(dkjVar);
                                }
                                ljuVar = ljuVarA;
                            } catch (Throwable th) {
                                th = th;
                                dkjVar = dkjVar2;
                                if (dkjVar != null) {
                                    this.d.unregisterAvailabilityCallback(dkjVar);
                                }
                                throw th;
                            }
                        }
                        ((oug) ((oug) c.b()).G(736)).o("Camera Manager reconnect failed, or there are no cameras on this device.");
                        ljuVar = lju.CAMERAS_NOT_ENUMERATED;
                        this.g.e(lju.CAMERAS_NOT_ENUMERATED);
                        ((lkm) this.e.get()).az(2, lju.CAMERAS_NOT_ENUMERATED, lju.CAMERAS_NOT_ENUMERATED.c(), 2);
                        lapVar.close();
                        this.d.unregisterAvailabilityCallback(dkjVar2);
                    } catch (Throwable th2) {
                        th = th2;
                        dkjVar = dkjVar2;
                        try {
                            lapVar.close();
                        } catch (Throwable th3) {
                            try {
                                th.addSuppressed(th3);
                            } catch (CameraAccessException e3) {
                                e = e3;
                                ((oug) ((oug) ((oug) c.b()).h(e)).G(737)).o("Camera Manager reconnect failed, or there are no cameras on this device.");
                                ljuVarA = lju.CAMERA_ERROR_CODE_UNKNOWN;
                                if (e instanceof CameraAccessException) {
                                    ljuVarA = lju.a(((CameraAccessException) e).getReason());
                                } else if (e instanceof InterruptedException) {
                                    ljuVarA = lju.CAMERAS_NOT_ENUMERATED;
                                }
                                this.g.e(ljuVarA);
                                ((lkm) this.e.get()).az(3, ljuVarA, e.getMessage(), 2);
                                if (dkjVar != null) {
                                    this.d.unregisterAvailabilityCallback(dkjVar);
                                }
                                ljuVar = ljuVarA;
                                dkk dkkVar2 = new dkk(false);
                                dkkVar2.b = ljuVar;
                                return dkkVar2;
                            } catch (InterruptedException e4) {
                                e = e4;
                                ((oug) ((oug) ((oug) c.b()).h(e)).G(737)).o("Camera Manager reconnect failed, or there are no cameras on this device.");
                                ljuVarA = lju.CAMERA_ERROR_CODE_UNKNOWN;
                                if (e instanceof CameraAccessException) {
                                    ljuVarA = lju.a(((CameraAccessException) e).getReason());
                                } else if (e instanceof InterruptedException) {
                                    ljuVarA = lju.CAMERAS_NOT_ENUMERATED;
                                }
                                this.g.e(ljuVarA);
                                ((lkm) this.e.get()).az(3, ljuVarA, e.getMessage(), 2);
                                if (dkjVar != null) {
                                    this.d.unregisterAvailabilityCallback(dkjVar);
                                }
                                ljuVar = ljuVarA;
                                dkk dkkVar3 = new dkk(false);
                                dkkVar3.b = ljuVar;
                                return dkkVar3;
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (CameraAccessException e5) {
            e = e5;
        } catch (InterruptedException e6) {
            e = e6;
        } catch (Throwable th6) {
            th = th6;
        }
        dkk dkkVar4 = new dkk(false);
        dkkVar4.b = ljuVar;
        return dkkVar4;
    }

    public final pht b() {
        pih pihVar;
        boolean z = true;
        try {
            String[] cameraIdList = this.cameraManager2.getCameraIdList();
            if (cameraIdList != null && cameraIdList.length > 0) {
                this.g.i();
                return plk.V(new dkk(true));
            }
        } catch (CameraAccessException e) {
        }
        synchronized (this.a) {
            if (this.b == null) {
                this.b = pih.f();
            } else {
                z = false;
            }
            pihVar = this.b;
        }
        if (z) {
            this.f.execute(new dki(this, 7000));
        }
        return pihVar;
    }
}

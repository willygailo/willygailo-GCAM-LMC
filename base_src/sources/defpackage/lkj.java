package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.util.Log;
import com.google.android.apps.camera.bottombar.R;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class lkj implements lke {
    public final String a;
    public final CameraManager b;
    public final lkm c;
    public final Executor d;
    public final Handler e;
    public final ljf f;
    public boolean k = false;
    public boolean l = false;
    private Throwable m = null;
    public final lky i = new lky();
    public final Object g = new Object();
    public final Object h = new Object();
    public final CountDownLatch j = new CountDownLatch(1);

    public lkj(Handler handler, Executor executor, CameraManager cameraManager, lkm lkmVar, ljf ljfVar, String str) {
        this.a = str;
        this.b = cameraManager;
        this.f = ljfVar;
        this.c = lkmVar;
        this.e = handler;
        this.d = executor;
    }

    private final void c(String str, Exception exc, boolean z, lju ljuVar, String str2) {
        Log.w("CAM_CameraDeviceOpener", str, exc);
        synchronized (this.g) {
            if (z) {
                this.c.az(3, ljuVar, str2, 3);
            }
        }
    }

    public final lkh a(lky lkyVar, boolean z, long j, long j2) {
        lkh lkhVar;
        ljf ljfVar;
        lkh lkhVar2;
        ljf ljfVar2;
        lkh lkhVar3;
        ljf ljfVar3;
        lki lkiVar = new lki(this.f);
        lkyVar.e(lkiVar);
        this.f.e("CameraDeviceOpenerImpl#open");
        try {
            try {
                try {
                    try {
                        this.a.length();
                        CameraManager cameraManager = this.b;
                        String str = this.a;
                        cameraManager.openCamera(str, new ljo(lkyVar, str), this.e);
                        lkhVar3 = lkiVar.e((5000 + j) - j2);
                        ljfVar3 = this.f;
                    } catch (CameraAccessException e) {
                        lju ljuVarA = lju.a(e.getReason());
                        switch (e.getReason()) {
                            case 1:
                                if (!z) {
                                    lkhVar2 = new lkh(3, ljuVarA, e.getMessage());
                                    ljfVar2 = this.f;
                                    ljfVar2.f();
                                    return lkhVar2;
                                }
                                String str2 = this.a;
                                StringBuilder sb = new StringBuilder(str2.length() + 73);
                                sb.append("Failed to open camera device ");
                                sb.append(str2);
                                sb.append(" after retry. The camera device is disabled.");
                                c(sb.toString(), e, true, ljuVarA, e.getMessage());
                                lkyVar.c(ljuVarA);
                                lkhVar = new lkh(4, ljuVarA, e.getMessage());
                                ljfVar = this.f;
                                ljfVar.f();
                                return lkhVar;
                            case 2:
                                lkhVar = new lkh(2, ljuVarA, e.getMessage());
                                ljfVar = this.f;
                                ljfVar.f();
                                return lkhVar;
                            case 3:
                                lkhVar = new lkh(2, ljuVarA, e.getMessage());
                                ljfVar = this.f;
                                ljfVar.f();
                                return lkhVar;
                            case 4:
                                String str3 = this.a;
                                StringBuilder sb2 = new StringBuilder(str3.length() + R.styleable.AppCompatTheme_switchStyle);
                                sb2.append("Failed to open camera device ");
                                sb2.append(str3);
                                sb2.append(" The camera device in use due to a higher priority process. Retrying ...");
                                c(sb2.toString(), e, true, ljuVarA, e.getMessage());
                                lkhVar = new lkh(2, ljuVarA, e.getMessage());
                                ljfVar = this.f;
                                ljfVar.f();
                                return lkhVar;
                            case 5:
                                String str4 = this.a;
                                StringBuilder sb3 = new StringBuilder(str4.length() + 78);
                                sb3.append("Failed to open camera device ");
                                sb3.append(str4);
                                sb3.append(". The maximum number of cameras are already open.");
                                c(sb3.toString(), e, z, ljuVarA, e.getMessage());
                                lkyVar.c(ljuVarA);
                                lkhVar = new lkh(4, ljuVarA, e.getMessage());
                                ljfVar = this.f;
                                ljfVar.f();
                                return lkhVar;
                            default:
                                String str5 = this.a;
                                int reason = e.getReason();
                                StringBuilder sb4 = new StringBuilder(str5.length() + 91);
                                sb4.append("Failed to open camera device ");
                                sb4.append(str5);
                                sb4.append(". An unknown exception was thrown with error code ");
                                sb4.append(reason);
                                sb4.append(".");
                                c(sb4.toString(), e, z, ljuVarA, e.getMessage());
                                lkyVar.c(ljuVarA);
                                lkhVar = new lkh(4, ljuVarA, e.getMessage());
                                ljfVar = this.f;
                                ljfVar.f();
                                return lkhVar;
                        }
                    }
                } catch (InterruptedException e2) {
                    lkhVar3 = new lkh(5);
                    ljfVar3 = this.f;
                }
                ljfVar3.f();
                return lkhVar3;
            } catch (IllegalArgumentException e3) {
                synchronized (this.g) {
                    this.m = e3;
                    lkhVar = new lkh(2, lju.CAMERA_ID_NOT_VALID, e3.getMessage());
                    ljfVar = this.f;
                    ljfVar.f();
                    return lkhVar;
                }
            } catch (SecurityException e4) {
                synchronized (this.g) {
                    this.m = e4;
                    if (!z) {
                        lkhVar2 = new lkh(3, lju.CAMERA_SECURITY_EXCEPTION, e4.getMessage());
                        ljfVar2 = this.f;
                        ljfVar2.f();
                        return lkhVar2;
                    }
                    String str6 = this.a;
                    StringBuilder sb5 = new StringBuilder(str6.length() + 98);
                    sb5.append("Failed to open camera device ");
                    sb5.append(str6);
                    sb5.append(". A SecurityException was thrown while attempting to open the camera.");
                    c(sb5.toString(), e4, true, lju.CAMERA_SECURITY_EXCEPTION, e4.getMessage());
                    lkyVar.c(lju.CAMERA_SECURITY_EXCEPTION);
                    lkhVar = new lkh(4, lju.CAMERA_SECURITY_EXCEPTION, e4.getMessage());
                    ljfVar = this.f;
                    ljfVar.f();
                    return lkhVar;
                }
            }
        } catch (Throwable th) {
            this.f.f();
            throw th;
        }
    }

    public final void b(boolean z, lju ljuVar, String str) {
        synchronized (this.g) {
            if (this.m != null) {
                String str2 = this.a;
                StringBuilder sb = new StringBuilder(str2.length() + 44);
                sb.append("Failed to open Camera device ");
                sb.append(str2);
                sb.append(" after timeout.");
                Log.e("CAM_CameraDeviceOpener", sb.toString(), this.m);
            } else {
                String str3 = this.a;
                StringBuilder sb2 = new StringBuilder(str3.length() + 44);
                sb2.append("Failed to open Camera device ");
                sb2.append(str3);
                sb2.append(" after timeout.");
                Log.e("CAM_CameraDeviceOpener", sb2.toString());
            }
            if (z) {
                this.c.az(2, ljuVar, str, 3);
            }
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.g) {
            this.l = true;
        }
        synchronized (this.h) {
            this.h.notify();
        }
    }
}

package defpackage;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes2.dex */
final class lkg extends CameraManager.AvailabilityCallback {
    final /* synthetic */ lkj a;

    public lkg(lkj lkjVar) {
        this.a = lkjVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.a.a.equals(str)) {
            synchronized (this.a.h) {
                this.a.h.notify();
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
    }
}

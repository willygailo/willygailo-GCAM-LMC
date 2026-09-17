package defpackage;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: loaded from: classes2.dex */
final class ljo extends CameraDevice.StateCallback {
    private final lkc a;
    private final String b;

    public ljo(lkc lkcVar, String str) {
        this.a = lkcVar;
        this.b = str;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        obr.aF(cameraDevice.getId().equals(this.b));
        this.a.a();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        obr.aF(cameraDevice.getId().equals(this.b));
        this.a.b();
        cameraDevice.close();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        cameraDevice.getClass();
        obr.aF(cameraDevice.getId().equals(this.b));
        lkc lkcVar = this.a;
        lju ljuVar = (lju) lju.t.get(Integer.valueOf(i));
        if (ljuVar == null) {
            throw new IllegalStateException("Unknown Camera Device error code");
        }
        lkcVar.c(ljuVar);
        cameraDevice.close();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        cameraDevice.getClass();
        obr.aF(cameraDevice.getId().equals(this.b));
        this.a.d(new luw(cameraDevice));
    }
}

package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class lvc extends CameraCaptureSession.StateCallback {
    private final lzn a;

    public lvc(lzn lznVar) {
        this.a = lznVar;
    }

    private static final lzo a(CameraCaptureSession cameraCaptureSession) {
        return cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? new luv((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession) : new luu(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        lzn lznVar = this.a;
        a(cameraCaptureSession);
        lznVar.i();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.a.d(a(cameraCaptureSession));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.a.e(a(cameraCaptureSession));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.a.f(a(cameraCaptureSession));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        lzn lznVar = this.a;
        a(cameraCaptureSession);
        lznVar.j();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        lzn lznVar = this.a;
        a(cameraCaptureSession);
        lznVar.k();
    }
}

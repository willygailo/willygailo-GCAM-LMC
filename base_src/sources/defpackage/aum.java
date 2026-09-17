package defpackage;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: classes.dex */
final class aum extends CameraCaptureSession.StateCallback {
    final /* synthetic */ aup a;

    public aum(aup aupVar) {
        this.a = aupVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        awm awmVar = this.a.k;
        if (awmVar != null) {
            awmVar.a();
            this.a.k = null;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        axp.a(aur.a, "Failed to configure the camera for capture");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        aup aupVar = this.a;
        aupVar.i = cameraCaptureSession;
        aupVar.a(8);
    }
}

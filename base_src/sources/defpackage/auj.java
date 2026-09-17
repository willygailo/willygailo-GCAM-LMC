package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
final class auj extends CameraCaptureSession.CaptureCallback {
    final /* synthetic */ avu a;
    final /* synthetic */ aup b;
    private boolean c = false;

    public auj(aup aupVar, avu avuVar) {
        this.b = aupVar;
        this.a = avuVar;
    }

    private final void a(CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AF_STATE) == null || this.c) {
            return;
        }
        this.c = true;
        aup aupVar = this.b;
        aupVar.l = this.a;
        aupVar.p.a(captureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        a(totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        axp.a(aur.a, "Focusing failed with reason " + captureFailure.getReason());
        this.a.a(false, this.b.e);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        a(captureResult);
    }
}

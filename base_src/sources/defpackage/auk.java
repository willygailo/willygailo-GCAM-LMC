package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
final class auk extends CameraCaptureSession.CaptureCallback {
    final /* synthetic */ auq a;
    final /* synthetic */ aup b;
    private boolean c = false;

    public auk(aup aupVar, auq auqVar) {
        this.b = aupVar;
        this.a = auqVar;
    }

    private final void a(CaptureResult captureResult) {
        if (captureResult.get(CaptureResult.CONTROL_AE_STATE) == null || this.c) {
            return;
        }
        this.c = true;
        aup aupVar = this.b;
        aupVar.m = this.a;
        aupVar.p.a(captureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        a(totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        axp.a(aur.a, "Autoexposure and capture failed with reason " + captureFailure.getReason());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        a(captureResult);
    }
}

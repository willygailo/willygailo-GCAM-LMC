package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class auq extends CameraCaptureSession.CaptureCallback implements ImageReader.OnImageAvailableListener {
    final /* synthetic */ Handler a;
    final /* synthetic */ awc b;
    final /* synthetic */ aui c;
    final /* synthetic */ fde d;

    public auq() {
    }

    public auq(aui auiVar, fde fdeVar, Handler handler, awc awcVar) {
        this.c = auiVar;
        this.d = fdeVar;
        this.a = handler;
        this.b = awcVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        if (this.d != null) {
            this.a.post(new auf(this));
        }
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        try {
            if (this.b != null) {
                ByteBuffer buffer = imageAcquireNextImage.getPlanes()[0].getBuffer();
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                this.a.post(new aug(this, bArr));
            }
            if (imageAcquireNextImage != null) {
                imageAcquireNextImage.close();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (imageAcquireNextImage != null) {
                    try {
                        imageAcquireNextImage.close();
                    } catch (Throwable th3) {
                    }
                }
                throw th2;
            }
        }
    }
}

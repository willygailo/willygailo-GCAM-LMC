package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class luu implements lzo {
    public final CameraCaptureSession a;

    public luu(CameraCaptureSession cameraCaptureSession) {
        this.a = cameraCaptureSession;
    }

    @Override // defpackage.lzo
    public final lzp a() {
        return new luw(this.a.getDevice());
    }

    @Override // defpackage.lzo
    public final void b() throws lzm {
        try {
            this.a.abortCaptures();
        } catch (IllegalStateException | SecurityException e) {
            throw new lzm(e);
        }
    }

    @Override // defpackage.lzo
    public final void c(List list) throws CameraAccessException {
        kde.b(this.a, mip.aT(list));
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.lzo
    public final void d() throws lzm {
        try {
            this.a.stopRepeating();
        } catch (IllegalStateException | SecurityException e) {
            throw new lzm(e);
        }
    }

    @Override // defpackage.lzo
    public final int e(lzq lzqVar, lts ltsVar, Handler handler) throws lzm {
        try {
            return this.a.capture((CaptureRequest) mip.aS(lzqVar), new lut(ltsVar), handler);
        } catch (IllegalStateException | SecurityException e) {
            throw new lzm(e);
        }
    }

    @Override // defpackage.lzo
    public final int f(List list, lts ltsVar, Handler handler) throws lzm {
        try {
            return this.a.captureBurst(mip.aT(list), new lut(ltsVar), handler);
        } catch (IllegalStateException | SecurityException e) {
            throw new lzm(e);
        }
    }

    @Override // defpackage.lzo
    public final int g(lzq lzqVar, lts ltsVar, Handler handler) throws lzm {
        try {
            return this.a.setRepeatingRequest((CaptureRequest) mip.aS(lzqVar), new lut(ltsVar), handler);
        } catch (IllegalStateException | SecurityException e) {
            throw new lzm(e);
        }
    }
}

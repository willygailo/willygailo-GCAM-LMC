package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class axr {
    public final Map a;
    public long b;

    public axr() {
        this.a = new HashMap();
        this.b = 0L;
    }

    public axr(axr axrVar) {
        if (axrVar == null) {
            throw new NullPointerException("Tried to copy null Camera2RequestSettingsSet");
        }
        this.a = new HashMap(axrVar.a);
        this.b = axrVar.b;
    }

    public final CaptureRequest a(CameraDevice cameraDevice, int i, Surface... surfaceArr) throws CameraAccessException {
        if (cameraDevice == null) {
            throw new NullPointerException("Tried to create request using null CameraDevice");
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(i);
        for (CaptureRequest.Key key : this.a.keySet()) {
            Object objB = b(key);
            if (objB != null) {
                builderCreateCaptureRequest.set(key, objB);
            }
        }
        for (int i2 = 0; i2 <= 0; i2++) {
            Surface surface = surfaceArr[i2];
            if (surface == null) {
                throw new NullPointerException("Tried to add null Surface as request target");
            }
            builderCreateCaptureRequest.addTarget(surface);
        }
        return builderCreateCaptureRequest.build();
    }

    public final Object b(CaptureRequest.Key key) {
        if (key != null) {
            return this.a.get(key);
        }
        throw new NullPointerException("Received a null key");
    }

    public final boolean c(CaptureRequest.Key key, Object obj) {
        return Objects.equals(b(key), obj);
    }

    public final void d(CaptureRequest.Key key, Object obj) {
        if (key == null) {
            throw new NullPointerException("Received a null key");
        }
        Object objB = b(key);
        if (this.a.containsKey(key) && Objects.equals(obj, objB)) {
            return;
        }
        this.a.put(key, obj);
        this.b++;
    }
}

package defpackage;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes.dex */
final class avi {
    private Camera.Parameters a;
    private final Camera b;

    public avi(Camera camera) {
        this.b = camera;
    }

    public final synchronized Camera.Parameters a() {
        Camera.Parameters parameters;
        parameters = this.a;
        if (parameters == null) {
            parameters = this.b.getParameters();
            this.a = parameters;
            if (parameters == null) {
                axp.a(avo.a, "Camera object returned null parameters!");
                throw new IllegalStateException("camera.getParameters returned null");
            }
        }
        return parameters;
    }

    public final synchronized void b() {
        this.a = null;
    }
}

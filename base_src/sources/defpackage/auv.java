package defpackage;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes.dex */
final class auv extends awz {
    private final Camera.CameraInfo a;

    public auv(Camera.CameraInfo cameraInfo) {
        this.a = cameraInfo;
    }

    @Override // defpackage.awz
    public final int a() {
        return this.a.orientation;
    }

    @Override // defpackage.awz
    public final boolean b() {
        return this.a.facing == 0;
    }

    @Override // defpackage.awz
    public final boolean c() {
        return this.a.facing == 1;
    }
}

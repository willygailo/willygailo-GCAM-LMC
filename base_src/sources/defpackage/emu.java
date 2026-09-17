package defpackage;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: classes.dex */
public final class emu implements pys {
    private final qkg a;

    public emu(qkg qkgVar) {
        this.a = qkgVar;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CameraManager get() {
        CameraManager cameraManager = (CameraManager) ((emr) this.a.get()).a(emr.e);
        qmd.ae(cameraManager);
        return cameraManager;
    }
}

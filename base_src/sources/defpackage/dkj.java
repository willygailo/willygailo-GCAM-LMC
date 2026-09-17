package defpackage;

import android.hardware.camera2.CameraManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class dkj extends CameraManager.AvailabilityCallback {
    final /* synthetic */ AtomicBoolean a;

    public dkj(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        this.a.set(true);
    }
}

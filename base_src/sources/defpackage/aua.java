package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: loaded from: classes.dex */
final class aua extends awz {
    private final CameraCharacteristics a;

    public aua(CameraCharacteristics cameraCharacteristics) {
        this.a = cameraCharacteristics;
    }

    @Override // defpackage.awz
    public final int a() {
        return ((Integer) this.a.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    @Override // defpackage.awz
    public final boolean b() {
        return ((Integer) this.a.get(CameraCharacteristics.LENS_FACING)).equals(1);
    }

    @Override // defpackage.awz
    public final boolean c() {
        return ((Integer) this.a.get(CameraCharacteristics.LENS_FACING)).equals(0);
    }
}

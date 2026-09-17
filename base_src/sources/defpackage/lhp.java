package defpackage;

import android.hardware.camera2.CameraCharacteristics;

/* JADX INFO: loaded from: classes2.dex */
public final class lhp {
    public static final int[] a = new int[0];

    public static final lwd a(vo voVar) {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object objA = voVar.a(key);
        objA.getClass();
        switch (((Number) objA).intValue()) {
            case 0:
                return lwd.FRONT;
            case 1:
                return lwd.BACK;
            default:
                return lwd.EXTERNAL;
        }
    }
}

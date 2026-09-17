package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class axm {
    public static final int a;

    static {
        try {
            try {
                a = Class.forName("android.hardware.camera2.CameraCharacteristics").getField("CONTROL_SCENE_MODE_HDR").getInt(null);
            } catch (Exception e) {
                Log.e("LegacyVendorTags", "Error while reflecting on SCENE_MODE_HDR enum, HDR will not be available: " + e);
                a = -1;
            }
        } catch (Throwable th) {
            a = -1;
            throw th;
        }
    }
}

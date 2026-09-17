package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class hoc {
    public static final ouj a = ouj.h("com/google/android/apps/camera/secure/SecureActivityModule");

    public static boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        return "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action) || intent.getBooleanExtra("secure_camera", false);
    }
}

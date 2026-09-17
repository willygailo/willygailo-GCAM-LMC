package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class hwv {
    private static final ouj a = ouj.h("com/google/android/apps/camera/sideline/util/SidelineCoreUtils");

    public static long a(Context context, int i) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.pixel.camera.hal", i | 1073741824).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException e) {
            ((oug) ((oug) a.c()).G((char) 2725)).o("Camera HAL package not found.");
            return -1L;
        }
    }

    public static long b(Context context) {
        return a(context, 0);
    }
}

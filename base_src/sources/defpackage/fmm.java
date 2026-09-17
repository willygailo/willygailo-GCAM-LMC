package defpackage;

import android.app.ActivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class fmm {
    public static final fml a = new fml();

    public static boolean a(ActivityManager activityManager) {
        try {
            return activityManager.isLowRamDevice();
        } catch (NoSuchMethodError e) {
            return false;
        }
    }
}

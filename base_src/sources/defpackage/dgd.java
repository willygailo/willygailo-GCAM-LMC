package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class dgd {
    public static int a = 0;

    public static boolean a(String str, int i) {
        return Log.isLoggable("CAM_", i) || Log.isLoggable(str, i);
    }
}

package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class pvx {
    private static final Class a;
    private final Object b;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("android.view.DisplayCutout");
        } catch (Exception e) {
            Log.e("AndroidPCompat", "Failed to obtain DisplayCutout API.");
            cls = null;
        }
        a = cls;
    }

    private pvx(Object obj) {
        this.b = obj;
    }

    public static pvx b(Object obj) {
        if (obj == null || a == null) {
            return null;
        }
        return new pvx(obj);
    }

    public final int a(String str) {
        try {
            return ((Integer) a.getDeclaredMethod(str, new Class[0]).invoke(this.b, new Object[0])).intValue();
        } catch (Exception e) {
            return 0;
        }
    }
}

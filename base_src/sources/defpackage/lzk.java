package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class lzk {
    private final Method a;

    public lzk() throws Throwable {
        Method method = null;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            method = cls.getMethod("get", String.class, String.class);
            try {
                try {
                    cls.getMethod("set", String.class, String.class);
                    cls.getMethod("getInt", String.class, Integer.TYPE);
                    cls.getMethod("getLong", String.class, Long.TYPE);
                    this.a = method;
                } catch (Exception e) {
                    e = e;
                    throw new IllegalStateException("Unable to reflect SystemProperties.", e);
                }
            } catch (Throwable th) {
                th = th;
                this.a = method;
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th2) {
            th = th2;
            this.a = method;
            throw th;
        }
    }

    public final String a(String str) {
        str.getClass();
        try {
            Method method = this.a;
            if (method == null) {
                return null;
            }
            String str2 = (String) method.invoke(null, str, null);
            if ("".equals(str2)) {
                return null;
            }
            return str2;
        } catch (Exception e) {
            Log.e("CAM_SystemProperties", "get error", e);
            return null;
        }
    }
}

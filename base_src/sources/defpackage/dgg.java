package defpackage;

import com.google.android.apps.camera.filmstrip.GlideConfiguration;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class dgg {
    private static void a(Class cls, Exception exc) {
        String strValueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 53);
        sb.append("Unable to instantiate GlideModule implementation for ");
        sb.append(strValueOf);
        throw new RuntimeException(sb.toString(), exc);
    }

    public static void c(lis lisVar, pht phtVar, String str, String str2) {
        plk.af(phtVar, new dgf(lisVar, str, str2), pgr.INSTANCE);
    }

    public static GlideConfiguration d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                a(cls, e);
            } catch (InstantiationException e2) {
                a(cls, e2);
            } catch (NoSuchMethodException e3) {
                a(cls, e3);
            } catch (InvocationTargetException e4) {
                a(cls, e4);
            }
            if (objNewInstance instanceof GlideConfiguration) {
                return (GlideConfiguration) objNewInstance;
            }
            String strValueOf = String.valueOf(objNewInstance);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 44);
            sb.append("Expected instanceof GlideModule, but found: ");
            sb.append(strValueOf);
            throw new RuntimeException(sb.toString());
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }
}

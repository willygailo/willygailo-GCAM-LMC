package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qme {
    public static final /* synthetic */ int a = 0;

    static {
        String property = System.getProperty("java.specification.version");
        int i = 65542;
        if (property != null) {
            int iO = qno.o(property, '.', 0, 6);
            if (iO < 0) {
                try {
                    i = Integer.parseInt(property) * 65536;
                } catch (NumberFormatException e) {
                }
            } else {
                int i2 = iO + 1;
                int iO2 = qno.o(property, '.', i2, 4);
                if (iO2 < 0) {
                    iO2 = property.length();
                }
                String strSubstring = property.substring(0, iO);
                strSubstring.getClass();
                String strSubstring2 = property.substring(i2, iO2);
                strSubstring2.getClass();
                try {
                    i = (Integer.parseInt(strSubstring) * 65536) + Integer.parseInt(strSubstring2);
                } catch (NumberFormatException e2) {
                }
            }
        }
        if (i >= 65544) {
            try {
                Object objNewInstance = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                objNewInstance.getClass();
                try {
                    return;
                } catch (ClassCastException e3) {
                    Throwable thInitCause = new ClassCastException("Instance classloader: " + objNewInstance.getClass().getClassLoader() + ", base type classloader: " + qmd.class.getClassLoader()).initCause(e3);
                    thInitCause.getClass();
                    throw thInitCause;
                }
            } catch (ClassNotFoundException e4) {
                try {
                    Object objNewInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    objNewInstance2.getClass();
                    try {
                        return;
                    } catch (ClassCastException e5) {
                        Throwable thInitCause2 = new ClassCastException("Instance classloader: " + objNewInstance2.getClass().getClassLoader() + ", base type classloader: " + qmd.class.getClassLoader()).initCause(e5);
                        thInitCause2.getClass();
                        throw thInitCause2;
                    }
                } catch (ClassNotFoundException e6) {
                }
            }
        }
        if (i >= 65543) {
            try {
                Object objNewInstance3 = Class.forName("kotlin.internal.jdk7.JDK7PlatformImplementations").newInstance();
                objNewInstance3.getClass();
                try {
                } catch (ClassCastException e7) {
                    Throwable thInitCause3 = new ClassCastException("Instance classloader: " + objNewInstance3.getClass().getClassLoader() + ", base type classloader: " + qmd.class.getClassLoader()).initCause(e7);
                    thInitCause3.getClass();
                    throw thInitCause3;
                }
            } catch (ClassNotFoundException e8) {
                try {
                    Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    objNewInstance4.getClass();
                    try {
                    } catch (ClassCastException e9) {
                        Throwable thInitCause4 = new ClassCastException("Instance classloader: " + objNewInstance4.getClass().getClassLoader() + ", base type classloader: " + qmd.class.getClassLoader()).initCause(e9);
                        thInitCause4.getClass();
                        throw thInitCause4;
                    }
                } catch (ClassNotFoundException e10) {
                }
            }
        }
    }
}

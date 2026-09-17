package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oyb {
    private static final String[] a;
    private static final oye b;

    static {
        oye oyfVar;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        a = strArr;
        for (int i = 0; i < 2; i++) {
            try {
                oyfVar = (oye) Class.forName(strArr[i]).asSubclass(oye.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                oyfVar = null;
            }
            if (oyfVar != null) {
                b = oyfVar;
            }
        }
        oyfVar = new oyf();
        b = oyfVar;
    }

    public static StackTraceElement a(Class cls) {
        oxh.x(cls, "target");
        return b.a(cls);
    }

    public static StackTraceElement[] b(Class cls, int i) {
        if (i > 0 || i == -1) {
            return b.b(cls, i);
        }
        throw new IllegalArgumentException("invalid maximum depth: 0");
    }
}

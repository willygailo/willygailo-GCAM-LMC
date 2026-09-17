package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
final class own {
    public static final owp a = a(owp.d);

    private static owp a(String[] strArr) {
        owp owpVarF;
        try {
            owpVarF = oxh.f();
        } catch (NoClassDefFoundError e) {
            owpVarF = null;
        }
        if (owpVarF != null) {
            return owpVarF;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (owp) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}

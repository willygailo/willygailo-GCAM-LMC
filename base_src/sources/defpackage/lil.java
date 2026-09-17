package defpackage;

import com.eszdman.rampatcher.PatcherSession;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lil {
    public static final Object a = new Object();
    public static final Map b = new HashMap();
    public static final Map c = new HashMap();

    private lil() {
    }

    public static void a(Class cls) {
        b(cls, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map] */
    public static void b(Class cls, String str) {
        lik likVar;
        ?? r1;
        synchronized (a) {
            String str2 = (String) c.get(cls);
            if (str2 != null) {
                likVar = (lik) b.get(str2);
                r1 = str2;
            } else if (str != null) {
                Map map = b;
                lik likVar2 = (lik) map.get(str);
                if (likVar2 == null) {
                    likVar2 = new lik(str);
                    map.put(str, likVar2);
                }
                likVar = likVar2;
                r1 = map;
            } else {
                likVar = null;
                r1 = str2;
            }
        }
        if (likVar == null) {
            String strValueOf = String.valueOf(cls.getName());
            throw new IllegalStateException(strValueOf.length() != 0 ? "JniLoader was null for ".concat(strValueOf) : new String("JniLoader was null for "));
        }
        try {
            likVar.b();
            new PatcherSession(r1, null);
        } catch (UnsatisfiedLinkError e) {
            String strMapLibraryName = System.mapLibraryName(likVar.a);
            String message = e.getMessage();
            if (message != null) {
                StringBuilder sb = new StringBuilder(String.valueOf(strMapLibraryName).length() + 16);
                sb.append("couldn't find \"");
                sb.append(strMapLibraryName);
                sb.append("\"");
                if (message.contains(sb.toString())) {
                    throw new UnsatisfiedLinkError(String.format(null, "Failed to resolve \"%s\" for \"%s\". Did you forget to include the .so or register it with %s.register(%s.class, %s)? \n%s", strMapLibraryName, cls.getSimpleName(), lil.class.getSimpleName(), cls.getSimpleName(), likVar.a, e.getMessage()));
                }
            }
            throw e;
        }
    }
}

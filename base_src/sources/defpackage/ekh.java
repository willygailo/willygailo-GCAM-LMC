package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ekh {
    private static final Map a = new HashMap();

    public static synchronized Object a(Class cls) {
        Object obj;
        obj = a.get(cls);
        if (obj == null) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35);
            sb.append("No instance for ");
            sb.append(name);
            sb.append(" has been provided.");
            throw new IllegalStateException(sb.toString());
        }
        return obj;
    }

    public static synchronized void b(Class cls, Object obj) {
        a.put(cls, obj);
    }
}

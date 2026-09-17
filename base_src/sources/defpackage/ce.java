package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class ce {
    private static final xf a = new xf();

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        xf xfVar = a;
        xf xfVar2 = (xf) xfVar.get(classLoader);
        if (xfVar2 == null) {
            xfVar2 = new xf();
            xfVar.put(classLoader, xfVar2);
        }
        Class cls = (Class) xfVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        xfVar2.put(str, cls2);
        return cls2;
    }

    public bu b(String str) {
        throw null;
    }
}

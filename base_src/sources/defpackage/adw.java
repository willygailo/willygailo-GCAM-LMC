package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class adw {
    public static final adw a = new adw();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private static final void d(Map map, adv advVar, adz adzVar, Class cls) {
        adz adzVar2 = (adz) map.get(advVar);
        if (adzVar2 == null || adzVar == adzVar2) {
            if (adzVar2 == null) {
                map.put(advVar, adzVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + advVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + adzVar2 + ", new value " + adzVar);
    }

    public final Method[] a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public final bci b(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(c(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).b.entrySet()) {
                d(map, (adv) entry.getKey(), (adz) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = a(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            aep aepVar = (aep) method.getAnnotation(aep.class);
            if (aepVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(aee.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                adz adzVarA = aepVar.a();
                if (length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(adz.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (adzVarA != adz.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(map, new adv(i, method), adzVarA, cls);
                z = true;
            }
        }
        bci bciVar = new bci(map);
        this.c.put(cls, bciVar);
        this.b.put(cls, Boolean.valueOf(z));
        return bciVar;
    }

    public final bci c(Class cls) {
        bci bciVar = (bci) this.c.get(cls);
        return bciVar != null ? bciVar : b(cls, null);
    }
}

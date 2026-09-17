package defpackage;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aei {
    private static final Map a = new HashMap();
    private static final Map b = new HashMap();

    static aec a(Object obj) {
        boolean z = obj instanceof aec;
        boolean z2 = obj instanceof adx;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((adx) obj, (aec) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((adx) obj, null);
        }
        if (z) {
            return (aec) obj;
        }
        Class<?> cls = obj.getClass();
        if (b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(c((Constructor) list.get(0), obj));
        }
        ady[] adyVarArr = new ady[list.size()];
        for (int i = 0; i < list.size(); i++) {
            adyVarArr[i] = c((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(adyVarArr);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0 A[PHI: r1
      0x00f0: PHI (r1v5 java.util.ArrayList) = (r1v4 java.util.ArrayList), (r1v11 java.util.ArrayList) binds: [B:43:0x00d8, B:47:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x011a A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00f0, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    private static int b(Class cls) {
        Constructor declaredConstructor;
        Class superclass;
        Integer num = (Integer) a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 2;
        if (cls.getCanonicalName() == null) {
            i = 1;
        } else {
            ArrayList arrayList = null;
            try {
                Package r5 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r5 != null ? r5.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String str = canonicalName.replace(".", "_") + "_LifecycleAdapter";
                if (!name.isEmpty()) {
                    str = name + "." + str;
                }
                declaredConstructor = Class.forName(str).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException e) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            if (declaredConstructor != null) {
                b.put(cls, Collections.singletonList(declaredConstructor));
            } else {
                adw adwVar = adw.a;
                Boolean bool = (Boolean) adwVar.b.get(cls);
                if (bool == null) {
                    Method[] methodArrA = adwVar.a(cls);
                    for (Method method : methodArrA) {
                        if (((aep) method.getAnnotation(aep.class)) != null) {
                            adwVar.b(cls, methodArrA);
                            i = 1;
                        }
                    }
                    adwVar.b.put(cls, false);
                    superclass = cls.getSuperclass();
                    if (!d(superclass)) {
                        for (Class<?> cls2 : cls.getInterfaces()) {
                            if (d(cls2)) {
                                if (b(cls2) == 1) {
                                    i = 1;
                                } else {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) b.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            b.put(cls, arrayList);
                        } else {
                            i = 1;
                        }
                    } else if (b(superclass) == 1) {
                        i = 1;
                    } else {
                        arrayList = new ArrayList((Collection) b.get(superclass));
                        while (i < r5) {
                            if (d(cls2)) {
                                if (b(cls2) == 1) {
                                    i = 1;
                                } else {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) b.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            b.put(cls, arrayList);
                        } else {
                            i = 1;
                        }
                    }
                } else if (bool.booleanValue()) {
                    i = 1;
                } else {
                    superclass = cls.getSuperclass();
                    if (!d(superclass)) {
                        while (i < r5) {
                            if (d(cls2)) {
                                if (b(cls2) == 1) {
                                    i = 1;
                                } else {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) b.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            b.put(cls, arrayList);
                        } else {
                            i = 1;
                        }
                    } else if (b(superclass) == 1) {
                        i = 1;
                    } else {
                        arrayList = new ArrayList((Collection) b.get(superclass));
                        while (i < r5) {
                            if (d(cls2)) {
                                if (b(cls2) == 1) {
                                    i = 1;
                                } else {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) b.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            b.put(cls, arrayList);
                        } else {
                            i = 1;
                        }
                    }
                }
            }
        }
        a.put(cls, Integer.valueOf(i));
        return i;
    }

    private static ady c(Constructor constructor, Object obj) {
        try {
            return (ady) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static boolean d(Class cls) {
        return cls != null && aed.class.isAssignableFrom(cls);
    }
}

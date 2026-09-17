package androidx.work;

import defpackage.amq;
import defpackage.amt;
import defpackage.gd;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends amt {
    private static final Object c(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object objNewInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        Array.set(objNewInstance, length, obj2);
        return objNewInstance;
    }

    @Override // defpackage.amt
    public final amq a(List list) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((amq) it.next()).b().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                Class<?> cls = value.getClass();
                Object obj = map2.get(str);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (cls2.equals(cls)) {
                        if (cls2.isArray()) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, objNewInstance, 0, length);
                            System.arraycopy(value, 0, objNewInstance, length, length2);
                            value = objNewInstance;
                        } else {
                            Object objNewInstance2 = Array.newInstance(obj.getClass(), 2);
                            Array.set(objNewInstance2, 0, obj);
                            Array.set(objNewInstance2, 1, value);
                            value = objNewInstance2;
                        }
                    } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                        value = c(obj, value);
                    } else {
                        if (!cls.isArray() || !cls.getComponentType().equals(cls2)) {
                            throw new IllegalArgumentException();
                        }
                        value = c(value, obj);
                    }
                } else if (!cls.isArray()) {
                    Object objNewInstance3 = Array.newInstance(value.getClass(), 1);
                    Array.set(objNewInstance3, 0, value);
                    value = objNewInstance3;
                }
                map2.put(str, value);
            }
        }
        gd.o(map2, map);
        return gd.n(map);
    }
}

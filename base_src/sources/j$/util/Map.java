package j$.util;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.ConcurrentModificationException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public interface Map {

    /* JADX INFO: renamed from: j$.util.Map$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Object $default$compute(java.util.Map map, Object obj, BiFunction biFunction) {
            biFunction.getClass();
            Object obj2 = map.get(obj);
            Object objApply = biFunction.apply(obj, obj2);
            if (objApply != null) {
                map.put(obj, objApply);
                return objApply;
            }
            if (obj2 == null && !map.containsKey(obj)) {
                return null;
            }
            map.remove(obj);
            return null;
        }

        public static Object $default$computeIfAbsent(java.util.Map map, Object obj, Function function) {
            Object objApply;
            function.getClass();
            Object obj2 = map.get(obj);
            if (obj2 != null || (objApply = function.apply(obj)) == null) {
                return obj2;
            }
            map.put(obj, objApply);
            return objApply;
        }

        public static Object $default$computeIfPresent(java.util.Map map, Object obj, BiFunction biFunction) {
            biFunction.getClass();
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                Object objApply = biFunction.apply(obj, obj2);
                if (objApply != null) {
                    map.put(obj, objApply);
                    return objApply;
                }
                map.remove(obj);
            }
            return null;
        }

        public static void $default$forEach(java.util.Map map, BiConsumer biConsumer) {
            biConsumer.getClass();
            for (java.util.Map.Entry entry : map.entrySet()) {
                try {
                    biConsumer.accept(entry.getKey(), entry.getValue());
                } catch (IllegalStateException e) {
                    throw new ConcurrentModificationException(e);
                }
            }
        }

        public static Object $default$getOrDefault(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            return (obj3 != null || map.containsKey(obj)) ? obj3 : obj2;
        }

        public static Object $default$merge(java.util.Map map, Object obj, Object obj2, BiFunction biFunction) {
            biFunction.getClass();
            obj2.getClass();
            Object obj3 = map.get(obj);
            if (obj3 != null) {
                obj2 = biFunction.apply(obj3, obj2);
            }
            if (obj2 == null) {
                map.remove(obj);
            } else {
                map.put(obj, obj2);
            }
            return obj2;
        }

        public static Object $default$putIfAbsent(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            return obj3 == null ? map.put(obj, obj2) : obj3;
        }

        public static boolean $default$remove(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            if (!Objects.equals(obj3, obj2)) {
                return false;
            }
            if (obj3 == null && !map.containsKey(obj)) {
                return false;
            }
            map.remove(obj);
            return true;
        }

        public static Object $default$replace(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            return (obj3 != null || map.containsKey(obj)) ? map.put(obj, obj2) : obj3;
        }

        public static boolean $default$replace(java.util.Map map, Object obj, Object obj2, Object obj3) {
            Object obj4 = map.get(obj);
            if (!Objects.equals(obj4, obj2)) {
                return false;
            }
            if (obj4 == null && !map.containsKey(obj)) {
                return false;
            }
            map.put(obj, obj3);
            return true;
        }

        public static void $default$replaceAll(java.util.Map map, BiFunction biFunction) {
            biFunction.getClass();
            for (java.util.Map.Entry entry : map.entrySet()) {
                try {
                    try {
                        entry.setValue(biFunction.apply(entry.getKey(), entry.getValue()));
                    } catch (IllegalStateException e) {
                        throw new ConcurrentModificationException(e);
                    }
                } catch (IllegalStateException e2) {
                    throw new ConcurrentModificationException(e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j$.util.Map$-EL, reason: invalid class name */
    public final /* synthetic */ class EL {
        public static /* synthetic */ Object compute(java.util.Map map, Object obj, BiFunction biFunction) {
            if (map instanceof Map) {
                return ((Map) map).compute(obj, biFunction);
            }
            return map instanceof ConcurrentMap ? j$.util.concurrent.ConcurrentMap.CC.$default$compute((ConcurrentMap) map, obj, biFunction) : CC.$default$compute(map, obj, biFunction);
        }

        public static /* synthetic */ Object computeIfAbsent(java.util.Map map, Object obj, Function function) {
            if (map instanceof Map) {
                return ((Map) map).computeIfAbsent(obj, function);
            }
            return map instanceof ConcurrentMap ? j$.util.concurrent.ConcurrentMap.CC.$default$computeIfAbsent((ConcurrentMap) map, obj, function) : CC.$default$computeIfAbsent(map, obj, function);
        }

        public static /* synthetic */ Object computeIfPresent(java.util.Map map, Object obj, BiFunction biFunction) {
            if (map instanceof Map) {
                return ((Map) map).computeIfPresent(obj, biFunction);
            }
            return map instanceof ConcurrentMap ? j$.util.concurrent.ConcurrentMap.CC.$default$computeIfPresent((ConcurrentMap) map, obj, biFunction) : CC.$default$computeIfPresent(map, obj, biFunction);
        }

        public static /* synthetic */ void forEach(java.util.Map map, BiConsumer biConsumer) {
            if (map instanceof Map) {
                ((Map) map).forEach(biConsumer);
            } else if (map instanceof ConcurrentMap) {
                j$.util.concurrent.ConcurrentMap.CC.$default$forEach((ConcurrentMap) map, biConsumer);
            } else {
                CC.$default$forEach(map, biConsumer);
            }
        }

        public static /* synthetic */ Object getOrDefault(java.util.Map map, Object obj, Object obj2) {
            if (map instanceof Map) {
                return ((Map) map).getOrDefault(obj, obj2);
            }
            return map instanceof ConcurrentMap ? j$.util.concurrent.ConcurrentMap.CC.$default$getOrDefault((ConcurrentMap) map, obj, obj2) : CC.$default$getOrDefault(map, obj, obj2);
        }

        public static /* synthetic */ Object merge(java.util.Map map, Object obj, Object obj2, BiFunction biFunction) {
            if (map instanceof Map) {
                return ((Map) map).merge(obj, obj2, biFunction);
            }
            return map instanceof ConcurrentMap ? j$.util.concurrent.ConcurrentMap.CC.$default$merge((ConcurrentMap) map, obj, obj2, biFunction) : CC.$default$merge(map, obj, obj2, biFunction);
        }

        public static /* synthetic */ Object putIfAbsent(java.util.Map map, Object obj, Object obj2) {
            return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : CC.$default$putIfAbsent(map, obj, obj2);
        }

        public static /* synthetic */ boolean remove(java.util.Map map, Object obj, Object obj2) {
            return map instanceof Map ? ((Map) map).remove(obj, obj2) : CC.$default$remove(map, obj, obj2);
        }

        public static /* synthetic */ Object replace(java.util.Map map, Object obj, Object obj2) {
            return map instanceof Map ? ((Map) map).replace(obj, obj2) : CC.$default$replace(map, obj, obj2);
        }

        public static /* synthetic */ boolean replace(java.util.Map map, Object obj, Object obj2, Object obj3) {
            return map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : CC.$default$replace(map, obj, obj2, obj3);
        }

        public static /* synthetic */ void replaceAll(java.util.Map map, BiFunction biFunction) {
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                j$.util.concurrent.ConcurrentMap.CC.$default$replaceAll((ConcurrentMap) map, biFunction);
            } else {
                CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    public interface Entry {
        boolean equals(Object obj);

        Object getKey();

        Object getValue();

        int hashCode();

        Object setValue(Object obj);
    }

    void clear();

    Object compute(Object obj, BiFunction biFunction);

    Object computeIfAbsent(Object obj, Function function);

    Object computeIfPresent(Object obj, BiFunction biFunction);

    boolean containsKey(Object obj);

    boolean containsValue(Object obj);

    Set entrySet();

    boolean equals(Object obj);

    void forEach(BiConsumer biConsumer);

    Object get(Object obj);

    Object getOrDefault(Object obj, Object obj2);

    int hashCode();

    boolean isEmpty();

    Set keySet();

    Object merge(Object obj, Object obj2, BiFunction biFunction);

    Object put(Object obj, Object obj2);

    void putAll(java.util.Map map);

    Object putIfAbsent(Object obj, Object obj2);

    Object remove(Object obj);

    boolean remove(Object obj, Object obj2);

    Object replace(Object obj, Object obj2);

    boolean replace(Object obj, Object obj2, Object obj3);

    void replaceAll(BiFunction biFunction);

    int size();

    java.util.Collection values();
}

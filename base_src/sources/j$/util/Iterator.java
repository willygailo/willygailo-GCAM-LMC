package j$.util;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public interface Iterator {

    /* JADX INFO: renamed from: j$.util.Iterator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$forEachRemaining(java.util.Iterator it, Consumer consumer) {
            consumer.getClass();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }

        public static void $default$remove(java.util.Iterator it) {
            throw new UnsupportedOperationException("remove");
        }
    }

    /* JADX INFO: renamed from: j$.util.Iterator$-EL, reason: invalid class name */
    public abstract /* synthetic */ class EL {
        public static /* synthetic */ void forEachRemaining(java.util.Iterator it, Consumer consumer) {
            if (it instanceof Iterator) {
                ((Iterator) it).forEachRemaining(consumer);
            } else {
                CC.$default$forEachRemaining(it, consumer);
            }
        }
    }

    void forEachRemaining(Consumer consumer);

    boolean hasNext();

    Object next();

    void remove();
}

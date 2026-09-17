package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class DesugarUnsafe {
    private static final DesugarUnsafe theUnsafeWrapper;
    private final Unsafe theUnsafe;

    static {
        Field unsafeField = getUnsafeField();
        unsafeField.setAccessible(true);
        try {
            theUnsafeWrapper = new DesugarUnsafe((Unsafe) unsafeField.get(null));
        } catch (IllegalAccessException unused) {
            throw new AssertionError("Couldn't get the Unsafe");
        }
    }

    DesugarUnsafe(Unsafe unsafe) {
        this.theUnsafe = unsafe;
    }

    public static DesugarUnsafe getUnsafe() {
        return theUnsafeWrapper;
    }

    private static Field getUnsafeField() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException unused) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe");
        }
    }

    public int arrayBaseOffset(Class cls) {
        return this.theUnsafe.arrayBaseOffset(cls);
    }

    public int arrayIndexScale(Class cls) {
        return this.theUnsafe.arrayIndexScale(cls);
    }

    public boolean compareAndSetInt(Object obj, long j, int i, int i2) {
        return this.theUnsafe.compareAndSwapInt(obj, j, i, i2);
    }

    public boolean compareAndSetLong(Object obj, long j, long j2, long j3) {
        return this.theUnsafe.compareAndSwapLong(obj, j, j2, j3);
    }

    public boolean compareAndSetObject(Object obj, long j, Object obj2, Object obj3) {
        return this.theUnsafe.compareAndSwapObject(obj, j, obj2, obj3);
    }

    public int getAndAddInt(Object obj, long j, int i) {
        int intVolatile;
        do {
            intVolatile = this.theUnsafe.getIntVolatile(obj, j);
        } while (!this.theUnsafe.compareAndSwapInt(obj, j, intVolatile, intVolatile + i));
        return intVolatile;
    }

    public Object getObjectAcquire(Object obj, long j) {
        return this.theUnsafe.getObjectVolatile(obj, j);
    }

    public long objectFieldOffset(Class cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        try {
            return objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("Cannot find field:");
        }
    }

    public long objectFieldOffset(Field field) {
        return this.theUnsafe.objectFieldOffset(field);
    }

    public void putObjectRelease(Object obj, long j, Object obj2) {
        this.theUnsafe.putObjectVolatile(obj, j, obj2);
    }
}

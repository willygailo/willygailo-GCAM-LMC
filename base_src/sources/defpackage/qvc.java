package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public final class qvc {
    private static final int a = b(Throwable.class, -1);
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap c = new WeakHashMap();

    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:71:0x0126 A[LOOP:4: B:70:0x0124->B:71:0x0126, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x013b A[Catch: all -> 0x0157, TryCatch #1 {all -> 0x0157, blocks: (B:73:0x0133, B:75:0x013b, B:77:0x013f), top: B:98:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x013e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0144 A[LOOP:5: B:78:0x0142->B:79:0x0144, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x0150  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object objL;
        ReentrantReadWriteLock reentrantReadWriteLock;
        ReentrantReadWriteLock.ReadLock lock;
        int readHoldCount;
        int i;
        ReentrantReadWriteLock.WriteLock writeLock;
        qmu qmuVar;
        qvb qvbVar;
        th.getClass();
        if (th instanceof qqc) {
            try {
                objL = ((qqc) th).a();
            } catch (Throwable th2) {
                objL = qmd.L(th2);
            }
            return (Throwable) (true != (objL instanceof qkm) ? objL : null);
        }
        ReentrantReadWriteLock reentrantReadWriteLock2 = b;
        ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock2.readLock();
        lock2.lock();
        try {
            qmu qmuVar2 = (qmu) c.get(th.getClass());
            lock2.unlock();
            if (qmuVar2 != null) {
                return (Throwable) qmuVar2.a(th);
            }
            int i2 = 0;
            if (a != b(th.getClass(), 0)) {
                ReentrantReadWriteLock.ReadLock lock3 = reentrantReadWriteLock2.readLock();
                int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount2; i3++) {
                    lock3.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    c.put(th.getClass(), qqe.d);
                    while (i2 < readHoldCount2) {
                        lock3.lock();
                        i2++;
                    }
                    return null;
                } finally {
                    while (i2 < readHoldCount2) {
                        lock3.lock();
                        i2++;
                    }
                    writeLock2.unlock();
                }
            }
            Object[] constructors = th.getClass().getConstructors();
            mvm mvmVar = new mvm(6);
            constructors.getClass();
            int length = constructors.length;
            if (length != 0) {
                constructors = Arrays.copyOf(constructors, length);
                constructors.getClass();
                if (constructors.length > 1) {
                    Arrays.sort(constructors, mvmVar);
                }
            }
            qvb qvbVar2 = null;
            try {
                for (Constructor constructor : qmd.F(constructors)) {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    switch (parameterTypes.length) {
                        case 0:
                            qvbVar = new qvb(constructor, 3);
                            qvbVar2 = qvbVar;
                            break;
                        case 1:
                            Class<?> cls = parameterTypes[0];
                            if (qno.c(cls, Throwable.class)) {
                                qvbVar2 = new qvb(constructor, 0);
                            } else if (qno.c(cls, String.class)) {
                                qvbVar = new qvb(constructor, 2);
                                qvbVar2 = qvbVar;
                            } else {
                                qvbVar2 = null;
                            }
                            break;
                        case 2:
                            qvbVar2 = (!qno.c(parameterTypes[0], String.class) || !qno.c(parameterTypes[1], Throwable.class)) ? null : new qvb(constructor, 1);
                            break;
                        default:
                            qvbVar2 = null;
                            break;
                    }
                    if (qvbVar2 != null) {
                        reentrantReadWriteLock = b;
                        lock = reentrantReadWriteLock.readLock();
                        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                            readHoldCount = reentrantReadWriteLock.getReadHoldCount();
                        } else {
                            readHoldCount = 0;
                        }
                        for (i = 0; i < readHoldCount; i++) {
                            lock.unlock();
                        }
                        writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        WeakHashMap weakHashMap = c;
                        Class<?> cls2 = th.getClass();
                        if (qvbVar2 == null) {
                            qmuVar = qqe.e;
                        } else {
                            qmuVar = qvbVar2;
                        }
                        weakHashMap.put(cls2, qmuVar);
                        while (i2 < readHoldCount) {
                            lock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                        if (qvbVar2 == null) {
                            return null;
                        }
                        return (Throwable) qvbVar2.a(th);
                    }
                }
                WeakHashMap weakHashMap2 = c;
                Class<?> cls3 = th.getClass();
                if (qvbVar2 == null) {
                    qmuVar = qqe.e;
                } else {
                    qmuVar = qvbVar2;
                }
                weakHashMap2.put(cls3, qmuVar);
                while (i2 < readHoldCount) {
                    lock.lock();
                    i2++;
                }
                writeLock.unlock();
                if (qvbVar2 == null) {
                    return null;
                }
                return (Throwable) qvbVar2.a(th);
            } catch (Throwable th3) {
                while (i2 < readHoldCount) {
                    lock.lock();
                    i2++;
                }
                writeLock.unlock();
                throw th3;
            }
            reentrantReadWriteLock = b;
            lock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                readHoldCount = reentrantReadWriteLock.getReadHoldCount();
            } else {
                readHoldCount = 0;
            }
            while (i < readHoldCount) {
                lock.unlock();
            }
            writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
        } catch (Throwable th4) {
            lock2.unlock();
            throw th4;
        }
    }

    private static final int b(Class cls, int i) {
        Object objL;
        cls.getClass();
        qns.b(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objL = qmd.L(th);
            }
        } while (cls != null);
        objL = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (true == (objL instanceof qkm)) {
            objL = objValueOf;
        }
        return ((Number) objL).intValue();
    }
}

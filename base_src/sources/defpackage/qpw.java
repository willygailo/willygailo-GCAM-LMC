package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class qpw extends qqx {
    public static final qpw b = new qpw();
    private static final int d;
    private static volatile Executor pool;

    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[LOOP:0: B:24:0x0045->B:37:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0076 A[EDGE_INSN: B:52:0x0076->B:41:0x0076 BREAK  A[LOOP:0: B:24:0x0045->B:37:0x0066], SYNTHETIC] */
    static {
        String property;
        int iIntValue;
        boolean z;
        int i;
        Integer numValueOf = null;
        try {
            property = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable th) {
            property = null;
        }
        if (property == null) {
            iIntValue = -1;
        } else {
            int length = property.length();
            if (length != 0) {
                int i2 = 0;
                char cCharAt = property.charAt(0);
                int i3 = -2147483647;
                int i4 = 1;
                if (qno.d(cCharAt) >= 0) {
                    z = false;
                    i4 = 0;
                } else if (length != 1) {
                    if (cCharAt == '-') {
                        i3 = Integer.MIN_VALUE;
                        z = true;
                    } else if (cCharAt == '+') {
                        z = false;
                    }
                }
                int i5 = -59652323;
                while (true) {
                    if (i4 >= length) {
                        if (!z) {
                            numValueOf = Integer.valueOf(-i2);
                            break;
                        } else {
                            numValueOf = Integer.valueOf(i2);
                            break;
                        }
                    }
                    int iX = qno.x(property.charAt(i4));
                    if (iX < 0) {
                        break;
                    }
                    if (i2 >= i5) {
                        i = i2 * 10;
                        if (i < i3 + iX) {
                            break;
                        }
                        i2 = i - iX;
                        i4++;
                    } else {
                        if (i5 != -59652323 || i2 < -214748364) {
                            break;
                        }
                        i5 = -214748364;
                        i = i2 * 10;
                        if (i < i3 + iX) {
                            break;
                            break;
                        } else {
                            i2 = i - iX;
                            i4++;
                        }
                    }
                }
            }
            if (numValueOf == null || numValueOf.intValue() <= 0) {
                throw new IllegalStateException(qno.a("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", property).toString());
            }
            iIntValue = numValueOf.intValue();
        }
        d = iIntValue;
    }

    private qpw() {
    }

    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c A[Catch: all -> 0x0091, TRY_LEAVE, TryCatch #0 {all -> 0x0091, blocks: (B:42:0x006e, B:44:0x008c), top: B:60:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0094 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #4 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:50:0x0098, B:15:0x001d, B:16:0x0023, B:27:0x0042, B:36:0x0062, B:49:0x0094), top: B:68:0x0001 }] */
    private final synchronized Executor f() {
        ExecutorService executorServiceH;
        Class<?> cls;
        ExecutorService executorService;
        Integer num;
        Object objNewInstance;
        Executor executor = pool;
        if (executor != null) {
            return executor;
        }
        if (System.getSecurityManager() != null) {
            executorServiceH = h();
        } else {
            executorServiceH = null;
            try {
                cls = Class.forName("java.util.concurrent.ForkJoinPool");
            } catch (Throwable th) {
                cls = null;
            }
            if (cls == null) {
                executorServiceH = h();
            } else if (d < 0) {
                try {
                    Object objInvoke = cls.getMethod("commonPool", new Class[0]).invoke(null, new Object[0]);
                    executorService = objInvoke instanceof ExecutorService ? (ExecutorService) objInvoke : null;
                } catch (Throwable th2) {
                }
                if (executorService == null) {
                    try {
                        objNewInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(g()));
                        if (objNewInstance instanceof ExecutorService) {
                            executorServiceH = (ExecutorService) objNewInstance;
                        }
                    } catch (Throwable th3) {
                    }
                    if (executorServiceH == null) {
                        executorServiceH = h();
                    }
                } else {
                    executorService.submit(oge.f);
                    try {
                        Object objInvoke2 = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
                        num = objInvoke2 instanceof Integer ? (Integer) objInvoke2 : null;
                    } catch (Throwable th4) {
                    }
                    if (num == null || num.intValue() <= 0) {
                        executorService = null;
                    }
                    if (executorService != null) {
                        executorServiceH = executorService;
                    } else {
                        objNewInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(g()));
                        if (objNewInstance instanceof ExecutorService) {
                            executorServiceH = (ExecutorService) objNewInstance;
                        }
                        if (executorServiceH == null) {
                            executorServiceH = h();
                        }
                    }
                }
            } else {
                objNewInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(g()));
                if (objNewInstance instanceof ExecutorService) {
                    executorServiceH = (ExecutorService) objNewInstance;
                }
                if (executorServiceH == null) {
                    executorServiceH = h();
                }
            }
        }
        pool = executorServiceH;
        return executorServiceH;
    }

    private static final int g() {
        Integer numValueOf = Integer.valueOf(d);
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        return numValueOf == null ? qno.f(Runtime.getRuntime().availableProcessors() - 1, 1) : numValueOf.intValue();
    }

    private static final ExecutorService h() {
        return Executors.newFixedThreadPool(g(), new qpv(new AtomicInteger()));
    }

    @Override // defpackage.qqx
    public final Executor c() {
        Executor executor = pool;
        return executor == null ? f() : executor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // defpackage.qqf
    public final void d(qln qlnVar, Runnable runnable) {
        qlnVar.getClass();
        try {
            Executor executorF = pool;
            if (executorF == null) {
                executorF = f();
            }
            executorF.execute(runnable);
        } catch (RejectedExecutionException e) {
            qqm.b.o(runnable);
        }
    }

    @Override // defpackage.qqf
    public final String toString() {
        return "CommonPool";
    }
}

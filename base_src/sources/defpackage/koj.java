package defpackage;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class koj {
    private static volatile ClassLoader a = null;
    private static volatile Thread b = null;

    public static synchronized ClassLoader a() {
        if (a == null) {
            a = b();
        }
        return a;
    }

    private static synchronized ClassLoader b() {
        ClassLoader contextClassLoader;
        contextClassLoader = null;
        if (b == null) {
            b = c();
            if (b != null) {
            }
        }
        synchronized (b) {
            try {
                contextClassLoader = b.getContextClassLoader();
            } catch (SecurityException e) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.w("DynamiteLoaderV2CL", strValueOf.length() != 0 ? "Failed to get thread context classloader ".concat(strValueOf) : new String("Failed to get thread context classloader "));
            }
        }
        return contextClassLoader;
    }

    private static synchronized Thread c() {
        SecurityException e;
        Thread koiVar;
        Thread thread;
        ThreadGroup threadGroup;
        ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
        if (threadGroup2 == null) {
            return null;
        }
        synchronized (Void.class) {
            try {
                int iActiveGroupCount = threadGroup2.activeGroupCount();
                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                threadGroup2.enumerate(threadGroupArr);
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= iActiveGroupCount) {
                        threadGroup = null;
                        break;
                    }
                    threadGroup = threadGroupArr[i2];
                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                        break;
                    }
                    i2++;
                }
                if (threadGroup == null) {
                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                }
                int iActiveCount = threadGroup.activeCount();
                Thread[] threadArr = new Thread[iActiveCount];
                threadGroup.enumerate(threadArr);
                while (true) {
                    if (i >= iActiveCount) {
                        thread = null;
                        break;
                    }
                    thread = threadArr[i];
                    if ("GmsDynamite".equals(thread.getName())) {
                        break;
                    }
                    i++;
                }
                if (thread == null) {
                    try {
                        koiVar = new koi(threadGroup);
                        try {
                            koiVar.setContextClassLoader(null);
                            koiVar.start();
                            thread = koiVar;
                        } catch (SecurityException e2) {
                            e = e2;
                            String strValueOf = String.valueOf(e.getMessage());
                            Log.w("DynamiteLoaderV2CL", strValueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(strValueOf) : new String("Failed to enumerate thread/threadgroup "));
                            thread = koiVar;
                        }
                    } catch (SecurityException e3) {
                        e = e3;
                        koiVar = thread;
                    }
                }
            } catch (SecurityException e4) {
                e = e4;
                koiVar = null;
            }
        }
        return thread;
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
abstract class phs extends AtomicReference implements Runnable {
    private static final Runnable a = new oge(2);
    private static final Runnable b = new oge(2);

    private final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        phr phrVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof phr)) {
                if (runnable != b) {
                    break;
                }
            } else {
                phrVar = (phr) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(phrVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public abstract Object a();

    public abstract String b();

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean g();

    final void h() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            phr phrVar = new phr(this);
            phrVar.a(Thread.currentThread());
            if (compareAndSet(runnable, phrVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(a)) == b) {
                    }
                } finally {
                    if (((Runnable) getAndSet(a)) == b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z = !g();
            if (z) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, a)) {
                        c(threadCurrentThread);
                    }
                    d(th);
                    return;
                }
            }
            if (!compareAndSet(threadCurrentThread, a)) {
                c(threadCurrentThread);
            }
            if (z) {
                e(objA);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = (Runnable) get();
        if (runnable == a) {
            string = "running=[DONE]";
        } else if (runnable instanceof phr) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strB = b();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(strB).length());
        sb2.append(string);
        sb2.append(", ");
        sb2.append(strB);
        return sb2.toString();
    }
}

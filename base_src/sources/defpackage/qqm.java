package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class qqm extends qqv implements Runnable {
    private static volatile Thread _thread;
    public static final qqm b;
    private static volatile int debugStatus;
    private static final long g;

    static {
        Long l;
        qqm qqmVar = new qqm();
        b = qqmVar;
        qqmVar.i(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException e) {
            l = 1000L;
        }
        g = timeUnit.toNanos(l.longValue());
    }

    private qqm() {
    }

    private final synchronized Thread q() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final synchronized void r() {
        if (t()) {
            debugStatus = 3;
            qpe qpeVar = ((qqv) this).e;
            int i = qpf.a;
            qpeVar.a = null;
            this.f.a = null;
            notifyAll();
        }
    }

    private final synchronized boolean s() {
        if (t()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private static final boolean t() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    @Override // defpackage.qqu
    protected final Thread c() {
        Thread thread = _thread;
        return thread == null ? q() : thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ThreadLocal threadLocal = qrz.a;
        qrz.a.set(this);
        try {
            if (!s()) {
                _thread = null;
                r();
                if (p()) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jF = f();
                if (jF == Long.MAX_VALUE) {
                    long jNanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = g + jNanoTime;
                    }
                    long j2 = j - jNanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        r();
                        if (p()) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (jF > j2) {
                        jF = j2;
                    }
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jF > 0) {
                    if (t()) {
                        _thread = null;
                        r();
                        if (p()) {
                            return;
                        } else {
                            return;
                        }
                    }
                    LockSupport.parkNanos(this, jF);
                }
            }
        } finally {
            _thread = null;
            r();
            if (!p()) {
                c();
            }
        }
    }
}

package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class axk extends Thread {
    private static final axo c = new axo("DispatchThread");
    public final Queue a;
    public Boolean b;
    private final Handler d;
    private final HandlerThread e;

    public axk(Handler handler, HandlerThread handlerThread) {
        super("Camera Job Dispatch Thread");
        this.a = new LinkedList();
        this.b = new Boolean(false);
        this.d = handler;
        this.e = handlerThread;
    }

    private final boolean c() {
        boolean zBooleanValue;
        synchronized (this.b) {
            zBooleanValue = this.b.booleanValue();
        }
        return zBooleanValue;
    }

    public final void a(Runnable runnable) {
        if (c()) {
            throw new IllegalStateException("Trying to run job on interrupted dispatcher thread");
        }
        synchronized (this.a) {
            if (this.a.size() == 256) {
                throw new RuntimeException("Camera master thread job queue full");
            }
            this.a.add(runnable);
            this.a.notifyAll();
        }
    }

    public final void b(Runnable runnable, Object obj, String str) {
        String str2 = "Timeout waiting 3500ms for " + str;
        synchronized (obj) {
            long jUptimeMillis = SystemClock.uptimeMillis() + 3500;
            try {
                a(runnable);
                obj.wait(3500L);
                if (SystemClock.uptimeMillis() > jUptimeMillis) {
                    throw new IllegalStateException(str2);
                }
            } catch (InterruptedException e) {
                if (SystemClock.uptimeMillis() > jUptimeMillis) {
                    throw new IllegalStateException(str2);
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Runnable runnable;
        while (true) {
            synchronized (this.a) {
                while (this.a.size() == 0 && !c()) {
                    try {
                        try {
                            this.a.wait();
                        } catch (InterruptedException e) {
                            axp.c(c, "Dispatcher thread wait() interrupted, exiting");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                runnable = (Runnable) this.a.poll();
            }
            if (runnable != null) {
                runnable.run();
                synchronized (this) {
                    this.d.post(new axj(this));
                    try {
                        wait();
                    } catch (InterruptedException e2) {
                    }
                }
            } else if (c()) {
                this.e.quitSafely();
                return;
            }
        }
    }
}

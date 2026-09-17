package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class axi {
    private static final axo a = new axo("CamStateHolder");
    private int b;
    private boolean c;

    public axi() {
        c(1);
        this.c = false;
    }

    public final synchronized int a() {
        return this.b;
    }

    public final synchronized void b() {
        this.c = true;
    }

    public final synchronized void c(int i) {
        if (this.b != i) {
            axo axoVar = a;
            Integer.toBinaryString(i);
            axp.g(axoVar);
        }
        this.b = i;
        notifyAll();
    }

    public final synchronized boolean d() {
        return this.c;
    }

    public final void e(int i) {
        axo axoVar = a;
        Integer.toBinaryString(i);
        axp.g(axoVar);
        long jUptimeMillis = SystemClock.uptimeMillis() + 3500;
        synchronized (this) {
            while ((a() | i) != i) {
                try {
                    wait(3500L);
                } catch (InterruptedException e) {
                    if (SystemClock.uptimeMillis() > jUptimeMillis) {
                        axp.c(a, "Timeout waiting.");
                    }
                    return;
                }
            }
        }
    }
}

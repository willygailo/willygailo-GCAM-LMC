package defpackage;

import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class bhk {
    private static volatile bhk c;
    private int d;
    private boolean e = true;
    private static final File b = new File("/proc/self/fd");
    public static volatile int a = -1;

    public bhk() {
        new AtomicBoolean(false);
    }

    public static bhk a() {
        if (c == null) {
            synchronized (bhk.class) {
                if (c == null) {
                    c = new bhk();
                }
            }
        }
        return c;
    }

    private final synchronized boolean c() {
        boolean z = true;
        int i = this.d + 1;
        this.d = i;
        if (i >= 50) {
            this.d = 0;
            int length = b.list().length;
            long j = a != -1 ? a : 20000;
            if (length >= j) {
                z = false;
            }
            this.e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder(135);
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(j);
                Log.w("Downsampler", sb.toString());
            }
        }
        return this.e;
    }

    public final boolean b(int i, int i2, boolean z, boolean z2) {
        return z && !z2 && i >= 0 && i2 >= 0 && c();
    }
}

package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class ThreadPoolConfig {
    public transient long a;
    protected transient boolean b;

    public ThreadPoolConfig() {
        this(GcamModuleJNI.new_ThreadPoolConfig(), true);
    }

    public ThreadPoolConfig(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long a(ThreadPoolConfig threadPoolConfig) {
        if (threadPoolConfig == null) {
            return 0L;
        }
        return threadPoolConfig.a;
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ThreadPoolConfig(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}

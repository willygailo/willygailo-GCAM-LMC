package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class ThreadPriority {
    public transient long a;
    protected transient boolean b;

    public ThreadPriority() {
        long jNew_ThreadPriority = GcamModuleJNI.new_ThreadPriority();
        this.b = true;
        this.a = jNew_ThreadPriority;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ThreadPriority(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}

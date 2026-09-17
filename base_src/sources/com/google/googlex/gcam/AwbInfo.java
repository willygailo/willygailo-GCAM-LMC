package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class AwbInfo {
    public transient long a;
    protected transient boolean b;

    public AwbInfo() {
        this(GcamModuleJNI.new_AwbInfo__SWIG_0(), true);
    }

    public AwbInfo(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long a(AwbInfo awbInfo) {
        if (awbInfo == null) {
            return 0L;
        }
        return awbInfo.a;
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AwbInfo(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}

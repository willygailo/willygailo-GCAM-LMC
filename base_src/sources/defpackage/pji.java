package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;

/* JADX INFO: loaded from: classes2.dex */
public final class pji {
    public transient long a;
    protected transient boolean b = true;

    public pji(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_PortraitDepthArguments(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}

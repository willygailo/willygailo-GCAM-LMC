package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class Size {
    public transient long a;
    protected transient boolean b;

    public Size() {
        long jNew_Size = GcamModuleJNI.new_Size();
        this.b = true;
        this.a = jNew_Size;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_Size(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}

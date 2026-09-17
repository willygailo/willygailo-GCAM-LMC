package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class RawReadView {
    public transient long a;
    protected transient boolean b = true;

    public RawReadView(long j) {
        this.a = j;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_RawReadView(j);
            }
            this.a = 0L;
        }
    }

    public final boolean b() {
        return GcamModuleJNI.RawReadView_empty(this.a, this);
    }

    protected void finalize() {
        a();
    }
}

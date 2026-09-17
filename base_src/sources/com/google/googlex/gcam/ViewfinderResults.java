package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class ViewfinderResults {
    protected transient boolean a;
    private transient long b;

    public ViewfinderResults() {
        this(GcamModuleJNI.new_ViewfinderResults());
    }

    public ViewfinderResults(long j) {
        this.a = true;
        this.b = j;
    }

    public final float a() {
        return GcamModuleJNI.ViewfinderResults_gyro_speed_rad_per_sec_get(this.b, this);
    }

    public final synchronized void b() {
        long j = this.b;
        if (j != 0) {
            if (this.a) {
                this.a = false;
                GcamModuleJNI.delete_ViewfinderResults(j);
            }
            this.b = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}

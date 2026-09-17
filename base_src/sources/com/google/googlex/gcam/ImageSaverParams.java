package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class ImageSaverParams {
    public transient long a;
    protected transient boolean b;

    public ImageSaverParams() {
        this(GcamModuleJNI.new_ImageSaverParams(), true);
    }

    public ImageSaverParams(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final String a() {
        return GcamModuleJNI.ImageSaverParams_dest_folder_get(this.a, this);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_ImageSaverParams(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}

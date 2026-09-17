package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class LiveHdrMetadata {
    public transient long a;
    protected transient boolean b;

    public LiveHdrMetadata() {
        this(GcamModuleJNI.new_LiveHdrMetadata(), true);
    }

    public LiveHdrMetadata(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_LiveHdrMetadata(j);
            }
            this.a = 0L;
        }
    }

    public final void b(float f) {
        GcamModuleJNI.LiveHdrMetadata_manual_long_tet_override_set(this.a, this, f);
    }

    public final void c(float f) {
        GcamModuleJNI.LiveHdrMetadata_manual_short_tet_override_set(this.a, this, f);
    }

    public final void d(float f) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_long_tet_set(this.a, this, f);
    }

    public final void e(float f) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_portrait_tet_set(this.a, this, f);
    }

    public final void f(float f) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_short_tet_set(this.a, this, f);
    }

    protected final void finalize() {
        a();
    }
}

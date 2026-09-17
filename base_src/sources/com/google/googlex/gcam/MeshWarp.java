package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class MeshWarp {
    public transient long a;
    protected transient boolean b;

    public MeshWarp() {
        this(GcamModuleJNI.new_MeshWarp(), true);
    }

    public MeshWarp(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final int a() {
        return GcamModuleJNI.MeshWarp_grid_cols_get(this.a, this);
    }

    public final int b() {
        return GcamModuleJNI.MeshWarp_grid_rows_get(this.a, this);
    }

    public final FloatVector c() {
        long jMeshWarp_mesh_warp_data_get = GcamModuleJNI.MeshWarp_mesh_warp_data_get(this.a, this);
        if (jMeshWarp_mesh_warp_data_get == 0) {
            return null;
        }
        return new FloatVector(jMeshWarp_mesh_warp_data_get, false);
    }

    public final synchronized void d() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_MeshWarp(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        d();
    }
}

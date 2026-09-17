package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class LandmarkMap {
    private transient long a;

    public LandmarkMap() {
        this(GcamModuleJNI.new_LandmarkMap__SWIG_0());
    }

    public LandmarkMap(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        if (this.a != 0) {
            this.a = 0L;
        }
    }

    public final void b(int i, FaceInfo.Landmark landmark) {
        GcamModuleJNI.LandmarkMap_set(this.a, this, i, landmark.a, landmark);
    }

    protected final void finalize() {
        a();
    }
}

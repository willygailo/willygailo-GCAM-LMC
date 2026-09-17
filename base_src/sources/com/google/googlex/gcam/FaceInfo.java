package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class FaceInfo {
    public transient long a;
    protected transient boolean b;

    public class Landmark {
        public transient long a;
        protected transient boolean b;

        public Landmark() {
            long jNew_FaceInfo_Landmark = GcamModuleJNI.new_FaceInfo_Landmark();
            this.b = true;
            this.a = jNew_FaceInfo_Landmark;
        }

        public final synchronized void a() {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_FaceInfo_Landmark(j);
                }
                this.a = 0L;
            }
        }

        public final void b(float f) {
            GcamModuleJNI.FaceInfo_Landmark_x_set(this.a, this, f);
        }

        public final void c(float f) {
            GcamModuleJNI.FaceInfo_Landmark_y_set(this.a, this, f);
        }

        protected final void finalize() {
            a();
        }
    }

    public FaceInfo() {
        long jNew_FaceInfo = GcamModuleJNI.new_FaceInfo();
        this.b = true;
        this.a = jNew_FaceInfo;
    }

    public final LandmarkMap a() {
        long jFaceInfo_landmarks_get = GcamModuleJNI.FaceInfo_landmarks_get(this.a, this);
        if (jFaceInfo_landmarks_get == 0) {
            return null;
        }
        return new LandmarkMap(jFaceInfo_landmarks_get);
    }

    public final synchronized void b() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_FaceInfo(j);
            }
            this.a = 0L;
        }
    }

    protected final void finalize() {
        b();
    }
}

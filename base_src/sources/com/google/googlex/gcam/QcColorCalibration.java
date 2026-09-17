package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class QcColorCalibration {
    public transient long a;
    protected transient boolean b;

    /* JADX INFO: loaded from: classes2.dex */
    public class IlluminantData {
        public transient long a;
        protected transient boolean b;

        public IlluminantData() {
            long jNew_QcColorCalibration_IlluminantData = GcamModuleJNI.new_QcColorCalibration_IlluminantData();
            this.b = true;
            this.a = jNew_QcColorCalibration_IlluminantData;
        }

        public final synchronized void a() {
            long j = this.a;
            if (j != 0) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_QcColorCalibration_IlluminantData(j);
                }
                this.a = 0L;
            }
        }

        protected final void finalize() {
            a();
        }
    }

    public QcColorCalibration() {
        long jNew_QcColorCalibration = GcamModuleJNI.new_QcColorCalibration();
        this.b = true;
        this.a = jNew_QcColorCalibration;
    }

    public final synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_QcColorCalibration(j);
            }
            this.a = 0L;
        }
    }

    public final void b(float f) {
        GcamModuleJNI.QcColorCalibration_grgb_ratio_set(this.a, this, f);
    }

    protected final void finalize() {
        a();
    }
}

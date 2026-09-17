package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class YuvWriteView extends YuvReadView {
    public transient long c;

    public YuvWriteView() {
        this(GcamModuleJNI.new_YuvWriteView__SWIG_0());
    }

    public YuvWriteView(long j) {
        super(GcamModuleJNI.YuvWriteView_SWIGUpcast(j));
        this.c = j;
    }

    public static long e(YuvWriteView yuvWriteView) {
        if (yuvWriteView == null) {
            return 0L;
        }
        return yuvWriteView.c;
    }

    @Override // com.google.googlex.gcam.YuvReadView
    public synchronized void a() {
        long j = this.c;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_YuvWriteView(j);
            }
            this.c = 0L;
        }
        super.a();
    }

    @Override // com.google.googlex.gcam.YuvReadView
    protected void finalize() {
        a();
    }
}

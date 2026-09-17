package com.google.googlex.gcam;

/* JADX INFO: loaded from: classes.dex */
public class YuvImage extends YuvWriteView {
    private transient long d;

    public YuvImage(int i, int i2, int i3) {
        this(GcamModuleJNI.new_YuvImage__SWIG_0(i, i2, i3));
    }

    public YuvImage(long j) {
        super(GcamModuleJNI.YuvImage_SWIGUpcast(j));
        this.d = j;
    }

    @Override // com.google.googlex.gcam.YuvWriteView, com.google.googlex.gcam.YuvReadView
    public final synchronized void a() {
        long j = this.d;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_YuvImage(j);
            }
            this.d = 0L;
        }
        super.a();
    }

    @Override // com.google.googlex.gcam.YuvWriteView, com.google.googlex.gcam.YuvReadView
    protected final void finalize() {
        a();
    }
}

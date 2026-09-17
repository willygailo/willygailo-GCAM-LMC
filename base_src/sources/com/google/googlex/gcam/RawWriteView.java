package com.google.googlex.gcam;

import defpackage.pjk;

/* JADX INFO: loaded from: classes.dex */
public class RawWriteView extends RawReadView {
    private transient long c;

    public RawWriteView() {
        this(GcamModuleJNI.new_RawWriteView__SWIG_0());
    }

    public RawWriteView(int i, int i2, int i3, int i4, pjk pjkVar) {
        this(GcamModuleJNI.new_RawWriteView__SWIG_1(i, i2, i3, i4, pjk.a(pjkVar)));
    }

    public RawWriteView(long j) {
        super(GcamModuleJNI.RawWriteView_SWIGUpcast(j));
        this.c = j;
    }

    public static long c(RawWriteView rawWriteView) {
        if (rawWriteView == null) {
            return 0L;
        }
        return rawWriteView.c;
    }

    @Override // com.google.googlex.gcam.RawReadView
    public synchronized void a() {
        long j = this.c;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_RawWriteView(j);
            }
            this.c = 0L;
        }
        super.a();
    }

    @Override // com.google.googlex.gcam.RawReadView
    protected void finalize() {
        a();
    }
}

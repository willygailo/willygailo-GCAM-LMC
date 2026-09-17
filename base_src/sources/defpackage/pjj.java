package defpackage;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.RawWriteView;

/* JADX INFO: loaded from: classes2.dex */
public final class pjj extends RawWriteView {
    private transient long c;

    public pjj() {
        this(GcamModuleJNI.new_RawImage__SWIG_0());
    }

    public pjj(long j) {
        super(GcamModuleJNI.RawImage_SWIGUpcast(j));
        this.c = j;
    }

    @Override // com.google.googlex.gcam.RawWriteView, com.google.googlex.gcam.RawReadView
    public final synchronized void a() {
        long j = this.c;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_RawImage(j);
            }
            this.c = 0L;
        }
        super.a();
    }

    @Override // com.google.googlex.gcam.RawWriteView, com.google.googlex.gcam.RawReadView
    protected final void finalize() {
        a();
    }
}

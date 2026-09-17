package defpackage;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class csh implements lie {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/surface/CachedPersistentSurface");
    public final Object b = new Object();
    public Surface c;
    public Surface d;
    public final mip e;
    private leb f;

    public csh(mip mipVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = mipVar;
    }

    public final ojc a(leb lebVar) {
        ojc ojcVarH;
        synchronized (this.b) {
            if (this.f != lebVar) {
                this.f = lebVar;
                close();
            }
            ojcVarH = ojc.h(this.c);
        }
        return ojcVarH;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.b) {
            Surface surface = this.c;
            if (surface != null) {
                surface.release();
                this.c = null;
            }
            Surface surface2 = this.d;
            if (surface2 != null) {
                surface2.release();
                this.d = null;
            }
        }
    }
}

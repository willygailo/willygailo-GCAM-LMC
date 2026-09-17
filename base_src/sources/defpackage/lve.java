package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.media.Image;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lve implements mad, lzl {
    public final int a;
    public final int b;
    public final int c;
    private final Object d = new Object();
    private final Image e;
    private final long f;
    private volatile oom g;
    private Rect h;

    public lve(Image image) {
        this.e = image;
        this.a = image.getFormat();
        this.b = image.getWidth();
        this.c = image.getHeight();
        this.f = image.getTimestamp();
    }

    @Override // defpackage.mad
    public final int a() {
        return this.a;
    }

    @Override // defpackage.mad
    public final int b() {
        return this.c;
    }

    @Override // defpackage.mad
    public final int c() {
        return this.b;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            this.e.close();
        }
    }

    @Override // defpackage.mad
    public final long d() {
        return this.f;
    }

    @Override // defpackage.mad
    public final Rect e() {
        Rect cropRect;
        synchronized (this.d) {
            try {
                try {
                    cropRect = this.e.getCropRect();
                    this.h = cropRect;
                } catch (IllegalStateException e) {
                    return this.h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cropRect;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof mad)) {
            return false;
        }
        mad madVar = (mad) obj;
        return madVar.a() == this.a && madVar.c() == this.b && madVar.b() == this.c && madVar.d() == this.f;
    }

    @Override // defpackage.mad
    public final HardwareBuffer f() {
        HardwareBuffer hardwareBuffer;
        try {
            synchronized (this.d) {
                hardwareBuffer = this.e.getHardwareBuffer();
            }
            return hardwareBuffer;
        } catch (IllegalStateException | NoSuchMethodError e) {
            return null;
        }
    }

    @Override // defpackage.mad
    public final List g() {
        return k();
    }

    @Override // defpackage.mad
    public final void h(Rect rect) {
        synchronized (this.d) {
            this.h = rect;
            try {
                this.e.setCropRect(rect);
            } catch (IllegalStateException e) {
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.f)});
    }

    @Override // defpackage.mad
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.lzl
    public final kkm j() {
        kkm kkmVar;
        synchronized (this.d) {
            kkmVar = new kkm(this.e);
        }
        return kkmVar;
    }

    public final oom k() {
        oom oomVarF = this.g;
        if (oomVarF == null) {
            synchronized (this.d) {
                oomVarF = this.g;
                if (oomVarF == null) {
                    Image.Plane[] planes = this.e.getPlanes();
                    if (planes == null) {
                        oomVarF = oom.l();
                    } else {
                        ooh oohVar = new ooh();
                        for (Image.Plane plane : planes) {
                            oohVar.g(new lvd(plane, 0));
                        }
                        oomVarF = oohVar.f();
                    }
                    this.g = oomVarF;
                }
            }
        }
        return oomVarF;
    }

    public final String toString() {
        String strT = mip.T(this.a);
        int i = this.b;
        long j = this.f;
        StringBuilder sb = new StringBuilder(String.valueOf(strT).length() + 39);
        sb.append("Image-");
        sb.append(strT);
        sb.append("w");
        sb.append(i);
        sb.append("-");
        sb.append(j);
        return sb.toString();
    }
}

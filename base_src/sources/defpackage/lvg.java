package defpackage;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class lvg implements mag {
    private final Object a = new Object();
    private final ImageReader b;
    private final boolean c;

    public lvg(ImageReader imageReader, boolean z) {
        this.b = imageReader;
        this.c = z;
    }

    @Override // defpackage.mag
    public final int a() {
        int height;
        synchronized (this.a) {
            height = this.b.getHeight();
        }
        return height;
    }

    @Override // defpackage.mag
    public final int b() {
        int imageFormat;
        synchronized (this.a) {
            imageFormat = this.b.getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.mag
    public final int c() {
        int maxImages;
        synchronized (this.a) {
            maxImages = this.b.getMaxImages();
        }
        return maxImages;
    }

    @Override // defpackage.mag, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            this.b.close();
        }
    }

    @Override // defpackage.mag
    public final int d() {
        int width;
        synchronized (this.a) {
            width = this.b.getWidth();
        }
        return width;
    }

    @Override // defpackage.mag
    public final Surface e() {
        Surface surface;
        synchronized (this.a) {
            surface = this.b.getSurface();
        }
        return surface;
    }

    @Override // defpackage.mag
    public final mad f() {
        synchronized (this.a) {
            Image imageAcquireLatestImage = this.b.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new lve(imageAcquireLatestImage);
        }
    }

    @Override // defpackage.mag
    public final mad g() {
        synchronized (this.a) {
            Image imageAcquireNextImage = this.b.acquireNextImage();
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new lve(imageAcquireNextImage);
        }
    }

    @Override // defpackage.mag
    public final void h() {
        synchronized (this.a) {
            if (this.c) {
                this.b.discardFreeBuffers();
            } else {
                try {
                    kde.a(this.b);
                } catch (RuntimeException e) {
                }
            }
        }
    }

    @Override // defpackage.mag
    public final void i(final maf mafVar, Handler handler) {
        synchronized (this.a) {
            this.b.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: lvf
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    mafVar.a();
                }
            }, handler);
        }
    }

    public final String toString() {
        ojb ojbVarAZ;
        synchronized (this.a) {
            ojbVarAZ = obr.aZ(this.b);
        }
        ojbVarAZ.e("width", d());
        ojbVarAZ.e("height", a());
        ojbVarAZ.b("format", mip.T(b()));
        ojbVarAZ.e("max images", c());
        return ojbVarAZ.toString();
    }
}

package defpackage;

import android.media.Image;
import android.media.ImageWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class lvj implements lie {
    private final Object a = new Object();
    private final ImageWriter b;
    private final int c;

    public lvj(ImageWriter imageWriter) {
        this.b = imageWriter;
        this.c = imageWriter.getFormat();
        imageWriter.getMaxImages();
    }

    public final void a(mad madVar, long j) {
        synchronized (this.a) {
            Image image = (Image) mip.aS(madVar);
            try {
                image.setTimestamp(j);
                this.b.queueInputImage(image);
            } catch (IllegalStateException e) {
                throw new llv(e);
            }
        }
        madVar.close();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            this.b.close();
        }
    }

    public final String toString() {
        ojb ojbVarAZ = obr.aZ(this);
        ojbVarAZ.b("format", mip.T(this.c));
        return ojbVarAZ.toString();
    }
}

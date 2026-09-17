package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class hoh {
    private final ddf a;
    private final lda b;

    public hoh(lda ldaVar, ddf ddfVar) {
        this.a = ddfVar;
        this.b = ldaVar;
    }

    public static final boolean f(lic licVar) {
        return licVar == lic.CLOCKWISE_90 || licVar == lic.CLOCKWISE_270;
    }

    public static final void g(mad madVar, lic licVar) {
        madVar.getClass();
        obr.aF(madVar.a() == 35);
        System.currentTimeMillis();
        boolean zF = f(licVar);
        ByteBuffer buffer = ((mac) madVar.g().get(0)).getBuffer();
        int rowStride = ((mac) madVar.g().get(0)).getRowStride();
        ByteBuffer buffer2 = ((mac) madVar.g().get(1)).getBuffer();
        int rowStride2 = ((mac) madVar.g().get(1)).getRowStride();
        ByteBuffer buffer3 = ((mac) madVar.g().get(2)).getBuffer();
        int rowStride3 = ((mac) madVar.g().get(2)).getRowStride();
        FrameUtilNative.mirrorYUV420888(buffer, rowStride, buffer2, rowStride2, buffer3, rowStride3, buffer, rowStride, buffer2, rowStride2, buffer3, rowStride3, madVar.c(), madVar.b(), zF);
        System.currentTimeMillis();
    }

    public final Bitmap a(Bitmap bitmap, int i, lwd lwdVar) {
        return b(bitmap, i, lwdVar, true);
    }

    public final Bitmap b(Bitmap bitmap, int i, lwd lwdVar, boolean z) {
        if (bitmap == null || !e(lwdVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        System.currentTimeMillis();
        if (i == lic.CLOCKWISE_90.e || i == lic.CLOCKWISE_270.e) {
            matrix.postScale(1.0f, -1.0f);
        } else {
            matrix.postScale(-1.0f, 1.0f);
        }
        if (z) {
            matrix.postRotate(i);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        System.currentTimeMillis();
        return bitmapCreateBitmap;
    }

    public final lco c() {
        if (!this.a.k(ddl.aQ)) {
            this.b.fB(false);
        }
        return this.b;
    }

    public final boolean d() {
        return ((Boolean) c().fA()).booleanValue();
    }

    public final boolean e(lwd lwdVar) {
        return d() && lwdVar.equals(lwd.FRONT);
    }
}

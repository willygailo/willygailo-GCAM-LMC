package defpackage;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.image.ImageUtils;

/* JADX INFO: loaded from: classes.dex */
public final class egi {
    public final DisplayMetrics a;

    public egi(DisplayMetrics displayMetrics) {
        this.a = displayMetrics;
    }

    public final Bitmap a(InterleavedImageU8 interleavedImageU8) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.a, interleavedImageU8.b(), interleavedImageU8.a(), Bitmap.Config.ARGB_8888);
        pjh pjhVarA = pjh.a(bitmapCreateBitmap);
        try {
            InterleavedReadViewU8 interleavedReadViewU8C = interleavedImageU8.c();
            InterleavedWriteViewU8 interleavedWriteViewU8 = pjhVarA.a;
            long j = interleavedReadViewU8C.a;
            long jA = InterleavedWriteViewU8.a(interleavedWriteViewU8);
            boolean z = true;
            obr.aG(j != 0, "src is null");
            if (jA == 0) {
                z = false;
            }
            obr.aG(z, "dst is null");
            ImageUtils.simpleRgbToAnyRgbImpl(j, 5, jA);
            pjhVarA.close();
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            try {
                pjhVarA.close();
            } catch (Throwable th2) {
            }
            throw th;
        }
    }
}

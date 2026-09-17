package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bif implements azv {
    public static final azs a = azs.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new bia(1, null));
    public static final azs b = azs.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new bia(0));
    private final bid c;
    private final bcv d;

    public bif(bcv bcvVar, bid bidVar) {
        this.d = bcvVar;
        this.c = bidVar;
    }

    @Override // defpackage.azv
    public final bcl a(Object obj, int i, int i2, azt aztVar) throws IOException {
        long jLongValue = ((Long) aztVar.b(a)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            StringBuilder sb = new StringBuilder(83);
            sb.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            sb.append(jLongValue);
            throw new IllegalArgumentException(sb.toString());
        }
        Integer num = (Integer) aztVar.b(b);
        if (num == null) {
            num = 2;
        }
        bhb bhbVar = (bhb) aztVar.b(bhb.f);
        if (bhbVar == null) {
            bhbVar = bhb.e;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.c.a(mediaMetadataRetriever, obj);
            int iIntValue = num.intValue();
            Bitmap frameAtTime = null;
            if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && bhbVar != bhb.d) {
                try {
                    int i3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int i4 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                    if (i5 == 90 || i5 == 270) {
                        i4 = i3;
                        i3 = i4;
                    }
                    float fA = bhbVar.a(i3, i4, i, i2);
                    frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(jLongValue, iIntValue, Math.round(i3 * fA), Math.round(fA * i4));
                } catch (Throwable th) {
                }
            }
            if (frameAtTime == null) {
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(jLongValue, iIntValue);
            }
            if (frameAtTime == null) {
                throw new bie();
            }
            mediaMetadataRetriever.close();
            return bgn.f(frameAtTime, this.d);
        } catch (Throwable th2) {
            mediaMetadataRetriever.close();
            throw th2;
        }
    }

    @Override // defpackage.azv
    public final boolean b(Object obj, azt aztVar) {
        return true;
    }
}

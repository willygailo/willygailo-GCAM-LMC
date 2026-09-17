package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class bgq extends bgo {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    @Override // defpackage.azp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.bgo
    protected final Bitmap c(bcv bcvVar, Bitmap bitmap, int i, int i2) {
        return bhy.d(bcvVar, bitmap, i, i2);
    }

    @Override // defpackage.azp
    public final boolean equals(Object obj) {
        return obj instanceof bgq;
    }

    @Override // defpackage.azp
    public final int hashCode() {
        return -670243078;
    }
}

package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class bgp extends bgo {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    @Override // defpackage.azp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.bgo
    protected final Bitmap c(bcv bcvVar, Bitmap bitmap, int i, int i2) {
        return bhy.c(bcvVar, bitmap, i, i2);
    }

    @Override // defpackage.azp
    public final boolean equals(Object obj) {
        return obj instanceof bgp;
    }

    @Override // defpackage.azp
    public final int hashCode() {
        return -599754482;
    }
}

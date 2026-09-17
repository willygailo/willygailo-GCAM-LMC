package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class bgo implements azx {
    @Override // defpackage.azx
    public final bcl b(Context context, bcl bclVar, int i, int i2) {
        if (!bmf.o(i, i2)) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Cannot apply transformation on width: ");
            sb.append(i);
            sb.append(" or height: ");
            sb.append(i2);
            sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
            throw new IllegalArgumentException(sb.toString());
        }
        bcv bcvVar = axv.b(context).a;
        Bitmap bitmap = (Bitmap) bclVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(bcvVar, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? bclVar : bgn.f(bitmapC, bcvVar);
    }

    protected abstract Bitmap c(bcv bcvVar, Bitmap bitmap, int i, int i2);
}

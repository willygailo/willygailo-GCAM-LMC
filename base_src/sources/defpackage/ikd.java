package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class ikd {
    public final Bitmap a;
    public final lic b;

    public ikd(Bitmap bitmap, lic licVar) {
        bitmap.getClass();
        licVar.getClass();
        this.a = bitmap;
        this.b = licVar;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        int iHashCode = hashCode();
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 52 + String.valueOf(strValueOf2).length());
        sb.append("OrientationBitmap[Bitmap: ");
        sb.append(strValueOf);
        sb.append("][rotation: ");
        sb.append(strValueOf2);
        sb.append("]: ");
        sb.append(iHashCode);
        return sb.toString();
    }
}

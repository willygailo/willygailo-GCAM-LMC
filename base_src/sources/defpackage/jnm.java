package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class jnm {
    public final Bitmap a;
    public final int b;
    public final ojc c;
    public final boolean d;

    public jnm() {
    }

    public jnm(Bitmap bitmap, int i, ojc ojcVar, boolean z) {
        if (bitmap == null) {
            throw new NullPointerException("Null bitmap");
        }
        this.a = bitmap;
        this.b = i;
        this.c = ojcVar;
        this.d = z;
    }

    public static jnm b(Bitmap bitmap, int i) {
        return new jnm(bitmap, i, ojc.h(null), true);
    }

    public final Rect a() {
        return new Rect(0, 0, this.a.getWidth(), this.a.getHeight());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jnm) {
            jnm jnmVar = (jnm) obj;
            if (this.a.equals(jnmVar.a) && this.b == jnmVar.b && this.c.equals(jnmVar.c) && this.d == jnmVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int i = this.b;
        String strValueOf2 = String.valueOf(this.c);
        boolean z = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 91 + String.valueOf(strValueOf2).length());
        sb.append("ViewfinderScreenshot{bitmap=");
        sb.append(strValueOf);
        sb.append(", downscaleRatio=");
        sb.append(i);
        sb.append(", bitmapSourceRect=");
        sb.append(strValueOf2);
        sb.append(", allowed=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

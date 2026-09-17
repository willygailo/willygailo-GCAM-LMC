package defpackage;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class jnj {
    public final Surface a;
    public final int b;
    public final Size c;

    public jnj() {
    }

    public jnj(Surface surface, int i, Size size) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.a = surface;
        this.b = i;
        this.c = size;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jnj) {
            jnj jnjVar = (jnj) obj;
            if (this.a.equals(jnjVar.a) && this.b == jnjVar.b && this.c.equals(jnjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int i = this.b;
        String strValueOf2 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 51 + String.valueOf(strValueOf2).length());
        sb.append("CreatedSurface{surface=");
        sb.append(strValueOf);
        sb.append(", format=");
        sb.append(i);
        sb.append(", size=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}

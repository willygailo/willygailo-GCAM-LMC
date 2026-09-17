package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class jcd {
    public final Size a;
    public final Rect b;
    public final Rect c;
    private final int d;

    public jcd() {
    }

    public jcd(Size size, Rect rect, Rect rect2, int i) {
        this.a = size;
        this.b = rect;
        this.c = rect2;
        this.d = i;
    }

    public static jcd a(Size size, Rect rect, Rect rect2, int i) {
        return new jcd(size, rect, rect2, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jcd) {
            jcd jcdVar = (jcd) obj;
            if (this.a.equals(jcdVar.a) && this.b.equals(jcdVar.b) && this.c.equals(jcdVar.c) && this.d == jcdVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        int i = this.d;
        int length = String.valueOf(strValueOf).length();
        StringBuilder sb = new StringBuilder(length + 97 + String.valueOf(strValueOf2).length() + String.valueOf(strValueOf3).length());
        sb.append("ViewfinderLayoutSpec{size=");
        sb.append(strValueOf);
        sb.append(", padding=");
        sb.append(strValueOf2);
        sb.append(", margins=");
        sb.append(strValueOf3);
        sb.append(", gravity=");
        sb.append(i);
        sb.append(", layoutDirection=0}");
        return sb.toString();
    }
}

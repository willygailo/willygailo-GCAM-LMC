package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public final class jfg {
    public final Rect a;
    public final int b;

    public jfg() {
    }

    public jfg(Rect rect, int i) {
        this.a = rect;
        this.b = i;
    }

    public static jff a() {
        return new jff();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jfg) {
            jfg jfgVar = (jfg) obj;
            if (this.a.equals(jfgVar.a) && this.b == jfgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int i = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 38);
        sb.append("RoundedRect{rect=");
        sb.append(strValueOf);
        sb.append(", radius=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

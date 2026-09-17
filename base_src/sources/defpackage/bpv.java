package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class bpv {
    public final int a;
    public final Rect b;

    public bpv() {
    }

    public bpv(int i, Rect rect) {
        this.a = i;
        if (rect == null) {
            throw new NullPointerException("Null bounds");
        }
        this.b = rect;
    }

    public static bpv a(int i, Rect rect) {
        return new bpv(i, rect);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bpv) {
            bpv bpvVar = (bpv) obj;
            if (this.a == bpvVar.a && this.b.equals(bpvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 38);
        sb.append("SmartAfRegion{id=");
        sb.append(i);
        sb.append(", bounds=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}

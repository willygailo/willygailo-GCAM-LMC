package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class ggm {
    public final PointF a;
    public final boolean b;
    private final int c;

    public ggm() {
    }

    public ggm(PointF pointF, int i, boolean z) {
        this.a = pointF;
        this.c = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ggm) {
            ggm ggmVar = (ggm) obj;
            if (this.a.equals(ggmVar.a) && this.c == ggmVar.c && this.b == ggmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int i = this.c;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 72);
        sb.append("AfRoi{normalizedCenterPoint=");
        sb.append(strValueOf);
        sb.append(", confidenceScore=");
        sb.append(i);
        sb.append(", isFace=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

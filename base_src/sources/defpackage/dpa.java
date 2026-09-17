package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class dpa {
    public RectF a;
    public PointF b;
    public PointF c;
    private Float d;

    public final dpb a() {
        Float f;
        RectF rectF = this.a;
        if (rectF != null && (f = this.d) != null) {
            return new dpb(rectF, this.b, this.c, f.floatValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" bounds");
        }
        if (this.d == null) {
            sb.append(" faceRoll");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(float f) {
        this.d = Float.valueOf(f);
    }
}

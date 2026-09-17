package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class due {
    private final float a;
    private final float b;
    private final PointF c;
    private final PointF d;
    private final float e;
    private final float f;

    public due(float f, float f2, PointF pointF, PointF pointF2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = pointF;
        this.d = pointF2;
        this.e = f3;
        this.f = f4;
    }

    public static final float d(float f) {
        return (-f) + 1.0f;
    }

    public final float a(float f) {
        float f2 = this.e;
        return f2 + ((this.f - f2) * f);
    }

    public final float b(float f) {
        float f2 = this.a;
        return f2 + ((this.b - f2) * f);
    }

    public final PointF c(float f) {
        return new PointF(this.c.x + ((this.d.x - this.c.x) * f), this.c.y + ((this.d.y - this.c.y) * f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(getClass().getName()).concat(" {"));
        float f = this.a;
        float f2 = this.b;
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append(" scale: ");
        sb2.append(f);
        sb2.append(" -> ");
        sb2.append(f2);
        sb.append(sb2.toString());
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        StringBuilder sb3 = new StringBuilder(String.valueOf(strValueOf).length() + 19 + String.valueOf(strValueOf2).length());
        sb3.append(", translation: ");
        sb3.append(strValueOf);
        sb3.append(" -> ");
        sb3.append(strValueOf2);
        sb.append(sb3.toString());
        float f3 = this.e;
        float f4 = this.f;
        StringBuilder sb4 = new StringBuilder(44);
        sb4.append(", radius: ");
        sb4.append(f3);
        sb4.append(" -> ");
        sb4.append(f4);
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder(45);
        sb5.append(", bgAlpha: ");
        sb5.append(1.0f);
        sb5.append(" -> ");
        sb5.append(0.0f);
        sb.append(sb5.toString());
        sb.append("}");
        return sb.toString();
    }
}

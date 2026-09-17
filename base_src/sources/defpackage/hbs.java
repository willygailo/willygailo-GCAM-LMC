package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hbs {
    public final float a;
    public final float b;

    public hbs() {
    }

    public hbs(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static hbs a(float f, float f2) {
        return new hbs(f, f2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hbs) {
            hbs hbsVar = (hbs) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(hbsVar.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(hbsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        StringBuilder sb = new StringBuilder(71);
        sb.append("DualEvKnobPositions{brightness=");
        sb.append(f);
        sb.append(", shadow=");
        sb.append(f2);
        sb.append("}");
        return sb.toString();
    }
}

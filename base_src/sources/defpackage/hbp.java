package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hbp {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public hbp() {
    }

    public hbp(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public static hbp a(float f, float f2, float f3, int i) {
        return new hbp(f, f2, f3, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hbp) {
            hbp hbpVar = (hbp) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(hbpVar.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(hbpVar.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(hbpVar.c) && this.d == hbpVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ this.d;
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        int i = this.d;
        StringBuilder sb = new StringBuilder(136);
        sb.append("DualEvHdrSettings{shortTet=");
        sb.append(f);
        sb.append(", longTet=");
        sb.append(f2);
        sb.append(", portraitTet=");
        sb.append(f3);
        sb.append(", exposureCompensationSteps=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

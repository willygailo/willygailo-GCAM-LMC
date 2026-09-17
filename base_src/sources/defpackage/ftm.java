package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ftm {
    public final int a;
    public final float b;
    public final float c;

    public ftm() {
    }

    public ftm(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public static ftm a(dqu dquVar) {
        obr.aF(dquVar.a.length == 3);
        return new ftm((int) dquVar.b(0), dquVar.b(1), dquVar.b(2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ftm) {
            ftm ftmVar = (ftm) obj;
            if (this.a == ftmVar.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(ftmVar.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(ftmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c);
    }

    public final String toString() {
        int i = this.a;
        float f = this.b;
        float f2 = this.c;
        StringBuilder sb = new StringBuilder(111);
        sb.append("CameraOrientation{deviceRotationDegrees=");
        sb.append(i);
        sb.append(", pitchDegrees=");
        sb.append(f);
        sb.append(", rollDegrees=");
        sb.append(f2);
        sb.append("}");
        return sb.toString();
    }
}

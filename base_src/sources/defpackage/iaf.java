package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iaf {
    public final int a;
    public final int b;
    public final iax c;
    public final jrl d;
    public final float e;

    public iaf() {
    }

    public iaf(int i, int i2, iax iaxVar, jrl jrlVar, float f) {
        this.a = i;
        this.b = i2;
        this.c = iaxVar;
        this.d = jrlVar;
        this.e = f;
    }

    public static iae a() {
        iae iaeVar = new iae();
        iaeVar.c(1);
        iaeVar.d(1);
        return iaeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iaf) {
            iaf iafVar = (iaf) obj;
            if (this.a == iafVar.a && this.b == iafVar.b && this.c.equals(iafVar.c) && this.d.equals(iafVar.d) && Float.floatToIntBits(this.e) == Float.floatToIntBits(iafVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ Float.floatToIntBits(this.e);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        float f = this.e;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 144 + String.valueOf(strValueOf2).length());
        sb.append("Options{numFramesPerSample=");
        sb.append(i);
        sb.append(", numSuccessiveSamplesRequired=");
        sb.append(i2);
        sb.append(", suggestion=");
        sb.append(strValueOf);
        sb.append(", applicationMode=");
        sb.append(strValueOf2);
        sb.append(", scoreThreshold=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dwp {
    public final int a;
    public final oom b;
    public final float c;

    public dwp() {
    }

    public dwp(int i, oom oomVar, float f) {
        this.a = i;
        this.b = oomVar;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwp) {
            dwp dwpVar = (dwp) obj;
            if (this.a == dwpVar.a && obr.an(this.b, dwpVar.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(dwpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.c);
    }

    public final String toString() {
        int i = this.a;
        String strValueOf = String.valueOf(this.b);
        float f = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 80);
        sb.append("FaceTrueTone{id=");
        sb.append(i);
        sb.append(", toneProbabilities=");
        sb.append(strValueOf);
        sb.append(", toneConfidence=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}

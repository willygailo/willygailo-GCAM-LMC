package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dwf {
    public final long a;
    public final float b;
    public final ojc c;
    public final float d;
    private final ojc e;

    public dwf() {
    }

    public dwf(long j, ojc ojcVar, float f, ojc ojcVar2, float f2) {
        this.a = j;
        this.e = ojcVar;
        this.b = f;
        this.c = ojcVar2;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwf) {
            dwf dwfVar = (dwf) obj;
            if (this.a == dwfVar.a && this.e.equals(dwfVar.e) && Float.floatToIntBits(this.b) == Float.floatToIntBits(dwfVar.b) && this.c.equals(dwfVar.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(dwfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return Float.floatToIntBits(this.d) ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        String strValueOf = String.valueOf(this.e);
        float f = this.b;
        String strValueOf2 = String.valueOf(this.c);
        float f2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 150 + String.valueOf(strValueOf2).length());
        sb.append("FrequentFace{trackId=");
        sb.append(j);
        sb.append(", identityId=");
        sb.append(strValueOf);
        sb.append(", score=");
        sb.append(f);
        sb.append(", aggregatedToneProbabilities=");
        sb.append(strValueOf2);
        sb.append(", aggregatedToneConfidence=");
        sb.append(f2);
        sb.append("}");
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bzs {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final pud g;

    public bzs() {
    }

    public bzs(long j, long j2, int i, int i2, int i3, float f, pud pudVar) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = f;
        if (pudVar == null) {
            throw new NullPointerException("Null frameMetadata");
        }
        this.g = pudVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bzs) {
            bzs bzsVar = (bzs) obj;
            if (this.a == bzsVar.a && this.b == bzsVar.b && this.c == bzsVar.c && this.d == bzsVar.d && this.e == bzsVar.e && Float.floatToIntBits(this.f) == Float.floatToIntBits(bzsVar.f) && this.g.equals(bzsVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iFloatToIntBits = (((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003;
        pud pudVar = this.g;
        int iB = pudVar.aD;
        if (iB == 0) {
            iB = pqu.a.b(pudVar).b(pudVar);
            pudVar.aD = iB;
        }
        return iFloatToIntBits ^ iB;
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        float f = this.f;
        String strValueOf = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 286);
        sb.append("CaptureReport{durationSinceLastCaptureMs=");
        sb.append(j);
        sb.append(", durationFromCandidatetoSavingMs=");
        sb.append(j2);
        sb.append(", candidateFramesDiscarded=");
        sb.append(i);
        sb.append(", framesAnalyzedBeforeCandidate=");
        sb.append(i2);
        sb.append(", framesAnalyzedAfterCandidate=");
        sb.append(i3);
        sb.append(", analysisScore=");
        sb.append(f);
        sb.append(", frameMetadata=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}

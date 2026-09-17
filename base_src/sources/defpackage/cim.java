package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cim {
    public final boolean a;
    public final boolean b;
    public final long c;
    public final int d;
    public final int e;

    public cim() {
    }

    public cim(boolean z, boolean z2, long j, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cim) {
            cim cimVar = (cim) obj;
            if (this.a == cimVar.a && this.b == cimVar.b && this.c == cimVar.c && this.d == cimVar.d && this.e == cimVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        int i2 = true == this.b ? 1231 : 1237;
        long j = this.c;
        return ((((((i ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "CocktailPartyStats{isAudioFallback=" + this.a + ", isMouthCovered=" + this.b + ", getAudioFrameCount=" + this.c + ", getAudioFrameDropCount=" + this.d + ", getAudioMaxFrameDropCount=" + this.e + "}";
    }
}

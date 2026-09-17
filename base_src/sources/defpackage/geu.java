package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class geu {
    public final int a;
    public final int b;
    public final boolean c;
    public final long d;
    public final int e;
    private final int f;
    private final int g;

    public geu() {
    }

    public geu(int i, int i2, int i3, int i4, boolean z, long j, int i5) {
        this.f = i;
        this.g = i2;
        this.a = i3;
        this.b = i4;
        this.c = z;
        this.d = j;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof geu) {
            geu geuVar = (geu) obj;
            if (this.f == geuVar.f && this.g == geuVar.g && this.a == geuVar.a && this.b == geuVar.b && this.c == geuVar.c && this.d == geuVar.d && this.e == geuVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.a) * 1000003) ^ this.b) * 1000003;
        int i2 = true != this.c ? 1237 : 1231;
        long j = this.d;
        return ((((i ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e;
    }

    public final String toString() {
        int i = this.f;
        int i2 = this.g;
        int i3 = this.a;
        int i4 = this.b;
        boolean z = this.c;
        long j = this.d;
        int i5 = this.e;
        StringBuilder sb = new StringBuilder(94);
        sb.append("{");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(z);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }
}

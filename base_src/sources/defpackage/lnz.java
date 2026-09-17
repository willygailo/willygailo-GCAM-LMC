package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lnz {
    public final loa a;
    public final ojc b;
    public final ojc c;
    public final lig d;
    public final int e;
    public final int f;
    public final ojc g;
    public final boolean h;
    public final boolean i;

    public lnz() {
    }

    public lnz(loa loaVar, ojc ojcVar, ojc ojcVar2, lig ligVar, int i, int i2, ojc ojcVar3, boolean z, boolean z2) {
        this.a = loaVar;
        this.b = ojcVar;
        this.c = ojcVar2;
        this.d = ligVar;
        this.e = i;
        this.f = i2;
        this.g = ojcVar3;
        this.h = z;
        this.i = z2;
    }

    public static lny a() {
        lny lnyVar = new lny(null);
        lnyVar.f(0);
        lnyVar.c(-1);
        lnyVar.d(false);
        lnyVar.e(false);
        return lnyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lnz) {
            lnz lnzVar = (lnz) obj;
            if (this.a.equals(lnzVar.a) && this.b.equals(lnzVar.b) && this.c.equals(lnzVar.c) && this.d.equals(lnzVar.d) && this.e == lnzVar.e && this.f == lnzVar.f && this.g.equals(lnzVar.g) && this.h == lnzVar.h && this.i == lnzVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true == this.i ? 1231 : 1237);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        int i = this.e;
        int i2 = this.f;
        String strValueOf5 = String.valueOf(this.g);
        boolean z = this.h;
        boolean z2 = this.i;
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        StringBuilder sb = new StringBuilder(length + 151 + length2 + length3 + String.valueOf(strValueOf4).length() + String.valueOf(strValueOf5).length());
        sb.append("StreamConfig{type=");
        sb.append(strValueOf);
        sb.append(", cameraId=");
        sb.append(strValueOf2);
        sb.append(", surface=");
        sb.append(strValueOf3);
        sb.append(", size=");
        sb.append(strValueOf4);
        sb.append(", imageFormat=");
        sb.append(i);
        sb.append(", capacity=");
        sb.append(i2);
        sb.append(", usageFlags=");
        sb.append(strValueOf5);
        sb.append(", forCapture=");
        sb.append(z);
        sb.append(", ignoreMemoryLimits=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}

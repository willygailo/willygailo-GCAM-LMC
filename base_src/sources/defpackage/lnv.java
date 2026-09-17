package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lnv {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public lnv() {
    }

    public lnv(int i, int i2, int i3, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.a = z;
    }

    public static lnu a() {
        lnu lnuVar = new lnu();
        lnuVar.d(false);
        return lnuVar;
    }

    public final boolean b() {
        int i = this.b;
        return i == 4 || i == 2;
    }

    public final boolean c() {
        int i = this.d;
        return i == 4 || i == 2;
    }

    public final boolean d() {
        return this.c != 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lnv)) {
            return false;
        }
        lnv lnvVar = (lnv) obj;
        int i = this.b;
        int i2 = lnvVar.b;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            int i3 = this.c;
            int i4 = lnvVar.c;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i4) {
                int i5 = this.d;
                int i6 = lnvVar.d;
                if (i5 == 0) {
                    throw null;
                }
                if (i5 == i6 && this.a == lnvVar.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        mip.bd(i);
        int i2 = this.c;
        mip.bd(i2);
        int i3 = this.d;
        mip.bd(i3);
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ (true != this.a ? 1237 : 1231);
    }

    public final String toString() {
        String strBc = mip.bc(this.b);
        String strBc2 = mip.bc(this.c);
        String strBc3 = mip.bc(this.d);
        boolean z = this.a;
        int length = strBc.length();
        StringBuilder sb = new StringBuilder(length + 58 + strBc2.length() + strBc3.length());
        sb.append("Spec3A{exposure=");
        sb.append(strBc);
        sb.append(", focus=");
        sb.append(strBc2);
        sb.append(", whiteBalance=");
        sb.append(strBc3);
        sb.append(", forCapture=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

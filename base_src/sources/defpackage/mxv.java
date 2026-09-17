package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mxv implements mwi {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public mxv() {
    }

    public mxv(int i, int i2, int i3, int i4, double d) {
        this.f = 1;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = d;
    }

    @Override // defpackage.mwi
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.mwi
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mxv)) {
            return false;
        }
        mxv mxvVar = (mxv) obj;
        int i = this.f;
        int i2 = mxvVar.f;
        if (i != 0) {
            return i2 == 1 && this.a == mxvVar.a && this.b == mxvVar.b && this.c == mxvVar.c && this.d == mxvVar.d && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(mxvVar.e);
        }
        throw null;
    }

    public final int hashCode() {
        mwj.b(this.f);
        return ((((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.e) >>> 32) ^ Double.doubleToLongBits(this.e)));
    }

    public final String toString() {
        String strA = mwj.a(this.f);
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        double d = this.e;
        StringBuilder sb = new StringBuilder(strA.length() + 211);
        sb.append("CpuProfilingConfigurations{enablement=");
        sb.append(strA);
        sb.append(", maxBufferSizeBytes=");
        sb.append(i);
        sb.append(", sampleDurationMs=");
        sb.append(i2);
        sb.append(", sampleDurationSkewMs=");
        sb.append(i3);
        sb.append(", sampleFrequencyMicro=");
        sb.append(i4);
        sb.append(", samplesPerEpoch=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}

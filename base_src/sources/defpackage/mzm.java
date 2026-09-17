package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mzm implements mwi {
    public final boolean a;
    public final ojc b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    private final int g;

    public mzm() {
    }

    public mzm(int i, int i2, boolean z, ojc ojcVar, boolean z2, boolean z3, boolean z4) {
        this.f = i;
        this.g = i2;
        this.a = z;
        this.b = ojcVar;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public static mzl c() {
        mzl mzlVar = new mzl(null);
        mzlVar.a = 3;
        mzlVar.b = false;
        mzlVar.c = oih.a;
        mzlVar.d = false;
        mzlVar.f = true;
        mzlVar.e = false;
        mzlVar.g = 1;
        return mzlVar;
    }

    @Override // defpackage.mwi
    public final int a() {
        return this.g;
    }

    @Override // defpackage.mwi
    public final boolean b() {
        return this.f == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mzm)) {
            return false;
        }
        mzm mzmVar = (mzm) obj;
        int i = this.f;
        int i2 = mzmVar.f;
        if (i != 0) {
            return i == i2 && this.g == mzmVar.g && this.a == mzmVar.a && this.b.equals(mzmVar.b) && this.c == mzmVar.c && this.d == mzmVar.d && this.e == mzmVar.e;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f;
        mwj.b(i);
        return ((((((((((((i ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        String strA = mwj.a(this.f);
        int i = this.g;
        boolean z = this.a;
        String strValueOf = String.valueOf(this.b);
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        StringBuilder sb = new StringBuilder(strA.length() + 206 + String.valueOf(strValueOf).length());
        sb.append("MemoryConfigurations{enablement=");
        sb.append(strA);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append(", recordMetricPerProcess=");
        sb.append(z);
        sb.append(", metricExtensionProvider=");
        sb.append(strValueOf);
        sb.append(", forceGcBeforeRecordMemory=");
        sb.append(z2);
        sb.append(", captureDebugMetrics=");
        sb.append(z3);
        sb.append(", captureMemoryInfo=");
        sb.append(z4);
        sb.append("}");
        return sb.toString();
    }
}

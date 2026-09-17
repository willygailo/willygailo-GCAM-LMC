package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class myd implements mwi {
    public final float a;
    private final int b;

    public myd() {
    }

    public myd(int i, float f) {
        this.b = i;
        this.a = f;
    }

    public static final nbv c() {
        nbv nbvVar = new nbv();
        nbvVar.a = Float.valueOf(100.0f);
        nbvVar.b = 1;
        return nbvVar;
    }

    @Override // defpackage.mwi
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.mwi
    public final boolean b() {
        int i = this.b;
        return i == 3 || i == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof myd)) {
            return false;
        }
        myd mydVar = (myd) obj;
        int i = this.b;
        int i2 = mydVar.b;
        if (i != 0) {
            return i == i2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(mydVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        mwj.b(i);
        return (((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a)) * 1000003;
    }

    public final String toString() {
        String strA = mwj.a(this.b);
        float f = this.a;
        String strValueOf = String.valueOf((Object) null);
        StringBuilder sb = new StringBuilder(strA.length() + 99 + String.valueOf(strValueOf).length());
        sb.append("CrashConfigurations{enablement=");
        sb.append(strA);
        sb.append(", startupSamplePercentage=");
        sb.append(f);
        sb.append(", metricExtensionProvider=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}

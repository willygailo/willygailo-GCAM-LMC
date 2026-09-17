package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nbw implements mwi {
    public final float a;
    private final int b;

    public nbw() {
    }

    public nbw(int i, float f) {
        this.b = i;
        this.a = f;
    }

    public static final nbv c() {
        nbv nbvVar = new nbv();
        nbvVar.a = Float.valueOf(0.5f);
        nbvVar.b = 1;
        return nbvVar;
    }

    @Override // defpackage.mwi
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.mwi
    public final boolean b() {
        return this.b == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nbw)) {
            return false;
        }
        nbw nbwVar = (nbw) obj;
        int i = this.b;
        int i2 = nbwVar.b;
        if (i != 0) {
            return i == i2 && Float.floatToIntBits(this.a) == Float.floatToIntBits(nbwVar.a);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.b;
        mwj.b(i);
        return ((i ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        String strA = mwj.a(this.b);
        float f = this.a;
        StringBuilder sb = new StringBuilder(strA.length() + 69);
        sb.append("TraceConfigurations{enablement=");
        sb.append(strA);
        sb.append(", samplingProbability=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}

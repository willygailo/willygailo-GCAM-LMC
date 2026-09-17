package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nbk implements mwi {
    public final boolean a;
    public final ojc b;
    private final int c;

    public nbk() {
    }

    public nbk(int i, boolean z, ojc ojcVar) {
        this.c = i;
        this.a = z;
        this.b = ojcVar;
    }

    public static final nbj c() {
        nbj nbjVar = new nbj(null);
        nbjVar.a = false;
        nbjVar.b = oih.a;
        nbjVar.c = 1;
        return nbjVar;
    }

    @Override // defpackage.mwi
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.mwi
    public final boolean b() {
        return this.c == 3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nbk)) {
            return false;
        }
        nbk nbkVar = (nbk) obj;
        int i = this.c;
        int i2 = nbkVar.c;
        if (i != 0) {
            return i == i2 && this.a == nbkVar.a && this.b.equals(nbkVar.b);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        mwj.b(i);
        return ((((i ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String strA = mwj.a(this.c);
        boolean z = this.a;
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(strA.length() + 80 + String.valueOf(strValueOf).length());
        sb.append("StorageConfigurations{enablement=");
        sb.append(strA);
        sb.append(", manualCapture=");
        sb.append(z);
        sb.append(", dirStatsConfigurations=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }
}

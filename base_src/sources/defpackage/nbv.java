package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nbv {
    public Float a;
    public int b;

    public final nbw a() {
        Float f;
        int i = this.b;
        if (i != 0 && (f = this.a) != null) {
            nbw nbwVar = new nbw(i, f.floatValue());
            float f2 = nbwVar.a;
            boolean z = false;
            if (f2 >= 0.0f && f2 <= 1.0f) {
                z = true;
            }
            obr.aR(z, "Probability shall be between 0 and 1.");
            return nbwVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == null) {
            sb.append(" samplingProbability");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(boolean z) {
        this.b = true != z ? 2 : 3;
    }

    public final myd c() {
        Float f;
        int i = this.b;
        if (i != 0 && (f = this.a) != null) {
            myd mydVar = new myd(i, f.floatValue());
            float f2 = mydVar.a;
            boolean z = false;
            if (f2 > 0.0f && f2 <= 100.0f) {
                z = true;
            }
            obr.aG(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return mydVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == null) {
            sb.append(" startupSamplePercentage");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void d(boolean z) {
        this.b = true != z ? 2 : 3;
    }
}

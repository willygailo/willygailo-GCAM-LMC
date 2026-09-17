package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mzl {
    public Integer a;
    public Boolean b;
    public ojc c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public int g;

    public mzl() {
    }

    public mzl(byte[] bArr) {
        this.c = oih.a;
    }

    public final mzm a() {
        Integer num;
        int i = this.g;
        if (i != 0 && (num = this.a) != null && this.b != null && this.d != null && this.e != null && this.f != null) {
            return new mzm(i, num.intValue(), this.b.booleanValue(), this.c, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue());
        }
        StringBuilder sb = new StringBuilder();
        if (this.g == 0) {
            sb.append(" enablement");
        }
        if (this.a == null) {
            sb.append(" rateLimitPerSecond");
        }
        if (this.b == null) {
            sb.append(" recordMetricPerProcess");
        }
        if (this.d == null) {
            sb.append(" forceGcBeforeRecordMemory");
        }
        if (this.e == null) {
            sb.append(" captureDebugMetrics");
        }
        if (this.f == null) {
            sb.append(" captureMemoryInfo");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(boolean z) {
        this.g = true != z ? 2 : 3;
    }
}

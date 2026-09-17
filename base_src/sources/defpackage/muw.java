package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class muw {
    public phw a;
    public Integer b;
    public Integer c;
    public Boolean d;

    public final mux a() {
        Integer num = this.b;
        if (num != null && this.c != null && this.d != null) {
            mux muxVar = new mux(this.a, num.intValue(), this.c.intValue(), this.d.booleanValue());
            int i = muxVar.c;
            boolean z = false;
            if (i > 0 && i <= 2) {
                z = true;
            }
            obr.aS(z, "Thread pool size must be less than or equal to %s", 2);
            return muxVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" primesMetricExecutorPriority");
        }
        if (this.c == null) {
            sb.append(" primesMetricExecutorPoolSize");
        }
        if (this.d == null) {
            sb.append(" enableDeferredTasks");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mxf {
    public String a;
    public qxe b;
    public String c;
    public Long d;
    public mvp e;
    private Boolean f;
    private qyk g;
    private Boolean h;

    public final mxg a() {
        Boolean bool = this.f;
        if (bool != null && this.g != null && this.h != null) {
            return new mxg(this.a, bool.booleanValue(), this.g, this.b, this.c, this.d, this.h.booleanValue(), this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" isEventNameConstant");
        }
        if (this.g == null) {
            sb.append(" metric");
        }
        if (this.h == null) {
            sb.append(" isUnsampled");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final void d(qyk qykVar) {
        if (qykVar == null) {
            throw new NullPointerException("Null metric");
        }
        this.g = qykVar;
    }
}

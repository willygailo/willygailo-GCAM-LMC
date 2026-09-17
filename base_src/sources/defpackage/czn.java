package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class czn {
    public ojc a;
    private Long b;
    private ojc c;

    public czn() {
    }

    public czn(byte[] bArr) {
        this.c = oih.a;
        this.a = oih.a;
    }

    public final czo a() {
        Long l = this.b;
        if (l != null) {
            return new czo(l.longValue(), this.c, this.a);
        }
        throw new IllegalStateException("Missing required properties: timestampNs");
    }

    public final void b(cyk cykVar) {
        this.c = ojc.i(cykVar);
    }

    public final void c(long j) {
        this.b = Long.valueOf(j);
    }
}

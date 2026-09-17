package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ige implements lie {
    public final cjd a;
    public final ihb b;
    public final int c;
    public final int d;
    public ciy e;
    private final lap f;

    public ige(ihb ihbVar, int i, int i2, cjd cjdVar) {
        this.b = ihbVar;
        this.d = i;
        this.c = i2;
        this.a = cjdVar;
        lap lapVar = new lap();
        this.f = lapVar;
        lapVar.c(ihbVar.a(new igd(this)));
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.f.close();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nhw {
    public Boolean b;
    public final ooh a = oom.e();
    public boolean c = false;

    public final nhx a() {
        Boolean bool = this.b;
        bool.getClass();
        return new nhx(bool.booleanValue(), this.c, this.a.f());
    }

    public final void b() {
        obr.aR(this.b == null, "A SourcePolicy can only set internal() or external() once.");
        this.b = false;
    }
}

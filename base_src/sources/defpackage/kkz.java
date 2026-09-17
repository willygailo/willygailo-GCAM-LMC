package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kkz {
    public klb a;
    public klb b;
    public kkt c;
    public int d;
    private final Runnable e = isd.n;

    public final kla a() {
        mip.dm(this.a != null, "Must set register function");
        mip.dm(this.b != null, "Must set unregister function");
        mip.dm(this.c != null, "Must set holder");
        mip.du(this.c.b, "Key must not be null");
        return new kla(new kky(this, this.c, this.d), new klm(this), this.e);
    }
}

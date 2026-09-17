package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kli {
    public klb a;
    public khk[] b;
    private boolean d = true;
    public int c = 0;

    public final klj a() {
        mip.dm(this.a != null, "execute parameter required");
        return new klj(this, this.b, this.d, this.c);
    }

    public final void b() {
        this.d = false;
    }
}

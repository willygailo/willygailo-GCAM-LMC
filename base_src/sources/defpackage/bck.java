package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bck implements bcl, bmk {
    private static final fc a = bmm.b(20, new bdu(1));
    private bcl b;
    private boolean c;
    private boolean d;
    private final fuo e = fuo.d();

    static bck d(bcl bclVar) {
        bck bckVar = (bck) a.a();
        aae.s(bckVar);
        bckVar.d = false;
        bckVar.c = true;
        bckVar.b = bclVar;
        return bckVar;
    }

    @Override // defpackage.bcl
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.bcl
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.bcl
    public final Object c() {
        return this.b.c();
    }

    @Override // defpackage.bcl
    public final synchronized void e() {
        this.e.c();
        this.d = true;
        if (!this.c) {
            this.b.e();
            this.b = null;
            a.b(this);
        }
    }

    @Override // defpackage.bmk
    public final fuo f() {
        return this.e;
    }

    final synchronized void g() {
        this.e.c();
        if (!this.c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.c = false;
        if (this.d) {
            e();
        }
    }
}

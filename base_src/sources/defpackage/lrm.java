package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class lrm implements lmr {
    private final lqh a;
    private final lie b;
    private boolean c = false;

    public lrm(lqh lqhVar, lie lieVar) {
        this.a = lqhVar;
        this.b = lieVar;
    }

    public static lmr k(lqh lqhVar) {
        lie lieVarB = lqhVar.b();
        if (lieVarB == null) {
            return null;
        }
        return new lrm(lqhVar, lieVarB);
    }

    @Override // defpackage.lmr
    public final synchronized lmr a() {
        return this.c ? null : k(this.a);
    }

    @Override // defpackage.lmr
    public final synchronized lmw b() {
        return this.a.b;
    }

    @Override // defpackage.lmr
    public final synchronized lzv c() {
        return this.a.d();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.c) {
            this.c = true;
            this.b.close();
        }
    }

    @Override // defpackage.lmr
    public final synchronized mad d(lnx lnxVar) {
        return this.c ? null : this.a.e(lnxVar);
    }

    @Override // defpackage.lmr
    public final synchronized boolean e() {
        return this.c;
    }

    @Override // defpackage.lmr
    public final synchronized boolean f() {
        return this.a.k();
    }

    @Override // defpackage.lmr
    public final synchronized boolean g() {
        return this.a.l();
    }

    @Override // defpackage.lmr
    public final synchronized boolean h() {
        return this.a.m();
    }

    @Override // defpackage.lmr
    public final synchronized lqd i() {
        return this.a.c;
    }

    @Override // defpackage.lmr
    public final synchronized void j(mip mipVar) {
        this.a.o(mipVar);
    }

    public final String toString() {
        return this.a.toString();
    }
}

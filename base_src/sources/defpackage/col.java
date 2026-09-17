package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class col implements cib {
    private final ddf a;
    private final /* synthetic */ int b;

    public col(ddf ddfVar, int i) {
        this.b = i;
        this.a = ddfVar;
    }

    @Override // defpackage.cib
    public final jrl a() {
        switch (this.b) {
            case 0:
                return jrl.VIDEO;
            default:
                return jrl.SLOW_MOTION;
        }
    }

    @Override // defpackage.cib
    public final ojc b() {
        switch (this.b) {
            case 0:
                return oih.a;
            default:
                return ojc.i(lwd.BACK);
        }
    }

    @Override // defpackage.cib
    public final boolean c() {
        switch (this.b) {
            case 0:
                break;
        }
        return this.a.k(ddl.K);
    }

    @Override // defpackage.cib
    public final boolean d() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.cib
    public final boolean e() {
        switch (this.b) {
            case 0:
                return this.a.k(dcu.q);
            default:
                return this.a.k(dcu.p);
        }
    }

    @Override // defpackage.cib
    public final boolean f() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.cib
    public final boolean g() {
        switch (this.b) {
            case 0:
                return this.a.k(dcu.ac) && this.a.k(dcu.ab);
            default:
                return false;
        }
    }

    @Override // defpackage.cib
    public final boolean h() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.cib
    public final boolean i() {
        switch (this.b) {
            case 0:
                return this.a.k(dcu.aa);
            default:
                return false;
        }
    }

    @Override // defpackage.cib
    public final boolean j() {
        int i = this.b;
        return true;
    }

    @Override // defpackage.cib
    public final boolean k() {
        switch (this.b) {
            case 0:
                return this.a.k(dcu.R);
            default:
                return false;
        }
    }

    @Override // defpackage.cib
    public final boolean l() {
        int i = this.b;
        return false;
    }

    @Override // defpackage.cib
    public final boolean m() {
        int i = this.b;
        return true;
    }

    @Override // defpackage.cib
    public final boolean n() {
        int i = this.b;
        return true;
    }

    @Override // defpackage.cib
    public final boolean o() {
        switch (this.b) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.cib
    public final void p() {
        switch (this.b) {
            case 0:
                ddf ddfVar = this.a;
                ddi ddiVar = dcu.a;
                ddfVar.d();
                break;
        }
    }
}

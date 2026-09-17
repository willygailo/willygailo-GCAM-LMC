package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nlz {
    public ojc a;
    public ojc b;
    public ojc c;
    private ooh d;
    private oom e;
    private ooh f;
    private oom g;
    private ojc h;
    private ojc i;
    private oom j;

    public nlz() {
    }

    public nlz(byte[] bArr) {
        this.a = oih.a;
        this.h = oih.a;
        this.i = oih.a;
        this.b = oih.a;
        this.c = oih.a;
    }

    public final nma a() {
        ooh oohVar = this.d;
        if (oohVar != null) {
            this.e = oohVar.f();
        } else if (this.e == null) {
            this.e = oom.l();
        }
        ooh oohVar2 = this.f;
        if (oohVar2 != null) {
            this.g = oohVar2.f();
        } else if (this.g == null) {
            this.g = oom.l();
        }
        if (this.j == null) {
            this.j = oom.l();
        }
        return new nma(this.a, this.e, this.g, this.h, this.i, this.b, this.j, this.c);
    }

    public final ooh b() {
        if (this.d == null) {
            if (this.e == null) {
                this.d = oom.e();
            } else {
                ooh oohVarE = oom.e();
                this.d = oohVarE;
                oohVarE.h(this.e);
                this.e = null;
            }
        }
        return this.d;
    }

    public final ooh c() {
        if (this.f == null) {
            if (this.g == null) {
                this.f = oom.e();
            } else {
                ooh oohVarE = oom.e();
                this.f = oohVarE;
                oohVarE.h(this.g);
                this.g = null;
            }
        }
        return this.f;
    }

    public final void d(String str) {
        this.h = ojc.i(str);
    }

    public final void e(String str) {
        this.i = ojc.i(str);
    }
}

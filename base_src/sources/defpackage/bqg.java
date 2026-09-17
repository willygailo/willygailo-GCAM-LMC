package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bqg implements fie, fig, fii, fij, fib {
    public final Object a = new Object();
    public lap b;
    public lap c;
    public lap d;
    public bws e;
    public bws f;
    public bws g;
    public final bui h;

    public bqg(bui buiVar) {
        this.h = buiVar;
        lap lapVarB = buiVar.b();
        this.d = lapVarB;
        lap lapVarC = buiVar.c(lapVarB);
        this.c = lapVarC;
        this.b = buiVar.a(lapVarC);
        lap lapVar = this.d;
        bws bwsVar = new bws();
        lapVar.c(bwsVar);
        this.g = bwsVar;
        lap lapVar2 = this.c;
        bws bwsVar2 = new bws();
        lapVar2.c(bwsVar2);
        this.f = bwsVar2;
        lap lapVar3 = this.b;
        bws bwsVar3 = new bws();
        lapVar3.c(bwsVar3);
        this.e = bwsVar3;
    }

    @Override // defpackage.fij
    public final void e() {
        synchronized (this.a) {
            this.c.close();
        }
    }

    public final boolean f() {
        boolean zA;
        synchronized (this.a) {
            zA = this.e.a();
        }
        return zA;
    }

    @Override // defpackage.fib
    public final void fT() {
        synchronized (this.a) {
            this.d.close();
        }
    }

    @Override // defpackage.fie
    public final void fU() {
        synchronized (this.a) {
            this.b.close();
        }
    }

    @Override // defpackage.fig
    public final void fV() {
        synchronized (this.a) {
            if (f()) {
                lap lapVarA = this.h.a(this.c);
                this.b = lapVarA;
                bws bwsVar = new bws();
                lapVarA.c(bwsVar);
                this.e = bwsVar;
            }
        }
    }

    @Override // defpackage.fii
    public final void fW() {
        synchronized (this.a) {
            if (g()) {
                lap lapVarC = this.h.c(this.d);
                this.c = lapVarC;
                bws bwsVar = new bws();
                lapVarC.c(bwsVar);
                this.f = bwsVar;
                lap lapVarA = this.h.a(this.c);
                this.b = lapVarA;
                bws bwsVar2 = new bws();
                lapVarA.c(bwsVar2);
                this.e = bwsVar2;
            }
        }
    }

    public final boolean g() {
        boolean zA;
        synchronized (this.a) {
            zA = this.f.a();
        }
        return zA;
    }

    public final lap h() {
        lap lapVar;
        synchronized (this.a) {
            lapVar = this.b;
        }
        return lapVar;
    }

    public final lap i() {
        lap lapVar;
        synchronized (this.a) {
            lapVar = this.d;
        }
        return lapVar;
    }
}

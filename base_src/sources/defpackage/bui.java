package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bui {
    public final Object a;
    public final lap b;
    public lap c;
    private lae d;
    private lap e;
    private lae f;
    private bws g;
    private bws h;

    public bui() {
        lap lapVar = new lap();
        this.b = lapVar;
        this.a = new Object();
        lap lapVarB = lapVar.b();
        this.e = lapVarB;
        this.f = d(lapVarB);
        lap lapVarB2 = this.e.b();
        this.c = lapVarB2;
        this.d = d(lapVarB2);
        lapVar.c(new bws());
        lap lapVar2 = this.e;
        bws bwsVar = new bws();
        lapVar2.c(bwsVar);
        this.h = bwsVar;
        lap lapVar3 = this.c;
        bws bwsVar2 = new bws();
        lapVar3.c(bwsVar2);
        this.g = bwsVar2;
    }

    private final lae d(lap lapVar) {
        lae laeVar = new lae(new buh(this, lapVar));
        lapVar.c(laeVar);
        return laeVar;
    }

    public final lap a(lap lapVar) {
        lap lapVarB = lapVar.b();
        synchronized (this.a) {
            if (this.g.a()) {
                lap lapVarB2 = this.e.b();
                this.c = lapVarB2;
                lapVarB2.c(bug.b);
                this.d = d(this.c);
                lap lapVar2 = this.c;
                bws bwsVar = new bws();
                lapVar2.c(bwsVar);
                this.g = bwsVar;
            }
            lie lieVarA = this.d.a();
            if (lieVarA != null) {
                lapVarB.c(lieVarA);
            }
        }
        return lapVarB;
    }

    public final lap b() {
        return this.b.b();
    }

    public final lap c(lap lapVar) {
        lap lapVarB = lapVar.b();
        synchronized (this.a) {
            if (this.h.a()) {
                lap lapVarB2 = this.b.b();
                this.e = lapVarB2;
                lapVarB2.c(bug.a);
                this.f = d(this.e);
                lap lapVar2 = this.e;
                bws bwsVar = new bws();
                lapVar2.c(bwsVar);
                this.h = bwsVar;
                lap lapVarB3 = this.e.b();
                this.c = lapVarB3;
                lapVarB3.c(bug.c);
                this.d = d(this.c);
                lap lapVar3 = this.c;
                bws bwsVar2 = new bws();
                lapVar3.c(bwsVar2);
                this.g = bwsVar2;
            }
            lie lieVarA = this.f.a();
            if (lieVarA != null) {
                lapVarB.c(lieVarA);
            }
        }
        return lapVarB;
    }
}

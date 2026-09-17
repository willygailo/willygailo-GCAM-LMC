package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class exy implements Runnable {
    public final /* synthetic */ eya a;
    private final /* synthetic */ int b;

    public /* synthetic */ exy(eya eyaVar, int i) {
        this.b = i;
        this.a = eyaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                eya eyaVar = this.a;
                eyaVar.a.O.f();
                eyaVar.a.r.fZ();
                break;
            case 1:
                fks fksVar = this.a.a.O;
                fksVar.g(fksVar.h);
                break;
            case 2:
                this.a.a.r.c();
                break;
            case 3:
                this.a.a.S.c();
                break;
            default:
                eya eyaVar2 = this.a;
                if (!eyaVar2.a.E.E()) {
                    fks fksVar2 = eyaVar2.a.O;
                    fksVar2.g(fksVar2.d);
                }
                eyg eygVar = eyaVar2.a;
                if (!eygVar.G && eygVar.q.fA() == hti.OFF) {
                    eyaVar2.a.v.h();
                    eyaVar2.a.E.q(true);
                    eyg eygVar2 = eyaVar2.a;
                    eygVar2.G = true;
                    ddf ddfVar = eygVar2.s;
                    ddi ddiVar = ddm.a;
                    ddfVar.f();
                    if (eyaVar2.a.k.d() >= eyg.c.floatValue()) {
                        eyaVar2.a.k.t(eyg.c.floatValue());
                        kas kasVar = eyaVar2.a.k;
                        kasVar.r(kasVar.d());
                    }
                    break;
                }
                break;
        }
    }
}

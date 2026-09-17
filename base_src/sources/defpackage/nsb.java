package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nsb implements nrk {
    public final pyn a;
    public final nrm b;
    public final mdf c;

    public nsb(pyn pynVar, nrm nrmVar, mdf mdfVar) {
        pynVar.getClass();
        nrmVar.getClass();
        mdfVar.getClass();
        this.a = pynVar;
        this.b = nrmVar;
        this.c = mdfVar;
    }

    private final qbu d(pht phtVar, nrl nrlVar) {
        qhs qhsVar = new qhs(naq.h(phtVar), new nsa(this, nrlVar));
        qco qcoVar = qmd.m;
        return qhsVar;
    }

    @Override // defpackage.nrk
    public final qbd a(nrl nrlVar, prl prlVar) {
        nrlVar.getClass();
        return d(((and) this.a.get()).a("F250_AUTO_WORKER_TAG"), nrlVar).a(new nrv(prlVar, this, nrlVar));
    }

    @Override // defpackage.nrk
    public final qbd b(nrl nrlVar, aml amlVar) {
        return naq.e(d(((and) this.a.get()).a("F250_WORKER_TAG"), nrlVar).a(new nrw(amlVar, this, nrlVar)), new nrx(this, amlVar, nrlVar));
    }

    public final qbd c(ana anaVar, nrl nrlVar, int i) {
        return naq.h(((anl) anaVar).c).e().g(new nry(this, nrlVar), qdd.c).g(qdd.d, new nrz(this, nrlVar, i));
    }
}

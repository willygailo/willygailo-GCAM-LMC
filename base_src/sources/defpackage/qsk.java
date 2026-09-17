package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qsk extends qtf {
    public final qsi a;
    public final qpn b;

    public qsk(qsi qsiVar, qpn qpnVar) {
        this.a = qsiVar;
        this.b = qpnVar;
    }

    @Override // defpackage.qth
    public final void b(Object obj) {
        this.a.b = obj;
        this.b.f();
    }

    @Override // defpackage.qtf
    public final void c(qta qtaVar) {
        Object objT;
        qtaVar.getClass();
        if (qtaVar.a == null) {
            objT = this.b.d(false);
        } else {
            objT = ((qpo) this.b).t(new qpy(qtaVar.e()), null);
        }
        if (objT != null) {
            this.a.b = qtaVar;
            this.b.f();
        }
    }

    @Override // defpackage.qth
    public final qvr d(Object obj) {
        qpn qpnVar = this.b;
        qso qsoVar = this.a.a;
        if (((qpo) qpnVar).t(true, null) == null) {
            return null;
        }
        boolean z = qql.a;
        return qpp.a;
    }

    @Override // defpackage.qvh
    public final String toString() {
        return qno.a("ReceiveHasNext@", qnm.g(this));
    }
}

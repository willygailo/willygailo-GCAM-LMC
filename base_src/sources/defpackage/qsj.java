package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qsj extends qtf {
    public final qpn a;
    public final int b;

    public qsj(qpn qpnVar, int i) {
        this.a = qpnVar;
        this.b = i;
    }

    public final Object a(Object obj) {
        return this.b == 1 ? qsz.a(obj) : obj;
    }

    @Override // defpackage.qth
    public final void b(Object obj) {
        this.a.f();
    }

    @Override // defpackage.qtf
    public final void c(qta qtaVar) {
        qtaVar.getClass();
        if (this.b == 1) {
            this.a.resumeWith(qsz.a(qnt.k(qtaVar.a)));
        } else {
            this.a.resumeWith(qmd.L(qtaVar.e()));
        }
    }

    @Override // defpackage.qth
    public final qvr d(Object obj) {
        if (((qpo) this.a).t(a(obj), null) == null) {
            return null;
        }
        boolean z = qql.a;
        return qpp.a;
    }

    @Override // defpackage.qvh
    public final String toString() {
        return "ReceiveElement@" + qnm.g(this) + "[receiveMode=" + this.b + ']';
    }
}

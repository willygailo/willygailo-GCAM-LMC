package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qtl extends qtj {
    public final qpn a;
    private final Object b;

    public qtl(Object obj, qpn qpnVar) {
        this.b = obj;
        this.a = qpnVar;
    }

    @Override // defpackage.qtj
    public final Object c() {
        return this.b;
    }

    @Override // defpackage.qtj
    public final void g() {
        this.a.f();
    }

    @Override // defpackage.qtj
    public final void h(qta qtaVar) {
        this.a.resumeWith(qmd.L(qtaVar.f()));
    }

    @Override // defpackage.qtj
    public final qvr i() {
        if (this.a.d(qks.a) == null) {
            return null;
        }
        boolean z = qql.a;
        return qpp.a;
    }

    @Override // defpackage.qvh
    public final String toString() {
        return qnm.f(this) + '@' + qnm.g(this) + '(' + this.b + ')';
    }
}

package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qta extends qtj implements qth {
    public final Throwable a;

    public qta(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.qth
    public final void b(Object obj) {
    }

    @Override // defpackage.qtj
    public final /* bridge */ /* synthetic */ Object c() {
        return this;
    }

    @Override // defpackage.qth
    public final qvr d(Object obj) {
        return qpp.a;
    }

    public final Throwable e() {
        Throwable th = this.a;
        return th == null ? new qtb() : th;
    }

    public final Throwable f() {
        Throwable th = this.a;
        return th == null ? new qtc() : th;
    }

    @Override // defpackage.qtj
    public final void g() {
    }

    @Override // defpackage.qtj
    public final void h(qta qtaVar) {
        boolean z = qql.a;
    }

    @Override // defpackage.qth
    public final /* bridge */ /* synthetic */ Object he() {
        return this;
    }

    @Override // defpackage.qtj
    public final qvr i() {
        return qpp.a;
    }

    @Override // defpackage.qvh
    public final String toString() {
        return "Closed@" + qnm.g(this) + '[' + this.a + ']';
    }
}

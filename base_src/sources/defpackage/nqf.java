package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nqf implements npz {
    public final aii a;
    public final ahz b;

    public nqf(aii aiiVar) {
        this.a = aiiVar;
        new nqb(aiiVar);
        this.b = new nqc(aiiVar);
    }

    @Override // defpackage.npz
    public final qbu a(nqh nqhVar) {
        return qbu.j(new nqd(this, nqhVar));
    }

    @Override // defpackage.npz
    public final qbu b(Iterable iterable) {
        return qbu.j(new nqe(this, iterable));
    }
}

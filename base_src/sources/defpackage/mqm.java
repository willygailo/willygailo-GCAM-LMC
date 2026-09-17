package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mqm {
    public final mmd a = mip.af(2);
    private final mpi b;

    public mqm(mpi mpiVar) {
        this.b = mpiVar;
    }

    public final void a(mtu mtuVar) {
        this.a.add(mtuVar);
    }

    public final mrd b() {
        mpi mpiVar = this.b;
        return new mrd(mpiVar, mpo.d(mpiVar, new mql(this)), null);
    }
}

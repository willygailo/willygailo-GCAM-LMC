package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class nqq implements Callable {
    final /* synthetic */ nnr a;
    final /* synthetic */ long b;
    final /* synthetic */ nqu c;

    public nqq(nqu nquVar, nnr nnrVar, long j) {
        this.c = nquVar;
        this.a = nnrVar;
        this.b = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ake akeVarE = this.c.b.e();
        akeVarE.e(1, npy.r(this.a));
        akeVarE.e(2, this.b);
        this.c.a.h();
        try {
            Integer numValueOf = Integer.valueOf(akeVarE.a());
            this.c.a.j();
            return numValueOf;
        } finally {
            this.c.a.i();
            this.c.b.f(akeVarE);
        }
    }
}

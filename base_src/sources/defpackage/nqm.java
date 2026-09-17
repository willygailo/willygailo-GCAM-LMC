package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class nqm implements Callable {
    final /* synthetic */ Set a;
    final /* synthetic */ nnr b;
    final /* synthetic */ nmr c;
    final /* synthetic */ nqu d;

    public nqm(nqu nquVar, Set set, nnr nnrVar, nmr nmrVar) {
        this.d = nquVar;
        this.a = set;
        this.b = nnrVar;
        this.c = nmrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        StringBuilder sbE = fz.e();
        sbE.append("\n      UPDATE ResourceEntity SET status_uploadState = ?\n      WHERE\n        status_uploadState IN (");
        int size = this.a.size();
        fz.f(sbE, size);
        sbE.append(")\n        AND (\n          status_airlockFileState IS NOT ?\n          OR namespaceId IS NULL\n          OR partitionId IS NULL\n        )\n    ");
        ake akeVarM = this.d.a.m(sbE.toString());
        akeVarM.e(1, npy.r(this.b));
        Iterator it = this.a.iterator();
        int i = 2;
        while (it.hasNext()) {
            akeVarM.e(i, npy.r((nnr) it.next()));
            i++;
        }
        akeVarM.e(size + 2, npy.a(this.c));
        this.d.a.h();
        try {
            Integer numValueOf = Integer.valueOf(akeVarM.a());
            this.d.a.j();
            return numValueOf;
        } finally {
            this.d.a.i();
        }
    }
}

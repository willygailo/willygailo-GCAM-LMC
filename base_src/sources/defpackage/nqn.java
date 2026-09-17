package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class nqn implements Callable {
    final /* synthetic */ Set a;
    final /* synthetic */ Set b;
    final /* synthetic */ nnr c;
    final /* synthetic */ nqu d;

    public nqn(nqu nquVar, Set set, Set set2, nnr nnrVar) {
        this.d = nquVar;
        this.a = set;
        this.b = set2;
        this.c = nnrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        StringBuilder sbE = fz.e();
        sbE.append("\n      UPDATE AnnotachmentEntity SET status_uploadState = ?\n      WHERE\n        resourceOnDeviceId IN (\n          SELECT onDeviceId FROM ResourceEntity WHERE status_uploadState = ?\n        )\n        AND isAttachment IN (");
        int size = this.a.size();
        fz.f(sbE, size);
        sbE.append(")\n        AND status_uploadState IN (");
        fz.f(sbE, this.b.size());
        sbE.append(")\n    ");
        ake akeVarM = this.d.a.m(sbE.toString());
        akeVarM.e(1, npy.r(this.c));
        akeVarM.e(2, npy.r(this.c));
        Iterator it = this.a.iterator();
        int i = 3;
        while (it.hasNext()) {
            akeVarM.e(i, npy.e((nmt) it.next()));
            i++;
        }
        int i2 = size + 3;
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            akeVarM.e(i2, npy.r((nnr) it2.next()));
            i2++;
        }
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

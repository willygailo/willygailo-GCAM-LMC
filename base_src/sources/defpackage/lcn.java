package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class lcn implements lco {
    public final List a;

    public lcn(Collection collection) {
        this.a = oom.j(collection);
    }

    @Override // defpackage.lco
    public final lie a(final lij lijVar, Executor executor) {
        if (this.a.isEmpty()) {
            executor.execute(new Runnable() { // from class: lcj
                @Override // java.lang.Runnable
                public final void run() {
                    lijVar.fB(Collections.emptyList());
                }
            });
            return new jmf(3);
        }
        lcm lcmVar = new lcm(this, lijVar, executor);
        lap lapVar = new lap();
        ldb ldbVar = new ldb();
        for (int i = 0; i < this.a.size(); i++) {
            lapVar.c(((lco) this.a.get(i)).a(new lcl(lcmVar, i), ldbVar));
        }
        return lapVar;
    }

    @Override // defpackage.lco
    public final /* bridge */ /* synthetic */ Object fA() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((lco) it.next()).fA());
        }
        return arrayList;
    }
}

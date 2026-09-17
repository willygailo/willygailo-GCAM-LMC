package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class cbd implements cbm {
    final /* synthetic */ Executor a;
    final /* synthetic */ Set b;

    public cbd(Executor executor, Set set) {
        this.a = executor;
        this.b = set;
    }

    @Override // defpackage.cbm
    public final void fP(final jrl jrlVar, final float f) {
        Executor executor = this.a;
        final Set set = this.b;
        executor.execute(new Runnable() { // from class: cbc
            @Override // java.lang.Runnable
            public final void run() {
                Set set2 = set;
                jrl jrlVar2 = jrlVar;
                float f2 = f;
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    ((cbm) it.next()).fP(jrlVar2, f2);
                }
            }
        });
    }
}

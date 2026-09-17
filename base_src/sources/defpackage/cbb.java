package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class cbb implements cbl {
    final /* synthetic */ Executor a;
    final /* synthetic */ Set b;

    public cbb(Executor executor, Set set) {
        this.a = executor;
        this.b = set;
    }

    @Override // defpackage.cbl
    public final void f(final jrl jrlVar) {
        Executor executor = this.a;
        final Set set = this.b;
        executor.execute(new Runnable() { // from class: cba
            @Override // java.lang.Runnable
            public final void run() {
                Set set2 = set;
                jrl jrlVar2 = jrlVar;
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    ((cbl) it.next()).f(jrlVar2);
                }
            }
        });
    }
}

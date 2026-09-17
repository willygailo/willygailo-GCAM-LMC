package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class bvs implements phh {
    final /* synthetic */ String a;
    final /* synthetic */ qkg b;
    final /* synthetic */ bvu c;

    public bvs(bvu bvuVar, String str, qkg qkgVar) {
        this.c = bvuVar;
        this.a = str;
        this.b = qkgVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Executor executor = this.c.a;
            final String str = this.a;
            final qkg qkgVar = this.b;
            executor.execute(new Runnable() { // from class: bvr
                @Override // java.lang.Runnable
                public final void run() {
                    bvs bvsVar = this.a;
                    String str2 = str;
                    qkg qkgVar2 = qkgVar;
                    bvsVar.c.b.e(str2.concat("#get-all"));
                    Iterator it = ((Set) qkgVar2.get()).iterator();
                    while (it.hasNext()) {
                        Runnable runnableC = bvsVar.c.b.c(str2, (iho) it.next());
                        runnableC.getClass();
                        new dks(runnableC, 1).run();
                    }
                    bvsVar.c.b.f();
                }
            });
        }
    }
}

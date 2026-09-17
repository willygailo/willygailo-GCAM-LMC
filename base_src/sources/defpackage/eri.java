package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class eri implements phh {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ erj c;

    public eri(erj erjVar, Runnable runnable, Runnable runnable2) {
        this.c = erjVar;
        this.a = runnable;
        this.b = runnable2;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        this.c.e();
        this.b.run();
        ((oug) ((oug) ((oug) erk.a.c().g(ovl.a, "LasagnaProcQueue")).h(th)).G(1424)).p("Error executing first stage for task %s", this.c.d);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Executor executor = this.c.g.d;
        final Runnable runnable = this.a;
        final Runnable runnable2 = this.b;
        executor.execute(new Runnable() { // from class: erh
            @Override // java.lang.Runnable
            public final void run() {
                eri eriVar = this.a;
                Runnable runnable3 = runnable;
                Runnable runnable4 = runnable2;
                if (eriVar.c.f) {
                    runnable4.run();
                } else {
                    runnable3.run();
                }
            }
        });
    }
}

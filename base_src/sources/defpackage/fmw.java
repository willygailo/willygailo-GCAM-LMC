package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class fmw extends mip {
    final /* synthetic */ Executor a;
    final /* synthetic */ fb b;
    final /* synthetic */ lmr c;

    public fmw(Executor executor, fb fbVar, lmr lmrVar) {
        this.a = executor;
        this.b = fbVar;
        this.c = lmrVar;
    }

    @Override // defpackage.mip
    public final void fy() {
        Executor executor = this.a;
        final fb fbVar = this.b;
        final lmr lmrVar = this.c;
        executor.execute(new Runnable() { // from class: fmv
            @Override // java.lang.Runnable
            public final void run() {
                fb fbVar2 = fbVar;
                lmr lmrVar2 = lmrVar;
                fbVar2.accept(lmrVar2);
                lmrVar2.close();
            }
        });
    }
}

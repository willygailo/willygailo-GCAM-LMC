package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lbq implements Executor {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ lbs c;
    private final /* synthetic */ int d;

    public /* synthetic */ lbq(lbs lbsVar, Runnable runnable, Executor executor, int i) {
        this.d = i;
        this.c = lbsVar;
        this.a = runnable;
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.d) {
            case 0:
                lbs lbsVar = this.c;
                lbsVar.a(runnable).d(this.a, this.b);
                break;
            default:
                lbs lbsVar2 = this.c;
                final Runnable runnable2 = this.a;
                Executor executor = this.b;
                final pht phtVarA = lbsVar2.a(runnable);
                phtVarA.d(new Runnable() { // from class: lbo
                    @Override // java.lang.Runnable
                    public final void run() {
                        pht phtVar = phtVarA;
                        Runnable runnable3 = runnable2;
                        if (((Boolean) plk.ae(phtVar)).booleanValue()) {
                            return;
                        }
                        runnable3.run();
                    }
                }, executor);
                break;
        }
    }
}

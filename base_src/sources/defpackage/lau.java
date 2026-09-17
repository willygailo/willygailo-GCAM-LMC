package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lau implements Runnable {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ pih b;
    private final /* synthetic */ int c;

    public /* synthetic */ lau(Runnable runnable, pih pihVar, int i) {
        this.c = i;
        this.a = runnable;
        this.b = pihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                Runnable runnable = this.a;
                pih pihVar = this.b;
                try {
                    runnable.run();
                    pihVar.o(true);
                    break;
                } catch (Throwable th) {
                    try {
                        pihVar.a(th);
                    } finally {
                        pihVar.o(false);
                    }
                    break;
                }
                return;
            default:
                Runnable runnable2 = this.a;
                pih pihVar2 = this.b;
                try {
                    runnable2.run();
                    return;
                } finally {
                    pihVar2.o(true);
                }
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class elr implements Runnable {
    public final /* synthetic */ els a;
    private final /* synthetic */ int b;

    public /* synthetic */ elr(els elsVar, int i) {
        this.b = i;
        this.a = elsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnableD;
        switch (this.b) {
            case 0:
                els elsVar = this.a;
                synchronized (els.a) {
                    elv elvVar = elsVar.j;
                    if (elvVar != null) {
                        elvVar.q(elsVar.k, elsVar.h, elsVar.i);
                    }
                    break;
                }
                return;
            case 1:
                els elsVar2 = this.a;
                elsVar2.c.e(elsVar2);
                return;
            case 2:
                els elsVar3 = this.a;
                synchronized (els.a) {
                    elv elvVar2 = elsVar3.j;
                    if (elvVar2 != null) {
                        elvVar2.q(elsVar3.k, elsVar3.h, elsVar3.i);
                    }
                    break;
                }
                return;
            default:
                els elsVar4 = this.a;
                synchronized (els.a) {
                    elv elvVar3 = elsVar4.j;
                    if (elvVar3 != null) {
                        runnableD = elvVar3.d();
                        elsVar4.g(elsVar4.j);
                    } else {
                        runnableD = null;
                    }
                    break;
                }
                if (runnableD != null) {
                    runnableD.run();
                    return;
                }
                return;
        }
    }
}

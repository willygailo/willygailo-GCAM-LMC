package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class elj implements Runnable {
    public final /* synthetic */ els a;
    public final /* synthetic */ elv b;
    private final /* synthetic */ int c;

    public /* synthetic */ elj(els elsVar, elv elvVar, int i) {
        this.c = i;
        this.a = elsVar;
        this.b = elvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                els elsVar = this.a;
                elv elvVar = this.b;
                synchronized (els.a) {
                    if (elvVar.equals(elsVar.j)) {
                        elvVar.h();
                    }
                    break;
                }
                return;
            case 1:
                els elsVar2 = this.a;
                elv elvVar2 = this.b;
                synchronized (els.a) {
                    elsVar2.d.remove(elvVar2);
                    break;
                }
                return;
            default:
                els elsVar3 = this.a;
                elv elvVar3 = this.b;
                elvVar3.q(elsVar3.k, elsVar3.h, elsVar3.i);
                elvVar3.j();
                return;
        }
    }
}

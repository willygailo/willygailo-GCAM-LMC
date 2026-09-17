package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fzz implements Runnable {
    public final /* synthetic */ gac a;
    private final /* synthetic */ int b;

    public /* synthetic */ fzz(gac gacVar, int i) {
        this.b = i;
        this.a = gacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                gac gacVar = this.a;
                gacVar.d.j(true);
                gacVar.v();
                return;
            default:
                gac gacVar2 = this.a;
                synchronized (gacVar2.f) {
                    if (!gacVar2.i) {
                        gacVar2.u();
                    }
                    gacVar2.c.n();
                    break;
                }
                return;
        }
    }
}

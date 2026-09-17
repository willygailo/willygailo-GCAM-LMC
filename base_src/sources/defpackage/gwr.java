package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gwr implements Runnable {
    final /* synthetic */ gws a;
    private final /* synthetic */ int b;

    public gwr(gws gwsVar, int i) {
        this.b = i;
        this.a = gwsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                gws gwsVar = this.a;
                gwsVar.b.a(gwsVar.e);
                break;
            default:
                gws gwsVar2 = this.a;
                gwsVar2.b.c(gwsVar2.e);
                pih pihVar = this.a.d;
                if (pihVar != null) {
                    pihVar.o(null);
                }
                break;
        }
    }
}

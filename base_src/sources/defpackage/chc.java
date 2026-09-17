package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class chc implements Runnable {
    final /* synthetic */ che a;
    private final /* synthetic */ int b;

    public chc(che cheVar, int i) {
        this.b = i;
        this.a = cheVar;
    }

    public /* synthetic */ chc(che cheVar, int i, byte[] bArr) {
        this.b = i;
        this.a = cheVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                synchronized (this.a.h) {
                    che cheVar = this.a;
                    cheVar.c.c(cheVar.f);
                    pih pihVar = this.a.g;
                    if (pihVar != null) {
                        pihVar.o(null);
                    }
                    break;
                }
                return;
            default:
                che cheVar2 = this.a;
                synchronized (cheVar2.h) {
                    if (cheVar2.e.k(ddl.br) || ((Integer) ((lce) cheVar2.d.b).d).intValue() == 0) {
                        cheVar2.c.a(cheVar2.f);
                        return;
                    }
                    return;
                }
        }
    }
}

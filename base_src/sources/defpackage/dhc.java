package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dhc implements Runnable {
    public final /* synthetic */ dhg a;
    public final /* synthetic */ dhf b;
    private final /* synthetic */ int c;

    public /* synthetic */ dhc(dhg dhgVar, dhf dhfVar, int i) {
        this.c = i;
        this.a = dhgVar;
        this.b = dhfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                dhg dhgVar = this.a;
                dhf dhfVar = this.b;
                synchronized (dhgVar) {
                    if (dhgVar.b.remove(dhfVar)) {
                        dhgVar.c.add(dhfVar.a());
                    }
                    break;
                }
                return;
            default:
                dhg dhgVar2 = this.a;
                dhf dhfVar2 = this.b;
                synchronized (dhgVar2) {
                    if (dhgVar2.b.remove(dhfVar2)) {
                        dhgVar2.c.add(dhfVar2.a());
                    }
                    break;
                }
                return;
        }
    }
}

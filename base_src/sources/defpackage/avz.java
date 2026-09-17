package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class avz implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ awb c;
    private final /* synthetic */ int d;

    public avz(awb awbVar, int i, String str, int i2) {
        this.d = i2;
        this.c = awbVar;
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.c.b.d(this.a, this.b);
                break;
            default:
                this.c.b.c(this.a, this.b);
                break;
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class dm implements Runnable {
    final /* synthetic */ dn a;
    final /* synthetic */ dq b;
    private final /* synthetic */ int c;

    public dm(dq dqVar, dn dnVar, int i) {
        this.c = i;
        this.b = dqVar;
        this.a = dnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                this.b.b.remove(this.a);
                this.b.c.remove(this.a);
                break;
            default:
                if (this.b.b.contains(this.a)) {
                    dn dnVar = this.a;
                    d.o(dnVar.e, dnVar.a.M);
                }
                break;
        }
    }
}

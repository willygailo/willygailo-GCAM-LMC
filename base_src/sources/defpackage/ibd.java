package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ibd implements Runnable {
    public final /* synthetic */ icw a;
    private final /* synthetic */ int b;

    public /* synthetic */ ibd(icw icwVar, int i) {
        this.b = i;
        this.a = icwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.o();
                break;
            case 1:
                this.a.m();
                break;
            case 2:
                this.a.f();
                break;
            case 3:
                this.a.j();
                break;
            default:
                this.a.k();
                break;
        }
    }
}

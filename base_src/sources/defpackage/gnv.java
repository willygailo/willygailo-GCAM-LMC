package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gnv implements Runnable {
    public final /* synthetic */ gnw a;
    private final /* synthetic */ int b;

    public /* synthetic */ gnv(gnw gnwVar, int i) {
        this.b = i;
        this.a = gnwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.a.c();
                break;
            case 1:
                this.a.d();
                break;
            default:
                this.a.h();
                break;
        }
    }
}

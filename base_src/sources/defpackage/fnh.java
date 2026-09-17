package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fnh implements Runnable {
    public final /* synthetic */ fnj a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ fnh(fnj fnjVar, long j, int i) {
        this.c = i;
        this.a = fnjVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                fnj fnjVar = this.a;
                fnjVar.f.post(new fnh(fnjVar, this.b, 1));
                break;
            default:
                this.a.c.h(System.currentTimeMillis() - this.b);
                break;
        }
    }
}

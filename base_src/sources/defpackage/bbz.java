package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bbz implements Runnable {
    final /* synthetic */ bcc a;
    private final bky b;
    private final /* synthetic */ int c;

    public bbz(bcc bccVar, bky bkyVar, int i) {
        this.c = i;
        this.a = bccVar;
        this.b = bkyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                synchronized (this.b.a()) {
                    synchronized (this.a) {
                        if (this.a.a.d(this.b)) {
                            this.a.i.d();
                            bcc bccVar = this.a;
                            try {
                                this.b.e(bccVar.i, bccVar.k);
                                this.a.g(this.b);
                            } catch (Throwable th) {
                                throw new bbc(th);
                            }
                        }
                        this.a.c();
                    }
                }
                return;
            default:
                synchronized (this.b.a()) {
                    synchronized (this.a) {
                        if (this.a.a.d(this.b)) {
                            bcc bccVar2 = this.a;
                            try {
                                this.b.d(bccVar2.g);
                            } catch (Throwable th2) {
                                throw new bbc(th2);
                            }
                        }
                        this.a.c();
                        break;
                    }
                }
                return;
        }
    }
}

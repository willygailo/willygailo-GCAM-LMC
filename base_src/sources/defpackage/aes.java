package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class aes implements Runnable {
    final adz a;
    private boolean b = false;
    private final aeb c;

    public aes(aeb aebVar, adz adzVar) {
        this.c = aebVar;
        this.a = adzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.c.c(this.a);
        this.b = true;
    }
}

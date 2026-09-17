package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class arp implements Runnable {
    final arq a;
    final Runnable b;

    public arp(arq arqVar, Runnable runnable) {
        this.a = arqVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
        } finally {
            this.a.a();
        }
    }
}

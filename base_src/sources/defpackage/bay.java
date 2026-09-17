package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bay implements Runnable {
    final /* synthetic */ bbb a;

    public bay(bbb bbbVar) {
        this.a = bbbVar;
    }

    /* JADX INFO: Infinite loop detected, blocks: 10, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        bbb bbbVar = this.a;
        while (true) {
            boolean z = bbbVar.c;
            try {
                bbbVar.c((bba) bbbVar.b.remove());
                baz bazVar = bbbVar.d;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

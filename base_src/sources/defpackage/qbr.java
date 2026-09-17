package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qbr implements Runnable, qbz {
    final Runnable a;
    final qbs b;
    Thread c;

    public qbr(Runnable runnable, qbs qbsVar) {
        this.a = runnable;
        this.b = qbsVar;
    }

    @Override // defpackage.qbz
    public final void gT() {
        if (this.c == Thread.currentThread()) {
            qbs qbsVar = this.b;
            if (qbsVar instanceof qiu) {
                qiu qiuVar = (qiu) qbsVar;
                if (qiuVar.c) {
                    return;
                }
                qiuVar.c = true;
                qiuVar.b.shutdown();
                return;
            }
        }
        this.b.gT();
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
        } finally {
            gT();
            this.c = null;
        }
    }
}

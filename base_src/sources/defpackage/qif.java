package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class qif extends qbs {
    volatile boolean a;
    private final qct b;
    private final qby c;
    private final qct d;
    private final qiu e;

    public qif(qiu qiuVar) {
        this.e = qiuVar;
        qct qctVar = new qct();
        this.b = qctVar;
        qby qbyVar = new qby();
        this.c = qbyVar;
        qct qctVar2 = new qct();
        this.d = qctVar2;
        qctVar2.b(qctVar);
        qctVar2.b(qbyVar);
    }

    @Override // defpackage.qbs
    public final void c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.a) {
            qcs qcsVar = qcs.INSTANCE;
        } else {
            this.e.f(runnable, j, timeUnit, this.c);
        }
    }

    @Override // defpackage.qbz
    public final void gT() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.d.gT();
    }

    @Override // defpackage.qbz
    public final boolean gV() {
        throw null;
    }
}

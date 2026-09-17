package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
public final class qpj extends qpg {
    public final qqu b;
    private final Thread e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpj(qln qlnVar, Thread thread, qqu qquVar) {
        super(qlnVar);
        qlnVar.getClass();
        thread.getClass();
        this.e = thread;
        this.b = qquVar;
    }

    @Override // defpackage.qro
    protected final void j(Object obj) {
        if (qno.c(Thread.currentThread(), this.e)) {
            return;
        }
        LockSupport.unpark(this.e);
    }

    @Override // defpackage.qro
    protected final boolean k() {
        return true;
    }
}

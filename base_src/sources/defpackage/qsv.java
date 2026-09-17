package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public class qsv extends qpg implements qsu {
    public final qsu b;

    public qsv(qln qlnVar, qsu qsuVar) {
        super(qlnVar);
        this.b = qsuVar;
    }

    @Override // defpackage.qro
    public final void B(Throwable th) throws Throwable {
        CancellationException cancellationExceptionK = qro.K(this, th);
        this.b.q(cancellationExceptionK);
        E(cancellationExceptionK);
    }

    @Override // defpackage.qtg
    public final Object b(qlh qlhVar) {
        throw null;
    }

    @Override // defpackage.qtg
    public final Object c(qlh qlhVar) {
        throw null;
    }

    @Override // defpackage.qtg
    public final qsw d() {
        throw null;
    }

    @Override // defpackage.qtg
    public final boolean l() {
        throw null;
    }

    @Override // defpackage.qro, defpackage.qrg
    public final void q(CancellationException cancellationException) throws Throwable {
        Object objV = v();
        if (objV instanceof qpy) {
            return;
        }
        if ((objV instanceof qrm) && ((qrm) objV).g()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new qrh(a(), null, this);
        }
        B(cancellationException);
    }

    @Override // defpackage.qtk
    public final Object r(Object obj, qlh qlhVar) {
        return this.b.r(obj, qlhVar);
    }

    @Override // defpackage.qtk
    public final Object s(Object obj) {
        return this.b.s(obj);
    }

    @Override // defpackage.qtk
    public final boolean w(Throwable th) {
        throw null;
    }
}

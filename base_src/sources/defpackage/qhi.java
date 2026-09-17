package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qhi implements qbv {
    final AtomicReference a;
    final qbv b;
    private final /* synthetic */ int c;

    public qhi(AtomicReference atomicReference, qbv qbvVar, int i) {
        this.c = i;
        this.a = atomicReference;
        this.b = qbvVar;
    }

    @Override // defpackage.qbv
    public final void b(Throwable th) {
        switch (this.c) {
            case 0:
                this.b.b(th);
                break;
            default:
                this.b.b(th);
                break;
        }
    }

    @Override // defpackage.qbv
    public final void d(Object obj) {
        switch (this.c) {
            case 0:
                this.b.d(obj);
                break;
            default:
                this.b.d(obj);
                break;
        }
    }

    @Override // defpackage.qbv
    public final void gR(qbz qbzVar) {
        switch (this.c) {
            case 0:
                qcr.h(this.a, qbzVar);
                break;
            default:
                qcr.h(this.a, qbzVar);
                break;
        }
    }
}

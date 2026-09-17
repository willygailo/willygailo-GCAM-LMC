package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qfp extends AtomicReference implements qbn, qbz {
    private static final long serialVersionUID = -3434801548987643227L;
    final qbq a;

    public qfp(qbq qbqVar) {
        this.a = qbqVar;
    }

    @Override // defpackage.qbg
    public final void a() {
        throw null;
    }

    @Override // defpackage.qbg
    public final void b(Throwable th) {
        Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
        if (gV()) {
            qmd.R(th);
            return;
        }
        try {
            this.a.b(nullPointerException);
        } finally {
            qcr.g(this);
        }
    }

    @Override // defpackage.qbg
    public final void c(Object obj) {
        if (gV()) {
            return;
        }
        this.a.e(obj);
    }

    @Override // defpackage.qbz
    public final void gT() {
        qcr.g(this);
    }

    @Override // defpackage.qbn, defpackage.qbz
    public final boolean gV() {
        return qcr.c((qbz) get());
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class qjl extends AtomicInteger implements qdi {
    private static final long serialVersionUID = -3830916580126663321L;
    final Object a;
    final qym b;

    public qjl(qym qymVar, Object obj) {
        this.b = qymVar;
        this.a = obj;
    }

    @Override // defpackage.qdl
    public final void c() {
        lazySet(1);
    }

    @Override // defpackage.qyn
    public final void g() {
        lazySet(2);
    }

    @Override // defpackage.qyn
    public final void gP(long j) {
        if (qjn.d(j) && compareAndSet(0, 1)) {
            qym qymVar = this.b;
            qymVar.e(this.a);
            if (get() != 2) {
                qymVar.gO();
            }
        }
    }

    @Override // defpackage.qdl
    public final Object gS() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }

    @Override // defpackage.qdl
    public final boolean gU(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return get() != 0;
    }

    @Override // defpackage.qdh
    public final int k() {
        return 1;
    }
}

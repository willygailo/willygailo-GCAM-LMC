package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qib implements qdk {
    private final AtomicReference a = new AtomicReference();
    private final AtomicReference b = new AtomicReference();

    public qib() {
        qia qiaVar = new qia();
        e(qiaVar);
        d(qiaVar);
    }

    final qia a() {
        return (qia) this.a.get();
    }

    @Override // defpackage.qdl
    public final void c() {
        while (gS() != null && !i()) {
        }
    }

    final qia d(qia qiaVar) {
        return (qia) this.a.getAndSet(qiaVar);
    }

    final void e(qia qiaVar) {
        this.b.lazySet(qiaVar);
    }

    @Override // defpackage.qdk, defpackage.qdl
    public final Object gS() {
        qia qiaVarA;
        qia qiaVar = (qia) this.b.get();
        qia qiaVarA2 = qiaVar.a();
        if (qiaVarA2 != null) {
            Object objB = qiaVarA2.b();
            e(qiaVarA2);
            return objB;
        }
        if (qiaVar == a()) {
            return null;
        }
        do {
            qiaVarA = qiaVar.a();
        } while (qiaVarA == null);
        Object objB2 = qiaVarA.b();
        e(qiaVarA);
        return objB2;
    }

    @Override // defpackage.qdl
    public final boolean gU(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        qia qiaVar = new qia(obj);
        d(qiaVar).lazySet(qiaVar);
        return true;
    }

    @Override // defpackage.qdl
    public final boolean i() {
        return ((qia) this.b.get()) == a();
    }
}

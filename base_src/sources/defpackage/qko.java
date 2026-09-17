package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class qko implements Serializable, qkj {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(qko.class, Object.class, "c");
    private volatile qmj b;
    private volatile Object c = qkq.a;

    public qko(qmj qmjVar) {
        this.b = qmjVar;
    }

    private final Object writeReplace() {
        return new qki(a());
    }

    @Override // defpackage.qkj
    public final Object a() {
        Object obj = this.c;
        if (obj != qkq.a) {
            return obj;
        }
        qmj qmjVar = this.b;
        if (qmjVar != null) {
            Object objInvoke = qmjVar.invoke();
            if (a.compareAndSet(this, qkq.a, objInvoke)) {
                this.b = null;
                return objInvoke;
            }
        }
        return this.c;
    }

    public final String toString() {
        return this.c != qkq.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}

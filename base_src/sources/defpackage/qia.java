package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
final class qia extends AtomicReference {
    private static final long serialVersionUID = 2404266111789071508L;
    private Object a;

    public qia() {
    }

    public qia(Object obj) {
        this.a = obj;
    }

    public final qia a() {
        return (qia) get();
    }

    public final Object b() {
        Object obj = this.a;
        this.a = null;
        return obj;
    }
}

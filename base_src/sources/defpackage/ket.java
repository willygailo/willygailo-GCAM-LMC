package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ket {
    private final Object a;
    private final Object b = new Object();

    private ket(Object obj) {
        this.a = obj;
    }

    static ket b(Object obj) {
        return new ket(obj);
    }

    public final Object a() {
        synchronized (this.b) {
        }
        return this.a;
    }
}

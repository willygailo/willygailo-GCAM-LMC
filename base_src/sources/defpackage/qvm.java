package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qvm {
    private final qpe a;

    public qvm() {
    }

    public qvm(byte[] bArr) {
        this.a = qnt.i(quu.a);
    }

    public abstract Object a(Object obj);

    public abstract void b(Object obj, Object obj2);

    public final Object c(Object obj) {
        Object objA = this.a.a;
        if (objA == quu.a) {
            objA = a(obj);
            boolean z = qql.a;
            Object obj2 = this.a.a;
            if (obj2 != quu.a) {
                objA = obj2;
            } else if (!this.a.c(quu.a, objA)) {
                objA = this.a.a;
            }
        }
        b(obj, objA);
        return objA;
    }

    public final String toString() {
        return qnm.f(this) + '@' + qnm.g(this);
    }
}

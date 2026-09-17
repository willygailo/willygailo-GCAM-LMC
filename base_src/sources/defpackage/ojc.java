package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ojc implements Serializable {
    private static final long serialVersionUID = 0;

    public static ojc h(Object obj) {
        return obj == null ? oih.a : new ojj(obj);
    }

    public static ojc i(Object obj) {
        obj.getClass();
        return new ojj(obj);
    }

    public abstract ojc a(ojc ojcVar);

    public abstract ojc b(oiu oiuVar);

    public abstract Object c();

    public abstract Object d(ojz ojzVar);

    public abstract Object e(Object obj);

    public abstract boolean equals(Object obj);

    public abstract Object f();

    public abstract boolean g();

    public abstract int hashCode();

    public abstract String toString();
}

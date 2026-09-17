package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class qnp implements Serializable, qnn {
    private final int arity;

    public qnp(int i) {
        this.arity = i;
    }

    @Override // defpackage.qnn
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        int i = qns.a;
        String strA = qnm.a(this);
        strA.getClass();
        return strA;
    }
}

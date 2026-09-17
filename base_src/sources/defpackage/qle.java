package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class qle implements Serializable {
    private static final long serialVersionUID = 0;
    private final qln[] a;

    public qle(qln[] qlnVarArr) {
        qlnVarArr.getClass();
        this.a = qlnVarArr;
    }

    private final Object readResolve() {
        qln[] qlnVarArr = this.a;
        qln qlnVarPlus = qlo.a;
        for (qln qlnVar : qlnVarArr) {
            qlnVarPlus = qlnVarPlus.plus(qlnVar);
        }
        return qlnVarPlus;
    }
}

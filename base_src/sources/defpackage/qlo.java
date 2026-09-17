package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class qlo implements Serializable, qln {
    public static final qlo a = new qlo();
    private static final long serialVersionUID = 0;

    private qlo() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.qln
    public final Object fold(Object obj, qmy qmyVar) {
        return obj;
    }

    @Override // defpackage.qln
    public final qlk get(qll qllVar) {
        qllVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.qln
    public final qln minusKey(qll qllVar) {
        qllVar.getClass();
        return this;
    }

    @Override // defpackage.qln
    public final qln plus(qln qlnVar) {
        qlnVar.getClass();
        return qlnVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}

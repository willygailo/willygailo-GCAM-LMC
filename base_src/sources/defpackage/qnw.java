package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class qnw implements Serializable {
    public static final qnw a = new qnw();
    private static final long serialVersionUID = 0;

    private qnw() {
    }

    private final Object readResolve() {
        return qny.c;
    }
}

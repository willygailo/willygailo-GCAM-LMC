package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class omx implements Serializable {
    private static final long serialVersionUID = 0;
    private final omw a;

    public omx(omw omwVar) {
        this.a = omwVar;
    }

    private Object readResolve() {
        return new omy(this.a);
    }
}

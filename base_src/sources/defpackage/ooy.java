package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class ooy implements Serializable {
    private static final long serialVersionUID = 0;
    final oor a;

    public ooy(oor oorVar) {
        this.a = oorVar;
    }

    Object readResolve() {
        return this.a.values();
    }
}

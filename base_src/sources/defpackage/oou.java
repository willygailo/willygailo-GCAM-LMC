package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class oou implements Serializable {
    private static final long serialVersionUID = 0;
    final oor a;

    public oou(oor oorVar) {
        this.a = oorVar;
    }

    Object readResolve() {
        return this.a.keySet();
    }
}

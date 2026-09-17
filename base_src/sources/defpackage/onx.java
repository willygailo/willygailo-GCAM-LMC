package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class onx implements Serializable {
    private static final long serialVersionUID = 0;
    final ood a;

    public onx(ood oodVar) {
        this.a = oodVar;
    }

    Object readResolve() {
        return this.a.v();
    }
}

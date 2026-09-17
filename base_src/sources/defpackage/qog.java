package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qog implements qoj {
    public final qoj a;
    public final qmu b;
    public final qmu c;

    public qog(qoj qojVar, qmu qmuVar, qmu qmuVar2) {
        this.a = qojVar;
        this.b = qmuVar;
        this.c = qmuVar2;
    }

    @Override // defpackage.qoj
    public final Iterator a() {
        return new qof(this);
    }
}

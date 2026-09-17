package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class orb extends oqy implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final int b;

    public orb(Object obj, int i) {
        this.a = obj;
        this.b = i;
        ohh.U(i, "count");
    }

    @Override // defpackage.oqv
    public final int a() {
        return this.b;
    }

    @Override // defpackage.oqv
    public final Object b() {
        return this.a;
    }
}

package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class uw extends vd {
    public final HashMap a = new HashMap();

    @Override // defpackage.vd
    public final uz a(Object obj) {
        return (uz) this.a.get(obj);
    }

    @Override // defpackage.vd
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.a.remove(obj);
        return objB;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}

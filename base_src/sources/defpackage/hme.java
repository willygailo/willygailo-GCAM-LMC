package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hme {
    public final hmh a;
    private final Object b = new Object();
    private final List c = new ArrayList();

    public hme(hmh hmhVar) {
        this.a = hmhVar;
    }

    public final hna a() {
        synchronized (this.b) {
            if (this.c.isEmpty()) {
                return null;
            }
            return (hna) ohh.t(this.c);
        }
    }

    public final boolean b(hnk hnkVar) {
        return this.a.c.containsKey(Long.valueOf(hnkVar.c()));
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jpf implements jqn {
    private final Set a;
    private boolean b = false;

    public jpf(Set set) {
        this.a = set;
    }

    @Override // defpackage.jqn
    public final void a() {
        lar.a();
        if (this.b) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jqn) it.next()).a();
        }
        this.b = true;
    }
}

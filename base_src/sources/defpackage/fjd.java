package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fjd implements fjt {
    private final List a;

    public fjd(List list) {
        this.a = list;
    }

    @Override // defpackage.fjt
    public final void a(pac pacVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((fjt) it.next()).a(pacVar);
        }
    }
}

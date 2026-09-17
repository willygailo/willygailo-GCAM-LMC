package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class hev implements heu {
    private final Set a;

    public hev(Set set) {
        this.a = ope.F(set);
    }

    @Override // defpackage.heu
    public final boolean a(lmr lmrVar) {
        try {
            mip.bi(lmrVar);
            lzv lzvVarC = lmrVar.c();
            if (lzvVarC == null) {
                return false;
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                if (!((gig) it.next()).a(lzvVarC)) {
                    return false;
                }
            }
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
}

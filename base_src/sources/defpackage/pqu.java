package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pqu {
    public static final pqu a = new pqu();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final pqe c = new pqe();

    private pqu() {
    }

    public final prb a(Class cls) {
        ppn.i(cls, "messageType");
        prb prbVarM = (prb) this.b.get(cls);
        if (prbVarM == null) {
            pqe pqeVar = this.c;
            prc.p(cls);
            pqj pqjVarA = pqeVar.a.a(cls);
            if (pqjVarA.b()) {
                prbVarM = ppd.class.isAssignableFrom(cls) ? pqp.c(prc.c, pot.a, pqjVarA.a()) : pqp.c(prc.a, pot.a(), pqjVarA.a());
            } else if (ppd.class.isAssignableFrom(cls)) {
                prbVarM = pqe.a(pqjVarA) ? pqo.m(pqjVarA, pqr.b, pqa.b, prc.c, pot.a, pqi.b) : pqo.m(pqjVarA, pqr.b, pqa.b, prc.c, null, pqi.b);
            } else {
                prbVarM = pqe.a(pqjVarA) ? pqo.m(pqjVarA, pqr.a, pqa.a, prc.a, pot.a(), pqi.a) : pqo.m(pqjVarA, pqr.a, pqa.a, prc.b, null, pqi.a);
            }
            ppn.i(cls, "messageType");
            ppn.i(prbVarM, "schema");
            prb prbVar = (prb) this.b.putIfAbsent(cls, prbVarM);
            if (prbVar != null) {
                return prbVar;
            }
        }
        return prbVarM;
    }

    public final prb b(Object obj) {
        return a(obj.getClass());
    }
}

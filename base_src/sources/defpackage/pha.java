package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class pha {
    private final AtomicReference b = new AtomicReference(phq.a);
    public pgz a = new pgz();

    private pha() {
    }

    public static pha a() {
        return new pha();
    }

    public final pht b(pgj pgjVar, Executor executor) {
        pgjVar.getClass();
        executor.getClass();
        pgy pgyVar = new pgy(executor, this);
        pgv pgvVar = new pgv(pgyVar, pgjVar);
        pih pihVarF = pih.f();
        pht phtVar = (pht) this.b.getAndSet(pihVarF);
        pip pipVarF = pip.f(pgvVar);
        phtVar.d(pipVarF, pgyVar);
        pht phtVarW = plk.W(pipVarF);
        pgw pgwVar = new pgw(pipVarF, pihVarF, phtVar, phtVarW, pgyVar);
        phtVarW.d(pgwVar, pgr.INSTANCE);
        pipVarF.d(pgwVar, pgr.INSTANCE);
        return phtVarW;
    }
}

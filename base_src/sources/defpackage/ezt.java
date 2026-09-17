package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ezt implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public ezt(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ezn get() {
        btt bttVar = (btt) this.a.get();
        jac jacVar = (jac) this.b.get();
        return new ezn(bttVar.g(), ((bvk) bttVar.g()).f, (Executor) this.c.get(), jacVar);
    }
}

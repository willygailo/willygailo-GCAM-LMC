package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class dpu implements pys {
    private final qkg a;
    private final qkg b;
    private final qkg c;

    public dpu(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        this.a = qkgVar;
        this.b = qkgVar2;
        this.c = qkgVar3;
    }

    public static dpu b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3) {
        return new dpu(qkgVar, qkgVar2, qkgVar3);
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dpt get() {
        return new dpt(dln.b(), (jtx) this.a.get(), (Executor) this.b.get(), ((emp) this.c).a(), null, null);
    }
}
